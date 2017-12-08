package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.GrnDto;
import com.incture.accpay.dto.GrnItemDto;
import com.incture.accpay.entities.GrnDo;
import com.incture.accpay.entities.GrnItemDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class GrnDao extends BaseDao<GrnDo, GrnDto> {

	public GrnDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public GrnDo importDto(GrnDto inputDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		GrnDo outputDo = new GrnDo();
		outputDo.setId(inputDto.getId());
		outputDo.setRequestId(inputDto.getRequestId());
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setPoNumber(inputDto.getPoNumber());
		if (!ServicesUtil.isEmpty(inputDto.getGrnItemList())) {
			List<GrnItemDo> doList = new ArrayList<GrnItemDo>();
			GrnItemDao dao = new GrnItemDao(super.getEntityManager());
			for (int i = 0; i < inputDto.getGrnItemList().size(); i++) {
				GrnItemDo importDo = dao.importDto(inputDto.getGrnItemList().get(i));
				importDo.setGrnDo(outputDo);
				doList.add(importDo);
			}
			outputDo.setGrnItemList(doList);
		}
		return outputDo;
	}

	@Override
	public GrnDto exportDto(GrnDo inputDo) {
		GrnDto outputDto = new GrnDto();
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setId(inputDo.getId());
		outputDto.setRequestId(inputDo.getRequestId());
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setPoNumber(inputDo.getPoNumber());
		if (!ServicesUtil.isEmpty(inputDo.getGrnItemList())) {
			List<GrnItemDto> grnItemList = new ArrayList<GrnItemDto>();
			GrnItemDao dao = new GrnItemDao(super.getEntityManager());
			for (int i = 0; i < inputDo.getGrnItemList().size(); i++) {
				grnItemList.add(dao.exportDto(inputDo.getGrnItemList().get(i)));
			}
			outputDto.setGrnItemList(grnItemList);
		}

		return outputDto;
	}

	public void deleteGRN(String requestid, String poNumber) {
		Query query = super.getEntityManager().createQuery("SELECT g FROM GrnDo g WHERE g.requestId =:requestId AND g.poNumber =:poNumber");
		query.setParameter("requestId", requestid);
		query.setParameter("poNumber", poNumber);
		if (!ServicesUtil.isEmpty(query.getResultList())) {
			Query grnQuery = super.getEntityManager().createQuery("DELETE FROM GrnDo g WHERE g.requestId =:requestId AND g.poNumber =:poNumber");
			grnQuery.setParameter("requestId", requestid);
			grnQuery.setParameter("poNumber", poNumber);
			grnQuery.executeUpdate();
		}

	}

	@SuppressWarnings("unchecked")
	public List<GrnDto> getGRNListByRequestID(String requestId) {
		List<GrnDto> grnDtoList = new ArrayList<GrnDto>();
		javax.persistence.Query queryGrn = super.getEntityManager().createQuery("select v from GrnDo v where v.requestId=:requestID");
		queryGrn.setParameter("requestID", requestId);
		List<GrnDo> grnDoList = queryGrn.getResultList();
		GrnDao grnDao = new GrnDao(super.getEntityManager());
		try {
			if (!ServicesUtil.isEmpty(grnDoList)) {
				for (GrnDo grnDo : grnDoList) {
					GrnDto grndto = new GrnDto();
					grndto.setId(grnDo.getId());
					grndto = grnDao.getByKeys(grndto);
					grnDtoList.add(grndto);
					// grndto = grnDao.exportDto(grnDoList.get(0));
				}
			}
		} catch (ExecutionFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoResultFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return grnDtoList;
	}

}
