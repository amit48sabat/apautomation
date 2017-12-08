/*package com.incture.accpay.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.incture.accpay.dto.CodHistoryDetailDto;
import com.incture.accpay.dto.CodHistoryHeaderDto;
import com.incture.accpay.entities.CodHistoryDetailDo;
import com.incture.accpay.entities.CodHistoryHeaderDo;
import com.incture.accpay.entities.CodHistoryHeaderDoPK;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.EntityManagerProvider;
import com.incture.accpay.util.EntityManagerProviderLocal;
import com.incture.accpay.util.ServicesUtil;

public class CodHistoryHeaderDao extends BaseDao<CodHistoryHeaderDo, CodHistoryHeaderDto> {

	@EJB
	private EntityManager em;

	public CodHistoryHeaderDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected CodHistoryHeaderDto exportDto(CodHistoryHeaderDo entity) {
		CodHistoryHeaderDto codHistoryHeaderDto = new CodHistoryHeaderDto();
		codHistoryHeaderDto.setAccountId(entity.getAccountId());
		codHistoryHeaderDto.setBasecoderEmail(entity.getId().getBasecoderEmail());
		codHistoryHeaderDto.setTemplateNo(entity.getId().getTemplateNo());
		codHistoryHeaderDto.setVendorId(entity.getId().getVendorId());
		codHistoryHeaderDto.setTemplateName(entity.getTemplateName());
		codHistoryHeaderDto.setCreatedBy(entity.getCreatedBy());
		codHistoryHeaderDto.setUpdatedBy(entity.getUpdatedBy());
		codHistoryHeaderDto.setCreatedDate(entity.getCreatedDate());
		codHistoryHeaderDto.setUpdatedDate(entity.getUpdatedDate());
		
		
		CodHistoryDetailDao codHistoryDetailDao = new CodHistoryDetailDao(em);
			
		codHistoryHeaderDto.setCodHistoryDetailDtoList(codHistoryDetailDao.exportDtoList(entity.getCodHistoryDetailDoList()));
		
		//codHistoryHeaderDto.setCodHistoryDetailDtoList(entity.getCodHistoryDetailDoList());
		return codHistoryHeaderDto;
	}

	@Override
	protected CodHistoryHeaderDo importDto(CodHistoryHeaderDto fromDto)
			throws InvalidInputFault, ExecutionFault, NoResultFault {
		CodHistoryHeaderDo codHistoryHeaderDo = new CodHistoryHeaderDo();
		CodHistoryHeaderDoPK codHistoryHeaderDoPK = new CodHistoryHeaderDoPK();
		codHistoryHeaderDoPK.setBasecoderEmail(fromDto.getBasecoderEmail());
		codHistoryHeaderDoPK.setVendorId(fromDto.getVendorId());
		codHistoryHeaderDoPK.setTemplateNo(fromDto.getTemplateNo());
		codHistoryHeaderDo.setTemplateName(fromDto.getTemplateName());
		codHistoryHeaderDo.setId(codHistoryHeaderDoPK);
		codHistoryHeaderDo.setAccountId(fromDto.getAccountId());
		codHistoryHeaderDo.setCreatedBy(fromDto.getCreatedBy());
		codHistoryHeaderDo.setUpdatedBy(fromDto.getUpdatedBy());
		codHistoryHeaderDo.setCreatedDate(fromDto.getCreatedDate());
		codHistoryHeaderDo.setUpdatedDate(fromDto.getUpdatedDate());
		CodHistoryDetailDao codHistoryDetailDao = new CodHistoryDetailDao(em);
		List<CodHistoryDetailDo> codHistoryDetailDoList = new ArrayList<CodHistoryDetailDo>();
		for(CodHistoryDetailDto codHistoryDetailDto:fromDto.getCodHistoryDetailDtoList()){
			codHistoryDetailDoList.add(codHistoryDetailDao.importDto(codHistoryDetailDto));
		}
		codHistoryHeaderDo.setCodHistoryDetailDoList(codHistoryDetailDoList);
		
		return codHistoryHeaderDo;
	}

	@SuppressWarnings("unchecked")
	public List<CodHistoryHeaderDto> getTemplateDetails(String basecoderEmail,String vendorId) {
		Query query = super.getEntityManager().createQuery(
						"SELECT v FROM CodHistoryHeaderDo v WHERE v.basecoderEmail =:basecoderEmail AND v.vendorId =:vendorId");
		query.setParameter("basecoderEmail", basecoderEmail);
		query.setParameter("vendorId", vendorId);
		List<CodHistoryHeaderDo> codHistoryHeaderDoList = query.getResultList();
		if(!ServicesUtil.isEmpty(codHistoryHeaderDoList)){
			List<CodHistoryHeaderDto> codHistoryHeaderDtoList = new ArrayList<CodHistoryHeaderDto>();
			
		for(CodHistoryHeaderDo codHistoryHeaderDo: codHistoryHeaderDoList){
			codHistoryHeaderDtoList.add(exportDto(codHistoryHeaderDo));
		}
		return codHistoryHeaderDtoList;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> getTemplateName(String basecoderEmail,String vendorId) throws InvalidInputFault, NoResultException, Exception {
		Query query = super.getEntityManager().createQuery(
						"SELECT v.templateName FROM CodHistoryHeaderDo v WHERE v.basecoderEmail =:basecoderEmail AND v.vendorId =:vendorId");
		query.setParameter("basecoderEmail", basecoderEmail);
		query.setParameter("vendorId", vendorId);
		List<String> templateNames = query.getResultList();
		if(!ServicesUtil.isEmpty(templateNames)){
			
		return templateNames;
		}
		return null;
	}
	
}
*/