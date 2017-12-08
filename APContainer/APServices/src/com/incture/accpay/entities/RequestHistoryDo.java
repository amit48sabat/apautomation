package com.incture.accpay.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Comments: null,
 */
@Entity
@Table(name = "AP_REQUEST_HISTORY")
public class RequestHistoryDo implements BaseDo, Serializable {
	public static final long serialVersionUID = 7433870729901345715L;

	@Column(name = "EMAIL_FROM", length = 254)
	private String emailFrom;

	@Column(name = "EMAIL_SUBJECT", length = 255)
	private String emailSubject;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "EMAIL_TIME", length = 50)
	private Date emailTime;

	@Column(name = "FILE_PATH", length = 50)
	private String filePath;

	@Id
	@Column(name = "REQUEST_ID", length = 40, nullable = false)
	private String id;

	@Column(name = "IS_NON_PO", length = 10)
	private Boolean isNonPo;

	@Column(name = "INVOICE_REFERENCE_NUMBER", length = 10)
	private String invoiceDocNumber;

	@Column(name = "PROCESS_ID", length = 40)
	private String processId;

	@Column(name = "SAP_INVOICE_NUMBER" , length = 10)
	private String sapInvoiceNumber;

	@Column(name = "SAPSTATUS", length = 50)
	private String sapStatus;

	@Column(name = "CREATED_BY")
	private String startedBy;
 
	@Column(name = "UPDATED_BY")
	private String updatedBy;
 
	@Column(name = "START_TYPE", length = 30)
	private String startType;

	@Column(name = "STATUS", length = 10)
	private String status;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "ENDED_DATE")
	private Date timeEnded;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private java.util.Date timeStarted;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private Date timeUpdated;
	
	@Column(name = "VENDOR_ID", length = 40)
	private String vendorId;

	@Column(name = "VENDOR_NAME", length = 100)
	private String vendorName;

	@Column(name = "DUPLICATEINVOICE")
	private boolean duplicateInvoice;
	
	@Column(name = "IV_GR")
	private boolean ivGR;
	
	@Column(name = "SET_DATA")
	private boolean setData;
	
	@Column(name = "VENDOR_BLOCKED")
	private String vendorBlocked;
	
	@Column(name = "VENDOR_PAYMENT_METHODS")
	private String vendorPymtMethods;
	
	@Column(name="AGENT_ID")
	private String agentID;
	
	@Column(name="AGENT_FIRST_NAME")
	private String agentFirstName;
	
	@Column(name="AGENT_LAST_NAME")
    private String agentLastName;
	
	@Column(name="AGENT_EMAIL")
	private String agentEmail;
	
	
 
	
	public String getAgentID() {
		return agentID;
	}


	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}


	public String getAgentFirstName() {
		return agentFirstName;
	}


	public void setAgentFirstName(String agentFirstName) {
		this.agentFirstName = agentFirstName;
	}


	public String getAgentLastName() {
		return agentLastName;
	}


	public void setAgentLastName(String agentLastName) {
		this.agentLastName = agentLastName;
	}


	public String getAgentEmail() {
		return agentEmail;
	}


	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}


	public String getVendorBlocked() {
		return vendorBlocked;
	}


	public void setVendorBlocked(String vendorBlocked) {
		this.vendorBlocked = vendorBlocked;
	}

	

	public String getVendorPymtMethods() {
		return vendorPymtMethods;
	}


	public void setVendorPymtMethods(String vendorPymtMethods) {
		this.vendorPymtMethods = vendorPymtMethods;
	}


	public boolean isSetData() {
		return setData;
	}


	public void setSetData(boolean setData) {
		this.setData = setData;
	}


	public Date getTimeEnded() {
		return timeEnded;
	}
	

	public void setTimeEnded(Date timeEnded) {
		this.timeEnded = timeEnded;
	}

	@Override
	public Object getPrimaryKey() {
		return id;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailSubject() {
		return emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public Date getEmailTime() {
		return emailTime;
	}

	public void setEmailTime(Date emailTime) {
		this.emailTime = emailTime;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getIsNonPo() {
		return isNonPo;
	}

	public void setIsNonPo(Boolean isNonPo) {
		this.isNonPo = isNonPo;
	}

	
	/**
	 * @return the ivGR
	 */
	public boolean isIvGR() {
		return ivGR;
	}


	/**
	 * @param ivGR the ivGR to set
	 */
	public void setIvGR(boolean ivGR) {
		this.ivGR = ivGR;
	}


	public String getInvoiceDocNumber() {
		return invoiceDocNumber;
	}

	public void setInvoiceDocNumber(String invoiceDocNumber) {
		this.invoiceDocNumber = invoiceDocNumber;
	}

	public String getProcessId() {
		return processId;
	}

	public void setProcessId(String processId) {
		this.processId = processId;
	}


	public String getSapInvoiceNumber() {
		return sapInvoiceNumber;
	}


	public void setSapInvoiceNumber(String sapInvoiceNumber) {
		this.sapInvoiceNumber = sapInvoiceNumber;
	}


	public String getSapStatus() {
		return sapStatus;
	}

	public void setSapStatus(String sapStatus) {
		this.sapStatus = sapStatus;
	}

 

	/**
	 * @return the startedBy
	 */
	public String getStartedBy() {
		return startedBy;
	}

	/**
	 * @param startedBy the startedBy to set
	 */
	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public String getStartType() {
		return startType;
	}

	public void setStartType(String startType) {
		this.startType = startType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getTimeStarted() {
		return timeStarted;
	}

	public void setTimeStarted(java.util.Date timeStarted) {
		this.timeStarted = timeStarted;
	}

	public Date getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Date timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public boolean getDuplicateInvoice() {
		return duplicateInvoice;
	}

	public void setDuplicateInvoice(boolean duplicateInvoice) {
		this.duplicateInvoice = duplicateInvoice;
	}

}