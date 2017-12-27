package com.incture.accpay.response.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.dto.InvoiceDetailDto;

@XmlRootElement
public class InvoiceDetailResponseDTO {
	boolean Status;
	String message;
	String id;
	List<InvoiceDetailDto> responseDTOs = new ArrayList<InvoiceDetailDto>();

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<InvoiceDetailDto> getResponseDTOs() {
		return responseDTOs;
	}

	public void setResponseDTOs(List<InvoiceDetailDto> responseDTOs) {
		this.responseDTOs = responseDTOs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
