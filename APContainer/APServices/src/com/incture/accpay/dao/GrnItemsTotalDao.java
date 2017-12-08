package com.incture.accpay.dao;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.GrnItemTotalDto;
import com.incture.accpay.entities.GrnItemsTotalDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class GrnItemsTotalDao extends BaseDao<GrnItemsTotalDo, GrnItemTotalDto>{

	public GrnItemsTotalDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected GrnItemTotalDto exportDto(GrnItemsTotalDo inputDo) {
		GrnItemTotalDto outputDto = new GrnItemTotalDto();
		outputDto.setHeaderId(inputDo.getHeaderId());
		outputDto.setId(inputDo.getId());
		outputDto.setPoItem(inputDo.getPoItem());
		outputDto.setSerialNo(inputDo.getSerialNo());
		outputDto.setWithdrqty(inputDo.getWithdrqty());
		outputDto.setBlockedqy(inputDo.getBlockedqy());
		outputDto.setBlqty(inputDo.getBlqty());
		outputDto.setDelivqty((inputDo.getDelivqty()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setPoprqnt((inputDo.getPoprqnt()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setValgrloc((inputDo.getValgrloc()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setValgrfor((inputDo.getValgrfor()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setIvqty((inputDo.getIvqty()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setIvqtypo((inputDo.getIvqtypo()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setValivloc(inputDo.getValivloc());
		outputDto.setValivfor(inputDo.getValivfor());
		outputDto.setClvalloc(inputDo.getClvalloc());
		outputDto.setClvalfor((inputDo.getClvalfor()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setDopvlloc(inputDo.getDopvlloc());
		outputDto.setIvvalloc(inputDo.getIvvalloc());
		outputDto.setIvvalfor(inputDo.getIvvalfor());
		outputDto.setDlqtytrsp(inputDo.getDlqtytrsp());
		outputDto.setBlqtytotal(inputDo.getBlqtytotal());
		outputDto.setDlqtytotal(inputDo.getDlqtytotal());
		outputDto.setIvqtytotal(inputDo.getIvqtytotal());
		outputDto.setCurrency(inputDo.getCurrency());
		outputDto.setCurrencyiso(inputDo.getCurrencyiso());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
	    outputDto.setUpdatedBy(inputDo.getUpdatedBy());
	    outputDto.setCreatedDate(inputDo.getCreatedDate());
	    outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		
		return outputDto;
	}

	@Override
	protected GrnItemsTotalDo importDto(GrnItemTotalDto inputDto)
			throws InvalidInputFault, ExecutionFault, NoResultFault {
		GrnItemsTotalDo grnDo = new GrnItemsTotalDo();
		grnDo.setCreatedDate(inputDto.getCreatedDate());
		grnDo.setHeaderId(inputDto.getHeaderId());
		grnDo.setId(inputDto.getId());
		grnDo.setHeaderId(inputDto.getHeaderId());
		grnDo.setHeaderId(inputDto.getHeaderId());
		grnDo.setId(inputDto.getId());
		grnDo.setPoItem(inputDto.getPoItem());
		grnDo.setSerialNo(inputDto.getSerialNo());
		grnDo.setWithdrqty(inputDto.getWithdrqty());
		grnDo.setBlockedqy(inputDto.getBlockedqy());
		grnDo.setBlqty(inputDto.getBlqty());
		grnDo.setDelivqty((inputDto.getDelivqty().setScale(3, RoundingMode.HALF_UP)));
		grnDo.setPoprqnt((inputDto.getPoprqnt()).setScale(3, RoundingMode.HALF_UP));
		grnDo.setValgrloc((inputDto.getValgrloc()).setScale(2, RoundingMode.HALF_UP));
		grnDo.setValgrfor((inputDto.getValgrfor()).setScale(2, RoundingMode.HALF_UP));
		grnDo.setIvqty((inputDto.getIvqty()).setScale(3, RoundingMode.HALF_UP));
		grnDo.setIvqtypo((inputDto.getIvqtypo()).setScale(3, RoundingMode.HALF_UP));
		grnDo.setValivloc(inputDto.getValivloc());
		grnDo.setValivfor(inputDto.getValivfor());
		grnDo.setClvalloc(inputDto.getClvalloc());
		grnDo.setClvalfor((inputDto.getClvalfor()).setScale(2, RoundingMode.HALF_UP));
		grnDo.setDopvlloc(inputDto.getDopvlloc());
		grnDo.setIvvalloc(inputDto.getIvvalloc());
		grnDo.setIvvalfor(inputDto.getIvvalfor());
		grnDo.setDlqtytrsp(inputDto.getDlqtytrsp());
		grnDo.setBlqtytotal(inputDto.getBlqtytotal());
		grnDo.setDlqtytotal(inputDto.getDlqtytotal());
		grnDo.setIvqtytotal(inputDto.getIvqtytotal());
		grnDo.setCurrency(inputDto.getCurrency());
		grnDo.setCurrencyiso(inputDto.getCurrencyiso());
		grnDo.setCreatedBy(inputDto.getCreatedBy());
		grnDo.setUpdatedBy(inputDto.getUpdatedBy());
	    grnDo.setCreatedDate(inputDto.getCreatedDate());
	    grnDo.setUpdatedDate(inputDto.getUpdatedDate());
		
		return grnDo;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<GrnItemTotalDto> getByHeaderId(String headerId){
		Query query = super.getEntityManager().createQuery("select v from GrnItemsTotalDo v where v.headerId=:headerId");
		query.setParameter("headerId", headerId);
		List<GrnItemTotalDto> grnTotalDto =null;
		List<GrnItemsTotalDo> listDo = query.getResultList();
		GrnItemsTotalDao grnTotalDao = new GrnItemsTotalDao(super.getEntityManager());
		if (!ServicesUtil.isEmpty(listDo)) {
			
			grnTotalDto = new ArrayList<GrnItemTotalDto>(listDo.size());
			for (GrnItemsTotalDo grnItemsTotalDo : listDo) {
				GrnItemTotalDto grnDto = grnTotalDao.exportDto(grnItemsTotalDo);
				grnTotalDto.add(grnDto);
			}
		}
		
		return grnTotalDto;
		
		
		
	}
	 
	
	
	

}
