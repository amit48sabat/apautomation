package com.incture.accpay.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;
import com.incture.accpay.util.ServicesUtil;

@XmlRootElement
public class DocumentDto extends BaseDto implements Serializable {
	public static final long serialVersionUID = -8420248345536394783L;

	private String appName;

	private String businessDocType;

	private String createdBy;

	private Date createdDate;

	private String deletedBy;

	private Date deletedDate;

	private String description;

	private String errorMessage;

	private Integer fileID;

	private String fileName;

	private String filePath;

	private String folderName;

	private String id;

	private String operationID;

	private String operationName;

	private String repositoryName;

	private String status;

	private String updatedBy;

	private String base64;

	private boolean deleted;

	public String getBase64() {
		return base64;
	}

	public void setBase64(String base64) {
		this.base64 = base64;
	}

	private Date updatedDate;

	public DocumentDto() {
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getDeletedBy() {
		return deletedBy;
	}

	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}

	public Date getDeletedDate() {
		return deletedDate;
	}

	public void setDeletedDate(Date deletedDate) {
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

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}

	public void validate(EnOperation operation) throws InvalidInputFault {
		if (id == null)// //Bypass due nullable PK in ECC
			id = ServicesUtil.SPECIAL_CHAR;
		if (operation != EnOperation.RETRIEVE) {
			enforceMandatory("Document.id", id);
		}
		appName = checkStringSize("Document.appName", appName, 30);
		businessDocType = checkStringSize("Document.businessDocType",
				businessDocType, 30);
		createdBy = checkStringSize("Document.createdBy", createdBy, 30);
		deletedBy = checkStringSize("Document.deletedBy", deletedBy, 30);
		description = checkStringSize("Document.description", description, 100);
		errorMessage = checkStringSize("Document.errorMessage", errorMessage,
				10);
		fileName = checkStringSize("Document.fileName", fileName, 490);
		filePath = checkStringSize("Document.filePath", filePath, 490);
		folderName = checkStringSize("Document.folderName", folderName, 490);
		id = checkStringSize("Document.id", id, 40);
		operationID = checkStringSize("Document.operationID", operationID, 10);
		operationName = checkStringSize("Document.operationName",
				operationName, 30);
		repositoryName = checkStringSize("Document.repositoryName",
				repositoryName, 30);
		status = checkStringSize("Document.status", status, 10);
		updatedBy = checkStringSize("Document.updatedBy", updatedBy, 30);
	}

	@Override
	public String toString() {
		return "DocumentDto [appName=" + appName + ", base64=" + base64
				+ ", businessDocType=" + businessDocType + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + ", deleted="
				+ deleted + ", deletedBy=" + deletedBy + ", deletedDate="
				+ deletedDate + ", description=" + description
				+ ", errorMessage=" + errorMessage + ", fileID=" + fileID
				+ ", fileName=" + fileName + ", filePath=" + filePath
				+ ", folderName=" + folderName + ", id=" + id
				+ ", operationID=" + operationID + ", operationName="
				+ operationName + ", repositoryName=" + repositoryName
				+ ", status=" + status + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + "]";
	}

}