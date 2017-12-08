package com.incture.accpay.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

public class GrnDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String requestId;

	private Date createdDate;

	private Date updatedDate;
	
	private String poNumber;

	private String createdBy;
	
	private String updatedBy;

	private List<GrnItemDto> grnItemList;

	private List<GrnItemTotalDto> grnItemTotalList;

	private boolean deleted;

	public List<GrnItemTotalDto> getGrnItemTotalList() {
		return grnItemTotalList;
	}

	public void setGrnItemTotalList(List<GrnItemTotalDto> grnItemTotalList) {
		this.grnItemTotalList = grnItemTotalList;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public List<GrnItemDto> getGrnItemList() {
		return grnItemList;
	}

	public void setGrnItemList(List<GrnItemDto> grnItemList) {
		this.grnItemList = grnItemList;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("Grn.id", id);
		}
		id = checkStringSize("Grn.id", id, 40);
		requestId = checkStringSize("Grn.requestId", requestId, 30);
		poNumber = checkStringSize("Grn.poNumber", poNumber, 10);
	}

	@Override
	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	@Override
	public String toString() {
		return "GrnDto [createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", deleted=" + deleted + ", grnItemList="
				+ grnItemList + ", grnItemTotalList=" + grnItemTotalList
				+ ", id=" + id + ", poNumber=" + poNumber + ", requestId="
				+ requestId + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + "]";
	}

}
