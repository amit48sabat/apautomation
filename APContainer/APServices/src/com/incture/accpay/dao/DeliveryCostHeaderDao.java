package com.incture.accpay.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.DeliveryCostHeaderDto;
import com.incture.accpay.entities.DeliveryCostHeaderDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class DeliveryCostHeaderDao extends BaseDao<DeliveryCostHeaderDo, DeliveryCostHeaderDto> {

	public DeliveryCostHeaderDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected DeliveryCostHeaderDto exportDto(DeliveryCostHeaderDo inputDo) {
		// TODO Auto-generated method stub
		DeliveryCostHeaderDto outputDto = new DeliveryCostHeaderDto();
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setPoNumber(inputDo.getPoNumber());
		outputDto.setRequestID(inputDo.getRequestID());
		outputDto.setUnplannedCost(inputDo.getUnplannedCost());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		outputDto.setPlannedCost(inputDo.getPlannedCost());
		outputDto.setStorage(inputDo.getStorage());
		outputDto.setFreight((inputDo.getFreight()));
		outputDto.setFees(inputDo.getFees());
		outputDto.setSurcharge(inputDo.getSurcharge());
		return outputDto;
	}

	@Override
	protected DeliveryCostHeaderDo importDto(DeliveryCostHeaderDto inputDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		DeliveryCostHeaderDo outputDo = new DeliveryCostHeaderDo();
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setId(inputDto.getId());
		outputDo.setUnplannedCost(inputDto.getUnplannedCost());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		outputDo.setPoNumber(inputDto.getPoNumber());
		outputDo.setRequestID(inputDto.getRequestID());
		outputDo.setPlannedCost(inputDto.getPlannedCost());
		outputDo.setStorage(inputDto.getStorage());
		outputDo.setFreight((inputDto.getFreight()));
		outputDo.setFees(inputDto.getFees());
		outputDo.setSurcharge(inputDto.getSurcharge());
		return outputDo;
	}

	@SuppressWarnings("unchecked")
	public DeliveryCostHeaderDto getByPoNumber(String poNumber, String requestID) {

		Query query = super.getEntityManager()
				.createQuery("SELECT v FROM DeliveryCostHeaderDo v WHERE v.poNumber =:poNumber AND v.requestID =:requestID");
		query.setParameter("poNumber", poNumber);
		query.setParameter("requestID", requestID);
		List<DeliveryCostHeaderDo> headerDoList = query.getResultList();
		if (!ServicesUtil.isEmpty(headerDoList)) {
			DeliveryCostHeaderDo headerDo = headerDoList.get(0);
			DeliveryCostHeaderDao headerDao = new DeliveryCostHeaderDao(super.getEntityManager());
			DeliveryCostHeaderDto headerDto = headerDao.exportDto(headerDo);
			return headerDto;
		}
		return null;
	}

	public void deleteDeliveryHeader(String requestid, String poNumber) {

		Query deliveryQuery = super.getEntityManager()
				.createQuery("DELETE FROM DeliveryCostHeaderDo g WHERE g.requestID =:requestId AND g.poNumber =:poNumber");
		deliveryQuery.setParameter("requestId", requestid);
		deliveryQuery.setParameter("poNumber", poNumber);
		deliveryQuery.executeUpdate();
	}

	public String getHeaderId(String requestId, String poNumber) {
		String headerId = null;
		Query query = super.getEntityManager()
				.createQuery("SELECT g.id from DeliveryCostHeaderDo g WHERE g.requestID =:requestId AND g.poNumber =:poNumber");
		query.setParameter("requestId", requestId);
		query.setParameter("poNumber", poNumber);

		if (!ServicesUtil.isEmpty(query.getSingleResult())) {
			// if (requestId!=null && poNumber != null) {
			headerId = (String) query.getSingleResult();
			// return headerId;
		}

		return headerId;

	}

}
