package com.incture.accpay.dto;

import java.io.Serializable;
import java.util.Date;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

public class ActionLogDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = -7223994935290185446L;

	private String actionOwner;

	private java.util.Date endTime;
	
	private java.util.Date startTime;
	
	private String createdBy;

	private String updatedBy;
	
	private Date createdDate;
	
	private Date updatedDate;

	private String errorDescription;

	private String errorMessage;

	private String id;

	private String requestID;


	private String status;

	private String stepName;

	private String taskId;

	private boolean deleted;

	public ActionLogDto() {
		super();
	}

	public String getActionOwner() {
		return actionOwner;
	}

	public void setActionOwner(String actionOwner) {
		this.actionOwner = actionOwner;
	}

	public java.util.Date getEndTime() {
		return endTime;
	}

	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public java.util.Date getStartTime() {
		return startTime;
	}

	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStepName() {
		return stepName;
	}

	public void setStepName(String stepName) {
		this.stepName = stepName;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("ActionLog.id", id);
		}
		actionOwner = checkStringSize("ActionLog.actionOwner", actionOwner, 30);
		errorDescription = checkStringSize("ActionLog.errorDescription",
				errorDescription, 30);
		errorMessage = checkStringSize("ActionLog.errorMessage", errorMessage,
				30);
		id = checkStringSize("ActionLog.id", id, 40);
		requestID = checkStringSize("ActionLog.requestID", requestID, 40);
		status = checkStringSize("ActionLog.status", status, 10);
		taskId = checkStringSize("ActionLog.taskId", taskId, 40);
		stepName = checkStringSize("ActionLog.stepName", stepName, 20);
	}

	@Override
	public String toString() {
		return "ActionLogDto [actionOwner=" + actionOwner + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", deleted="
				+ deleted + ", endTime=" + endTime + ", errorDescription="
				+ errorDescription + ", errorMessage=" + errorMessage + ", id="
				+ id + ", requestID=" + requestID + ", startTime=" + startTime
				+ ", status=" + status + ", stepName=" + stepName + ", taskId="
				+ taskId + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + "]";
	}

}