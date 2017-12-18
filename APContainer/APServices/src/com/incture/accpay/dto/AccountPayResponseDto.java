package com.incture.accpay.dto;

import java.util.List;

public class AccountPayResponseDto {
	private InvoiceDetailDto detailDto;
	private List<GrnDto> grnDtos;
	private List<PurchaseOrderDto> purchaseOrderDtos;

	public List<GrnDto> getGrnDtos() {
		return grnDtos;
	}

	public void setGrnDtos(List<GrnDto> grnDtos) {
		this.grnDtos = grnDtos;
	}

	public List<PurchaseOrderDto> getPurchaseOrderDtos() {
		return purchaseOrderDtos;
	}

	public void setPurchaseOrderDtos(List<PurchaseOrderDto> purchaseOrderDtos) {
		this.purchaseOrderDtos = purchaseOrderDtos;
	}

	public InvoiceDetailDto getDetailDto() {
		return detailDto;
	}

	public void setDetailDto(InvoiceDetailDto detailDto) {
		this.detailDto = detailDto;
	}

}
