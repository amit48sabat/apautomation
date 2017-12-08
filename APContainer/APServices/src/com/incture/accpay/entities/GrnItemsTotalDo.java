package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="AP_GRN_ITEM_TOTALS")
public class GrnItemsTotalDo implements BaseDo, Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 40)
	private String id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "CREATED_DATE")
	private Date createdDate;
	
	@Column (name = "HEADER_ID", length = 40)
	private String headerId;
	
	@Column (name = "PO_ITEM", length = 5)
	private String poItem;
	
	@Column (name = "SERIAL_NO", length = 3)
	private String serialNo;
	
    @Column(name = "WITHDR_QTY")
    private BigDecimal withdrqty;
    
    @Column(name = "BLOCKED_QY")
    private BigDecimal blockedqy;
    
    @Column(name = "BL_QTY")
    private BigDecimal blqty;
    
    @Column(name = "DELIV_QTY")
    private BigDecimal delivqty;
    
    @Column(name = "PO_PR_QNT")
    private BigDecimal poprqnt;
    
    @Column(name = "VAL_GR_LOC")
    private BigDecimal valgrloc;
    
    @Column(name = "VAL_GR_FOR")
    private BigDecimal valgrfor;
    
    @Column(name = "IV_QTY")
    private BigDecimal ivqty;
    
    @Column(name = "IV_QTY_PO")
    private BigDecimal ivqtypo;
    
    @Column(name = "VAL_IV_LOC")
    private BigDecimal valivloc;
    
    @Column(name = "VAL_IV_FOR")
    private BigDecimal valivfor;
    
    @Column(name = "CL_VAL_LOC")
    private BigDecimal clvalloc;
    
    @Column(name = "CL_VAL_FOR")
    private BigDecimal clvalfor;
    
    @Column(name = "DOP_VL_LOC")
    private BigDecimal dopvlloc;
    
    @Column(name = "IVVAL_LOC")
    private BigDecimal ivvalloc;
    
    @Column(name = "IVVAL_FOR")
    private BigDecimal ivvalfor;
    
    @Column(name = "DL_QTY_TRSP")
    private BigDecimal dlqtytrsp;
    
    @Column(name = "BL_QTY_TOTAL")
    private BigDecimal blqtytotal;
    
    @Column(name = "DL_QTY_TOTAL")
    private BigDecimal dlqtytotal;
    
    @Column(name = "IV_QTY_TOTAL")
    private BigDecimal ivqtytotal;
    
    @Column(name = "CURRENCY", length = 6)
    private String currency;
    
    @Column(name = "CURRENCY_ISO", length = 4)
    private String currencyiso;

    @Column(name="CREATED_BY")
    private String createdBy;
 
    @Column(name="UPDATED_BY")
    private String updatedBy;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATED_DATE")
    private Date updatedDate;
    
	@Override
	public Object getPrimaryKey() {
		return null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getHeaderId() {
		return headerId;
	}

	public void setHeaderId(String headerId) {
		this.headerId = headerId;
	}

	public String getPoItem() {
		return poItem;
	}

	public void setPoItem(String poItem) {
		this.poItem = poItem;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public BigDecimal getWithdrqty() {
		return withdrqty;
	}

	public void setWithdrqty(BigDecimal withdrqty) {
		this.withdrqty = withdrqty;
	}

	public BigDecimal getBlockedqy() {
		return blockedqy;
	}

	public void setBlockedqy(BigDecimal blockedqy) {
		this.blockedqy = blockedqy;
	}

	public BigDecimal getBlqty() {
		return blqty;
	}

	public void setBlqty(BigDecimal blqty) {
		this.blqty = blqty;
	}

	public BigDecimal getDelivqty() {
		return delivqty;
	}

	public void setDelivqty(BigDecimal delivqty) {
		this.delivqty = delivqty;
	}

	public BigDecimal getPoprqnt() {
		return poprqnt;
	}

	public void setPoprqnt(BigDecimal poprqnt) {
		this.poprqnt = poprqnt;
	}

	public BigDecimal getValgrloc() {
		return valgrloc;
	}

	public void setValgrloc(BigDecimal valgrloc) {
		this.valgrloc = valgrloc;
	}

	public BigDecimal getValgrfor() {
		return valgrfor;
	}

	public void setValgrfor(BigDecimal valgrfor) {
		this.valgrfor = valgrfor;
	}

	public BigDecimal getIvqty() {
		return ivqty;
	}

	public void setIvqty(BigDecimal ivqty) {
		this.ivqty = ivqty;
	}

	public BigDecimal getIvqtypo() {
		return ivqtypo;
	}

	public void setIvqtypo(BigDecimal ivqtypo) {
		this.ivqtypo = ivqtypo;
	}

	public BigDecimal getValivloc() {
		return valivloc;
	}

	public void setValivloc(BigDecimal valivloc) {
		this.valivloc = valivloc;
	}

	public BigDecimal getValivfor() {
		return valivfor;
	}

	public void setValivfor(BigDecimal valivfor) {
		this.valivfor = valivfor;
	}

	public BigDecimal getClvalloc() {
		return clvalloc;
	}

	public void setClvalloc(BigDecimal clvalloc) {
		this.clvalloc = clvalloc;
	}

	public BigDecimal getClvalfor() {
		return clvalfor;
	}

	public void setClvalfor(BigDecimal clvalfor) {
		this.clvalfor = clvalfor;
	}

	public BigDecimal getDopvlloc() {
		return dopvlloc;
	}

	public void setDopvlloc(BigDecimal dopvlloc) {
		this.dopvlloc = dopvlloc;
	}

	public BigDecimal getIvvalloc() {
		return ivvalloc;
	}

	public void setIvvalloc(BigDecimal ivvalloc) {
		this.ivvalloc = ivvalloc;
	}

	public BigDecimal getIvvalfor() {
		return ivvalfor;
	}

	public void setIvvalfor(BigDecimal ivvalfor) {
		this.ivvalfor = ivvalfor;
	}

	public BigDecimal getDlqtytrsp() {
		return dlqtytrsp;
	}

	public void setDlqtytrsp(BigDecimal dlqtytrsp) {
		this.dlqtytrsp = dlqtytrsp;
	}

	public BigDecimal getBlqtytotal() {
		return blqtytotal;
	}

	public void setBlqtytotal(BigDecimal blqtytotal) {
		this.blqtytotal = blqtytotal;
	}

	public BigDecimal getDlqtytotal() {
		return dlqtytotal;
	}

	public void setDlqtytotal(BigDecimal dlqtytotal) {
		this.dlqtytotal = dlqtytotal;
	}

	public BigDecimal getIvqtytotal() {
		return ivqtytotal;
	}

	public void setIvqtytotal(BigDecimal ivqtytotal) {
		this.ivqtytotal = ivqtytotal;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrencyiso() {
		return currencyiso;
	}

	public void setCurrencyiso(String currencyiso) {
		this.currencyiso = currencyiso;
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

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
