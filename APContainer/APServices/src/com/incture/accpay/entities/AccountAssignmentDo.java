package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Entity implementation class for Entity: AccountAssignmentDo
 *
 */
@Entity
@Table(name = "AP_PO_ACCOUNT_ASSIGN")
public class AccountAssignmentDo implements BaseDo, Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;
	
	@Column(name = "PO_HEADER_ID")
	private String poHeaderId;
	
	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;
	
	@Column(name = "PO_ITEM", length = 30)
	private String poItem;
	
	@Column(name = "DELETED")
	private Boolean deleted;
	
	@Column(name = "SERIAL_NO", length = 5)
	private String serialNo;
	
	@Column(name = "QUANTITY")
	private BigDecimal quantity;
	
	@Column(name = "DISTR_PERC")
	private BigDecimal distrPerc;
	
	@Column(name = "NET_VALUE")
	private BigDecimal netValue;
	
	@Column(name = "GL_ACCOUNT", length = 30)
	private String glAccount;
	
	@Column(name = "COSTCENTER", length = 30)
	private String costCenter;
	
	@Column(name = "ORDERID", length = 30)
	private String orderId;
	
	@Column(name = "ASSET_NO", length = 30)
	private String assetNo;
	
	@Column(name = "SUB_NUMBER", length = 30)
	private String subNumber;
	
	@Column(name = "WBS_ELEMENT", length = 30)
	private String wbsElement;
	
	@Column(name = "UNPLANNED_LINE")
	private Boolean unplannedLIne;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(String poHeaderId) {
		this.poHeaderId = poHeaderId;
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

	public String getPoItem() {
		return poItem;
	}

	public void setPoItem(String poItem) {
		this.poItem = poItem;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getDistrPerc() {
		return distrPerc;
	}

	public void setDistrPerc(BigDecimal distrPerc) {
		this.distrPerc = distrPerc;
	}

	public BigDecimal getNetValue() {
		return netValue;
	}

	public void setNetValue(BigDecimal netValue) {
		this.netValue = netValue;
	}

	public String getGlAccount() {
		return glAccount;
	}

	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAssetNo() {
		return assetNo;
	}

	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}

	public String getSubNumber() {
		return subNumber;
	}

	public void setSubNumber(String subNumber) {
		this.subNumber = subNumber;
	}

	public String getWbsElement() {
		return wbsElement;
	}

	public void setWbsElement(String wbsElement) {
		this.wbsElement = wbsElement;
	}

	public Boolean getUnplannedLIne() {
		return unplannedLIne;
	}

	public void setUnplannedLIne(Boolean unplannedLIne) {
		this.unplannedLIne = unplannedLIne;
	}

	public AccountAssignmentDo() {
		super();
	}

	@Override
	public Object getPrimaryKey() {
		return id;
	}
	
}
