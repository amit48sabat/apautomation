package com.incture.accpay.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserPrefColResponseDto {

	private String message;
	private String messageDesc;
	private UserPreferenceColumnsDto userPrefCol;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setMessageDesc(String messageDesc) {
		this.messageDesc = messageDesc;
	}

	public String getMessageDesc() {
		return messageDesc;
	}

	public UserPreferenceColumnsDto getUserPrefCol() {
		return userPrefCol;
	}

	public void setUserPrefCol(UserPreferenceColumnsDto userPrefCol) {
		this.userPrefCol = userPrefCol;
	}

	@Override
	public String toString() {
		return "UserPrefColResponseDto [message=" + message + ", messageDesc="
				+ messageDesc + ", userPrefCol=" + userPrefCol + "]";
	}

}
