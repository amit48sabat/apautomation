/*package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

*//**
 * Entity implementation class for Entity: CodHistoryDetailDo
 * 
 *//*
@TableGenerator(name = "APACodHistDetNo", table = "APA_SEQ_NUM", allocationSize = 1, initialValue = 0, pkColumnName = "GEN_KEY", valueColumnName = "GEN_VALUE", pkColumnValue = "APACodHistDetNo")
@Entity
@Table(name = "AP_COD_HIST_DETAIL")
public class CodHistoryDetailDo implements BaseDo, Serializable {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.TABLE, generator = "APASequenceNumber")
	@Id
	@Column(name = "SERIAL_NO", nullable = false)
	private String serialNo;

	@Column(name = "GL_ACCOUNT", length = 10)
	private String glAccount;

	@Column(name = "COST_CENTRE", length = 50)
	private String costCentre;

	@Column(name = "INTERNAL_ORDER")
	private String internalOrder;

	@Column(name = "ASSET")
	private String asset;

	@Column(name = "DEBIT_CREDIT_IND", length = 1)
	private String debitCreditInd;

	@Column(name = "PROFIT_CENTRE")
	private String profitCentre;

	@Column(name = "COMPANY_CODE", length = 10)
	private String companyCode;

	@Column(name = "AMOUNT")
	private BigDecimal amount;

	@ManyToOne
	@JoinColumns({@JoinColumn(name = "BASECODER_EMAIL", referencedColumnName ="BASECODER_EMAIL"),
		@JoinColumn(name = "VENDOR_ID", referencedColumnName ="VENDOR_ID"),
		@JoinColumn(name = "TEMPLATE_NO", referencedColumnName ="TEMPLATE_NO")})
	private CodHistoryHeaderDo codHistoryHeaderDo;
	
	
	@ManyToOne
	@JoinColumn(name = "id")
	private CodHistoryHeaderDo codHistoryHeaderDo;
	
	public String getGlAccount() {
		return glAccount;
	}

	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}

	public String getCostCentre() {
		return costCentre;
	}

	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;
	}

	public String getInternalOrder() {
		return internalOrder;
	}

	public void setInternalOrder(String internalOrder) {
		this.internalOrder = internalOrder;
	}

	public String getAsset() {
		return asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getDebitCreditInd() {
		return debitCreditInd;
	}

	public void setDebitCreditInd(String debitCreditInd) {
		this.debitCreditInd = debitCreditInd;
	}

	public String getProfitCentre() {
		return profitCentre;
	}

	public void setProfitCentre(String profitCentre) {
		this.profitCentre = profitCentre;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public CodHistoryDetailDo() {
		super();
	}

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setCodHistoryHeaderDo(CodHistoryHeaderDo codHistoryHeaderDo) {
		this.codHistoryHeaderDo = codHistoryHeaderDo;
	}

	public CodHistoryHeaderDo getCodHistoryHeaderDo() {
		return codHistoryHeaderDo;
	}
}
*/