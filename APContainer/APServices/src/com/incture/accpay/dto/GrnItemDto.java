package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

public class GrnItemDto extends BaseDto implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String poItemId;
	private BigDecimal quantity;
	private String docNo;
	private String grItemId;
	private BigDecimal refQuantity;
	private BigDecimal refCostLocal;
	private BigDecimal refCostFOREIGN;
	private BigDecimal refInvCostLocal;
	private BigDecimal refInvCostForeign;
	private BigDecimal costLocalCurrency;
	private BigDecimal costForeignCurrency;
	private BigDecimal invoiceCostLocal;
	private BigDecimal invoiceCostForeign;
	private String materialId;
	private String docYear;
	private String moveType;
	private java.util.Date postingDate;
	private BigDecimal delivQty;
	private String delivUnit;
	private boolean deleted;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;

	public String getDocYear() {
		return docYear;
	}

	public void setDocYear(String docYear) {
		this.docYear = docYear;
	}

	public BigDecimal getRefQuantity() {
		return refQuantity;
	}

	public void setRefQuantity(BigDecimal refQuantity) {
		this.refQuantity = refQuantity;
	}

	public BigDecimal getRefCostLocal() {
		return refCostLocal;
	}

	public void setRefCostLocal(BigDecimal refCostLocal) {
		this.refCostLocal = refCostLocal;
	}

	public BigDecimal getRefCostFOREIGN() {
		return refCostFOREIGN;
	}

	public void setRefCostFOREIGN(BigDecimal refCostFOREIGN) {
		this.refCostFOREIGN = refCostFOREIGN;
	}

	public BigDecimal getRefInvCostLocal() {
		return refInvCostLocal;
	}

	public void setRefInvCostLocal(BigDecimal refInvCostLocal) {
		this.refInvCostLocal = refInvCostLocal;
	}

	public BigDecimal getRefInvCostForeign() {
		return refInvCostForeign;
	}

	public void setRefInvCostForeign(BigDecimal refInvCostForeign) {
		this.refInvCostForeign = refInvCostForeign;
	}

	public BigDecimal getCostLocalCurrency() {
		return costLocalCurrency;
	}

	public void setCostLocalCurrency(BigDecimal costLocalCurrency) {
		this.costLocalCurrency = costLocalCurrency;
	}

	public BigDecimal getCostForeignCurrency() {
		return costForeignCurrency;
	}

	public void setCostForeignCurrency(BigDecimal costForeignCurrency) {
		this.costForeignCurrency = costForeignCurrency;
	}

	public BigDecimal getInvoiceCostLocal() {
		return invoiceCostLocal;
	}

	public void setInvoiceCostLocal(BigDecimal invoiceCostLocal) {
		this.invoiceCostLocal = invoiceCostLocal;
	}

	public BigDecimal getInvoiceCostForeign() {
		return invoiceCostForeign;
	}

	public void setInvoiceCostForeign(BigDecimal invoiceCostForeign) {
		this.invoiceCostForeign = invoiceCostForeign;
	}

	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getPoItemId() {
		return poItemId;
	}

	public void setPoItemId(String poItemId) {
		this.poItemId = poItemId;
	}

	public String getDocNo() {
		return docNo;
	}

	public void setDocNo(String docNo) {
		this.docNo = docNo;
	}

	public String getGrItemId() {
		return grItemId;
	}

	public void setGrItemId(String grItemId) {
		this.grItemId = grItemId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getMoveType() {
		return moveType;
	}

	public void setMoveType(String moveType) {
		this.moveType = moveType;
	}

	public java.util.Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(java.util.Date postingDate) {
		this.postingDate = postingDate;
	}

	public BigDecimal getDelivQty() {
		return delivQty;
	}

	public void setDelivQty(BigDecimal delivQty) {
		this.delivQty = delivQty;
	}

	public String getDelivUnit() {
		return delivUnit;
	}

	public void setDelivUnit(String delivUnit) {
		this.delivUnit = delivUnit;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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

	@Override
	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	@Override
	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("GrnItem.id", id);
		}
		id = checkStringSize("GrnItem.id", id, 40);
		poItemId = checkStringSize("Grn.poItemId", poItemId, 10);
		docNo = checkStringSize("GrnItem.docNo", docNo, 10);
		grItemId = checkStringSize("GrnItem.grItemId", grItemId, 10);
		docYear = checkStringSize("GrnItem.docYear", docYear, 4);

	}

	@Override
	public String toString() {
		return "GrnItemDto [costForeignCurrency=" + costForeignCurrency
				+ ", costLocalCurrency=" + costLocalCurrency + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", deleted="
				+ deleted + ", delivQty=" + delivQty + ", delivUnit="
				+ delivUnit + ", docNo=" + docNo + ", docYear=" + docYear
				+ ", grItemId=" + grItemId + ", id=" + id
				+ ", invoiceCostForeign=" + invoiceCostForeign
				+ ", invoiceCostLocal=" + invoiceCostLocal + ", materialId="
				+ materialId + ", moveType=" + moveType + ", poItemId="
				+ poItemId + ", postingDate=" + postingDate + ", quantity="
				+ quantity + ", refCostFOREIGN=" + refCostFOREIGN
				+ ", refCostLocal=" + refCostLocal + ", refInvCostForeign="
				+ refInvCostForeign + ", refInvCostLocal=" + refInvCostLocal
				+ ", refQuantity=" + refQuantity + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

}
