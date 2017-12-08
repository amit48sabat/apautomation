/*package com.incture.accpay.dao;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.CodHistoryDetailDto;
import com.incture.accpay.entities.CodHistoryDetailDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class CodHistoryDetailDao  extends BaseDao<CodHistoryDetailDo, CodHistoryDetailDto> {

	@EJB
	private EntityManager em;

	public CodHistoryDetailDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected CodHistoryDetailDto exportDto(CodHistoryDetailDo entity) {
		CodHistoryDetailDto codHistoryDetailDto = new CodHistoryDetailDto();
		codHistoryDetailDto.setAmount(entity.getAmount());
		codHistoryDetailDto.setAsset(entity.getAsset());
		codHistoryDetailDto.setCompanyCode(entity.getCompanyCode());
		codHistoryDetailDto.setCostCentre(entity.getCostCentre());
		codHistoryDetailDto.setDebitCreditInd(entity.getDebitCreditInd());
		codHistoryDetailDto.setGlAccount(entity.getGlAccount());
		codHistoryDetailDto.setInternalOrder(entity.getInternalOrder());
		codHistoryDetailDto.setProfitCentre(entity.getProfitCentre());
		codHistoryDetailDto.setSerialNo(entity.getSerialNo());
		
		CodHistoryHeaderDao codHistoryHeaderDao = new CodHistoryHeaderDao(em);
		
		codHistoryDetailDto.setCodHistoryHeaderDto(codHistoryHeaderDao.exportDto(entity.getCodHistoryHeaderDo()));
		return codHistoryDetailDto;
	}

	@Override
	protected CodHistoryDetailDo importDto(CodHistoryDetailDto fromDto)
			throws InvalidInputFault, ExecutionFault, NoResultFault {
		CodHistoryDetailDo codHistoryDetailDo = new CodHistoryDetailDo();
		codHistoryDetailDo.setAmount(fromDto.getAmount());
		codHistoryDetailDo.setAsset(fromDto.getAsset());
		codHistoryDetailDo.setCompanyCode(fromDto.getCompanyCode());
		codHistoryDetailDo.setCostCentre(fromDto.getCostCentre());
		codHistoryDetailDo.setDebitCreditInd(fromDto.getDebitCreditInd());
		codHistoryDetailDo.setGlAccount(fromDto.getGlAccount());
		codHistoryDetailDo.setInternalOrder(fromDto.getInternalOrder());
		codHistoryDetailDo.setProfitCentre(fromDto.getProfitCentre());
		codHistoryDetailDo.setSerialNo(fromDto.getSerialNo());
		
		CodHistoryHeaderDao codHistoryHeaderDao = new CodHistoryHeaderDao(em);
		
		codHistoryDetailDo.setCodHistoryHeaderDo(codHistoryHeaderDao.importDto(fromDto.getCodHistoryHeaderDto()));
		return codHistoryDetailDo;
	}
	
	public CodHistoryDetailDto getTemplateDetails(Integer serialNo) {
		Query query = super.getEntityManager().createQuery(
						"SELECT v FROM CodHistoryDetailDo v WHERE v.serialNo =:serialNo");
		query.setParameter("serialNo", serialNo);
		CodHistoryDetailDo codHistoryDetailDo = (CodHistoryDetailDo) query.getSingleResult();
		if(!ServicesUtil.isEmpty(codHistoryDetailDo)){
		return(exportDto(codHistoryDetailDo));
		}
		return null;
	}

}
*/