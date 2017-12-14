package com.incture.accpay.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.incture.accpay.dao.InvoiceDetailDao;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.entities.InvoiceDetailDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;

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
		// TODO Auto-generated constructor stub
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
	 * Add a person to the table.
	 */
	@Override
	public InvoiceDetailResponseDTO saveInvoiceDetails(InvoiceDetailDto invoiceDetailDto) {
		InvoiceDetailResponseDTO detailResponseDTO = new InvoiceDetailResponseDTO();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
		try {
			invoiceDetailDao.create(invoiceDetailDto);
			 detailResponseDTO.setStatus(true);;
		} catch (ExecutionFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();

		} catch (NoResultFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return detailResponseDTO;
	}

}
