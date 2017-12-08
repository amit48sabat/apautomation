package com.incture.accpay.dao;

import java.math.RoundingMode;

import javax.persistence.EntityManager;

import com.incture.accpay.dto.GrnItemDto;
import com.incture.accpay.entities.GrnItemDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class GrnItemDao extends BaseDao<GrnItemDo, GrnItemDto> {

	public GrnItemDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected GrnItemDo importDto(GrnItemDto inputDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		GrnItemDo outputDo = new GrnItemDo();

		outputDo.setPoItemId(inputDto.getPoItemId());
		outputDo.setGrItemId(inputDto.getGrItemId());
		outputDo.setId(inputDto.getId());
		outputDo.setQuantity((inputDto.getQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setDocNo(inputDto.getDocNo());
		outputDo.setMaterialId(inputDto.getMaterialId());
		outputDo.setCostForeignCurrency((inputDto.getCostForeignCurrency()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setCostLocalCurrency((inputDto.getCostLocalCurrency()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setInvoiceCostForeign(inputDto.getInvoiceCostForeign());
		outputDo.setInvoiceCostLocal(inputDto.getInvoiceCostLocal());
		outputDo.setRefQuantity((inputDto.getRefQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setRefCostLocal(inputDto.getRefCostLocal());
		outputDo.setRefCostFOREIGN(inputDto.getRefCostFOREIGN());
		outputDo.setRefInvCostForeign(inputDto.getRefInvCostForeign());
		outputDo.setRefInvCostLocal(inputDto.getRefInvCostLocal());
		outputDo.setDocYear(inputDto.getDocYear());
		outputDo.setMoveType(inputDto.getMoveType());
		outputDo.setPostingDate(inputDto.getPostingDate());
		outputDo.setDelivQty((inputDto.getDelivQty()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setDelivUnit(inputDto.getDelivUnit());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		return outputDo;
	}

	@Override
	protected GrnItemDto exportDto(GrnItemDo inputDo) {
		GrnItemDto outputDto = new GrnItemDto();
		// COPY DATA
		outputDto.setPoItemId(inputDo.getPoItemId());
		outputDto.setGrItemId(inputDo.getGrItemId());
		outputDto.setQuantity((inputDo.getQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setDocNo(inputDo.getDocNo());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setMaterialId(inputDo.getMaterialId());
		outputDto.setCostForeignCurrency((inputDo.getCostForeignCurrency()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setCostLocalCurrency((inputDo.getCostLocalCurrency()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setInvoiceCostForeign(inputDo.getInvoiceCostForeign());
		outputDto.setInvoiceCostLocal(inputDo.getInvoiceCostLocal());
		outputDto.setRefQuantity((inputDo.getRefQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setRefCostLocal(inputDo.getRefCostLocal());
		outputDto.setRefCostFOREIGN(inputDo.getRefCostFOREIGN());
		outputDto.setRefInvCostForeign(inputDo.getRefInvCostForeign());
		outputDto.setRefInvCostLocal(inputDo.getRefInvCostLocal());
		outputDto.setDocYear(inputDo.getDocYear());
		outputDto.setMoveType(inputDo.getMoveType());
		outputDto.setPostingDate(inputDo.getPostingDate());
		outputDto.setDelivQty((inputDo.getDelivQty()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setDelivUnit(inputDo.getDelivUnit());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		return outputDto;
	}
}
