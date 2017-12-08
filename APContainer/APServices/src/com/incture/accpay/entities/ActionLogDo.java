package com.incture.accpay.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
* Comments: null,
*/
@Entity
@Table(name="AP_ACTION_LOG")
public class ActionLogDo implements BaseDo, Serializable {
	public static final long serialVersionUID = -6582135780955448287L;

	@Column(name="ACTION_OWNER", length=30)
	private String actionOwner;

	@Column(name="CREATED_BY")
	private String createdBy;
	
	@Column(name="UPDATED_BY")
	private String updatedBy;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="END_TIME")
	private java.util.Date endTime;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="START_TIME")
	private java.util.Date startTIme;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private java.util.Date createdDate;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private java.util.Date updatedDate;
	
	@Column(name="ERROR_DESCRIPTION", length=30)
	private String errorDescription;

	@Column(name="ERROR_MESSAGE", length=30)
	private String errorMessage;

	@Id
	@Column(name="ID", length=40, nullable = false)
	private String id;

	@Column(name="REQUEST_ID", length=40)
	private String requestID;

	@Column(name="STATUS", length=10)
	private String status;

	@Column(name="STEP_NAME",length = 20)
	private String stepName;

	@Column(name="TASK_ID", length=40)
	private String taskId;

	@Override
	public Object getPrimaryKey() {
		return id;
	}

	public ActionLogDo() {
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

	public java.util.Date getStartTIme() {
		return startTIme;
	}

	public void setStartTIme(java.util.Date startTIme) {
		this.startTIme = startTIme;
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

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public java.util.Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(java.util.Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}