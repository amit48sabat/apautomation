package com.incture.accpay.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class AccountPayDto {
	private InvoiceDetailDto invoiceDetailUIDto;
	private List<GrnDto> grnUIDtoList;
	private List<PurchaseOrderDto> purchaseOrderUIDtoList;

	public InvoiceDetailDto getInvoiceDetailUIDto() {
		return invoiceDetailUIDto;
	}

	public void setInvoiceDetailUIDto(InvoiceDetailDto invoiceDetailUIDto) {
		this.invoiceDetailUIDto = invoiceDetailUIDto;
	}

	public List<GrnDto> getGrnUIDtoList() {
		return grnUIDtoList;
	}

	public void setGrnUIDtoList(List<GrnDto> grnUIDtoList) {
		this.grnUIDtoList = grnUIDtoList;
	}

	public List<PurchaseOrderDto> getPurchaseOrderUIDtoList() {
		return purchaseOrderUIDtoList;
	}

	public void setPurchaseOrderUIDtoList(List<PurchaseOrderDto> purchaseOrderUIDtoList) {
		this.purchaseOrderUIDtoList = purchaseOrderUIDtoList;
	}

}
