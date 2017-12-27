package com.incture.accpay.response.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.dto.AccountPayDto;

@XmlRootElement
public class AccPayResponseDTO {
	boolean Status;
	String message;
	List<AccountPayDto> responseDTOs = new ArrayList<AccountPayDto>();

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

	public List<AccountPayDto> getResponseDTOs() {
		return responseDTOs;
	}

	public void setResponseDTOs(List<AccountPayDto> responseDTOs) {
		this.responseDTOs = responseDTOs;
	}

}
