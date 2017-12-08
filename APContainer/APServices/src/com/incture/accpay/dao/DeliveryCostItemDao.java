package com.incture.accpay.dao;

import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;

import com.incture.accpay.dto.DeliveryCostItemDto;
import com.incture.accpay.entities.DeliveryCostItemDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class DeliveryCostItemDao extends BaseDao<DeliveryCostItemDo, DeliveryCostItemDto> {

	public DeliveryCostItemDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected DeliveryCostItemDto exportDto(DeliveryCostItemDo inputDo) {
		DeliveryCostItemDto outputDto = new DeliveryCostItemDto();
		outputDto.setAmount((inputDo.getAmount()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setHistoryAmount((inputDo.getHistoryAmount()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setCreatedDate(inputDo.getCreatedDate());
		outputDto.setHeaderId(inputDo.getHeaderId());
		// outputDto.setId(inputDo.getId());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setMaterialDescription(inputDo.getMaterialDescription());
		outputDto.setPoItemId(inputDo.getPoItemId());
		outputDto.setPoNumber(inputDo.getPoNumber());
		outputDto.setQuantityBaseUnit(inputDo.getQuantityBaseUnit());
		outputDto.setUpdatedDate(inputDo.getUpdatedDate());
		outputDto.setQuantity((inputDo.getQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setHistoryQuantity((inputDo.getHistoryQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setFieldType(inputDo.getFieldType());
		outputDto.setIndicator(inputDo.getIndicator());
		outputDto.setFreightVendor(inputDo.getFreightVendor());
		outputDto.setAmountLocal((inputDo.getAmountLcoal()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setBpmng((inputDo.getBpmng()).setScale(3, RoundingMode.HALF_UP));
		outputDto.setZaehk(inputDo.getZaehk());
		outputDto.setStunr(inputDo.getStunr());
		outputDto.setSelected(inputDo.getSelected());
		outputDto.setCreatedBy(inputDo.getCreatedBy());
		outputDto.setUpdatedBy(inputDo.getUpdatedBy());
		return outputDto;
	}

	@Override
	protected DeliveryCostItemDo importDto(DeliveryCostItemDto inputDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		DeliveryCostItemDo outputDo = new DeliveryCostItemDo();
		outputDo.setAmount((inputDto.getAmount()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setHistoryAmount((inputDto.getHistoryAmount()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setCreatedDate(inputDto.getCreatedDate());
		outputDo.setHeaderId(inputDto.getHeaderId());
		outputDo.setId(inputDto.getId());
		outputDo.setMaterialDescription(inputDto.getMaterialDescription());
		outputDo.setPoItemId(inputDto.getPoItemId());
		outputDo.setPoNumber(inputDto.getPoNumber());
		outputDo.setQuantityBaseUnit(inputDto.getQuantityBaseUnit());
		outputDo.setUpdatedDate(inputDto.getUpdatedDate());
		outputDo.setFieldType(inputDto.getFieldType());
		outputDo.setQuantity((inputDto.getQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setHistoryQuantity((inputDto.getHistoryQuantity()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setIndicator(inputDto.getIndicator());
		outputDo.setFreightVendor(inputDto.getFreightVendor());
		outputDo.setAmountLcoal((inputDto.getAmountLocal()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setBpmng((inputDto.getBpmng()).setScale(3, RoundingMode.HALF_UP));
		outputDo.setZaehk(inputDto.getZaehk());
		outputDo.setStunr(inputDto.getStunr());
		outputDo.setSelected(inputDto.getSelected());
		outputDo.setCreatedBy(inputDto.getCreatedBy());
		outputDo.setUpdatedBy(inputDto.getUpdatedBy());
		return outputDo;
	}

	public List<DeliveryCostItemDto> getItemByHeaderId(String headerId) {

		Query query = super.getEntityManager().createQuery("select v from DeliveryCostItemDo v where v.headerId =:headerId");

		query.setParameter("headerId", headerId);

		@SuppressWarnings("unchecked")
		List<DeliveryCostItemDo> itemDoList = query.getResultList();
		DeliveryCostItemDao itemDao = new DeliveryCostItemDao(super.getEntityManager());
		List<DeliveryCostItemDto> itemDtoList = new ArrayList<DeliveryCostItemDto>();
		if (!ServicesUtil.isEmpty(itemDoList)) {
			for (DeliveryCostItemDo deliveryCostItemDo : itemDoList) {
				DeliveryCostItemDto itemDto = itemDao.exportDto(deliveryCostItemDo);
				itemDtoList.add(itemDto);
			}

		}

		else {
			return null;
		}

		return itemDtoList;

	}

	public void deleteByHeaderId(String headerId) {

		Query query = super.getEntityManager().createQuery("DELETE FROM DeliveryCostItemDo g WHERE g.headerId =:headerId");
		query.setParameter("headerId", headerId);
		query.executeUpdate();
	}

	public void updateAmountQuantity(DeliveryCostItemDto deliveryCostItemDto) {
		Query query = super.getEntityManager().createQuery(
				"UPDATE DeliveryCostItemDo g SET g.quantity =:quantity, g.amount =:amount, g.historyQuantity =:historyQuantity, g.historyAmount =:historyAmount, g.selected=:selected, g.updatedBy=:updatedBy, g.updatedDate=:updatedDate WHERE g.id =:id");
		query.setParameter("quantity", deliveryCostItemDto.getQuantity());
		query.setParameter("amount", deliveryCostItemDto.getAmount());
		query.setParameter("historyQuantity", deliveryCostItemDto.getHistoryQuantity());
		query.setParameter("historyAmount", deliveryCostItemDto.getHistoryAmount());
		query.setParameter("selected", deliveryCostItemDto.getSelected());
		query.setParameter("id", deliveryCostItemDto.getId());
		query.setParameter("updatedBy", deliveryCostItemDto.getUpdatedBy());
		query.setParameter("updatedDate", deliveryCostItemDto.getUpdatedDate(), TemporalType.TIMESTAMP);
		query.executeUpdate();
	}

}
