package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AP_INVOICE_LINE_ITEMS")
@TableGenerator(name="AP_INVOICE_LINE_ITEMS_GEN", initialValue=1, allocationSize=50)

public class InvoiceItemDo implements BaseDo, Serializable {
	public static final long serialVersionUID = -2422408359198939060L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE, generator="AP_INVOICE_LINE_ITEMS_GEN")
	@Column(name = "ID", length = 40, nullable = false)
	private String id;

	@Column(name = "LINE_NO")
	private BigDecimal lineNo;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private java.util.Date dateCreated;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private java.util.Date dateUpdated;

	@Column(name = "PARTIAL_POST")
	private boolean partialPost;

	@Column(name = "INVOICE_ITEM_ID")
	private String invoiceItemId;

	@Column(name = "MATERIAL_DESCRIPTION", length = 255)
	private String materialDescription;

	@Column(name = "NET_PRICE", scale = 2)
	private BigDecimal netPrice;

	@Column(name = "PO_MATCHING_ITEM_NO_ID", length = 40)
	private String poMatchingItemNoId;

	@Column(name = "PO_MATCHING_NO_ID", length = 40)
	private String poMatchingNoId;

	@Column(name = "QUANTITY", length = 10)
	private BigDecimal quantity;

	@Column(name = "HAS_ERROR_FLAG")
	private boolean hasErrorFlag;

	@Column(name = "HAS_SOME_GR_FLAG")
	private boolean hasSomeGrFlag;

	@Column(name = "HEADER_CHARGES")
	private boolean headercharges;

	@Column(name = "THREEWAY_MATCHING_FLAG")
	private Boolean threewayMatchingFlag;

	@Column(name = "TWO_WAY_MATCHING_FLAG")
	private Boolean twowayMatchingFlag;

	@Column(name = "TWO_WAY_MATCHING_PERCENTAGE")
	private BigDecimal twowayMatchingPercentage;

	@Column(name = "UNIT_PRICE", scale = 2)
	private BigDecimal unitPrice;

	@Column(name = "COMMENT", length = 500)
	private String comment;

	@Column(name = "MODE", length = 20)
	private String mode;

	@Column(name = "UOM", length = 100)
	private String uom;

	@Column(name = "UPC_CODE", length = 100)
	private String upcCode;

	@Column(name = "PO_UPC_CODE", length = 18)
	private String poUpcCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_BY")
	private Date userCreated;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_BY")
	private Date userUpdated;

	@Column(name = "UNIT_PRICE_MISMATCH")
	private int unitPriceMismatchFlag = 0;

	@Column(name = "QUANTITY_PRICE_MESSAGE")
	private int quantityMismatchFlag = 0;

	@Column(name = "UPSC_MISMATCH")
	private int upscMismatchFlag = 0;

	@Column(name = "DESCRIPTION_MISMATCH")
	private int descriptionMismatchFlag = 0;

	@Column(name = "AMOUNT_DIFFERENCE")
	private BigDecimal amountDifference;

	@Column(name = "INVOICE_PO_NUMBER")
	private String invoicePONumber;

	@Column(name = "DISCOUNT_VALUE")
	private String discountValue;

	@Column(name = "VAT_VALUE")
	private String vatValue;

	@Column(name = "REQUEST_ID")
	private String requestId;

	@Column(name = "GL_CODING")
	private boolean glCoding;

	@Column(name = "VENDOR_MATERIAL_ID")
	private String vendorMaterialId;

	@Column(name = "MATCHING_PO_NUMBER", length = 10)
	private String matchingPonumber;

	@Column(name = "MATERIAL", length = 20)
	private String material;

	@Column(name = "VENDOR_MATERIAL", length = 100)
	private String vendorMaterial;

	@Column(name = "MATERIAL_LINE")
	private boolean materialLine;

	@Column(name = "NET_WORTH")
	private BigDecimal netWorth;

	@Column(name = "DELETED")
	private boolean deleted;

	public BigDecimal getLineNo() {
		return lineNo;
	}

	public void setLineNo(BigDecimal lineNo) {
		this.lineNo = lineNo;
	}

	public boolean isHasErrorFlag() {
		return hasErrorFlag;
	}

	public void setHasErrorFlag(boolean hasErrorFlag) {
		this.hasErrorFlag = hasErrorFlag;
	}

	public boolean isHasSomeGrFlag() {
		return hasSomeGrFlag;
	}

	public void setHasSomeGrFlag(boolean hasSomeGrFlag) {
		this.hasSomeGrFlag = hasSomeGrFlag;
	}

	public boolean isHeadercharges() {
		return headercharges;
	}

	public void setHeadercharges(boolean headercharges) {
		this.headercharges = headercharges;
	}

	public String getPoUpcCode() {
		return poUpcCode;
	}

	public void setPoUpcCode(String poUpcCode) {
		this.poUpcCode = poUpcCode;
	}

	public boolean isGlCoding() {
		return glCoding;
	}

	public void setGlCoding(boolean glCoding) {
		this.glCoding = glCoding;
	}

	public String getMatchingPonumber() {
		return matchingPonumber;
	}

	public void setMatchingPonumber(String matchingPonumber) {
		this.matchingPonumber = matchingPonumber;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getVendorMaterial() {
		return vendorMaterial;
	}

	public void setVendorMaterial(String vendorMaterial) {
		this.vendorMaterial = vendorMaterial;
	}

	public boolean isMaterialLine() {
		return materialLine;
	}

	public void setMaterialLine(boolean materialLine) {
		this.materialLine = materialLine;
	}

	public BigDecimal getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(BigDecimal netWorth) {
		this.netWorth = netWorth;
	}

	public String getInvoiceItemId() {
		return invoiceItemId;
	}

	public void setInvoiceItemId(String invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}

	public String getVendorMaterialId() {
		return vendorMaterialId;
	}

	public void setVendorMaterialId(String vendorMaterialId) {
		this.vendorMaterialId = vendorMaterialId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVatValue() {
		return vatValue;
	}

	public void setVatValue(String vatValue) {
		this.vatValue = vatValue;
	}

	public String getInvoicePONumber() {
		return invoicePONumber;
	}

	public void setInvoicePONumber(String invoicePONumber) {
		this.invoicePONumber = invoicePONumber;
	}

	public String getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(String discountValue) {
		this.discountValue = discountValue;
	}

	public BigDecimal getAmountDifference() {
		return amountDifference;
	}

	public void setAmountDifference(BigDecimal amountDifference) {
		this.amountDifference = amountDifference;
	}

	public int getUnitPriceMismatchFlag() {
		return unitPriceMismatchFlag;
	}

	public void setUnitPriceMismatchFlag(int unitPriceMismatchFlag) {
		this.unitPriceMismatchFlag = unitPriceMismatchFlag;
	}

	public int getQuantityMismatchFlag() {
		return quantityMismatchFlag;
	}

	public void setQuantityMismatchFlag(int quantityMismatchFlag) {
		this.quantityMismatchFlag = quantityMismatchFlag;
	}

	public int getUpscMismatchFlag() {
		return upscMismatchFlag;
	}

	public void setUpscMismatchFlag(int upscMismatchFlag) {
		this.upscMismatchFlag = upscMismatchFlag;
	}

	public int getDescriptionMismatchFlag() {
		return descriptionMismatchFlag;
	}

	public void setDescriptionMismatchFlag(int descriptionMismatchFlag) {
		this.descriptionMismatchFlag = descriptionMismatchFlag;
	}

	public void setPartialPost(boolean partialPost) {
		this.partialPost = partialPost;
	}

	public boolean isPartialPost() {
		return partialPost;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}



	@Override
	public Object getPrimaryKey() {
		return id;
	}

	public InvoiceItemDo() {
		super();
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public java.util.Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(java.util.Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public String getPoMatchingItemNoId() {
		return poMatchingItemNoId;
	}

	public void setPoMatchingItemNoId(String poMatchingItemNoId) {
		this.poMatchingItemNoId = poMatchingItemNoId;
	}

	public String getPoMatchingNoId() {
		return poMatchingNoId;
	}

	public void setPoMatchingNoId(String poMatchingNoId) {
		this.poMatchingNoId = poMatchingNoId;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public Boolean getThreewayMatchingFlag() {
		return threewayMatchingFlag;
	}

	public void setThreewayMatchingFlag(Boolean threewayMatchingFlag) {
		this.threewayMatchingFlag = threewayMatchingFlag;
	}

	public Boolean getTwowayMatchingFlag() {
		return twowayMatchingFlag;
	}

	public void setTwowayMatchingFlag(Boolean twowayMatchingFlag) {
		this.twowayMatchingFlag = twowayMatchingFlag;
	}

	public BigDecimal getTwowayMatchingPercentage() {
		return twowayMatchingPercentage;
	}

	public void setTwowayMatchingPercentage(BigDecimal twowayMatchingPercentage) {
		this.twowayMatchingPercentage = twowayMatchingPercentage;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}

	public Date getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(Date userCreated) {
		this.userCreated = userCreated;
	}

	public Date getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(Date string) {
		this.userUpdated = string;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}