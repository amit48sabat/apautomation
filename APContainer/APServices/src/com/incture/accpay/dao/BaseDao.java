package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import com.incture.accpay.dto.BaseDto;
import com.incture.accpay.dto.MessageUIDto;
import com.incture.accpay.entities.BaseDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.exception.NonUniqueRecordFault;
import com.incture.accpay.exception.RecordExistFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

/**
 * The <code>BaseDao</code> abstract class comprise abstract functions for CRUD
 * operations and a few utility functions for child <code>Data Access
 * Objects<code>
 * 
 * @version 2.0, 21-June-2012
 * @since CR8313
 * @author VINU
 */
public abstract class BaseDao<E extends BaseDo, D extends BaseDto> {
	// private Integer batchSize;
	// private Integer startIndex = 0;
	// protected final Integer noOfRetries = 5;
	protected final boolean isNotQuery = false;
	protected final boolean isQuery = true;

	// Message
	private final String recordExist = "Record already exist ";
	private final String noRecordFound = "No record found: "; // NOT USED

	// Connection
	private EntityManager entityManager;

	public BaseDao(EntityManager entityManager) {
		this.entityManager = entityManager;
		// LogUtil = new LogUtil(BaseDao.class);
	}

	// <WRAPPER OVER BASIC CRUD ONES, WITH IMPORT AND EXPORT FUNCTIONS>

	/**
	 * @param dto
	 *            the record to be created
	 * @throws ExecutionFault
	 *             in case for fatal error
	 * @throws InvalidInputFault
	 *             wrong inputs
	 * @throws NoResultFault
	 */
	public void create(D dto) throws ExecutionFault, InvalidInputFault, NoResultFault {
		persist(importDto(EnOperation.CREATE, dto));
	}

	/**
	 * @param dto
	 *            input object
	 * @return single record based on the objects primary key
	 * @throws ExecutionFault
	 *             in case for fatal error
	 * @throws InvalidInputFault
	 *             even key is missing
	 * @throws NoResultFault
	 *             when record could be retrieved
	 */
	public D getByKeys(D dto) throws ExecutionFault, InvalidInputFault, NoResultFault {
		return exportDto(getByKeysForFK(dto));
	}

	/**
	 * @return the entity, mainly used for setting FK
	 */
	public E getByKeysForFK(D dto) throws ExecutionFault, InvalidInputFault, NoResultFault {
		return find(importDto(EnOperation.RETRIEVE, dto));
	}

	/**
	 * @param dto
	 *            the record to be updated
	 * @return the updated record
	 * @throws ExecutionFault
	 *             in case for fatal error
	 * @throws InvalidInputFault
	 *             wrong inputs
	 * @throws NoResultFault
	 */
	public D update(D dto) throws ExecutionFault, InvalidInputFault, NoResultFault {
		// return exportDto(merge(importDto(EnOperation.UPDATE, dto)));
		getByKeysForFK(dto);
		return exportDto(merge(importDto(EnOperation.UPDATE, dto)));
	}

	public void delete(D dto) throws ExecutionFault, InvalidInputFault, NoResultFault {
		// remove(importDto(EnOperation.DELETE, dto));
		remove(getByKeysForFK(dto));
	}

	// </WRAPPER OVER BASIC CRUD ONES, WITH IMPORT AND EXPORT FUNCTIONS>

	// <BASIC CRUD OPERATIONS>
	protected void persist(E pojo) throws ExecutionFault {
		try {
			getEntityManager().persist(pojo);
		} catch (Exception e) {
			MessageUIDto faultInfo = new MessageUIDto();
			faultInfo.setMessage(e.getMessage());
			String message = "Create of " + pojo.getClass().getSimpleName() + " with keys " + pojo.getPrimaryKey()
					+ " failed!";
			throw new ExecutionFault(message, faultInfo, e);
		}
	}

	@SuppressWarnings("unchecked")
	protected E find(E pojo) throws ExecutionFault, NoResultFault {
		E result = null;
		try {
			result = (E) getEntityManager().find(pojo.getClass(), pojo.getPrimaryKey());
		} catch (Exception e) {
			// In case of connection or other JPA ones.
			MessageUIDto faultInfo = new MessageUIDto();
			faultInfo.setMessage(e.getMessage());
			String message = "Retrieve of " + pojo.getClass().getSimpleName() + " by keys " + pojo.getPrimaryKey()
					+ " failed!";
			throw new ExecutionFault(message, faultInfo, e);
		}
		if (result == null) {
			throw new NoResultFault(noRecordFound + pojo.getClass().getSimpleName() + "#" + pojo.getPrimaryKey());
			// TODO: Re-think noRecordFound message
		}
		return result;
	}

	protected E merge(E pojo) throws ExecutionFault {
		try {
			return getEntityManager().merge(pojo);
		} catch (Exception e) {
			MessageUIDto faultInfo = new MessageUIDto();
			faultInfo.setMessage(e.getMessage());
			String message = "Update of " + pojo.getClass().getSimpleName() + " having keys " + pojo.getPrimaryKey()
					+ " failed!";
			throw new ExecutionFault(message, faultInfo, e);
		}
	}

	protected void remove(E pojo) throws ExecutionFault {
		try {
			getEntityManager().remove(pojo);
		} catch (Exception e) {
			MessageUIDto faultInfo = new MessageUIDto();
			faultInfo.setMessage(e.getMessage());
			String message = "Delete of " + pojo.getClass().getSimpleName() + " having keys " + pojo.getPrimaryKey()
					+ " failed!";
			throw new ExecutionFault(message, faultInfo, e);
		}
	}

