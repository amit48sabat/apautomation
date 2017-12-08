package com.incture.accpay.entities;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
* Comments: null,
*/
@Entity
@Table(name="AP_PO")
public class PurchaseOrderDo implements BaseDo, Serializable {
	public static final long serialVersionUID = 451217544987595261L;

	@Column(name="COMP_CODE", length=30)
	private String companyCode;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE")
	private java.util.Date createDate;
	
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date updatedDate;

	@Column(name="CURRENCY", length=30)
	private String currency;

	@Column(name="EXCH_RATE")
	private BigDecimal exchchangeRate;

	@Id
	@Column(name="ID", length=40, nullable = false)
	private String id;

	@Column(name="PMNTTRMS", length=30)
	private String paymentTerms;

	@Column(name="PO_NUMBER", length=30)
	private String poNumber;

	@Column(name="REQUEST_ID", length=40)
	private String requestId;

	@Column(name="VENDOR", length=30)
	private String vendor;
	
	@Column(name = "HAS_DELIVERY_CHARGES")
	private Boolean hasDeliveryCharges;
	
	@Column(name="HAS_DELIVERY_VENDOR")
	private Boolean hasDeliveryVendor;
	
	@Column(name="IS_THIRD_PARTY")
	private Boolean isThirdParty;
	
	@Column(name="DELIVERY_VENDOR",length=10)
	private String deliveryVendor;
	
	@Column(name = "HAS_GR")
	private Boolean has_Gr;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
    @Column(name="UPDATED_BY")
    private String updatedBy;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="DOC_DATE")
	private java.util.Date docDate;
	
	
	@Column(name = "PLANNED_COST")
	private BigDecimal plannedCost;
	

	public boolean getHasDeliveryVendor() {
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
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getDocDate() {
		return docDate;
	}

	public void setDocDate(java.util.Date docDate) {
		this.docDate = docDate;
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

	@OneToMany(mappedBy="purchaseOrderDo",cascade=CascadeType.ALL)
	private List<PoItemDo> poItemDo;
	
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public java.util.Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(java.util.Date createDate) {
		this.createDate = createDate;
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

	public List<PoItemDo> getPoItemDo() {
		return poItemDo;
	}

	public void setPoItemDo(List<PoItemDo> poItemDo) {
		this.poItemDo = poItemDo;
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

	@Override
	public Object getPrimaryKey() {
		return id;
	}
}