package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "AP_DELIVERY_COST_ITEM")
public class DeliveryCostItemDo implements BaseDo, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;

	@Column(name = "PO_NUMBER", length = 11)
	private String poNumber;

	@Column(name = "PO_ITEM_ID", length = 10)
	private String poItemId;

	@Column(name = "MATERIAL_DESCRIPTION", length = 100)
	private String materialDescription;

	@Column(name = "QUANTITY", length = 20)
	private BigDecimal quantity;

	@Column(name = "AMOUNT", length = 20)
	private BigDecimal amount;

	@Column(name = "HISTORY_QUANTITY", length = 20)
	private BigDecimal historyQuantity;

	@Column(name = "HISTORY_AMOUNT", length = 20)
	private BigDecimal historyAmount;
	
	@Column(name = "QUANTITY_BASE_UNIT", length = 10)
	private BigDecimal quantityBaseUnit;

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

	@Column(name = "HEADER_ID", length = 40)
	private String headerId;
	
	@Column (name = "FIELD_TYPE" , length = 40)
	private String fieldType;
	
	@Column(name="INDICATOR", length=10)
    private String indicator;
	
	@Column(name="FREIGHT_VENDOR",length=12)
	private String freightVendor;
	
	@Column(name="AMOUNT_LOCAL")
	private BigDecimal amountLcoal;
	
	@Column(name="BPMNG")
	private BigDecimal bpmng;
	
	@Column(name="STUNR")
	private String stunr;
	
	@Column(name="ZAEHK")
	private String zaehk;
	
	@Column(name = "SELECTED")
	private Boolean selected;

	public String getFreightVendor() {
		return freightVendor;
	}

	public void setFreightVendor(String freightVendor) {
		this.freightVendor = freightVendor;
	}

	public BigDecimal getAmountLcoal() {
		return amountLcoal;
	}

	public void setAmountLcoal(BigDecimal amountLcoal) {
		this.amountLcoal = amountLcoal;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getPoItemId() {
		return poItemId;
	}

	public void setPoItemId(String poItemId) {
		this.poItemId = poItemId;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getHistoryQuantity() {
		return historyQuantity;
	}

	public void setHistoryQuantity(BigDecimal historyQuantity) {
		this.historyQuantity = historyQuantity;
	}

	public BigDecimal getHistoryAmount() {
		return historyAmount;
	}

	public void setHistoryAmount(BigDecimal historyAmount) {
		this.historyAmount = historyAmount;
	}

	public BigDecimal getQuantityBaseUnit() {
		return quantityBaseUnit;
	}

	public void setQuantityBaseUnit(BigDecimal quantityBaseUnit) {
		this.quantityBaseUnit = quantityBaseUnit;
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

	public String getHeaderId() {
		return headerId;
	}

	public void setHeaderId(String headerId) {
		this.headerId = headerId;
	}
	
	public BigDecimal getBpmng() {
		return bpmng;
	}

	public void setBpmng(BigDecimal bpmng) {
		this.bpmng = bpmng;
	}

	public String getStunr() {
		return stunr;
	}

	public void setStunr(String stunr) {
		this.stunr = stunr;
	}

	public String getZaehk() {
		return zaehk;
	}

	public void setZaehk(String zaehk) {
		this.zaehk = zaehk;
	}

	public Boolean getSelected() {
		return selected;
	}

	public void setSelected(Boolean selected) {
		this.selected = selected;
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
		return null;
	}
	

}
