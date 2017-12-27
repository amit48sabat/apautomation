package com.incture.accpay.response.dto;

public class PI_PO_GRN_ServiceResponseDTO {
	boolean Status;

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

	String message;
}
