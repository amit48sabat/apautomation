package com.incture.accpay.dao;

import javax.persistence.EntityManager;

import com.incture.accpay.dto.ActionLogDto;
import com.incture.accpay.entities.ActionLogDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class ActionLogDao extends BaseDao<ActionLogDo, ActionLogDto> {

	public ActionLogDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected ActionLogDo importDto(ActionLogDto inputDto) throws ExecutionFault, NoResultFault, InvalidInputFault {
		ActionLogDo outputDo = new ActionLogDo();
		outputDo.setActionOwner(inputDto.getActionOwner());
		outputDo.setEndTime(inputDto.getEndTime());
		outputDo.setStartTIme(inputDto.getStartTime());
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setErrorDescription(inputDto.getErrorDescription());
		outputDo.setErrorMessage(inputDto.getErrorMessage());
		outputDo.setId(inputDto.getId());
		outputDo.setRequestID(inputDto.getRequestID());
		outputDo.setStatus(inputDto.getStatus());
		outputDo.setStepName(inputDto.getStepName());
		outputDo.setTaskId(inputDto.getTaskId());
		return outputDo;
	}

	@Override
	protected ActionLogDto exportDto(ActionLogDo inputDo) {
		ActionLogDto outputDto = new ActionLogDto();
		// COPY DATA
		outputDto.setActionOwner(inputDo.getActionOwner());
		outputDto.setEndTime(inputDo.getEndTime());
		outputDto.setStartTime(inputDo.getStartTIme());
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setErrorDescription(inputDo.getErrorDescription());
		outputDto.setErrorMessage(inputDo.getErrorMessage());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setRequestID(inputDo.getRequestID());
		outputDto.setStatus(inputDo.getStatus());
		outputDto.setStepName(inputDo.getStepName());
		outputDto.setTaskId(inputDo.getTaskId());
		return outputDto;
	}

	public ActionLogDto getByRequestIdnStepName(String requestId, String stepName) {

		ActionLogDto actionLogDto = new ActionLogDto();
		javax.persistence.Query query = super.getEntityManager()
				.createQuery("select v from ActionLogDo v where v.requestID=:requestId AND v.stepName=:stepName");
		query.setParameter("requestId", requestId);
		query.setParameter("stepName", stepName);
		ActionLogDo actionLogDo = (ActionLogDo) query.getSingleResult();
		actionLogDto = exportDto(actionLogDo);
		return actionLogDto;
	}
}