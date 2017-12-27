package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlRootElement
public class PurchaseOrderDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = -7946275458431427282L;
	private String companyCode;
	private String currency;
	private BigDecimal exchchangeRate;
	private String id;
	private String paymentTerms;
	private String poNumber;
	private String requestId;
	private String vendor;
	private java.util.Date DocDate;
	private Boolean hasDeliveryCharges;
	private Boolean has_Gr;
	private BigDecimal plannedCost;
	private Boolean hasDeliveryVendor;
	private String deliveryVendor;
	private Boolean isThirdParty;
	private boolean deleted;
	private Date createDate;
	private Date updatedDate;
	private String CreatedBy;
	private String updatedBy;
	
	private List<AccountAssignmentDto> accAssignDtoList; 
	
	public Boolean getHasDeliveryVendor() {
		return hasDeliveryVendor;
	}

	public void setHasDeliveryVendor(Boolean hasDeliveryVendor) {
		this.hasDeliveryVendor = hasDeliveryVendor;
	}

	public String getDeliveryVendor() {
		return deliveryVendor;
	}

	public void setDeliveryVendor(String deliveryVendor) {
		this.deliveryVendor = deliveryVendor;
	}

	public BigDecimal getPlannedCost() {
		return plannedCost;
	}

	public void setPlannedCost(BigDecimal plannedCost) {
		this.plannedCost = plannedCost;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public Date getDocDate() {
		return DocDate;
	}

	public void setDocDate(Date docDate) {
		DocDate = docDate;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Boolean getHasDeliveryCharges() {
		return hasDeliveryCharges;
	}

	public void setHasDeliveryCharges(Boolean hasDeliveryCharges) {
		this.hasDeliveryCharges = hasDeliveryCharges;
	}

	public Boolean getHas_Gr() {
		return has_Gr;
	}

	public void setHas_Gr(Boolean hasGr) {
		has_Gr = hasGr;
	}

	private List<PoItemDto> poItemList;

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
	}

	public List<PoItemDto> getPoItemList() {
		return poItemList;
	}

	public void setPoItemList(List<PoItemDto> poItemList) {
		this.poItemList = poItemList;
	}

	public PurchaseOrderDto() {
		super();
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getExchchangeRate() {
		return exchchangeRate;
	}

	public void setExchchangeRate(BigDecimal exchchangeRate) {
		this.exchchangeRate = exchchangeRate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public Boolean getIsThirdParty() {
		return isThirdParty;
	}

	public void setIsThirdParty(Boolean isThirdParty) {
		this.isThirdParty = isThirdParty;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<AccountAssignmentDto> getAccAssignDtoList() {
		return accAssignDtoList;
	}

	public void setAccAssignDtoList(List<AccountAssignmentDto> accAssignDtoList) {
		this.accAssignDtoList = accAssignDtoList;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("PurchaseOrder.id", id);
		}
		companyCode = checkStringSize("PurchaseOrder.companyCode", companyCode,
				30);
		currency = checkStringSize("PurchaseOrder.currency", currency, 30);
		id = checkStringSize("PurchaseOrder.id", id, 40);
		paymentTerms = checkStringSize("PurchaseOrder.paymentTerms",
				paymentTerms, 30);
		poNumber = checkStringSize("PurchaseOrder.poNumber", poNumber, 30);
		requestId = checkStringSize("PurchaseOrder.requestId", requestId, 40);
		vendor = checkStringSize("PurchaseOrder.vendor", vendor, 30);
	}

	@Override
	public String toString() {
		return "PurchaseOrderDto [CreatedBy=" + CreatedBy + ", DocDate="
				+ DocDate + ", accAssignDtoList=" + accAssignDtoList
				+ ", companyCode=" + companyCode + ", createDate=" + createDate
				+ ", currency=" + currency + ", deleted=" + deleted
				+ ", deliveryVendor=" + deliveryVendor + ", exchchangeRate="
				+ exchchangeRate + ", hasDeliveryCharges=" + hasDeliveryCharges
				+ ", hasDeliveryVendor=" + hasDeliveryVendor + ", has_Gr="
				+ has_Gr + ", id=" + id + ", isThirdParty=" + isThirdParty
				+ ", paymentTerms=" + paymentTerms + ", plannedCost="
				+ plannedCost + ", poItemList=" + poItemList + ", poNumber="
				+ poNumber + ", requestId=" + requestId + ", updatedBy="
				+ updatedBy + ", updatedDate=" + updatedDate + ", vendor="
				+ vendor + "]";
	}

}