	// </BASIC CRUD OPERATIONS>
	// <SIGNATURE FOR DATA TRANSFER FUNCTIONS>
	private E importDto(EnOperation operation, D fromDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		if (fromDto != null) {
			fromDto.validate(operation);
			return importDto(fromDto);
		}
		throw new InvalidInputFault("Empty DTO passed");
	}

	/**
	 * @param fromDto
	 *            Data object from which data needs to be copied to a new entity
	 */
	protected abstract E importDto(D fromDto) throws InvalidInputFault, ExecutionFault, NoResultFault;

	// /**
	// * To be used this if copy over existing entity is needed
	// */
	// protected abstract E importDto(D fromDto, E toEntity)
	// throws InvalidInputFault, ExecutionFault;

	/**
	 * @param entity
	 *            Copies data back to a new transfer object from entity
	 */
	protected abstract D exportDto(E entity);

	protected List<D> exportDtoList(Collection<E> listDo) {
		List<D> returnDtos = null;
		if (!ServicesUtil.isEmpty(listDo)) {
			returnDtos = new ArrayList<D>(listDo.size());
			for (Iterator<E> iterator = listDo.iterator(); iterator.hasNext();) {
				returnDtos.add(exportDto(iterator.next()));
			}
		}
		return returnDtos;
	}

	/**
	 * Its negation logic over getByKeys.
	 * 
	 * @param dto
	 * @throws ExecutionFault
	 * @throws RecordExistFault
	 * @throws InvalidInputFault
	 */
	protected void entityExist(D dto) throws ExecutionFault, RecordExistFault, InvalidInputFault {
		try {// Report entity exist
			getByKeys(dto);
			throw new RecordExistFault(recordExist, buildRecordExistFault(dto));
		} catch (NoResultFault e) {
		}
	}

	// </SIGNATURE FOR DATA TRANSFER FUNCTIONS>

	// <UTILITY FUNCTIONS TO ENFORCE CONNECTIONS>
	protected final EntityManager getEntityManager() {
		return entityManager;
	}

	public final void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	/**
	 * 
	 * @param queryName
	 *            used for logging
	 * 
	 * @param query
	 *            object used for execution
	 * @param parameters
	 *            to be set in where clause
	 * @return Single record, depending on columns in SELECT clause, it return a
	 *         object of BaseDo type or an object array
	 * @throws NoResultFault
	 * @throws NonUniqueRecordFault
	 */

	protected Object getSingleResult(String queryName, Query query, Object... parameters)
			throws NoResultFault, NonUniqueRecordFault {
		// if (!ServicesUtil.isEmpty(parameters)) {
		// final int length = parameters.length;
		// for (int i = 0; i < length; i++) {
		// query.setParameter(i, parameters[i]);
		// }
		// }
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			throw new NoResultFault(ServicesUtil.buildNoRecordMessage(queryName, parameters));
		} catch (NonUniqueResultException e) {
			throw new NonUniqueRecordFault("Failed due to corrupt data, please contact db admin",
					buildNonUniqueRecordFault(queryName, parameters));
		}
	}

	/**
	 * @param queryName
	 *            used for logging
	 * @param query
	 *            object used for execution
	 * @param parameters
	 *            to be set in where clause
	 * @return List of records based on startIndex and batchIndex
	 * @throws NoResultFault
	 */
	protected List<?> getResultList(String queryName, Query query, Object... parameters) throws NoResultFault {
		// if (!ServicesUtil.isEmpty(parameters)) {
		// final int length = parameters.length;
		// for (int i = 0; i < length; i++) {
		// query.setParameter(i, parameters[i]);
		// }
		// }
		List<?> returnList = query.getResultList();
		if (ServicesUtil.isEmpty(returnList)) {
			throw new NoResultFault(ServicesUtil.buildNoRecordMessage(queryName, parameters));
		}
		return returnList;
	}

	protected String uuidGen(BaseDto dto, Class<? extends BaseDo> classDo) throws ExecutionFault {
		return UUID.randomUUID().toString();
		// TODO: TO REVIEW: Retrying logic below, ignored for now
	}

	private MessageUIDto buildRecordExistFault(BaseDto BaseDto) {
		StringBuffer sb = new StringBuffer(recordExist);
		if (BaseDto != null) {
			// sb.append(BaseDto.getClass().getSimpleName());
			// sb.append("#[");
			sb.append(BaseDto.toString());
			// sb.append(']');
		}
		MessageUIDto messageUIDto = new MessageUIDto();
		messageUIDto.setMessage(sb.toString());
		return messageUIDto;
	}

	private MessageUIDto buildNonUniqueRecordFault(String queryName, Object... parameters) {
		StringBuffer sb = new StringBuffer("Non Unique Record found for query: ");
		sb.append(queryName);
		if (!ServicesUtil.isEmpty(parameters)) {
			sb.append(" for params:");
			sb.append(ServicesUtil.getCSV(parameters));
		}
		MessageUIDto messageUIDto = new MessageUIDto();
		messageUIDto.setMessage(sb.toString());
		return messageUIDto;
	}
	

	@SuppressWarnings("unchecked")
	public List<D> getAllResults(String doName, Object... parameters)
			throws NoResultFault {
		String queryName = "SELECT p FROM " + doName + " p";
		Query query = getEntityManager().createQuery(queryName);
		List<E> returnList = query.getResultList();
		if (ServicesUtil.isEmpty(returnList)) {
			throw new NoResultFault(ServicesUtil.buildNoRecordMessage(
					queryName, parameters));
		}
		System.err.println("returnList: "+returnList);
		return exportDtoList(returnList);
	}

}