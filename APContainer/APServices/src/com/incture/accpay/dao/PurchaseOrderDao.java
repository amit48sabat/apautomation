package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.AccountAssignmentDto;
import com.incture.accpay.dto.PoItemDto;
import com.incture.accpay.dto.PurchaseOrderDto;
import com.incture.accpay.entities.PoItemDo;
import com.incture.accpay.entities.PurchaseOrderDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.EntityManagerProviderLocal;
import com.incture.accpay.util.ServicesUtil;

public class PurchaseOrderDao extends
		BaseDao<PurchaseOrderDo, PurchaseOrderDto> {

	public PurchaseOrderDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected PurchaseOrderDo importDto(PurchaseOrderDto inputDto)
			throws ExecutionFault, NoResultFault, InvalidInputFault {
		PurchaseOrderDo outputDo = new PurchaseOrderDo();
		outputDo.setCompanyCode(inputDto.getCompanyCode());
		outputDo.setCreateDate(inputDto.getCreateDate());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setCurrency(inputDto.getCurrency());
		outputDo.setExchchangeRate(inputDto.getExchchangeRate());
		outputDo.setId(inputDto.getId());
		outputDo.setPaymentTerms(inputDto.getPaymentTerms());
		outputDo.setPoNumber(inputDto.getPoNumber());
		outputDo.setRequestId(inputDto.getRequestId());
		outputDo.setVendor(inputDto.getVendor());
		outputDo.setDocDate(inputDto.getDocDate());
		outputDo.setHas_Gr(inputDto.getHas_Gr());
		outputDo.setHasDeliveryCharges(inputDto.getHasDeliveryCharges());
		outputDo.setPlannedCost(inputDto.getPlannedCost());
		outputDo.setDeliveryVendor(inputDto.getDeliveryVendor());
		outputDo.setHasDeliveryVendor(inputDto.getHasDeliveryVendor());
		outputDo.setIsThirdParty(inputDto.getIsThirdParty());
		if (!ServicesUtil.isEmpty(inputDto.getPoItemList())) {
			List<PoItemDo> doList = new ArrayList<PoItemDo>();
			PoItemDao dao = new PoItemDao(super.getEntityManager());
			for (int i = 0; i < inputDto.getPoItemList().size(); i++) {
				PoItemDo importDo = dao.importDto(inputDto.getPoItemList().get(
						i));
				importDo.setPurchaseOrderDo(outputDo);
				doList.add(importDo);
			}
			outputDo.setPoItemDo(doList);
		}
		return outputDo;
	}

	@Override
	public PurchaseOrderDto exportDto(PurchaseOrderDo inputDo) {
		PurchaseOrderDto outputDto = new PurchaseOrderDto();
		outputDto.setCompanyCode(inputDo.getCompanyCode());
		outputDto.setCreateDate(inputDo.getCreateDate());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		outputDto.setCurrency(inputDo.getCurrency());
		outputDto.setExchchangeRate(inputDo.getExchchangeRate());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setDocDate(inputDo.getDocDate());
		outputDto.setHas_Gr(inputDo.getHas_Gr());
		outputDto.setHasDeliveryCharges(inputDo.getHasDeliveryCharges());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setPaymentTerms(inputDo.getPaymentTerms());
		outputDto.setPlannedCost(inputDo.getPlannedCost());
		outputDto.setPoNumber(inputDo.getPoNumber());
		outputDto.setRequestId(inputDo.getRequestId());
		outputDto.setVendor(inputDo.getVendor());
		outputDto.setDeliveryVendor(inputDo.getDeliveryVendor());
		outputDto.setHasDeliveryVendor(inputDo.getHasDeliveryVendor());
		outputDto.setIsThirdParty(inputDo.getIsThirdParty());
		if (!ServicesUtil.isEmpty(inputDo.getPoItemDo())) {
			List<PoItemDto> poItemList = new ArrayList<PoItemDto>();
			PoItemDao dao = new PoItemDao(super.getEntityManager());
			for (int i = 0; i < inputDo.getPoItemDo().size(); i++) {
				poItemList.add(dao.exportDto(inputDo.getPoItemDo().get(i)));
			}
			outputDto.setPoItemList(poItemList);
		}

		return outputDto;
	}

	public void deletePO(String requestId) {
		try {
			Query query = super.getEntityManager().createQuery(
					"SELECT p.id FROM PurchaseOrderDo p "
							+ "WHERE p.requestId =:requestId ");
			query.setParameter("requestId", requestId);
			String id = (String) query.getSingleResult();
			PurchaseOrderDto purchaseOrderDto = new PurchaseOrderDto();
			purchaseOrderDto.setId(id);
			PurchaseOrderDao dao = new PurchaseOrderDao(super
					.getEntityManager());

			dao.delete(purchaseOrderDto);
		} catch (ExecutionFault e) {
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			e.printStackTrace();
		} catch (NoResultFault e) {
			e.printStackTrace();
		} catch (javax.persistence.NoResultException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public PurchaseOrderDto grnReceivng(String requestID) {
		
		PurchaseOrderDto purDto = new PurchaseOrderDto();

		Query query = super.getEntityManager().createQuery(
						"select v from PurchaseOrderDo v where v.requestId =:requestID");
		query.setParameter("requestID", requestID);
		List<PurchaseOrderDo> list2 = query.getResultList();
		PurchaseOrderDao dao = new PurchaseOrderDao(super
				.getEntityManager());

		if (!ServicesUtil.isEmpty(list2)) {
			// PurchaseOrderDto purdto = new PurchaseOrderDto();
			purDto.setId(list2.get(0).getId());
			purDto = dao.exportDto(list2.get(0));//this need to be changed when multiple PO case is implemented
		}

		return purDto;
	}

	
	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<PurchaseOrderDto> getPOListByRequestID(String requestID) {
		Query query = super
				.getEntityManager()
				.createQuery(
						"select v from PurchaseOrderDo v where v.requestId =:requestID");
		query.setParameter("requestID", requestID);
		List<PurchaseOrderDo> list2 = query.getResultList();
		PurchaseOrderDao dao = new PurchaseOrderDao(super.getEntityManager());
		List<PurchaseOrderDto> purchaseOrderList = new ArrayList<PurchaseOrderDto>();
		try {
			if (!ServicesUtil.isEmpty(list2)) {
				for (PurchaseOrderDo purDo : list2) {
					List<AccountAssignmentDto> accAssignDtoList = new ArrayList<AccountAssignmentDto>();
					PurchaseOrderDto purDto = new PurchaseOrderDto();
					purDto.setId(purDo.getId());
					purDto = dao.getByKeys(purDto);
					AccountAssignmentDao accAssignDao = new AccountAssignmentDao(super.getEntityManager());
					accAssignDtoList = accAssignDao.getaccAssignListByPoHeaderId(purDo.getId());
					if(!ServicesUtil.isEmpty(accAssignDtoList)){
						System.err.println("AccountAssignment List :"+accAssignDtoList.size());
						purDto.setAccAssignDtoList(accAssignDtoList);
					}
					purchaseOrderList.add(purDto);
					// purDto = dao.exportDto(list2.get(0));
				}
			}
		} catch (ExecutionFault e) {
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			e.printStackTrace();
		} catch (NoResultFault e) {
			e.printStackTrace();
		}
		return purchaseOrderList;
	}
	
	
	public void deletePOData (String requestid, String poNumber,EntityManagerProviderLocal em){
		try {
			Query poQuery = em.getEntityManager().createQuery("DELETE FROM  PurchaseOrderDo g WHERE g.requestId =:requestId AND g.poNumber =:poNumber");
			poQuery.setParameter("requestId", requestid);
			poQuery.setParameter("poNumber", poNumber);
			poQuery.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getPoHeaderId(String requestid, String poNumber,EntityManagerProviderLocal em){
		String poHeaderId=null;
		try {
			Query poQuery = em.getEntityManager().createQuery("Select g.id FROM  PurchaseOrderDo g WHERE g.requestId =:requestId AND g.poNumber =:poNumber");
			poQuery.setParameter("requestId", requestid);
			poQuery.setParameter("poNumber", poNumber);
			poHeaderId = (String) poQuery.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return poHeaderId;
		
	}
}