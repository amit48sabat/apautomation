package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;

public class AccountAssignmentDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;
	private String poItem;
	private Boolean deleted;
	private String serialNo;
	private BigDecimal quantity;
	private BigDecimal distrPerc;
	private BigDecimal netValue;
	private String glAccount;
	private String costCenter;
	private String orderId;
	private String assetNo;
	private String subNumber;
	private String wbsElement;
	private Boolean unplannedLIne;
	private String poHeaderId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(String poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	
	@Override
	public String toString() {
		return "AccountAssignmentDto [assetNo=" + assetNo + ", costCenter="
				+ costCenter + ", createdBy=" + createdBy + ", createdDate="
				+ createdDate + ", deleted=" + deleted + ", distrPerc="
				+ distrPerc + ", glAccount=" + glAccount + ", id=" + id
				+ ", netValue=" + netValue + ", orderId=" + orderId
				+ ", poHeaderId=" + poHeaderId + ", poItem=" + poItem
				+ ", quantity=" + quantity + ", serialNo=" + serialNo
				+ ", subNumber=" + subNumber + ", unplannedLIne="
				+ unplannedLIne + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", wbsElement=" + wbsElement + "]";
	}

	@Override
	public Boolean getValidForUsage() {
		return null;
	}

	@Override
	public void validate(EnOperation enOperation) throws InvalidInputFault {
	}

}
