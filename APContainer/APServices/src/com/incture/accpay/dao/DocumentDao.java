package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.DocumentDto;
import com.incture.accpay.entities.DocumentDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class DocumentDao extends BaseDao<DocumentDo, DocumentDto> {

	public DocumentDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected DocumentDo importDto(DocumentDto inputDto) throws ExecutionFault, NoResultFault, InvalidInputFault {
		DocumentDo outputDo = new DocumentDo();
		// TODO: VALIDATE FK HERE
		/**
		*/
		// COPY DATA
		outputDo.setAppName(inputDto.getAppName());
		outputDo.setBusinessDocType(inputDto.getBusinessDocType());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setDeletedBy(inputDto.getDeletedBy());
		outputDo.setDeletedDate(inputDto.getDeletedDate());
		outputDo.setDescription(inputDto.getDescription());
		outputDo.setErrorMessage(inputDto.getErrorMessage());
		outputDo.setFileID(inputDto.getFileID());
		outputDo.setFileName(inputDto.getFileName());
		outputDo.setFilePath(inputDto.getFilePath());
		outputDo.setFolderName(inputDto.getFolderName());
		outputDo.setId(inputDto.getId());
		outputDo.setOperationID(inputDto.getOperationID());
		outputDo.setOperationName(inputDto.getOperationName());
		outputDo.setRepositoryName(inputDto.getRepositoryName());
		outputDo.setStatus(inputDto.getStatus());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		return outputDo;
	}

	@Override
	protected DocumentDto exportDto(DocumentDo inputDo) {
		DocumentDto outputDto = new DocumentDto();
		// COPY DATA
		outputDto.setAppName(inputDo.getAppName());
		outputDto.setBusinessDocType(inputDo.getBusinessDocType());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		outputDto.setDeletedBy(inputDo.getDeletedBy());
		outputDto.setDeletedDate(inputDo.getDeletedDate());
		outputDto.setDescription(inputDo.getDescription());
		outputDto.setErrorMessage(inputDo.getErrorMessage());
		outputDto.setFileID(inputDo.getFileID());
		outputDto.setFileName(inputDo.getFileName());
		outputDto.setFilePath(inputDo.getFilePath());
		outputDto.setFolderName(inputDo.getFolderName());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setOperationID(inputDo.getOperationID());
		outputDto.setOperationName(inputDo.getOperationName());
		outputDto.setRepositoryName(inputDo.getRepositoryName());
		outputDto.setStatus(inputDo.getStatus());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		return outputDto;
	}

	@SuppressWarnings("unchecked")
	public List<DocumentDto> getByRequestId(String requestId) {
		List<DocumentDto> documentDtos = new ArrayList<DocumentDto>();
		Query query = super.getEntityManager()
				.createQuery("SELECT v FROM DocumentDo v WHERE v.folderName like \'%" + requestId + "%\' AND v.folderName <> '" + requestId + "'");
		List<DocumentDo> documentDos = query.getResultList();
		for (int i = 0; i < ServicesUtil.nullHandler(documentDos); i++) {
			documentDtos.add(exportDto(documentDos.get(i)));
		}
		return documentDtos;
	}

	@SuppressWarnings("unchecked")
	public List<DocumentDto> getAllUrlsByRequestId(String requestId) {
		List<DocumentDto> documentDtos = new ArrayList<DocumentDto>();
		Query query = super.getEntityManager().createQuery("SELECT v FROM DocumentDo v WHERE v.folderName like \'%" + requestId + "%\'");
		List<DocumentDo> documentDos = query.getResultList();
		for (int i = 0; i < ServicesUtil.nullHandler(documentDos); i++) {
			documentDtos.add(exportDto(documentDos.get(i)));
		}
		return documentDtos;
	}

}