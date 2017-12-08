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
public class InvoiceHistoryDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = 3884260955283377626L;

	private String vendorName;

	private String companyCode;

	private String currency;

	private java.util.Date deliveryDate;

	private java.util.Date invoiceDate;

	private BigDecimal totalDiscount;

	private String headerPatternMatchingFlag;

	private String id;

	private String invoiceNumber;

	private java.util.Date postingDate;

	private String purchaseOrderReference;

	private String requestId;

	private String route;

	private BigDecimal subTotal;

	private String taxIndicator;

	private BigDecimal total;

	private BigDecimal totalInvoiceAmount;

	private boolean discrepencyFlag;

	private Date baseLineDate;

	private String paymentTerms;

	private String paymentMethod;

	private String paymentBlock;

	private BigDecimal surcharge;

	private BigDecimal plannedCost;

	private BigDecimal invoiceHeaderCharges;

	private BigDecimal netDiffrenceHeaderCharges;

	private boolean hasUnplannedCost;

	private BigDecimal po_freight;

	private BigDecimal po_storage;

	private BigDecimal po_importfees;

	private BigDecimal po_surcharge;

	private String vendorId;

	private BigDecimal freight;

	private BigDecimal storage;

	private List<InvoiceItemDto> invoiceItemList;

	private String comment;

	private String mode;

	private BigDecimal importFees;

	private BigDecimal Freight_percentage;

	private BigDecimal Fee_percentage;

	private BigDecimal abbyNetPrice;

	private BigDecimal grossPrice;

	private BigDecimal balanceAmount;

	private boolean deleted;
	
	private Date dateCreated;
	
	private Date dateUpdated;
	
	private String userCreated;
	
	private String userUpdated;

	public boolean isDiscrepencyFlag() {
		return discrepencyFlag;
	}

	public void setDiscrepencyFlag(boolean discrepencyFlag) {
		this.discrepencyFlag = discrepencyFlag;
	}

	public BigDecimal getPlannedCost() {
		return plannedCost;
	}

	public void setPlannedCost(BigDecimal plannedCost) {
		this.plannedCost = plannedCost;
	}

	public BigDecimal getInvoiceHeaderCharges() {
		return invoiceHeaderCharges;
	}

	public void setInvoiceHeaderCharges(BigDecimal invoiceHeaderCharges) {
		this.invoiceHeaderCharges = invoiceHeaderCharges;
	}

	public BigDecimal getNetDiffrenceHeaderCharges() {
		return netDiffrenceHeaderCharges;
	}

	public void setNetDiffrenceHeaderCharges(
			BigDecimal netDiffrenceHeaderCharges) {
		this.netDiffrenceHeaderCharges = netDiffrenceHeaderCharges;
	}

	public boolean isHasUnplannedCost() {
		return hasUnplannedCost;
	}

	public void setHasUnplannedCost(boolean hasUnplannedCost) {
		this.hasUnplannedCost = hasUnplannedCost;
	}

	public BigDecimal getPo_freight() {
		return po_freight;
	}

	public void setPo_freight(BigDecimal poFreight) {
		po_freight = poFreight;
	}

	public BigDecimal getPo_storage() {
		return po_storage;
	}

	public void setPo_storage(BigDecimal poStorage) {
		po_storage = poStorage;
	}

	public BigDecimal getPo_importfees() {
		return po_importfees;
	}

	public void setPo_importfees(BigDecimal poImportfees) {
		po_importfees = poImportfees;
	}

	public BigDecimal getPo_surcharge() {
		return po_surcharge;
	}

	public void setPo_surcharge(BigDecimal poSurcharge) {
		po_surcharge = poSurcharge;
	}

	public String getVendorName() {
		return vendorName;
	}

	public BigDecimal getImportFees() {
		return importFees;
	}

	public void setImportFees(BigDecimal importFees) {
		this.importFees = importFees;
	}

	public BigDecimal getFreight_percentage() {
		return Freight_percentage;
	}

	public void setFreight_percentage(BigDecimal freightPercentage) {
		Freight_percentage = freightPercentage;
	}

	public BigDecimal getFee_percentage() {
		return Fee_percentage;
	}

	public void setFee_percentage(BigDecimal feePercentage) {
		Fee_percentage = feePercentage;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public java.util.Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(java.util.Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public BigDecimal getSurcharge() {
		return surcharge;
	}

	public void setSurcharge(BigDecimal surcharge) {
		this.surcharge = surcharge;
	}

	public BigDecimal getFreight() {
		return freight;
	}

	public void setFreight(BigDecimal freight) {
		this.freight = freight;
	}

	public BigDecimal getStorage() {
		return storage;
	}

	public void setStorage(BigDecimal storage) {
		this.storage = storage;
	}

	public java.util.Date getBaseLineDate() {
		return baseLineDate;
	}

	public void setBaseLineDate(java.util.Date baseLineDate) {
		this.baseLineDate = baseLineDate;
	}

	public String getPaymentTerms() {
		return paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentBlock() {
		return paymentBlock;
	}

	public void setPaymentBlock(String paymentBlock) {
		this.paymentBlock = paymentBlock;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public InvoiceHistoryDto() {
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

	public java.util.Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(java.util.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getHeaderPatternMatchingFlag() {
		return headerPatternMatchingFlag;
	}

	public void setHeaderPatternMatchingFlag(String headerPatternMatchingFlag) {
		this.headerPatternMatchingFlag = headerPatternMatchingFlag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public java.util.Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(java.util.Date postingDate) {
		this.postingDate = postingDate;
	}

	public String getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(String purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public String getTaxIndicator() {
		return taxIndicator;
	}

	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}

	public void setTotalInvoiceAmount(BigDecimal totalInvoiceAmount) {
		this.totalInvoiceAmount = totalInvoiceAmount;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public void setInvoiceItemList(List<InvoiceItemDto> invoiceItemList) {
		this.invoiceItemList = invoiceItemList;
	}

	public List<InvoiceItemDto> getInvoiceItemList() {
		return invoiceItemList;
	}

	public BigDecimal getAbbyNetPrice() {
		return abbyNetPrice;
	}

	public void setAbbyNetPrice(BigDecimal abbyNetPrice) {
		this.abbyNetPrice = abbyNetPrice;
	}

	public BigDecimal getGrossPrice() {
		return grossPrice;
	}

	public void setGrossPrice(BigDecimal grossPrice) {
		this.grossPrice = grossPrice;
	}

	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(String userCreated) {
		this.userCreated = userCreated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("InvoiceDetail.id", id);
		}
		vendorName = checkStringSize("InvoiceDetail.vendorName", vendorName,
				250);
		companyCode = checkStringSize("InvoiceDetail.companyCode", companyCode,
				10);
		currency = checkStringSize("InvoiceDetail.currency", currency, 10);
		headerPatternMatchingFlag = checkStringSize(
				"InvoiceDetail.headerPatternMatchingFlag",
				headerPatternMatchingFlag, 30);
		id = checkStringSize("InvoiceDetail.id", id, 40);
		invoiceNumber = checkStringSize("InvoiceDetail.invoiceNumber",
				invoiceNumber, 30);
		purchaseOrderReference = checkStringSize(
				"InvoiceDetail.purchaseOrderReference", purchaseOrderReference,
				30);
		requestId = checkStringSize("InvoiceDetail.requestId", requestId, 40);
		route = checkStringSize("InvoiceDetail.route", route, 10);
		taxIndicator = checkStringSize("InvoiceDetail.taxIndicator",
				taxIndicator, 30);
		vendorId = checkStringSize("InvoiceDetail.vendorId", vendorId, 10);
		paymentTerms = checkStringSize("InvoiceDetail.paymentTerms",
				paymentTerms, 40);
		paymentBlock = checkStringSize("InvoiceDetail.paymentBlock",
				paymentBlock, 40);
		paymentMethod = checkStringSize("InvoiceDetail.paymentMethod",
				paymentMethod, 40);

	}

	@Override
	public String toString() {
		return "InvoiceHistoryDto [Fee_percentage=" + Fee_percentage
				+ ", Freight_percentage=" + Freight_percentage
				+ ", abbyNetPrice=" + abbyNetPrice + ", balanceAmount="
				+ balanceAmount + ", baseLineDate=" + baseLineDate
				+ ", comment=" + comment + ", companyCode=" + companyCode
				+ ", currency=" + currency + ", dateCreated=" + dateCreated
				+ ", dateUpdated=" + dateUpdated + ", deleted=" + deleted
				+ ", deliveryDate=" + deliveryDate + ", discrepencyFlag="
				+ discrepencyFlag + ", freight=" + freight + ", grossPrice="
				+ grossPrice + ", hasUnplannedCost=" + hasUnplannedCost
				+ ", headerPatternMatchingFlag=" + headerPatternMatchingFlag
				+ ", id=" + id + ", importFees=" + importFees
				+ ", invoiceDate=" + invoiceDate + ", invoiceHeaderCharges="
				+ invoiceHeaderCharges + ", invoiceItemList=" + invoiceItemList
				+ ", invoiceNumber=" + invoiceNumber + ", mode=" + mode
				+ ", netDiffrenceHeaderCharges=" + netDiffrenceHeaderCharges
				+ ", paymentBlock=" + paymentBlock + ", paymentMethod="
				+ paymentMethod + ", paymentTerms=" + paymentTerms
				+ ", plannedCost=" + plannedCost + ", po_freight=" + po_freight
				+ ", po_importfees=" + po_importfees + ", po_storage="
				+ po_storage + ", po_surcharge=" + po_surcharge
				+ ", postingDate=" + postingDate + ", purchaseOrderReference="
				+ purchaseOrderReference + ", requestId=" + requestId
				+ ", route=" + route + ", storage=" + storage + ", subTotal="
				+ subTotal + ", surcharge=" + surcharge + ", taxIndicator="
				+ taxIndicator + ", total=" + total + ", totalDiscount="
				+ totalDiscount + ", totalInvoiceAmount=" + totalInvoiceAmount
				+ ", userCreated=" + userCreated + ", userUpdated="
				+ userUpdated + ", vendorId=" + vendorId + ", vendorName="
				+ vendorName + "]";
	}

}