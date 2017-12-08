package com.incture.accpay.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;


public class CodHistoryHeaderDto extends BaseDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String basecoderEmail;
	private String vendorId;
	private String templateNo;
	private String templateName;
	private String accountId;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;
	private List<CodHistoryDetailDto> CodHistoryDetailDtoList;
	
	public String getBasecoderEmail() {
		return basecoderEmail;
	}
	public void setBasecoderEmail(String basecoderEmail) {
		this.basecoderEmail = basecoderEmail;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getTemplateNo() {
		return templateNo;
	}
	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public void setCodHistoryDetailDtoList(List<CodHistoryDetailDto> codHistoryDetailDtoList) {
		CodHistoryDetailDtoList = codHistoryDetailDtoList;
	}
	public List<CodHistoryDetailDto> getCodHistoryDetailDtoList() {
		return CodHistoryDetailDtoList;
	}

	

	

}
