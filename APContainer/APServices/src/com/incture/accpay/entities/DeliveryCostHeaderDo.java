package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "AP_DELIVERY_COST_HEADER")
public class DeliveryCostHeaderDo implements BaseDo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;

	@Column(name = "UNPLANNED_COST", length = 40)
	private BigDecimal unplannedCost;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE", length = 20)
	private java.util.Date createdDate;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE", length = 20)
	private java.util.Date updatedDate;

	@Column(name = "PO_NUMBER", length = 10)
	private String poNumber;

	@Column(name = "REQUEST_ID", length = 20)
	private String requestID;

	@Column(name = "PLANNED_COST")
	private BigDecimal plannedCost;

	@Column(name = "FREIGHT")
	private BigDecimal freight;

	@Column(name = "SURCHARGE")
	private BigDecimal surcharge;

	@Column(name = "STORAGE")
	private BigDecimal storage;

	@Column(name = "FEES")
	private BigDecimal fees;

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

	private List<DeliveryCostItemDo> item;

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

	public List<DeliveryCostItemDo> getItem() {
		return item;
	}

	public void setItem(List<DeliveryCostItemDo> item) {
		this.item = item;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
