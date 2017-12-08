package com.incture.accpay.dao;

import java.math.RoundingMode;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.InvoiceItemHistoryDto;
import com.incture.accpay.entities.InvoiceItemHistoryDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class InvoiceItemHistoryDao extends BaseDao<InvoiceItemHistoryDo, InvoiceItemHistoryDto> {

	public InvoiceItemHistoryDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected InvoiceItemHistoryDo importDto(InvoiceItemHistoryDto inputDto) throws ExecutionFault, NoResultFault, InvalidInputFault {
		InvoiceItemHistoryDo outputDo = new InvoiceItemHistoryDo();

		outputDo.setDateCreated(inputDto.getDateCreated());
		outputDo.setDateUpdated(inputDto.getDateUpdated());
		outputDo.setId(inputDto.getId());
		outputDo.setHasSomeGrFlag(inputDto.isHasSomeGrFlag());
		outputDo.setHasErrorFlag(inputDto.isHasErrorFlag());
		outputDo.setMatchingPonumber(inputDto.getMatchingPonumber());
		outputDo.setMaterial(inputDto.getMaterial());
		outputDo.setMaterialLine(inputDto.isMaterialLine());
		outputDo.setNetWorth(inputDto.getNetWorth());
		outputDo.setPartialPost(inputDto.isPartialPost());
		outputDo.setPoUpcCode(inputDto.getPoUpcCode());
		outputDo.setVendorMaterial(inputDto.getVendorMaterial());
		outputDo.setInvoiceItemId(inputDto.getInvoiceItemId());
		outputDo.setMaterialDescription(inputDto.getMaterialDescription());
		outputDo.setNetPrice((ServicesUtil.nullHandler(inputDto.getNetPrice())).setScale(2, RoundingMode.HALF_UP));
		outputDo.setHeadercharges(inputDto.isHeadercharges());
		outputDo.setPoMatchingItemNoId(inputDto.getPoMatchingItemNoId());
		outputDo.setPoMatchingNoId(inputDto.getPoMatchingNoId());
		outputDo.setQuantity((ServicesUtil.nullHandler(inputDto.getQuantity())).setScale(3, RoundingMode.HALF_UP));
		outputDo.setTwowayMatchingFlag(inputDto.getTwowayMatchingFlag());
		outputDo.setThreewayMatchingFlag(inputDto.getThreewayMatchingFlag());
		outputDo.setUnitPrice((ServicesUtil.nullHandler(inputDto.getUnitPrice())).setScale(2, RoundingMode.HALF_UP));
		outputDo.setUom(inputDto.getUom());
		outputDo.setUpcCode(inputDto.getUpcCode());
		outputDo.setGlCoding(inputDto.isGlCoding());
		outputDo.setUserCreated(inputDto.getUserCreated());
		outputDo.setUserUpdated(inputDto.getUserUpdated());
		outputDo.setComment(inputDto.getComment());
		outputDo.setMode(inputDto.getMode());
		outputDo.setUpscMismatchFlag(inputDto.getUpscMismatchFlag());
		outputDo.setUnitPriceMismatchFlag(inputDto.getUnitPriceMismatchFlag());
		outputDo.setDescriptionMismatchFlag(inputDto.getDescriptionMismatchFlag());
		outputDo.setQuantityMismatchFlag(inputDto.getQuantityMismatchFlag());
		outputDo.setPartialPost(inputDto.isPartialPost());
		outputDo.setAmountDifference(inputDto.getAmountDifference());
		outputDo.setInvoicePONumber(inputDto.getInvoicePONumber());
		outputDo.setDiscountValue(inputDto.getDiscountValue());
		outputDo.setVatValue(inputDto.getVatValue());
		outputDo.setRequestId(inputDto.getRequestId());
		outputDo.setVendorMaterialId(inputDto.getVendorMaterialId());
		outputDo.setLineNo(inputDto.getLineNo());
		outputDo.setDeleted(inputDto.isDeleted());
		return outputDo;
	}

	@Override
	public InvoiceItemHistoryDto exportDto(InvoiceItemHistoryDo inputDo) {
		InvoiceItemHistoryDto outputDto = new InvoiceItemHistoryDto();

		outputDto.setDateCreated(inputDo.getDateCreated());
		outputDto.setDateUpdated(inputDo.getDateUpdated());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setInvoiceItemId(inputDo.getInvoiceItemId());
		outputDto.setMaterialDescription(inputDo.getMaterialDescription());
		outputDto.setNetPrice((ServicesUtil.nullHandler(inputDo.getNetPrice())).setScale(2, RoundingMode.HALF_UP));
		outputDto.setPoMatchingItemNoId(inputDo.getPoMatchingItemNoId());
		outputDto.setPoMatchingNoId(inputDo.getPoMatchingNoId());
		outputDto.setQuantity((ServicesUtil.nullHandler(inputDo.getQuantity())).setScale(3, RoundingMode.HALF_UP));
		outputDto.setGlCoding(inputDo.isGlCoding());
		outputDto.setTwowayMatchingFlag(inputDo.getTwowayMatchingFlag());
		outputDto.setThreewayMatchingFlag(inputDo.getThreewayMatchingFlag());
		outputDto.setUnitPrice((ServicesUtil.nullHandler(inputDo.getUnitPrice())).setScale(2, RoundingMode.HALF_UP));
		outputDto.setUom(inputDo.getUom());
		outputDto.setUpcCode(inputDo.getUpcCode());
		outputDto.setUserCreated(inputDo.getUserCreated());
		outputDto.setUserUpdated(inputDo.getUserUpdated());
		outputDto.setComment(inputDo.getComment());
		outputDto.setMode(inputDo.getMode());
		outputDto.setMatchingPonumber(inputDo.getMatchingPonumber());
		outputDto.setMaterial(inputDo.getMaterial());
		outputDto.setHeadercharges(inputDo.isHeadercharges());
		outputDto.setUnitPriceMismatchFlag(inputDo.getUnitPriceMismatchFlag());
		outputDto.setDescriptionMismatchFlag(inputDo.getDescriptionMismatchFlag());
		outputDto.setQuantityMismatchFlag(inputDo.getQuantityMismatchFlag());
		outputDto.setUpscMismatchFlag(inputDo.getUpscMismatchFlag());
		outputDto.setPartialPost(inputDo.isPartialPost());
		outputDto.setAmountDifference(inputDo.getAmountDifference());
		outputDto.setHasErrorFlag(inputDo.isHasErrorFlag());
		outputDto.setHasSomeGrFlag(inputDo.isHasSomeGrFlag());
		outputDto.setInvoicePONumber(inputDo.getInvoicePONumber());
		outputDto.setDiscountValue(inputDo.getDiscountValue());
		outputDto.setVatValue(inputDo.getVatValue());
		outputDto.setMaterialLine(inputDo.isMaterialLine());
		outputDto.setNetWorth(inputDo.getNetWorth());
		outputDto.setPartialPost(inputDo.isPartialPost());
		outputDto.setPoUpcCode(inputDo.getPoUpcCode());
		outputDto.setVendorMaterial(inputDo.getVendorMaterial());
		outputDto.setRequestId(inputDo.getRequestId());
		outputDto.setVendorMaterialId(inputDo.getVendorMaterialId());
		outputDto.setLineNo(inputDo.getLineNo());
		outputDto.setDeleted(inputDo.isDeleted());
		return outputDto;
	}

	public Boolean getRecordExist(String id) {
		Query query = super.getEntityManager().createQuery("SELECT v FROM InvoiceItemHistoryDo v WHERE v.id =:id");
		query.setParameter("id", id);
		return !ServicesUtil.isEmpty(query.getResultList());

	}
}