package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlRootElement
public class GrnItemTotalDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;
	private String id;
	private String headerId;
	private String poItem;
	private String serialNo;
	private BigDecimal withdrqty;
	private BigDecimal blockedqy;
	private BigDecimal blqty;
	private BigDecimal delivqty;
	private BigDecimal poprqnt;
	private BigDecimal valgrloc;
	private BigDecimal valgrfor;
	private BigDecimal ivqty;
	private BigDecimal ivqtypo;
	private BigDecimal valivloc;
	private BigDecimal valivfor;
	private BigDecimal clvalloc;
	private BigDecimal clvalfor;
	private BigDecimal dopvlloc;
	private BigDecimal ivvalloc;
	private BigDecimal ivvalfor;
	private BigDecimal dlqtytrsp;
	private BigDecimal blqtytotal;
	private BigDecimal dlqtytotal;
	private BigDecimal ivqtytotal;
	private String currency;
	private String currencyiso;
	private boolean deleted;
	private Date createdDate;
	private Date updatedDate;
	private String createdBy;
	private String updatedBy;
	
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

	@Override
	public Boolean getValidForUsage() {
		return null;
	}

	@Override
	public void validate(EnOperation operation) throws InvalidInputFault {

		if (id == null) {
			id = ServicesUtil.SPECIAL_CHAR;
			if (operation != EnOperation.RETRIEVE) {
				enforceMandatory("GrnItemTotal.id", id);
			}
		}

		headerId = checkStringSize("GrnItemTotal.headerId", headerId, 40);
	}

	@Override
	public String toString() {
		return "GrnItemTotalDto [blockedqy=" + blockedqy + ", blqty=" + blqty
				+ ", blqtytotal=" + blqtytotal + ", clvalfor=" + clvalfor
				+ ", clvalloc=" + clvalloc + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", currency=" + currency
				+ ", currencyiso=" + currencyiso + ", deleted=" + deleted
				+ ", delivqty=" + delivqty + ", dlqtytotal=" + dlqtytotal
				+ ", dlqtytrsp=" + dlqtytrsp + ", dopvlloc=" + dopvlloc
				+ ", headerId=" + headerId + ", id=" + id + ", ivqty=" + ivqty
				+ ", ivqtypo=" + ivqtypo + ", ivqtytotal=" + ivqtytotal
				+ ", ivvalfor=" + ivvalfor + ", ivvalloc=" + ivvalloc
				+ ", poItem=" + poItem + ", poprqnt=" + poprqnt + ", serialNo="
				+ serialNo + ", updatedBy=" + updatedBy + ", updatedDate="
				+ updatedDate + ", valgrfor=" + valgrfor + ", valgrloc="
				+ valgrloc + ", valivfor=" + valivfor + ", valivloc="
				+ valivloc + ", withdrqty=" + withdrqty + "]";
	}
	
}
