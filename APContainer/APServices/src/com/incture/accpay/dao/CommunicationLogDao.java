package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.CommunicationLogDto;
import com.incture.accpay.entities.CommunicationLogDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class CommunicationLogDao extends BaseDao<CommunicationLogDo, CommunicationLogDto> {

	public CommunicationLogDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public CommunicationLogDo importDto(CommunicationLogDto inputDto) throws ExecutionFault, NoResultFault, InvalidInputFault {
		CommunicationLogDo outputDo = new CommunicationLogDo();
		outputDo.setComment(inputDto.getComment());
		outputDo.setCommentedBy(inputDto.getCommentedBy());
		outputDo.setId(inputDto.getId());
		outputDo.setStep(inputDto.getStep());
		outputDo.setRequestId(inputDto.getRequestId());
		outputDo.setDateCommented(inputDto.getDateCommented());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setDateUpdated(inputDto.getUpdatedDate());

		return outputDo;
	}

	@Override
	public CommunicationLogDto exportDto(CommunicationLogDo inputDo) {
		CommunicationLogDto outputDto = new CommunicationLogDto();
		outputDto.setComment(inputDo.getComment());
		outputDto.setCommentedBy(inputDo.getCommentedBy());
		outputDto.setId(inputDo.getId());
		outputDto.setStep(inputDo.getStep());
		outputDto.setRequestId(inputDo.getRequestId());
		outputDto.setDateCommented(inputDo.getDateCommented());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setUpdatedDate(inputDo.getDateUpdated());
		return outputDto;
	}

	@SuppressWarnings("unchecked")
	public List<CommunicationLogDto> getCommunicationByRequestId(String requestId) {
		EntityManager em = super.getEntityManager();

		javax.persistence.Query commentQry = em.createQuery("select v from CommunicationLogDo v where v.requestId=:requestID");
		commentQry.setParameter("requestID", requestId);
		List<CommunicationLogDo> commentsList = commentQry.getResultList();
		List<CommunicationLogDto> commentListDto = new ArrayList<CommunicationLogDto>();
		if (!ServicesUtil.isEmpty(commentsList)) {
			CommunicationLogDao commDao = new CommunicationLogDao(em);
			for (CommunicationLogDo communicationLogDo : commentsList) {
				CommunicationLogDto commentDto = new CommunicationLogDto();
				commentDto = commDao.exportDto(communicationLogDo);
				commentListDto.add(commentDto);
			}
		}
		if (!ServicesUtil.isEmpty(commentListDto)) {
			return commentListDto;
		}
		return null;

	}

	public void deleteByRequestId(String requestId) {
		Query query = super.getEntityManager().createQuery("DELETE FROM CommunicationLogDo v WHERE v.requestId =:requestId");
		query.setParameter("requestId", requestId);
		@SuppressWarnings("unused")
		int rowsDeleted = query.executeUpdate();
	}

}
