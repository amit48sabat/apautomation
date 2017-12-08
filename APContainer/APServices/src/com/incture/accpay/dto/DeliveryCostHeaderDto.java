package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlRootElement
public class DeliveryCostHeaderDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private BigDecimal unplannedCost;
	private String createdBy;
	private String updatedBy;
	private java.util.Date createdDate;
	private java.util.Date updatedDate;
	private BigDecimal plannedCost;
	private List<DeliveryCostItemDto> item;
	private String poNumber;
	private String requestID;
	private BigDecimal freight;
	private BigDecimal surcharge;
	private BigDecimal storage;
	private BigDecimal fees;
	private boolean deleted;

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public BigDecimal getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(BigDecimal surcharge) {
		this.surcharge = surcharge;
	}

	public BigDecimal getStorage() {
		return storage;
	}

	public void setStorage(BigDecimal storage) {
		this.storage = storage;
	}

	public BigDecimal getFees() {
		return fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}

	public BigDecimal getPlannedCost() {
		return plannedCost;
	}

	public void setPlannedCost(BigDecimal plannedCost) {
		this.plannedCost = plannedCost;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getUnplannedCost() {
		return unplannedCost;
	}

	public void setUnplannedCost(BigDecimal unplannedCost) {
		this.unplannedCost = unplannedCost;
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

	public List<DeliveryCostItemDto> getItem() {
		return item;
	}

	public void setItem(List<DeliveryCostItemDto> item) {
		this.item = item;
	}

	@Override
	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public void validate(EnOperation Operation) throws InvalidInputFault {

		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (Operation != EnOperation.RETRIEVE) {
			enforceMandatory("DeliveryCostHeader.id", id);
		}

		id = checkStringSize("DeliveryCostHeader.id", id, 40);
		requestID = checkStringSize("DeliveryCostHeader.requestID", requestID,
				20);
		poNumber = checkStringSize("DeliveryCostHeader.poNumber", poNumber, 10);

	}

	@Override
	public String toString() {
		return "DeliveryCostHeaderDto [createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", deleted=" + deleted
				+ ", fees=" + fees + ", freight=" + freight + ", id=" + id
				+ ", item=" + item + ", plannedCost=" + plannedCost
				+ ", poNumber=" + poNumber + ", requestID=" + requestID
				+ ", storage=" + storage + ", surcharge=" + surcharge
				+ ", unplannedCost=" + unplannedCost + ", updatedBy="
				+ updatedBy + ", updatedDate=" + updatedDate + "]";
	}

}
