package com.incture.accpay.dao;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.CommunicationLogDto;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.dto.InvoiceItemDto;
import com.incture.accpay.entities.CommunicationLogDo;
import com.incture.accpay.entities.InvoiceDetailDo;
import com.incture.accpay.entities.InvoiceItemDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class InvoiceDetailDao extends BaseDao<InvoiceDetailDo, InvoiceDetailDto> {

	public InvoiceDetailDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected InvoiceDetailDo importDto(InvoiceDetailDto inputDto)
			throws ExecutionFault, NoResultFault, InvalidInputFault {
		InvoiceDetailDo outputDo = new InvoiceDetailDo();
		outputDo.setId(inputDto.getId());
		outputDo.setDiscrepencyFlag(inputDto.isDiscrepencyFlag());
		outputDo.setHasUnplannedCost(inputDto.isHasUnplannedCost());
		outputDo.setInvoiceHeaderCharges(inputDto.getInvoiceHeaderCharges());
		outputDo.setNetDiffrenceHeaderCharges(inputDto.getNetDiffrenceHeaderCharges());
		outputDo.setPlannedCost(inputDto.getPlannedCost());
		outputDo.setPo_freight(inputDto.getPo_freight());
		outputDo.setPo_importfees(inputDto.getPo_importfees());
		outputDo.setPo_storage(inputDto.getPo_storage());
		outputDo.setSurcharge(inputDto.getSurcharge());
		outputDo.setVendorName(inputDto.getVendorName());
		outputDo.setCompanyCode(inputDto.getCompanyCode());
		outputDo.setCurrency(inputDto.getCurrency());
		outputDo.setDeliveryDate(inputDto.getDeliveryDate());
		outputDo.setTotalDiscount(inputDto.getTotalDiscount());
		outputDo.setHeaderPatternMatchingFlag(inputDto.getHeaderPatternMatchingFlag());
		outputDo.setId(inputDto.getId());
		outputDo.setAbbyBatchName(inputDto.getAbbyBatchName());
		outputDo.setInvoiceNumber(inputDto.getInvoiceNumber());
		outputDo.setPostingDate(inputDto.getPostingDate());
		outputDo.setBaseLineDate(inputDto.getBaseLineDate());
		outputDo.setInvoiceDate(inputDto.getInvoiceDate());
		outputDo.setPurchaseOrderReference(inputDto.getPurchaseOrderReference());
		outputDo.setRequestId(inputDto.getRequestId());
		outputDo.setRoute(inputDto.getRoute());
		outputDo.setSubTotal(inputDto.getSubTotal());
		outputDo.setTaxIndicator(inputDto.getTaxIndicator());
		outputDo.setTotal((ServicesUtil.nullHandler(inputDto.getTotal())).setScale(2, RoundingMode.HALF_UP));
		outputDo.setTotalInvoiceAmount(
				(ServicesUtil.nullHandler(inputDto.getTotalInvoiceAmount())).setScale(2, RoundingMode.HALF_UP));
		outputDo.setVendorId(inputDto.getVendorId());
		outputDo.setPaymentBlock(inputDto.getPaymentBlock());
		outputDo.setPaymentMethod(inputDto.getPaymentMethod());
		outputDo.setPaymentTerms(inputDto.getPaymentTerms());
		outputDo.setFreight(inputDto.getFreight());
		outputDo.setStorage(inputDto.getStorage());
		outputDo.setSurcharge(inputDto.getSurcharge());
		outputDo.setFee_percentage(inputDto.getFee_percentage());
		outputDo.setFreight_percentage(inputDto.getFreight_percentage());
		outputDo.setImportFees(inputDto.getFee_percentage());
		outputDo.setAbbyNetPrice(inputDto.getAbbyNetPrice());
		outputDo.setGrossPrice(inputDto.getGrossPrice());
		outputDo.setBalanceAmount(inputDto.getBalanceAmount());
		outputDo.setDeleted(inputDto.isDeleted());
		outputDo.setUserCreated(inputDto.getUserCreated());
		outputDo.setUserUpdated(inputDto.getUserUpdated());
		outputDo.setDateCreated(inputDto.getDateCreated());
		outputDo.setDateUpdated(inputDto.getDateUpdated());
		if (!ServicesUtil.isEmpty(inputDto.getInvoiceItemList())) {
			List<InvoiceItemDo> doList = new ArrayList<InvoiceItemDo>();
			InvoiceItemDao dao = new InvoiceItemDao(super.getEntityManager());
			for (int i = 0; i < inputDto.getInvoiceItemList().size(); i++) {
				InvoiceItemDo importDo = dao.importDto(inputDto.getInvoiceItemList().get(i));
				importDo.setInvoiceDetailDo(outputDo);
				doList.add(importDo);
			}
			outputDo.setInvoiceItemDo(doList);
		}

		if (!ServicesUtil.isEmpty(inputDto.getCommunicationLogDtos())) {
			List<CommunicationLogDo> communicationLogDos = new ArrayList<CommunicationLogDo>();
			CommunicationLogDao communicationLogDao = new CommunicationLogDao(super.getEntityManager());
			for (CommunicationLogDto communicationLogDto : inputDto.getCommunicationLogDtos()) {
				communicationLogDos.add(communicationLogDao.importDto(communicationLogDto));
			}
			outputDo.setCommunicationLogDos(communicationLogDos);
		}
		return outputDo;
	}

	@Override
	public InvoiceDetailDto exportDto(InvoiceDetailDo inputDo) {
		InvoiceDetailDto outputDto = new InvoiceDetailDto();
		outputDto.setId(inputDo.getId());
		outputDto.setVendorName(inputDo.getVendorName());
		outputDto.setCompanyCode(inputDo.getCompanyCode());
		outputDto.setCurrency(inputDo.getCurrency());
		outputDto.setDeliveryDate(inputDo.getDeliveryDate());
		outputDto.setTotalDiscount(inputDo.getTotalDiscount());
		outputDto.setInvoiceDate(inputDo.getInvoiceDate());
		outputDto.setHeaderPatternMatchingFlag(inputDo.getHeaderPatternMatchingFlag());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setInvoiceNumber(inputDo.getInvoiceNumber());
		outputDto.setPostingDate(inputDo.getPostingDate());
		outputDto.setBaseLineDate(inputDo.getBaseLineDate());
		outputDto.setPurchaseOrderReference(inputDo.getPurchaseOrderReference());
		outputDto.setRequestId(inputDo.getRequestId());
		outputDto.setRoute(inputDo.getRoute());
		outputDto.setVendorId(inputDo.getVendorId());
		outputDto.setSubTotal(inputDo.getSubTotal());
		outputDto.setTaxIndicator(inputDo.getTaxIndicator());
		outputDto.setTotal((ServicesUtil.nullHandler(inputDo.getTotal())).setScale(2, RoundingMode.HALF_UP));
		outputDto.setTotalInvoiceAmount(
				(ServicesUtil.nullHandler(inputDo.getTotalInvoiceAmount())).setScale(2, RoundingMode.HALF_UP));
		outputDto.setPaymentBlock(inputDo.getPaymentBlock());
		outputDto.setPaymentMethod(inputDo.getPaymentMethod());
		outputDto.setPaymentTerms(inputDo.getPaymentTerms());
		outputDto.setFreight(inputDo.getFreight());
		outputDto.setStorage(inputDo.getStorage());
		outputDto.setSurcharge(inputDo.getSurcharge());
		outputDto.setFee_percentage(inputDo.getFee_percentage());
		outputDto.setFreight_percentage(inputDo.getFreight_percentage());
		outputDto.setDiscrepencyFlag(inputDo.isDiscrepencyFlag());
		outputDto.setHasUnplannedCost(inputDo.isHasUnplannedCost());
		outputDto.setInvoiceHeaderCharges(inputDo.getInvoiceHeaderCharges());
		outputDto.setNetDiffrenceHeaderCharges(inputDo.getNetDiffrenceHeaderCharges());
		outputDto.setPlannedCost(inputDo.getPlannedCost());
		outputDto.setPo_freight(inputDo.getPo_freight());
		outputDto.setPo_importfees(inputDo.getPo_importfees());
		outputDto.setPo_storage(inputDo.getPo_storage());
		outputDto.setSurcharge(inputDo.getSurcharge());
		outputDto.setImportFees(inputDo.getFee_percentage());
		outputDto.setAbbyBatchName(inputDo.getAbbyBatchName());
		outputDto.setAbbyNetPrice(inputDo.getAbbyNetPrice());
		outputDto.setGrossPrice(inputDo.getGrossPrice());
		outputDto.setBalanceAmount(inputDo.getBalanceAmount());
		outputDto.setDeleted(inputDo.isDeleted());
		outputDto.setUserCreated(inputDo.getUserCreated());
		outputDto.setUserUpdated(inputDo.getUserUpdated());
		outputDto.setDateCreated(inputDo.getDateCreated());
		outputDto.setDateUpdated(inputDo.getDateUpdated());
		if (!ServicesUtil.isEmpty(inputDo.getInvoiceItemDo())) {
			List<InvoiceItemDto> invItemList = new ArrayList<InvoiceItemDto>(inputDo.getInvoiceItemDo().size());
			InvoiceItemDao dao = new InvoiceItemDao(super.getEntityManager());
			for (int i = 0; i < inputDo.getInvoiceItemDo().size(); i++) {
				invItemList.add(dao.exportDto(inputDo.getInvoiceItemDo().get(i)));
			}
			outputDto.setInvoiceItemList(invItemList);
		}

		if (!ServicesUtil.isEmpty(inputDo.getCommunicationLogDos())) {
			List<CommunicationLogDto> communicationLogDtos = new ArrayList<CommunicationLogDto>();
			CommunicationLogDao communicationLogDao = new CommunicationLogDao(super.getEntityManager());
			for (CommunicationLogDo communicationLogDo : inputDo.getCommunicationLogDos()) {
				communicationLogDtos.add(communicationLogDao.exportDto(communicationLogDo));
			}
			outputDto.setCommunicationLogDtos(communicationLogDtos);
		}
		return outputDto;
	}

	@SuppressWarnings("unchecked")
	public InvoiceDetailDto getInvDetailRequestNumber(@WebParam(name = "requestID") String requestID) {

		InvoiceDetailDto invDto = new InvoiceDetailDto();
		javax.persistence.Query query = super.getEntityManager()
				.createQuery("select v from InvoiceDetailDo v where v.requestId=:requestID");
		query.setParameter("requestID", requestID);

		List<InvoiceDetailDo> list = query.getResultList();
		InvoiceDetailDao invoiceDao = new InvoiceDetailDao(super.getEntityManager());
		invDto = invoiceDao.exportDto(list.get(0));
		return invDto;

	}

	@SuppressWarnings("unchecked")
	public InvoiceDetailDto getCmpnyCodeVendorId(String requestId) {

		Query query = super.getEntityManager().createQuery(
				"SELECT DISTINCT v.companyCode, v.vendorId FROM InvoiceDetailDo v WHERE v.requestId =:requestID");
		query.setParameter("requestID", requestId);

		List<Object[]> resultList = new ArrayList<Object[]>();
		resultList = query.getResultList();

		InvoiceDetailDto output = new InvoiceDetailDto();
		if (resultList != null && ServicesUtil.nullHandler(resultList) > 0) {
			for (Object[] obj : resultList) {
				output.setCompanyCode(obj[0] == null ? "" : obj[0].toString());
				output.setVendorId(obj[1] == null ? "" : obj[1].toString());
				break;
			}
		}
		return output;
	}

}
