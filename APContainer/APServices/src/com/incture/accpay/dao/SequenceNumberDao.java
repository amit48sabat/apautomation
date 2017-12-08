package com.incture.accpay.dao;

import javax.persistence.EntityManager;

import com.incture.accpay.dto.SequenceNumberDto;
import com.incture.accpay.entities.SequenceNumber;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;

public class SequenceNumberDao extends
		BaseDao<SequenceNumber, SequenceNumberDto> {

	public SequenceNumberDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected SequenceNumberDto exportDto(SequenceNumber entity) {
		SequenceNumberDto dto = new SequenceNumberDto();
		dto.setAPASerialId(entity.getAPASerialId());
		return dto;
	}

	@Override
	protected SequenceNumber importDto(SequenceNumberDto fromDto)
			throws InvalidInputFault, ExecutionFault, NoResultFault {
		SequenceNumber entity = new SequenceNumber();
		entity.setAPASerialId(fromDto.getAPASerialId());
		return entity;
	}

	public SequenceNumberDto createProject(SequenceNumberDto dto)
			throws ExecutionFault, InvalidInputFault, NoResultFault {
		SequenceNumber sequenceNumberDo = importDto(dto);
		persist(sequenceNumberDo);
		return exportDto(sequenceNumberDo);
	}

	public String getRequestId(Integer serialId) {
		StringBuffer sb = new StringBuffer(serialId + "");
		StringBuffer resultsb = new StringBuffer("APA");
		if (sb.length() < 12) {
			int noOfPads = 12 - sb.length();
			while (noOfPads-- > 0) {
				sb.insert(0, '0');
			}
			resultsb.append(sb);
		} else {
			resultsb.append(sb);
		}
		return resultsb.toString();
	}

}
