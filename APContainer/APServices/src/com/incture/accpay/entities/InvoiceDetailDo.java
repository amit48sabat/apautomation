package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AP_INVOICE_DETAIL")

public class InvoiceDetailDo implements BaseDo, Serializable {
	public static final long serialVersionUID = -3248578168688762316L;

	
	@Column(name = "VENDOR_NAME", length = 250)
	private String vendorName;

	@Column(name = "DISCREPENCY_FLAG")
	private boolean discrepencyFlag;

	@Column(name = "HAS_UNPLANNED_COST")
	private boolean hasUnplannedCost;

	@Column(name = "PLANNED_COST")
	private BigDecimal plannedCost;

	@Column(name = "PO_FREIGHT")
	private BigDecimal po_freight;

	@Column(name = "PO_SURCHARGE")
	private BigDecimal po_surcharge;

	@Column(name = "PO_STORAGE")
	private BigDecimal po_storage;

	@Column(name = "PO_IMPORT_FEE")
	private BigDecimal po_importfees;

	@Column(name = "INVOICE_HEADER_CHARGES")
	private BigDecimal invoiceHeaderCharges;

	@Column(name = "NET_DIFFERENCE_HEADER_CHARGES")
	private BigDecimal netDiffrenceHeaderCharges;

	@Column(name = "COMPANY_CODE", length = 10)
	private String companyCode;

	@Column(name = "CURRENCY", length = 10)
	private String currency;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DELIVARY_DATE")
	private Date deliveryDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INVOICE_DATE")
	private Date invoiceDate;

	@Column(name = "TOTOAL_DISCOUNT")
	private BigDecimal totalDiscount;

	@Column(name = "HEADER_PATTERN_MATCHING_FLAG", length = 30)
	private String headerPatternMatchingFlag;

	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;
	
	
	@Column(name = "TASK_STATUS", length = 30)
	private String taskStatus;
	
	@Column(name = "INVOICE_NUMBER", length = 30)
	private String invoiceNumber;
	
	@Column(name = "SAP_INVOICE_NUMBER", length = 30)
	private String sapInvoiceNumber;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "POSTING_DATE")
	private java.util.Date postingDate;

	@Column(name = "PURCHASE_ORDER_REFERENCE", length = 30)
	private String purchaseOrderReference;

	@Column(name = "REQUEST_ID", length = 40)
	private String requestId;

	@Column(name = "ROUTE", length = 10)
	private String route;

	@Column(name = "SUBTOTAL", scale = 2)
	private BigDecimal subTotal;

	@Column(name = "TAX_INDICATOR", length = 30)
	private String taxIndicator;

	@Column(name = "TOTAL", scale = 2)
	private BigDecimal total;

	@Column(name = "TOTAL_INVOICE_AMOUNT", scale = 2)
	private BigDecimal totalInvoiceAmount;

	@Column(name = "VENDOR_ID", length = 10)
	private String vendorId;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "BASE_LINE_DATE")
	private java.util.Date baseLineDate;

	@Column(name = "PAYMENT_TERM", length = 40)
	private String paymentTerms;

	@Column(name = "PAYMENT_METHOD", length = 40)
	private String paymentMethod;

	@Column(name = "PAYMENT_BLOCK", length = 40)
	private String paymentBlock;

	@Column(name = "SURCHARGE")
	private BigDecimal surcharge;

	@Column(name = "FREIGHT")
	private BigDecimal freight;

	@Column(name = "STORAGE")
	private BigDecimal storage;

	@Column(name = "IMPORT_FEES")
	private BigDecimal importFees;

	@Column(name = "FREIGHT_PERCENTAGE")
	private BigDecimal Freight_percentage;

	@Column(name = "FEE_PERCENTAGE")
	private BigDecimal Fee_percentage;

	@Column(name = "ABBY_BATCH_NAME")
	private String abbyBatchName;

	@Column(name = "ABBY_NET_PRICE")
	private BigDecimal abbyNetPrice;

	@Column(name = "GROSS_PRICE")
	private BigDecimal grossPrice;

	@Column(name = "BALANCE_AMOUNT")
	private BigDecimal balanceAmount;

	@Column(name = "DELETED")
	private boolean deleted;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date dateCreated;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private Date dateUpdated;
	
	@Column(name = "CREATED_BY")
	private String userCreated;

	@Column(name = "UPDATED_BY")
	private String userUpdated;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<InvoiceItemDo> invoiceItemDo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CommunicationLogDo>  communicationLogDos;
	
	@Column(name = "PROCESS_ID")
	private String processId;


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

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public java.util.Date getInvoiceDate() {
		return invoiceDate;
	}

	public boolean isDiscrepencyFlag() {
		return discrepencyFlag;
	}

	public void setDiscrepencyFlag(boolean discrepencyFlag) {
		this.discrepencyFlag = discrepencyFlag;
	}

	public boolean isHasUnplannedCost() {
		return hasUnplannedCost;
	}

	public void setHasUnplannedCost(boolean hasUnplannedCost) {
		this.hasUnplannedCost = hasUnplannedCost;
	}

	public BigDecimal getPlannedCost() {
		return plannedCost;
	}

	public void setPlannedCost(BigDecimal plannedCost) {
		this.plannedCost = plannedCost;
	}

	public BigDecimal getPo_freight() {
		return po_freight;
	}

	public void setPo_freight(BigDecimal poFreight) {
		po_freight = poFreight;
	}

	public BigDecimal getPo_surcharge() {
		return po_surcharge;
	}

	public void setPo_surcharge(BigDecimal poSurcharge) {
		po_surcharge = poSurcharge;
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

	public void setInvoiceDate(java.util.Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
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

	public String getAbbyBatchName() {
		return abbyBatchName;
	}

	public void setAbbyBatchName(String abbyBatchName) {
		this.abbyBatchName = abbyBatchName;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public List<InvoiceItemDo> getInvoiceItemDo() {
		return invoiceItemDo;
	}

	public void setInvoiceItemDo(List<InvoiceItemDo> invoiceItemDo) {
		this.invoiceItemDo = invoiceItemDo;
	}

	@Override
	public Object getPrimaryKey() {
		return id;
	}

	public InvoiceDetailDo() {
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
	public List<CommunicationLogDo> getCommunicationLogDos() {
		return communicationLogDos;
	}

	public void setCommunicationLogDos(List<CommunicationLogDo> communicationLogDos) {
		this.communicationLogDos = communicationLogDos;
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

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

}