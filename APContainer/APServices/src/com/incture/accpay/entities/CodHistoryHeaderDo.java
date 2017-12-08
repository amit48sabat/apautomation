/*package com.incture.accpay.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

*//**
 * Entity implementation class for Entity: CodHistoryHeaderDo
 * 
 *//*
@Entity
@Table(name = "AP_COD_HIST_HEADER")
@IdClass(CodHistoryHeaderDoPK.class) 
public class CodHistoryHeaderDo implements BaseDo, Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	@Column(name = "ID")
	private CodHistoryHeaderDoPK id;

	@Column(name = "TEMPLATE_NAME", length = 25)
	private String templateName;
	
	@Column(name = "ACCOUNT_ID")
	private String accountId;

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

	@OneToMany(mappedBy = "codHistoryHeaderDo",cascade = CascadeType.ALL)
	private List<CodHistoryDetailDo> codHistoryDetailDoList;

	public CodHistoryHeaderDo() {
		super();
	}

	public String getAccountId() {
		return accountId;
	}

	public CodHistoryHeaderDoPK getId() {
		return id;
	}

	public void setId(CodHistoryHeaderDoPK id) {
		this.id = id;
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
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setCodHistoryDetailDoList(
			List<CodHistoryDetailDo> codHistoryDetailDoList) {
		this.codHistoryDetailDoList = codHistoryDetailDoList;
	}

	public List<CodHistoryDetailDo> getCodHistoryDetailDoList() {
		return codHistoryDetailDoList;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getTemplateName() {
		return templateName;
	}

}
*/