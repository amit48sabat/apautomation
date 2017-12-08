package com.incture.accpay.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlRootElement
public class RequestDto extends BaseDto implements Serializable {
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

	private java.util.Date emailTime;

	private String status;

	private java.util.Date timeEnded;

	private java.util.Date timeStarted;
	
	private java.util.Date timeUpdated;

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

	private boolean showPlannedCost;

	private String vendorPaymentBlockedDefault;

	private boolean duplicateInvoice = false;

	private String duplicateMessage;

	private boolean grAvaliable = true;

	private String paymentTerms;

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

	/**
	 * @return the ivGR
	 */

	public RequestDto() {
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

	public java.util.Date getEmailTime() {
		return emailTime;
	}

	public void setEmailTime(java.util.Date emailTime) {
		this.emailTime = emailTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getTimeEnded() {
		return timeEnded;
	}

	public void setTimeEnded(java.util.Date timeEnded) {
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

	public boolean isShowPlannedCost() {
		return showPlannedCost;
	}

	public void setShowPlannedCost(boolean showPlannedCost) {
		this.showPlannedCost = showPlannedCost;
	}

	public String getVendorPaymentBlockedDefault() {
		return vendorPaymentBlockedDefault;
	}

	public void setVendorPaymentBlockedDefault(
			String vendorPaymentBlockedDefault) {
		this.vendorPaymentBlockedDefault = vendorPaymentBlockedDefault;
	}

	public String getDuplicateMessage() {
		return duplicateMessage;
	}

	public void setDuplicateMessage(String duplicateMessage) {
		this.duplicateMessage = duplicateMessage;
	}

	public boolean isGrAvaliable() {
		return grAvaliable;
	}

	public void setGrAvaliable(boolean grAvaliable) {
		this.grAvaliable = grAvaliable;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
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

	public java.util.Date getTimeUpdated() {
		return timeUpdated;
	}

	public void setTimeUpdated(java.util.Date timeUpdated) {
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
		return "RequestDto [agentEmail=" + agentEmail + ", agentFirstName="
				+ agentFirstName + ", agentID=" + agentID + ", agentLastName="
				+ agentLastName + ", deleted=" + deleted
				+ ", duplicateInvoice=" + duplicateInvoice
				+ ", duplicateMessage=" + duplicateMessage + ", emailFrom="
				+ emailFrom + ", emailSubject=" + emailSubject + ", emailTime="
				+ emailTime + ", filePath=" + filePath + ", grAvaliable="
				+ grAvaliable + ", id=" + id + ", invoiceDocNumber="
				+ invoiceDocNumber + ", isNonPo=" + isNonPo + ", ivGR=" + ivGR
				+ ", paymentTerms=" + paymentTerms + ", processId=" + processId
				+ ", sapInvoiceNumber=" + sapInvoiceNumber + ", sapStatus="
				+ sapStatus + ", setData=" + setData + ", showPlannedCost="
				+ showPlannedCost + ", startType=" + startType + ", startedBy="
				+ startedBy + ", status=" + status + ", timeEnded=" + timeEnded
				+ ", timeStarted=" + timeStarted + ", timeUpdated="
				+ timeUpdated + ", updatedBy=" + updatedBy + ", vendorBlocked="
				+ vendorBlocked + ", vendorId=" + vendorId + ", vendorName="
				+ vendorName + ", vendorPaymentBlockedDefault="
				+ vendorPaymentBlockedDefault + ", vendorPymtMethods="
				+ vendorPymtMethods + "]";
	}

}