package com.incture.accpay.dto;

import java.io.Serializable;
import java.util.Date;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

/**
 * Comments: null,
 */
public class RequestHistoryDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = 3331152813094923164L;

	private String emailFrom;

	private String emailSubject;

	private String filePath;

	private String id;

	private Boolean isNonPo;

	private String invoiceDocNumber;

	private String processId;

	private String sapInvoiceNumber;

	private String sapStatus;

	private String startedBy;
	
	private String updatedBy;

	private String startType;

	private Date emailTime;

	private String status;

	private Date timeEnded;

	private Date timeStarted;
	
	private Date timeUpdated;

	private String vendorId;

	private String vendorName;

	private boolean ivGR;

	private boolean setData;

	private String vendorBlocked;

	private String vendorPymtMethods;

	private String agentID;

	private String agentFirstName;

	private String agentLastName;

	private String agentEmail;

	private boolean deleted;

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

	private boolean duplicateInvoice = false;

	/**
	 * @return the ivGR
	 */

	public RequestHistoryDto() {
		super();
	}

	/**
	 * @return the ivGR
	 */
	public boolean isIvGR() {
		return ivGR;
	}

	/**
	 * @param ivGR
	 *            the ivGR to set
	 */
	public void setIvGR(boolean ivGR) {
		this.ivGR = ivGR;
	}

	public boolean isDuplicateInvoice() {
		return duplicateInvoice;
	}

	public void setDuplicateInvoice(boolean duplicateInvoice) {
		this.duplicateInvoice = duplicateInvoice;
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
	 * @param startedBy
	 *            the startedBy to set
	 */
	public void setStartedBy(String startedBy) {
		this.startedBy = startedBy;
	}

	public String getStartType() {
		return startType;
	}

	public void setStartType(String startType) {
		this.startType = startType;
	}

	public Date getEmailTime() {
		return emailTime;
	}

	public void setEmailTime(Date emailTime) {
		this.emailTime = emailTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getTimeEnded() {
		return timeEnded;
	}

	public void setTimeEnded(Date timeEnded) {
		this.timeEnded = timeEnded;
	}

	public java.util.Date getTimeStarted() {
		return timeStarted;
	}

	public void setTimeStarted(java.util.Date timeStarted) {
		this.timeStarted = timeStarted;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(Date timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("Request.id", id);
		}
		emailFrom = checkStringSize("Request.emailFrom", emailFrom, 254);
		emailSubject = checkStringSize("Request.emailSubject", emailSubject, 255);
		filePath = checkStringSize("Request.filePath", filePath, 50);
		id = checkStringSize("Request.id", id, 40);
		invoiceDocNumber = checkStringSize("Request.invoiceDocNumber",
				invoiceDocNumber, 10);
		processId = checkStringSize("Request.processId", processId, 40);
		sapStatus = checkStringSize("Request.sapStatus", sapStatus, 50);
		startType = checkStringSize("Request.startType", startType, 30);
		status = checkStringSize("Request.status", status, 10);
		vendorId = checkStringSize("Request.vendorId", vendorId, 40);
		vendorName = checkStringSize("Request.vendorName", vendorName, 100);
		vendorBlocked = checkStringSize("Request.vendorBlocked", vendorBlocked,
				10);

	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	@Override
	public String toString() {
		return "RequestHistoryDto [agentEmail=" + agentEmail
				+ ", agentFirstName=" + agentFirstName + ", agentID=" + agentID
				+ ", agentLastName=" + agentLastName + ", deleted=" + deleted
				+ ", duplicateInvoice=" + duplicateInvoice + ", emailFrom="
				+ emailFrom + ", emailSubject=" + emailSubject + ", emailTime="
				+ emailTime + ", filePath=" + filePath + ", id=" + id
				+ ", invoiceDocNumber=" + invoiceDocNumber + ", isNonPo="
				+ isNonPo + ", ivGR=" + ivGR + ", processId=" + processId
				+ ", sapInvoiceNumber=" + sapInvoiceNumber + ", sapStatus="
				+ sapStatus + ", setData=" + setData + ", startType="
				+ startType + ", startedBy=" + startedBy + ", status=" + status
				+ ", timeEnded=" + timeEnded + ", timeStarted=" + timeStarted
				+ ", timeUpdated=" + timeUpdated + ", updatedBy=" + updatedBy
				+ ", vendorBlocked=" + vendorBlocked + ", vendorId=" + vendorId
				+ ", vendorName=" + vendorName + ", vendorPymtMethods="
				+ vendorPymtMethods + "]";
	}

}