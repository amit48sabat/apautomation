package com.incture.accpay.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InvoiceDetailUiDTO {
	InvoiceDetailDto invoiceDetailUIDto;

	public InvoiceDetailDto getInvoiceDetailUIDto() {
		return invoiceDetailUIDto;
	}

	public void setInvoiceDetailUIDto(InvoiceDetailDto invoiceDetailUIDto) {
		this.invoiceDetailUIDto = invoiceDetailUIDto;
	}
	

}
