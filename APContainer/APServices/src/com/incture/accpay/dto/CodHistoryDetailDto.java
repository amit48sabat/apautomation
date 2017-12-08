package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;

@SuppressWarnings("serial")
public class CodHistoryDetailDto extends BaseDto implements Serializable {

	private String serialNo;
	private String glAccount;
	private String costCentre;
	private String internalOrder;
	private String asset;
	private String debitCreditInd;
	private String profitCentre;
	private String companyCode;
	private BigDecimal amount;
	private CodHistoryHeaderDto codHistoryHeaderDto;
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
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
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public CodHistoryHeaderDto getCodHistoryHeaderDto() {
		return codHistoryHeaderDto;
	}
	public void setCodHistoryHeaderDto(CodHistoryHeaderDto codHistoryHeaderDto) {
		this.codHistoryHeaderDto = codHistoryHeaderDto;
	}
	@Override
	public Boolean getValidForUsage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void validate(EnOperation enOperation) throws InvalidInputFault {
		// TODO Auto-generated method stub
		
	}
	

}
