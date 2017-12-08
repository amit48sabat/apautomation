package com.incture.accpay.dao;

import java.math.RoundingMode;

import javax.persistence.EntityManager;

import com.incture.accpay.dto.PoItemDto;
import com.incture.accpay.entities.PoItemDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class PoItemDao extends BaseDao<PoItemDo, PoItemDto> {

	public PoItemDao(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	protected PoItemDo importDto(PoItemDto inputDto) throws ExecutionFault, NoResultFault, InvalidInputFault {
		PoItemDo outputDo = new PoItemDo();
		// TODO: VALIDATE FK HERE
		// COPY DATA
		outputDo.setId(inputDto.getId());
		// Removes all the 0's(Zeros) at the start of Material Number.
		outputDo.setMaterialNumber(inputDto.getMaterialNumber().replaceFirst("^0*", ""));
		outputDo.setNetPrice((inputDto.getNetPrice()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setPoItem(inputDto.getPoItem());
		outputDo.setQuantity((inputDto.getQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setShortText(inputDto.getShortText());
		outputDo.setVendMat(inputDto.getVendMat());
		// outputDo.setPosted(inputDto.getPosted());
		outputDo.setUnit(inputDto.getUnit());
		outputDo.setUnitPrice((inputDto.getUnitPrice()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setQuantityAccepted(inputDto.getQuantityAccepted());
		outputDo.setMaterialPrice(inputDto.getMaterialPrice());
		outputDo.setBaseUom(inputDto.getBaseUom());
		outputDo.setBaseQuantity(inputDto.getBaseQuantity());
		outputDo.setConvDen1(inputDto.getConvDen1());
		outputDo.setConvNum1(inputDto.getConvNum1());
		outputDo.setItemCategory(inputDto.getItemCategory());
		outputDo.setVendorMaterialId(inputDto.getVendorMaterialId());
		outputDo.setMaterialId(inputDto.getMaterialId());
		outputDo.setNetWorth((inputDto.getNetWorth()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setPoOrderUnit(inputDto.getPoOrderUnit());
		outputDo.setUpsc(inputDto.getUpsc());
		outputDo.setGrIndicator(inputDto.getGrIndicator());
		outputDo.setDeleted(inputDto.getDeleted());
		outputDo.setSkuUnit(inputDto.getSkuUnit());
		outputDo.setSkuFactor(inputDto.getSkuFactor());
		outputDo.setSkuOrderUnit(inputDto.getSkuOrderUnit());
		outputDo.setSkuOrderFactor(inputDto.getSkuOrderFactor());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		outputDo.setFreeItem(inputDto.getFreeItem());
		outputDo.setAccountAssignCategory(inputDto.getAccountAssignCategory());
		return outputDo;
	}

	@Override
	protected PoItemDto exportDto(PoItemDo inputDo) {
		PoItemDto outputDto = new PoItemDto();
		// COPY DATA
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setMaterialNumber(inputDo.getMaterialNumber());
		outputDto.setNetPrice((inputDo.getNetPrice()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setPoItem(inputDo.getPoItem());
		outputDto.setQuantity((inputDo.getQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setShortText(inputDo.getShortText());
		outputDto.setVendMat(inputDo.getVendMat());
		outputDto.setPosted(inputDo.isPosted());
		outputDto.setUnit(inputDo.getUnit());
		outputDto.setUnitPrice((inputDo.getUnitPrice()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setMaterialPrice(inputDo.getMaterialPrice());
		outputDto.setQuantityAccepted(inputDo.getQuantityAccepted());
		outputDto.setBaseUom(inputDo.getBaseUom());
		outputDto.setBaseQuantity(inputDo.getBaseQuantity());
		outputDto.setConvDen1(inputDo.getConvDen1());
		outputDto.setConvNum1(inputDo.getConvNum1());
		outputDto.setItemCategory(inputDo.getItemCategory());
		outputDto.setVendorMaterialId(inputDo.getVendorMaterialId());
		outputDto.setMaterialId(inputDo.getMaterialId());
		outputDto.setNetWorth((inputDo.getNetWorth()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setPoOrderUnit(inputDo.getPoOrderUnit());
		outputDto.setUpsc(inputDo.getUpsc());
		outputDto.setGrIndicator(inputDo.getGrIndicator());
		outputDto.setDeleted(inputDo.getDeleted());
		outputDto.setSkuUnit(inputDo.getSkuUnit());
		outputDto.setSkuFactor(inputDo.getSkuFactor());
		outputDto.setSkuOrderUnit(inputDo.getSkuOrderUnit());
		outputDto.setSkuOrderFactor(inputDo.getSkuOrderFactor());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		outputDto.setFreeItem(inputDo.getFreeItem());
		outputDto.setAccountAssignCategory(inputDo.getAccountAssignCategory());
		return outputDto;
	}
}