package com.incture.accpay.dao;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.incture.accpay.dto.UserPreferenceColumnsDto;
import com.incture.accpay.entities.UserPreferenceColumnsDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class UserPreferenceColumnsDao extends BaseDao<UserPreferenceColumnsDo, UserPreferenceColumnsDto> {

	public UserPreferenceColumnsDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected UserPreferenceColumnsDto exportDto(UserPreferenceColumnsDo entity) {
		// TODO Auto-generated method stub
		UserPreferenceColumnsDto userPreferenceColumnsDto = new UserPreferenceColumnsDto();
		userPreferenceColumnsDto.setUserId(entity.getUserId());
		if (!ServicesUtil.isEmpty(entity.getColumns())) {
			userPreferenceColumnsDto.setColumnList(Arrays.asList(entity.getColumns().trim().split(","))); // CLOB(String)->List<String>
		}
		return userPreferenceColumnsDto;
	}

	@Override
	protected UserPreferenceColumnsDo importDto(UserPreferenceColumnsDto fromDto)
			throws InvalidInputFault, ExecutionFault, NoResultFault {
		// TODO Auto-generated method stub
		UserPreferenceColumnsDo userPreferenceColumnsDo = new UserPreferenceColumnsDo();
		userPreferenceColumnsDo.setUserId(fromDto.getUserId());
		// List<String> -> String
		if (!ServicesUtil.isEmpty(fromDto.getColumnList())) {
			StringBuilder sb = new StringBuilder();
			for (String s : fromDto.getColumnList()) {
				sb.append(s);
				sb.append(",");
			}
			userPreferenceColumnsDo.setColumns(sb.substring(0, (sb.length() - 1)));
		}
		return userPreferenceColumnsDo;
	}

	public UserPreferenceColumnsDto getColumnsByUserId(String userId) throws ExecutionFault, InvalidInputFault {
		EntityManager em = super.getEntityManager();
		UserPreferenceColumnsDo userPreferenceColumnsDo = new UserPreferenceColumnsDo();
		Query query = em.createQuery("select v from UserPreferenceColumnsDo v where v.userId=:userId");
		query.setParameter("userId", userId);
		try {
			userPreferenceColumnsDo = (UserPreferenceColumnsDo) query.getSingleResult();
			return exportDto(userPreferenceColumnsDo);
		} catch (NoResultException e) {
			e.printStackTrace();
			return null;
		}

	}

	public Integer deleteByUserId(String userId) {
		Query query = super.getEntityManager()
				.createQuery("DELETE FROM UserPreferenceColumnsDo v WHERE v.userId =:userId");
		query.setParameter("userId", userId);
		return (query.executeUpdate());
	}

}
