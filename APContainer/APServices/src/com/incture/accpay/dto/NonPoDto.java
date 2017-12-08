package com.incture.accpay.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

public class NonPoDto extends BaseDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private int flag;

	private String id;

	private String invoiceItemId;

	private String taskId;

	private String requestId;

	private BigDecimal amount;

	private String action;

	private Date dateCreated;

	private String userCreated;

	private Date dateUpdated;

	private String userUpdated;

	private String roleAssigned;

	private Date approvedDate;

	private String costCenter;

	private String text;

	private String debitCreditInd;

	private String companyCode;

	private String glCode;

	private String internalOrder;

	private String materialId;

	private String materialDescription;

	private String plantId;

	private String plantDescription;

	private BigDecimal quantity;

	private String baseUnit;

	private boolean deleted;
	
	

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getBaseUnit() {
		return baseUnit;
	}

	public void setBaseUnit(String baseUnit) {
		this.baseUnit = baseUnit;
	}

	public String getMaterialId() {
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getMaterialDescription() {
		return materialDescription;
	}

	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}

	public String getPlantId() {
		return plantId;
	}

	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}

	public String getPlantDescription() {
		return plantDescription;
	}

	public void setPlantDescription(String plantDescription) {
		this.plantDescription = plantDescription;
	}

	public String getCostCenter() {
		return costCenter;
	}

	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getInternalOrder() {
		return internalOrder;
	}

	public void setInternalOrder(String internalOrder) {
		this.internalOrder = internalOrder;
	}

	public String getInvoiceItemId() {
		return invoiceItemId;
	}

	public void setInvoiceItemId(String invoiceItemId) {
		this.invoiceItemId = invoiceItemId;
	}

	public String getDebitCreditInd() {
		return debitCreditInd;
	}

	public void setDebitCreditInd(String debitCreditInd) {
		this.debitCreditInd = debitCreditInd;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getGlCode() {
		return glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getUserCreated() {
		return userCreated;
	}

	public void setUserCreated(String userCreated) {
		this.userCreated = userCreated;
	}

	public String getRoleAssigned() {
		return roleAssigned;
	}

	public void setRoleAssigned(String roleAssigned) {
		this.roleAssigned = roleAssigned;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getUserUpdated() {
		return userUpdated;
	}

	public void setUserUpdated(String userUpdated) {
		this.userUpdated = userUpdated;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	@Override
	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	@Override
	public void validate(EnOperation operation) throws InvalidInputFault {

		if (id == null) // Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("NonPoDto.id", id);
		}

		id = checkStringSize("NonPoDto.id", id, 40);
		invoiceItemId = checkStringSize("NonPoDto.invoiceItemId",
				invoiceItemId, 40);
		taskId = checkStringSize("NonPoDto.invoiceItemId", taskId, 40);
		requestId = checkStringSize("NonPoDto.requestId", requestId, 20);
		action = checkStringSize("NonPoDto.action", action, 10);
		userCreated = checkStringSize("NonPoDto.userCreated", userCreated, 255);
		roleAssigned = checkStringSize("NonPoDto.roleAssigned", roleAssigned,
				20);
		text = checkStringSize("NonPoDto.NonPOText", text, 55);
		companyCode = checkStringSize("NonPoDto.companyCode", companyCode, 20);
		glCode = checkStringSize("NonPoDto.glCode", glCode, 10);
		internalOrder = checkStringSize("NonPoDto.internalOrder",
				internalOrder, 20);
		materialId = checkStringSize("NonPoDto.materialId", materialId, 12);
		materialDescription = checkStringSize("NonPoDto.materialDescription",
				materialDescription, 55);
		plantId = checkStringSize("NonPoDto.plantId", plantId, 4);
		plantDescription = checkStringSize("NonPoDto.plantDescription",
				plantDescription, 55);
	}

	@Override
	public String toString() {
		return "NonPoDto [action=" + action + ", amount=" + amount
				+ ", approvedDate=" + approvedDate + ", baseUnit=" + baseUnit
				+ ", companyCode=" + companyCode + ", costCenter=" + costCenter
				+ ", dateCreated=" + dateCreated + ", dateUpdated="
				+ dateUpdated + ", debitCreditInd=" + debitCreditInd
				+ ", deleted=" + deleted + ", flag=" + flag + ", glCode="
				+ glCode + ", id=" + id + ", internalOrder=" + internalOrder
				+ ", invoiceItemId=" + invoiceItemId + ", materialDescription="
				+ materialDescription + ", materialId=" + materialId
				+ ", plantDescription=" + plantDescription + ", plantId="
				+ plantId + ", quantity=" + quantity + ", requestId="
				+ requestId + ", roleAssigned=" + roleAssigned + ", taskId="
				+ taskId + ", text=" + text + ", userCreated=" + userCreated
				+ ", userUpdated=" + userUpdated + "]";
	}

}
