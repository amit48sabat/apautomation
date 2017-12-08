package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Comments: null,
 */
@Entity
@Table(name = "AP_PO_ITEM")
public class PoItemDo implements BaseDo, Serializable {
	public static final long serialVersionUID = -5097532557770916896L;

	@Id
	@Column(name = "ID", length = 40, nullable = false)
	private String id;

	@Column(name = "MATERIAL_NUMBER", length = 30)
	private String materialNumber;

	@Column(name = "NET_PRICE", scale = 2)
	private BigDecimal netPrice;

	@Column(name = "PO_ITEM", length = 30)
	private String poItem;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	@Column(name = "SHORT_TEXT", length = 255)
	private String shortText;

	@Column(name = "VEND_MAT", length = 35)
	private String vendMat;

	@ManyToOne
	@JoinColumn(name = "PO_HEADER_ID")
	private PurchaseOrderDo purchaseOrderDo;

	@Column(name = "GR_INDICATOR")
	private Boolean grIndicator;

	@Column(name = "POSTED")
	private boolean posted;

	@Column(name = "UNIT")
	private String unit;

	@Column(name = "PRICE_UNIT")
	private BigDecimal unitPrice;

	@Column(name = "MATERIAL_PRICE")
	private BigDecimal materialPrice;

	@Column(name = "QUANTITY_ACCEPTED")
	private BigDecimal quantityAccepted;

	@Column(name = "BASE_UOM", length = 30)
	private String baseUom;

	@Column(name = "BASE_QUANTITY")
	private BigDecimal baseQuantity;

	@Column(name = "CONV_NUM1")
	private BigDecimal convNum1;

	@Column(name = "CONV_DEN1")
	private BigDecimal convDen1;

	@Column(name = "ITEM_CATEGORY")
	private String itemCategory;

	@Column(name = "VENDOR_MATERIAL_ID", length = 20)
	private String vendorMaterialId;

	@Column(name = "MATERIAL_ID", length = 20)
	private String materialId;

	@Column(name = "NET_WORTH")
	private BigDecimal netWorth;

	@Column(name = "PO_ORDER_UNIT")
	private String poOrderUnit;

	@Column(name = "UPSC", length = 18)
	private String upsc;

	@Column(name = "DELETED")
	private Boolean deleted;

	@Column(name = "SKU_UNIT")
	private String skuUnit;

	@Column(name = "SKU_FACTOR")
	private BigDecimal skuFactor;

	@Column(name = "SKU_ORDER_UNIT")
	private String skuOrderUnit;

	@Column(name = "SKU_ORDER_FACTOR")
	private BigDecimal skuOrderFactor;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	private Date updatedDate;

	@Column(name = "FREE_ITEM")
	private Boolean freeItem;
	
	@Column(name = "ACCOUNT_ASSIGN_CATEGORY")
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

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	/**
	 * @param convNum1
	 *            the convNum1 to set
	 */
	public void setConvNum1(BigDecimal convNum1) {
		this.convNum1 = convNum1;
	}

	/**
	 * @return the convDen1
	 */
	public BigDecimal getConvDen1() {
		return convDen1;
	}

	/**
	 * @param convDen1
	 *            the convDen1 to set
	 */
	public void setConvDen1(BigDecimal convDen1) {
		this.convDen1 = convDen1;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit
	 *            the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * @return the unitPrice
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice
	 *            the unitPrice to set
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the materialPrice
	 */
	public BigDecimal getMaterialPrice() {
		return materialPrice;
	}

	/**
	 * @param materialPrice
	 *            the materialPrice to set
	 */
	public void setMaterialPrice(BigDecimal materialPrice) {
		this.materialPrice = materialPrice;
	}

	/**
	 * @return the quantityAccepted
	 */
	public BigDecimal getQuantityAccepted() {
		return quantityAccepted;
	}

	/**
	 * @param quantityAccepted
	 *            the quantityAccepted to set
	 */
	public void setQuantityAccepted(BigDecimal quantityAccepted) {
		this.quantityAccepted = quantityAccepted;
	}

	public boolean isPosted() {
		return posted;
	}

	public void setPosted(boolean posted) {
		this.posted = posted;
	}

	public PurchaseOrderDo getPurchaseOrderDo() {
		return purchaseOrderDo;
	}

	public void setPurchaseOrderDo(PurchaseOrderDo purchaseOrderDo) {
		this.purchaseOrderDo = purchaseOrderDo;
	}

	@Override
	public Object getPrimaryKey() {
		return id;
	}

	public PoItemDo() {
		super();
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

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
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

	public Boolean getGrIndicator() {
		return grIndicator;
	}

	public void setGrIndicator(Boolean grIndicator) {
		this.grIndicator = grIndicator;
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

	public String getAccountAssignCategory() {
		return accountAssignCategory;
	}

	public void setAccountAssignCategory(String accountAssignCategory) {
		this.accountAssignCategory = accountAssignCategory;
	}

}