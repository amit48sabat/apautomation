package com.incture.accpay.services;

import javax.ejb.Local;

import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;

@Local
public interface InvoiceDetailServicesLocal {



	InvoiceDetailResponseDTO getAllInvoiceData();

	InvoiceDetailResponseDTO saveInvoiceDetails(InvoiceDetailDto invoiceDetailDto);

}
