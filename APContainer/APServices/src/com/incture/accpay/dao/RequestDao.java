package com.incture.accpay.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.RequestDto;
import com.incture.accpay.entities.RequestDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class RequestDao extends BaseDao<RequestDo, RequestDto> {

	public RequestDao(EntityManager entityManager) {
		super(entityManager);
	}

	public List<RequestDo> checkDuplicatePoInvoice(String requestId,
			String poNumber, BigDecimal total, String status) {
		Query query = super
				.getEntityManager()
				.createQuery(
						"SELECT r FROM RequestDao p,InvoiceDetailDo iDo,RequestDo r "
								+ "WHERE p.requestId = r.id AND iDo.requestId = p.requestId AND p.requestId <>:requestId "
								+ "AND iDo.total =:totalAmount AND p.poNumber =:poNumber AND r.status =:status");

		query.setParameter("status", status);
		query.setParameter("poNumber", poNumber);
		query.setParameter("totalAmount", total);
		query.setParameter("requestId", requestId);

		List<RequestDo> reqDo = query.getResultList();

		if (!ServicesUtil.isEmpty(reqDo)) {
			return reqDo;
		} else
			return null;
	}
	

	public List<String> checkDuplicateInvoice(String requestId,
			String vendorId, String invoiceNumber, String status,BigDecimal total) {
		Query query = super
				.getEntityManager()
				.createQuery(
						"SELECT rD.id FROM RequestDo rD,InvoiceDetailDo iDo "
								+ "WHERE iDo.invoiceNumber =:invoiceNumber AND iDo.vendorId =:vendorId AND rD.id <>:requestId AND rD.status =:status AND iDo.requestId=rD.id");

		query.setParameter("invoiceNumber", invoiceNumber);
		query.setParameter("vendorId", vendorId);
		query.setParameter("requestId", requestId);
		query.setParameter("status", status);
		List<String> reqId = query.getResultList();
		if (!ServicesUtil.isEmpty(reqId)) {
			return reqId;
		} else
		{
			return checkDuplicateTotal(requestId,vendorId,status,total);
		}
	}

	public List<String> checkDuplicateTotal(String requestId, String vendorId, String status, BigDecimal total) {
		Query query = super
				.getEntityManager()
				.createQuery(
						"SELECT rD.id FROM RequestDo rD,InvoiceDetailDo iDo "
								+ "WHERE iDo.total =:total AND iDo.vendorId =:vendorId AND rD.id <>:requestId AND rD.status =:status AND iDo.requestId=rD.id");

		query.setParameter("total", total);
		query.setParameter("vendorId", vendorId);
		query.setParameter("requestId", requestId);
		query.setParameter("status", status);
		List<String> reqId = query.getResultList();
		if (!ServicesUtil.isEmpty(reqId)) {
			return reqId;
		} else
			return null;
	}
	
	

	@Override
	protected RequestDo importDto(RequestDto inputDto) throws ExecutionFault,
			NoResultFault, InvalidInputFault {
		RequestDo outputDo = new RequestDo();
		// TODO: VALIDATE FK HERE
		/**
		*/
		// COPY DATA
		outputDo.setEmailFrom(inputDto.getEmailFrom());
		outputDo.setEmailSubject(inputDto.getEmailSubject());
		outputDo.setFilePath(inputDto.getFilePath());
		outputDo.setId(inputDto.getId());
		outputDo.setIsNonPo(inputDto.getIsNonPo());
		outputDo.setInvoiceDocNumber(inputDto.getInvoiceDocNumber());
		outputDo.setProcessId(inputDto.getProcessId());
		outputDo.setSapInvoiceNumber(inputDto.getSapInvoiceNumber());
		outputDo.setSapStatus(inputDto.getSapStatus());
		outputDo.setStartedBy(inputDto.getStartedBy());
		outputDo.setStartType(inputDto.getStartType());
		outputDo.setStatus(inputDto.getStatus());
		outputDo.setTimeEnded(inputDto.getTimeEnded());
		outputDo.setTimeStarted(inputDto.getTimeStarted());
		outputDo.setVendorId(inputDto.getVendorId());
		outputDo.setVendorName(inputDto.getVendorName());
		outputDo.setDuplicateInvoice(inputDto.isDuplicateInvoice());
		outputDo.setEmailTime(inputDto.getEmailTime());
		outputDo.setIvGR(inputDto.isIvGR());
		outputDo.setSetData(inputDto.isSetData());
		outputDo.setVendorBlocked(inputDto.getVendorBlocked());
		outputDo.setVendorPymtMethods(inputDto.getVendorPymtMethods());
		outputDo.setAgentEmail(inputDto.getAgentEmail());
		outputDo.setAgentFirstName(inputDto.getAgentFirstName());
		outputDo.setAgentID(inputDto.getAgentID());
		outputDo.setAgentLastName(inputDto.getAgentLastName());
		outputDo.setShowPlannedCost(inputDto.isShowPlannedCost());
		outputDo.setVendorPaymentBlockedDefault(inputDto.getVendorPaymentBlockedDefault());
		outputDo.setGrAvaliable(inputDto.isGrAvaliable());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setTimeUpdated(inputDto.getTimeUpdated());
		return outputDo;
	}

	@Override
	protected RequestDto exportDto(RequestDo inputDo) {
		RequestDto outputDto = new RequestDto();
		// COPY DATA
		outputDto.setEmailFrom(inputDo.getEmailFrom());
		outputDto.setEmailSubject(inputDo.getEmailSubject());
		outputDto.setFilePath(inputDo.getFilePath());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setIsNonPo(inputDo.getIsNonPo());
		outputDto.setInvoiceDocNumber(inputDo.getInvoiceDocNumber());
		outputDto.setProcessId(inputDo.getProcessId());
		outputDto.setSapInvoiceNumber(inputDo.getSapInvoiceNumber());
		outputDto.setSapStatus(inputDo.getSapStatus());
		outputDto.setStartedBy(inputDo.getStartedBy());
		outputDto.setStartType(inputDo.getStartType());
		outputDto.setStatus(inputDo.getStatus());
		outputDto.setTimeEnded(inputDo.getTimeEnded());
		outputDto.setTimeStarted(inputDo.getTimeStarted());
		outputDto.setVendorId(inputDo.getVendorId());
		outputDto.setVendorName(inputDo.getVendorName());
		outputDto.setDuplicateInvoice(inputDo.getDuplicateInvoice());
		outputDto.setEmailTime(inputDo.getEmailTime());
		outputDto.setIvGR(inputDo.isIvGR());
		outputDto.setSetData(inputDo.isSetData());
		outputDto.setVendorBlocked(inputDo.getVendorBlocked());
		outputDto.setVendorPymtMethods(inputDo.getVendorPymtMethods());
		outputDto.setAgentEmail(inputDo.getAgentEmail());
		outputDto.setAgentFirstName(inputDo.getAgentFirstName());
		outputDto.setAgentID(inputDo.getAgentID());
		outputDto.setAgentLastName(inputDo.getAgentLastName());
		outputDto.setShowPlannedCost(inputDo.isShowPlannedCost());
		outputDto.setVendorPaymentBlockedDefault(inputDo.getVendorPaymentBlockedDefault());
		outputDto.setGrAvaliable(inputDo.isGrAvaliable());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setTimeUpdated(inputDo.getTimeUpdated());
		return outputDto;
	}
}