package com.incture.accpay.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;

@XmlRootElement
public class UserPreferenceColumnsDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String userId;
	private List<String> columnList;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setColumnList(List<String> columnList) {
		this.columnList = columnList;
	}

	public List<String> getColumnList() {
		return columnList;
	}

	@Override
	public Boolean getValidForUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(EnOperation enOperation) throws InvalidInputFault {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "UserPreferenceColumnsDto [columnList=" + columnList
				+ ", userId=" + userId + "]";
	}

}
