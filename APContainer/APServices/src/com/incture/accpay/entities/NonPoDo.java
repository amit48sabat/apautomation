package com.incture.accpay.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "AP_NON_PO")
public class NonPoDo implements BaseDo, Serializable {

	private static final long serialVersionUID = -865712771524801994L;

	@Id
	@Column(name = "ID", length = 40)
	String id;

	@Column(name = "TASK_ID", length = 40)
	String taskId;

	@Column(name = "REQUEST_ID", length = 20)
	String requestId;

	@Column(name = "AMOUNT")
	BigDecimal amount;

	@Column(name = "ACTION", length = 10)
	String action;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "CREATED_DATE")
	Date dateCreated;

	@Column(name = "CREATED_BY")
	String userCreated;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DATE")
	Date dateUpdated;

	@Column(name = "UPDATED_BY")
	String userUpdated;

	@Column(name = "ROLE_ASSIGNED", length = 20)
	String roleAssigned;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name = "APPROVED_DATE")
	Date approvedDate;

	@Column(name = "COST_CENTER", length = 20)
	String costCenter;

	@Column(name = "INVOICE_ITEM_ID", length = 40)
	String invoiceItemId;

	@Column(name = "DEBIT_CREDIT_IND", length = 10)
	String debitCreditInd;

	@Column(name = "COMPANY_CODE", length = 10)
	String companyCode;

	@Column(name = "GL_CODE", length = 20)
	String glCode;

	@Column(name = "NON_PO_TEXT", length = 55)
	String nonPOText;

	@Column(name = "INTERNAL_ORDER", length = 20)
	String internalOrder;

	@Column(name = "MATERIAL_ID", length = 12)
	private String materialId;

	@Column(name = "MATERIAL_DESCRIPTION", length = 55)
	private String materialDescription;

	@Column(name = "PLANT_ID", length = 4)
	private String plantId;

	@Column(name = "PLANT_DESCRIPTION", length = 55)
	private String plantDescription;

	@Column(name = "FLAG")
	private int flag;

	@Column(name = "QUANTITY")
	private BigDecimal quantity;

	@Column(name = "BASE_UNIT", length = 20)
	private String baseUnit;

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

	public String getNonPOText() {
		return nonPOText;
	}

	public void setNonPOText(String nonPOText) {
		this.nonPOText = nonPOText;
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

	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return id;
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

	public String getRoleAssigned() {
		return roleAssigned;
	}

	public void setRoleAssigned(String roleAssigned) {
		this.roleAssigned = roleAssigned;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

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
		
}
