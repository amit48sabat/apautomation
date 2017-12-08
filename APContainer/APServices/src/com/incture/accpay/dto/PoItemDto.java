package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

public class PoItemDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = 3758218749797326837L;

	private String id;

	private String materialNumber;

	private BigDecimal netPrice;

	private String poItem;

	private BigDecimal quantity;

	private String shortText;

	private String vendMat;

	private Boolean posted;

	private PurchaseOrderDto purchaseOrderDto;

	private String unit;

	private BigDecimal unitPrice;

	private BigDecimal materialPrice;

	private BigDecimal quantityAccepted;

	private String baseUom;

	private BigDecimal baseQuantity;

	private BigDecimal convNum1;

	private BigDecimal convDen1;

	private String itemCategory;

	private String vendorMaterialId;

	private String materialId;

	private BigDecimal netWorth;

	private String poOrderUnit;

	private String upsc;

	private Boolean grIndicator;

	private Boolean deleted;

	private String skuUnit;

	private BigDecimal skuFactor;

	private String skuOrderUnit;

	private BigDecimal skuOrderFactor;

	private Date createdDate;

	private Date updatedDate;

	private String createdBy;

	private String updatedBy;

	private Boolean freeItem;
	
	private String accountAssignCategory;

	public Boolean getFreeItem() {
		return freeItem;
	}

	public void setFreeItem(Boolean freeItem) {
		this.freeItem = freeItem;
	}

	public String getUpsc() {
		return upsc;
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

	public void setUpsc(String upsc) {
		this.upsc = upsc;
	}

	public String getPoOrderUnit() {
		return poOrderUnit;
	}

	public void setPoOrderUnit(String poOrderUnit) {
		this.poOrderUnit = poOrderUnit;
	}

	public String getVendorMaterialId() {
		return vendorMaterialId;
	}

	public void setVendorMaterialId(String vendorMaterialId) {
		this.vendorMaterialId = vendorMaterialId;
	}

	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public BigDecimal getNetWorth() {
		return netWorth;
	}

	public void setNetWorth(BigDecimal netWorth) {
		this.netWorth = netWorth;
	}

	public BigDecimal getConvNum1() {
		return convNum1;
	}

	public void setConvNum1(BigDecimal convNum1) {
		this.convNum1 = convNum1;
	}

	public BigDecimal getConvDen1() {
		return convDen1;
	}

	public void setConvDen1(BigDecimal convDen1) {
		this.convDen1 = convDen1;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getBaseUom() {
		return baseUom;
	}

	public void setBaseUom(String baseUom) {
		this.baseUom = baseUom;
	}

	public BigDecimal getBaseQuantity() {
		return baseQuantity;
	}

	public void setBaseQuantity(BigDecimal baseQuantity) {
		this.baseQuantity = baseQuantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getMaterialPrice() {
		return materialPrice;
	}

	public void setMaterialPrice(BigDecimal materialPrice) {
		this.materialPrice = materialPrice;
	}

	public BigDecimal getQuantityAccepted() {
		return quantityAccepted;
	}

	public void setQuantityAccepted(BigDecimal quantityAccepted) {
		this.quantityAccepted = quantityAccepted;
	}

	public PurchaseOrderDto getPurchaseOrderDto() {
		return purchaseOrderDto;
	}

	public void setPurchaseOrderDto(PurchaseOrderDto purchaseOrderDto) {
		this.purchaseOrderDto = purchaseOrderDto;
	}

	public Boolean getPosted() {
		return posted;
	}

	public void setPosted(Boolean posted) {
		this.posted = posted;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMaterialNumber() {
		return materialNumber;
	}

	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public String getPoItem() {
		return poItem;
	}

	public void setPoItem(String poItem) {
		this.poItem = poItem;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getShortText() {
		return shortText;
	}

	public void setShortText(String shortText) {
		this.shortText = shortText;
	}

	public String getVendMat() {
		return vendMat;
	}

	public void setVendMat(String vendMat) {
		this.vendMat = vendMat;
	}

	public Boolean getGrIndicator() {
		return grIndicator;
	}

	public void setGrIndicator(Boolean grIndicator) {
		this.grIndicator = grIndicator;
	}

	public PoItemDto() {
		super();
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getSkuUnit() {
		return skuUnit;
	}

	public void setSkuUnit(String skuUnit) {
		this.skuUnit = skuUnit;
	}

	public BigDecimal getSkuFactor() {
		return skuFactor;
	}

	public void setSkuFactor(BigDecimal skuFactor) {
		this.skuFactor = skuFactor;
	}

	public String getSkuOrderUnit() {
		return skuOrderUnit;
	}

	public void setSkuOrderUnit(String skuOrderUnit) {
		this.skuOrderUnit = skuOrderUnit;
	}

	public BigDecimal getSkuOrderFactor() {
		return skuOrderFactor;
	}

	public void setSkuOrderFactor(BigDecimal skuOrderFactor) {
		this.skuOrderFactor = skuOrderFactor;
	}

	public String getAccountAssignCategory() {
		return accountAssignCategory;
	}

	public void setAccountAssignCategory(String accountAssignCategory) {
		this.accountAssignCategory = accountAssignCategory;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("PoItem.id", id);
		}
		id = checkStringSize("PoItem.id", id, 40);
		materialNumber = checkStringSize("PoItem.materialNumber",
				materialNumber, 30);
		poItem = checkStringSize("PoItem.poItem", poItem, 30);
		shortText = checkStringSize("PoItem.shortText", shortText, 255);
		vendMat = checkStringSize("PoItem.vendMat", vendMat, 35);
		baseUom = checkStringSize("PoItem.baseUom", baseUom, 5);
		vendorMaterialId = checkStringSize("PoItem.vendorMaterialId",
				vendorMaterialId, 20);
		materialId = checkStringSize("PoItem.materialId", materialId, 20);

	}

	@Override
	public String toString() {
		return "PoItemDto [accountAssignCategory=" + accountAssignCategory
				+ ", baseQuantity=" + baseQuantity + ", baseUom=" + baseUom
				+ ", convDen1=" + convDen1 + ", convNum1=" + convNum1
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate
				+ ", deleted=" + deleted + ", freeItem=" + freeItem
				+ ", grIndicator=" + grIndicator + ", id=" + id
				+ ", itemCategory=" + itemCategory + ", materialId="
				+ materialId + ", materialNumber=" + materialNumber
				+ ", materialPrice=" + materialPrice + ", netPrice=" + netPrice
				+ ", netWorth=" + netWorth + ", poItem=" + poItem
				+ ", poOrderUnit=" + poOrderUnit + ", posted=" + posted
				+ ", purchaseOrderDto=" + purchaseOrderDto + ", quantity="
				+ quantity + ", quantityAccepted=" + quantityAccepted
				+ ", shortText=" + shortText + ", skuFactor=" + skuFactor
				+ ", skuOrderFactor=" + skuOrderFactor + ", skuOrderUnit="
				+ skuOrderUnit + ", skuUnit=" + skuUnit + ", unit=" + unit
				+ ", unitPrice=" + unitPrice + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", upsc=" + upsc
				+ ", vendMat=" + vendMat + ", vendorMaterialId="
				+ vendorMaterialId + "]";
	}

}