package com.incture.accpay.services;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.incture.accpay.dao.InvoiceDetailDao;
import com.incture.accpay.dto.CommunicationLogDto;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.dto.InvoiceItemDto;
import com.incture.accpay.entities.InvoiceDetailDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;
import com.incture.accpay.util.ServicesUtil;

/**
 * Session Bean implementation class PersonBean2
 */
@Stateless
@LocalBean
public class InvoiceDetailServices implements InvoiceDetailServicesLocal {

	/**
	 * Default constructor.
	 */
	public InvoiceDetailServices() {
	}

	@PersistenceContext(name = "ACCOUNT_PAYEE_PU")
	private EntityManager em;

	/**
	 * Get all persons from the table.
	 */
	@Override
	public InvoiceDetailResponseDTO getAllInvoiceData() {
		InvoiceDetailResponseDTO detailResponseDTO = new InvoiceDetailResponseDTO();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
		List<InvoiceDetailDto> invoiceDetailDtos;
		try {
			invoiceDetailDtos = invoiceDetailDao.getAllResults(InvoiceDetailDo.class.getSimpleName(), "");
			detailResponseDTO.setResponseDTOs(invoiceDetailDtos);
			detailResponseDTO.setStatus(true);

		} catch (NoResultFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return detailResponseDTO;

	}

	/**
	 * Add invoice data to table
	 */
	@Override
	public InvoiceDetailResponseDTO saveInvoiceDetails(InvoiceDetailDto invoiceDetailDto) {
		InvoiceDetailResponseDTO detailResponseDTO = new InvoiceDetailResponseDTO();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
		
		Date currentDate = new Date();
		invoiceDetailDto.setDateCreated(currentDate);
		String id ="APA" + SequenceNumberGen.getInstance().getNextSeqNumber("0",8,em);
		invoiceDetailDto.setId(id);
		if(!ServicesUtil.isEmpty(invoiceDetailDto.getInvoiceItemList()))
		for (InvoiceItemDto invoiceItemDto : invoiceDetailDto.getInvoiceItemList()) {
			invoiceItemDto.setDateCreated(currentDate);
		}
		if(!ServicesUtil.isEmpty(invoiceDetailDto.getCommunicationLogDtos()))
		for (CommunicationLogDto communicationLogDto : invoiceDetailDto.getCommunicationLogDtos()) {
			communicationLogDto.setDateCommented(currentDate);
		}
		try {
			invoiceDetailDao.create(invoiceDetailDto);
			detailResponseDTO.setStatus(true);
			;
		} catch (ExecutionFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();

		} catch (NoResultFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return detailResponseDTO;
	}

}
