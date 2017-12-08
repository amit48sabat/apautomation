package com.incture.accpay.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.incture.accpay.dto.RequestHistoryDto;
import com.incture.accpay.entities.RequestHistoryDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.APEnum;
import com.incture.accpay.util.ServicesUtil;

public class RequestHistoryDao extends BaseDao<RequestHistoryDo, RequestHistoryDto> {

	public RequestHistoryDao(EntityManager entityManager) {
		super(entityManager);
	}

	
	@Override
	protected RequestHistoryDo importDto(RequestHistoryDto inputDto) throws ExecutionFault,
			NoResultFault, InvalidInputFault {
		RequestHistoryDo outputDo = new RequestHistoryDo();
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
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setTimeUpdated(inputDto.getTimeUpdated());
		return outputDo;
	}

	@Override
	protected RequestHistoryDto exportDto(RequestHistoryDo inputDo) {
		RequestHistoryDto outputDto = new RequestHistoryDto();
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
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setTimeUpdated(inputDo.getTimeUpdated());
		return outputDto;
	}
}