package com.incture.accpay.services;

import javax.ejb.Local;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.response.dto.AccPayResponseDTO;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;

@Local
public interface InvoiceDetailServicesLocal {



	InvoiceDetailResponseDTO getAllInvoiceData();

	InvoiceDetailResponseDTO saveInvoiceDetails(InvoiceDetailDto invoiceDetailDto);

	AccPayResponseDTO getInvoiceDetailsByRequestId(String requestId);

	InvoiceDetailResponseDTO updateInvoiceDetails(AccountPayDto accountPayDto);

}
