package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class InvoiceItemDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = 3635755922658905106L;

	private java.util.Date dateCreated;

	private BigDecimal lineNo;

	private java.util.Date dateUpdated;

	private String id;

	private String invoiceItemId;

	private String materialDescription;

	private BigDecimal netPrice;

	private String poMatchingItemNoId;

	private String poMatchingNoId;

	private String matchingPonumber;

	private BigDecimal quantity;

	private Boolean twowayMatchingFlag;

	private BigDecimal unitPrice;

	private String uom;

	private String upcCode;

	private Date userCreated;

	private Date userUpdated;

	private String comment;

	private String mode;

	private String poNumber;

	private BigDecimal poPrice;

	private BigDecimal poQuantity;

	private String quantityBaseUom;

	private int unitPriceMismatchFlag = 0;

	private int quantityMismatchFlag = 0;

	private int upscMismatchFlag = 0;

	private int descriptionMismatchFlag = 0;

	private boolean headercharges;

	private List<NonPoDto> nonpoList;

	private boolean glCoding;

	private boolean materialLine;

	private boolean hasErrorFlag;

	private boolean hasSomeGrFlag;

	private BigDecimal netWorth;

	private String material;

	private String VendorMaterial;

	private String poUpcCode;

	private String invHeaderId;

	private boolean partialPost;

	private InvoiceDetailDto invoiceDetailDto;

	private BigDecimal amountDifference;

	private String invoicePONumber;

	private String discountValue;

	private String vatValue;

	private String requestId;

	private String vendorMaterialId;

	private boolean deleted;

	private Boolean threewayMatchingFlag;

	private String upcToMaterial;

	private String poOrderUnit;

	private Boolean freeItem;

	private BigDecimal priceUnit;

	private boolean partialPosting;
	
	private List<AccountAssignmentDto> accAssignList;
	
	private BigDecimal accAssignCount;
	
	private String poHeaderId;


	public BigDecimal getLineNo() {
		return lineNo;
	}

	public void setLineNo(BigDecimal lineNo) {
		this.lineNo = lineNo;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getVatValue() {
		return vatValue;
	}

	public void setVatValue(String vatValue) {
		this.vatValue = vatValue;
	}

	public BigDecimal getAmountDifference() {
		return amountDifference;
	}

	public void setAmountDifference(BigDecimal amountDifference) {
		this.amountDifference = amountDifference;
	}

	public List<NonPoDto> getNonpoList() {
		return nonpoList;
	}

	public void setNonpoList(List<NonPoDto> nonpoList) {
		this.nonpoList = nonpoList;
	}

	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	public BigDecimal getPoPrice() {
		return poPrice;
	}

	public void setPoPrice(BigDecimal poPrice) {
		this.poPrice = poPrice;
	}

	public BigDecimal getPoQuantity() {
		return poQuantity;
	}

	public void setPoQuantity(BigDecimal poQuantity) {
		this.poQuantity = poQuantity;
	}

	public String getQuantityBaseUom() {
		return quantityBaseUom;
	}

	public void setQuantityBaseUom(String quantityBaseUom) {
		this.quantityBaseUom = quantityBaseUom;
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

	public boolean isPartialPost() {
		return partialPost;
	}

	public void setPartialPost(boolean partialPost) {
		this.partialPost = partialPost;
	}

	public InvoiceDetailDto getInvoiceDetailDto() {
		return invoiceDetailDto;
	}

	public void setInvoiceDetailDto(InvoiceDetailDto invoiceDetailDto) {
		this.invoiceDetailDto = invoiceDetailDto;
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

	public String getInvHeaderId() {
		return invHeaderId;
	}

	public void setInvHeaderId(String invHeaderId) {
		this.invHeaderId = invHeaderId;
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

	public Boolean getTwowayMatchingFlag() {
		return twowayMatchingFlag;
	}

	public void setTwowayMatchingFlag(Boolean twowayMatchingFlag) {
		this.twowayMatchingFlag = twowayMatchingFlag;
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

	public void setUserUpdated(Date userUpdated) {
		this.userUpdated = userUpdated;
	}

	public String getMatchingPonumber() {
		return matchingPonumber;
	}

	public void setMatchingPonumber(String matchingPonumber) {
		this.matchingPonumber = matchingPonumber;
	}

	public boolean isHeadercharges() {
		return headercharges;
	}

	public void setHeadercharges(boolean headercharges) {
		this.headercharges = headercharges;
	}

	public boolean isGlCoding() {
		return glCoding;
	}

	public void setGlCoding(boolean glCoding) {
		this.glCoding = glCoding;
	}

	public boolean isMaterialLine() {
		return materialLine;
	}

	public void setMaterialLine(boolean materialLine) {
		this.materialLine = materialLine;
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

	public BigDecimal getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(BigDecimal netWorth) {
		this.netWorth = netWorth;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getVendorMaterial() {
		return VendorMaterial;
	}

	public void setVendorMaterial(String vendorMaterial) {
		VendorMaterial = vendorMaterial;
	}

	public String getPoUpcCode() {
		return poUpcCode;
	}

	public void setPoUpcCode(String poUpcCode) {
		this.poUpcCode = poUpcCode;
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

	public Boolean getThreewayMatchingFlag() {
		return threewayMatchingFlag;
	}

	public void setThreewayMatchingFlag(Boolean threewayMatchingFlag) {
		this.threewayMatchingFlag = threewayMatchingFlag;
	}

	public InvoiceItemDto() {
		super();
	}

	public String getUpcToMaterial() {
		return upcToMaterial;
	}

	public void setUpcToMaterial(String upcToMaterial) {
		this.upcToMaterial = upcToMaterial;
	}

	public String getPoOrderUnit() {
		return poOrderUnit;
	}

	public void setPoOrderUnit(String poOrderUnit) {
		this.poOrderUnit = poOrderUnit;
	}

	public Boolean getFreeItem() {
		return freeItem;
	}

	public void setFreeItem(Boolean freeItem) {
		this.freeItem = freeItem;
	}

	public BigDecimal getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(BigDecimal priceUnit) {
		this.priceUnit = priceUnit;
	}

	public boolean isPartialPosting() {
		return partialPosting;
	}

	public void setPartialPosting(boolean partialPosting) {
		this.partialPosting = partialPosting;
	}

	

	public List<AccountAssignmentDto> getAccAssignList() {
		return accAssignList;
	}

	public void setAccAssignList(List<AccountAssignmentDto> accAssignList) {
		this.accAssignList = accAssignList;
	}

	public BigDecimal getAccAssignCount() {
		return accAssignCount;
	}

	public void setAccAssignCount(BigDecimal accAssignCount) {
		this.accAssignCount = accAssignCount;
	}

	public String getPoHeaderId() {
		return poHeaderId;
	}

	public void setPoHeaderId(String poHeaderId) {
		this.poHeaderId = poHeaderId;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("InvoiceItem.id", id);
		}
		id = checkStringSize("InvoiceItem.id", id, 40);
		invHeaderId = checkStringSize("InvoiceItem.invHeaderId", invHeaderId, 40);
		materialDescription = checkStringSize("InvoiceItem.materialDescription", materialDescription, 255);
		poMatchingItemNoId = checkStringSize("InvoiceItem.poMatchingItemNoId", poMatchingItemNoId, 40);
		poMatchingNoId = checkStringSize("InvoiceItem.poMatchingNoId", poMatchingNoId, 40);
		uom = checkStringSize("InvoiceItem.uom", uom, 100);
		upcCode = checkStringSize("InvoiceItem.upcCode", upcCode, 100);
		comment = checkStringSize("InvoiceItem.comment", comment, 500);
		mode = checkStringSize("InvoiceItem.mode", mode, 20);
		matchingPonumber = checkStringSize("InvoiceItem.matchingPonumber", matchingPonumber, 10);
		material = checkStringSize("InvoiceItem.material", material, 20);
		VendorMaterial = checkStringSize("InvoiceItem.VendorMaterial", VendorMaterial, 100);
	}

	@Override
	public String toString() {
		return "InvoiceItemDto [VendorMaterial=" + VendorMaterial + ", amountDifference=" + amountDifference
				+ ", comment=" + comment + ", dateCreated=" + dateCreated + ", dateUpdated=" + dateUpdated
				+ ", deleted=" + deleted + ", descriptionMismatchFlag=" + descriptionMismatchFlag + ", discountValue="
				+ discountValue + ", glCoding=" + glCoding + ", hasErrorFlag=" + hasErrorFlag + ", hasSomeGrFlag="
				+ hasSomeGrFlag + ", headercharges=" + headercharges + ", id=" + id + ", invHeaderId=" + invHeaderId
				+ ", invoiceDetailDto=" + invoiceDetailDto + ", invoiceItemId=" + invoiceItemId + ", invoicePONumber="
				+ invoicePONumber + ", lineNo=" + lineNo + ", matchingPonumber=" + matchingPonumber + ", material="
				+ material + ", materialDescription=" + materialDescription + ", materialLine=" + materialLine
				+ ", mode=" + mode + ", netPrice=" + netPrice + ", netWorth=" + netWorth + ", nonpoList=" + nonpoList
				+ ", partialPost=" + partialPost + ", poMatchingItemNoId=" + poMatchingItemNoId + ", poMatchingNoId="
				+ poMatchingNoId + ", poNumber=" + poNumber + ", poPrice=" + poPrice + ", poQuantity=" + poQuantity
				+ ", poUpcCode=" + poUpcCode + ", quantity=" + quantity + ", quantityBaseUom=" + quantityBaseUom
				+ ", quantityMismatchFlag=" + quantityMismatchFlag + ", requestId=" + requestId
				+ ", threewayMatchingFlag=" + threewayMatchingFlag + ", twowayMatchingFlag=" + twowayMatchingFlag
				+ ", unitPrice=" + unitPrice + ", unitPriceMismatchFlag=" + unitPriceMismatchFlag + ", uom=" + uom
				+ ", upcCode=" + upcCode + ", upscMismatchFlag=" + upscMismatchFlag + ", userCreated=" + userCreated
				+ ", userUpdated=" + userUpdated + ", vatValue=" + vatValue + ", vendorMaterialId=" + vendorMaterialId
				+ "]";
	}

	public static Comparator<InvoiceItemDto> sortAscending = new Comparator<InvoiceItemDto>() {
		public int compare(InvoiceItemDto s1, InvoiceItemDto s2) {
			return s1.getLineNo().compareTo(s2.getLineNo());
		}
	};

}