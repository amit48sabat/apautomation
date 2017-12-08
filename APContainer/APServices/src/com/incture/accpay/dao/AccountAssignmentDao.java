package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.AccountAssignmentDto;
import com.incture.accpay.entities.AccountAssignmentDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class AccountAssignmentDao extends BaseDao<AccountAssignmentDo, AccountAssignmentDto> {

	public AccountAssignmentDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected AccountAssignmentDto exportDto(AccountAssignmentDo accAssignDo) {
		AccountAssignmentDto accAssignDto = new AccountAssignmentDto();
		accAssignDto.setAssetNo(accAssignDo.getAssetNo());
		accAssignDto.setCostCenter(accAssignDo.getCostCenter());
		accAssignDto.setCreatedBy(accAssignDo.getCreatedBy());
		accAssignDto.setCreatedDate(accAssignDo.getCreatedDate());
		accAssignDto.setDeleted(accAssignDo.getDeleted());
		accAssignDto.setDistrPerc(accAssignDo.getDistrPerc());
		accAssignDto.setGlAccount(accAssignDo.getGlAccount());
		accAssignDto.setId(accAssignDo.getId());
		accAssignDto.setNetValue(accAssignDo.getNetValue());
		accAssignDto.setOrderId(accAssignDo.getOrderId());
		accAssignDto.setPoItem(accAssignDo.getPoItem());
		accAssignDto.setQuantity(accAssignDo.getQuantity());
		accAssignDto.setSerialNo(accAssignDo.getSerialNo());
		accAssignDto.setSubNumber(accAssignDo.getSubNumber());
		accAssignDto.setUpdatedBy(accAssignDo.getUpdatedBy());
		accAssignDto.setUpdatedDate(accAssignDo.getUpdatedDate());
		accAssignDto.setWbsElement(accAssignDo.getWbsElement());
		accAssignDto.setUnplannedLIne(accAssignDo.getUnplannedLIne());
		accAssignDto.setPoHeaderId(accAssignDo.getPoHeaderId());
		return accAssignDto;
	}

	@Override
	protected AccountAssignmentDo importDto(AccountAssignmentDto accAssignDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		AccountAssignmentDo accAssignDo = new AccountAssignmentDo();
		accAssignDo.setAssetNo(accAssignDto.getAssetNo());
		accAssignDo.setCostCenter(accAssignDto.getCostCenter());
		accAssignDo.setCreatedBy(accAssignDto.getCreatedBy());
		accAssignDo.setCreatedDate(accAssignDto.getCreatedDate());
		accAssignDo.setDeleted(accAssignDto.getDeleted());
		accAssignDo.setDistrPerc(accAssignDto.getDistrPerc());
		accAssignDo.setGlAccount(accAssignDto.getGlAccount());
		accAssignDo.setId(accAssignDto.getId());
		accAssignDo.setNetValue(accAssignDto.getNetValue());
		accAssignDo.setOrderId(accAssignDto.getOrderId());
		accAssignDo.setPoItem(accAssignDto.getPoItem());
		accAssignDo.setQuantity(accAssignDto.getQuantity());
		accAssignDo.setSerialNo(accAssignDto.getSerialNo());
		accAssignDo.setSubNumber(accAssignDto.getSubNumber());
		accAssignDo.setUpdatedBy(accAssignDto.getUpdatedBy());
		accAssignDo.setUpdatedDate(accAssignDto.getUpdatedDate());
		accAssignDo.setWbsElement(accAssignDto.getWbsElement());
		accAssignDo.setUnplannedLIne(accAssignDto.getUnplannedLIne());
		accAssignDo.setPoHeaderId(accAssignDto.getPoHeaderId());
		return accAssignDo;
	}

	@SuppressWarnings("unchecked")
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public List<AccountAssignmentDto> getaccAssignListByPoHeaderId(String poHeaderId) {
		List<AccountAssignmentDto> accAssignDtoList = new ArrayList<AccountAssignmentDto>();
		Query query = super.getEntityManager().createQuery("select v from AccountAssignmentDo v where v.poHeaderId =:poHeaderId");
		query.setParameter("poHeaderId", poHeaderId);
		try {
			List<AccountAssignmentDo> accAssignList = query.getResultList();
			if (!ServicesUtil.isEmpty(accAssignList)) {
				for (AccountAssignmentDo accAsssignDo : accAssignList) {
					AccountAssignmentDto accAssignDto = exportDto(accAsssignDo);
					accAssignDtoList.add(accAssignDto);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return accAssignDtoList;
	}

	public void deleteByPOHeaderId(String poHeaderId) {
		Query query = super.getEntityManager().createQuery("DELETE FROM AccountAssignmentDo g WHERE g.poHeaderId =:poHeaderId");
		query.setParameter("poHeaderId", poHeaderId);
		query.executeUpdate();
	}

	public void deleteByPOHeaderItem(String poHeaderId, String poItem) {
		Query query = super.getEntityManager().createQuery("DELETE FROM AccountAssignmentDo g WHERE g.poHeaderId =:poHeaderId AND g.poItem =:poItem");
		query.setParameter("poHeaderId", poHeaderId);
		query.setParameter("poItem", poItem);
		query.executeUpdate();
	}

}
