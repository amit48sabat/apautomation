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

@Entity
@Table(name="AP_GRN_LINE_ITEMS")
public class GrnItemDo implements BaseDo,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID",length=40,nullable= false)
	private String id;
	
	@Column (name="PO_ITEM_ID",length=10)
	private String poItemId;
	
	@Column (name="QUANTITY")
	private BigDecimal quantity;
	
	@Column(name="DOCUMENT_NO",length=10)
	private String docNo;
	
	@Column(name="GR_ITEM_ID",length=10)
	private String grItemId;
	
	@ManyToOne
	@JoinColumn(name="GRN_HEADER_ID")
	private GrnDo grnDo; 
	
	@Column(name="REFERENCE_QUANTITY")
	private BigDecimal refQuantity;
	
	@Column(name="REFERENCE_COST_LOCAL")
	private BigDecimal refCostLocal;
	
	@Column(name="REFERENCE_COST_FOREIGN")
	private BigDecimal refCostFOREIGN;
	
	@Column(name="REFERENCE_INVOICE_COST_LOCAL")
	private BigDecimal refInvCostLocal;
	
	@Column(name="REFERENCE_INVOICE_COST_FOREIGN")
	private BigDecimal refInvCostForeign;
	
	
	@Column(name="COST_LOCAL_CURRENCY")
	private BigDecimal costLocalCurrency;
	
	@Column(name="COST_FOREIGN_CURRENCY")
	private BigDecimal costForeignCurrency;
	
	@Column(name="INVOICE_COST_LOCAL")
	private BigDecimal invoiceCostLocal;
	
	@Column(name="INVOICE_COST_FOREIGN")
	private BigDecimal invoiceCostForeign;
	
	@Column(name="MATERIAL_ID")
	private String materialId;
	
	@Column(name = "DOC_YEAR"  , length = 4)
	private String docYear;
	
	@Column(name = "MOVE_TYPE", length = 10)
	private String moveType;
	
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "POSTING_DATE")
	private java.util.Date postingDate;
	
	@Column(name = "DELIV_QTY")
	private BigDecimal delivQty;
	
	@Column(name = "DELIV_UNIT")
	private String delivUnit;
	
    @Column(name="CREATED_BY")
    private String createdBy;
 
    @Column(name="UPDATED_BY")
    private String updatedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="CREATED_DATE")
    private Date createdDate;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date updatedDate;
	
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

	public GrnDo getGrnDo() {
		return grnDo;
	}

	public void setGrnDo(GrnDo grnDo) {
		this.grnDo = grnDo;
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

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return id;
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
	
}
