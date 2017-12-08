package com.incture.accpay.dto;

public class ProcessResponseDto {

	
	private String message;
	private String requestId;
	private String errorMsg;
	private String processId;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getProcessId() {
		return processId;
	}
	public void setProcessId(String processId) {
		this.processId = processId;
	}
	@Override
	public String toString() {
		return "ProcessResponseDto [errorMsg=" + errorMsg + ", message="
				+ message + ", processId=" + processId + ", requestId="
				+ requestId + "]";
	}
	
	
}
