package com.incture.accpay.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
* Comments: null,
*/
@Entity
@Table(name="AP_DOCUMENT")
public class DocumentDo implements BaseDo, Serializable {
	public static final long serialVersionUID = 125718377695802355L;

	@Column(name="APP_NAME", length=30)
	private String appName;

	@Column(name="BUSINESS_DOC_TYPE", length=30)
	private String businessDocType;

	@Column(name="CREATED_BY", length=30)
	private String createdBy;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="CREATED_DATE")
	private java.util.Date createdDate;

	@Column(name="DELETED_BY", length=30)
	private String deletedBy;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="DELETED_DATE")
	private java.util.Date deletedDate;

	@Column(name="DESCRIPTION", length=100)
	private String description;

	@Column(name="ERROR_MESSAGE", length=10)
	private String errorMessage;

	@Column(name="FILE_ID")
	private Integer fileID;

	@Column(name="FILE_NAME", length=490)
	private String fileName;

	@Column(name="FILE_PATH", length=490)
	private String filePath;

	@Column(name="FOLDER_NAME", length=490)
	private String folderName;

	@Id
	@Column(name="ID", length=40, nullable = false)
	private String id;

	@Column(name="OPERATION_ID", length=10)
	private String operationID;

	@Column(name="OPERATION_NAME", length=30)
	private String operationName;

	@Column(name="REPOSITORY_NAME", length=30)
	private String repositoryName;

	@Column(name="STATUS", length=10)
	private String status;

	@Column(name="UPDATED_BY", length=30)
	private String updatedBy;

	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	@Column(name="UPDATED_DATE")
	private java.util.Date updatedDate;

	@Override
	public Object getPrimaryKey() {
		return id;
	}

	public DocumentDo() {
		super();
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getBusinessDocType() {
		return businessDocType;
	}

	public void setBusinessDocType(String businessDocType) {
		this.businessDocType = businessDocType;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public java.util.Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(java.util.Date deletedDate) {
		this.deletedDate = deletedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getFileID() {
		return fileID;
	}

	public void setFileID(Integer fileID) {
		this.fileID = fileID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOperationID() {
		return operationID;
	}

	public void setOperationID(String operationID) {
		this.operationID = operationID;
	}

	public String getOperationName() {
		return operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}

	public String getRepositoryName() {
		return repositoryName;
	}

	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public java.util.Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(java.util.Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}
}