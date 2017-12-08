package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlRootElement
public class DeliveryCostItemDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String poNumber;
	private String poItemId;
	private String materialDescription;
	private BigDecimal amount;
	private BigDecimal historyAmount;
	private BigDecimal quantityBaseUnit;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	private String headerId;
	private BigDecimal quantity;
	private BigDecimal historyQuantity;
	private String fieldType;
	private String indicator;
	private String freightVendor;
	private BigDecimal amountLocal;
	private BigDecimal bpmng;
	private boolean deleted;
	private String stunr;
	private String zaehk;
	private Boolean selected;
	
	public String getFreightVendor() {
		return freightVendor;
	}

	public void setFreightVendor(String freightVendor) {
		this.freightVendor = freightVendor;
	}

	public BigDecimal getAmountLocal() {
		return amountLocal;
	}

	public void setAmountLocal(BigDecimal amountLocal) {
		this.amountLocal = amountLocal;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getHistoryQuantity() {
		return historyQuantity;
	}

	public void setHistoryQuantity(BigDecimal historyQuantity) {
		this.historyQuantity = historyQuantity;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public Boolean getValidForUsage() {
		return Boolean.TRUE;
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

	@Override
	public void validate(EnOperation operation) throws InvalidInputFault {

		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("DeliveryCostItem.id", id);
		}

		id = checkStringSize("DeliveryCostItem.id", id, 40);
		poNumber = checkStringSize("DeliveryCostItem.poNumber", poNumber, 20);
		poItemId = checkStringSize("DeliveryCostItem.poItemId", poItemId, 20);
		materialDescription = checkStringSize(
				"DeliveryCostItem.materialDescription", materialDescription,
				100);
		headerId = checkStringSize("DeliveryCostItem.headerId", headerId, 40);
		fieldType = checkStringSize("DeliveryCostItem.fieldType", fieldType, 40);
	}

	@Override
	public String toString() {
		return "DeliveryCostItemDto [amount=" + amount + ", amountLocal="
				+ amountLocal + ", bpmng=" + bpmng + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", deleted=" + deleted
				+ ", fieldType=" + fieldType + ", freightVendor="
				+ freightVendor + ", headerId=" + headerId + ", historyAmount="
				+ historyAmount + ", historyQuantity=" + historyQuantity
				+ ", id=" + id + ", indicator=" + indicator
				+ ", materialDescription=" + materialDescription
				+ ", poItemId=" + poItemId + ", poNumber=" + poNumber
				+ ", quantity=" + quantity + ", quantityBaseUnit="
				+ quantityBaseUnit + ", selected=" + selected + ", stunr="
				+ stunr + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", zaehk=" + zaehk + "]";
	}

}
