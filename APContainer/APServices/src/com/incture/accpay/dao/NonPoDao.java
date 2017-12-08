package com.incture.accpay.dao;

import java.io.Serializable;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.incture.accpay.dto.NonPoDto;
import com.incture.accpay.entities.NonPoDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.util.ServicesUtil;

public class NonPoDao extends BaseDao<NonPoDo, NonPoDto> implements Serializable {

	private static final long serialVersionUID = -6445463765493109898L;

	public NonPoDao(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected NonPoDto exportDto(NonPoDo inputDo) {
		// TODO Auto-generated method stub
		NonPoDto outputDto = new NonPoDto();
		outputDto.setAction(inputDo.getAction());
		outputDto.setAmount((inputDo.getAmount()).setScale(2, RoundingMode.HALF_UP));
		outputDto.setApprovedDate(inputDo.getApprovedDate());
		outputDto.setCostCenter(inputDo.getCostCenter());
		outputDto.setDateCreated(inputDo.getDateCreated());
		if (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
			outputDto.setId(inputDo.getId());
		}
		outputDto.setRequestId(inputDo.getRequestId());
		outputDto.setInvoiceItemId(inputDo.getInvoiceItemId());
		outputDto.setRoleAssigned(inputDo.getRoleAssigned());
		outputDto.setTaskId(inputDo.getTaskId());
		outputDto.setUserCreated(inputDo.getUserCreated());
		outputDto.setCompanyCode(inputDo.getCompanyCode());
		outputDto.setDebitCreditInd(inputDo.getDebitCreditInd());
		outputDto.setGlCode(inputDo.getGlCode());
		outputDto.setText(inputDo.getNonPOText());
		outputDto.setInternalOrder(inputDo.getInternalOrder());
		outputDto.setMaterialId(inputDo.getMaterialId());
		outputDto.setMaterialDescription(inputDo.getMaterialDescription());
		outputDto.setPlantId(inputDo.getPlantId());
		outputDto.setPlantDescription(inputDo.getPlantDescription());
		outputDto.setFlag(inputDo.getFlag());
		outputDto.setQuantity((ServicesUtil.nullHandler(inputDo.getQuantity())).setScale(3, RoundingMode.HALF_UP));
		outputDto.setBaseUnit(inputDo.getBaseUnit());
		outputDto.setDateUpdated(inputDo.getDateUpdated());
		outputDto.setUserUpdated(inputDo.getUserUpdated());
		return outputDto;
	}

	@Override
	protected NonPoDo importDto(NonPoDto inputDto) throws InvalidInputFault, ExecutionFault, NoResultFault {
		NonPoDo outputDo = new NonPoDo();
		outputDo.setAction(inputDto.getAction());
		outputDo.setAmount((inputDto.getAmount()).setScale(2, RoundingMode.HALF_UP));
		outputDo.setApprovedDate(inputDto.getApprovedDate());
		outputDo.setCostCenter(inputDto.getCostCenter());
		outputDo.setDateCreated(inputDto.getDateCreated());
		outputDo.setId(inputDto.getId());
		outputDo.setRequestId(inputDto.getRequestId());
		outputDo.setInvoiceItemId(inputDto.getInvoiceItemId());
		outputDo.setTaskId(inputDto.getTaskId());
		outputDo.setUserCreated(inputDto.getUserCreated());
		outputDo.setRoleAssigned(inputDto.getRoleAssigned());
		outputDo.setCompanyCode(inputDto.getCompanyCode());
		outputDo.setGlCode(inputDto.getGlCode());
		outputDo.setDebitCreditInd(inputDto.getDebitCreditInd());
		outputDo.setNonPOText(inputDto.getText());
		outputDo.setInternalOrder(inputDto.getInternalOrder());
		outputDo.setMaterialId(inputDto.getMaterialId());
		outputDo.setMaterialDescription(inputDto.getMaterialDescription());
		outputDo.setPlantId(inputDto.getPlantId());
		outputDo.setPlantDescription(inputDto.getPlantDescription());
		outputDo.setFlag(inputDto.getFlag());
		outputDo.setQuantity((ServicesUtil.nullHandler(inputDto.getQuantity())).setScale(3, RoundingMode.HALF_UP));
		outputDo.setBaseUnit(inputDto.getBaseUnit());
		outputDo.setDateUpdated(inputDto.getDateUpdated());
		outputDo.setUserUpdated(inputDto.getUserUpdated());
		// TODO Auto-generated method stub
		return outputDo;
	}

	@SuppressWarnings("unchecked")
	public List<NonPoDto> getNonPoByInvoiceItemId(String invoiceItemId) {
		List<NonPoDto> nonPoDtos = new ArrayList<NonPoDto>();
		Query query = super.getEntityManager().createQuery("SELECT v FROM NonPoDo v WHERE v.invoiceItemId =:invoiceItemId");
		query.setParameter("invoiceItemId", invoiceItemId);
		List<NonPoDo> nonPoDos = query.getResultList();

		for (NonPoDo nonPoDo : nonPoDos) {
			NonPoDto nonPoDto = new NonPoDto();
			nonPoDto = exportDto(nonPoDo);
			nonPoDtos.add(nonPoDto);
		}
		return nonPoDtos;

	}

	@SuppressWarnings("unchecked")
	public List<NonPoDto> getNonPoByRequestId(String requestId) {
		Query query = super.getEntityManager()
				.createQuery("SELECT v FROM NonPoDo v WHERE v.requestId =:requestId AND v.invoiceItemId = 'NonPoLines'");
		query.setParameter("requestId", requestId);
		List<NonPoDo> nonPoDos = query.getResultList();
		return exportDtoList(nonPoDos);
	}

	public int deleteByRequestId(String requestId) {
		Query query = super.getEntityManager().createQuery("DELETE FROM NonPoDo v WHERE v.requestId =:requestId");
		query.setParameter("requestId", requestId);
		int rowsDeleted = query.executeUpdate();
		return rowsDeleted;

	}

	public int deleteByInvoiceId(String Id) {
		Query query = super.getEntityManager().createQuery("DELETE FROM NonPoDo v WHERE v.invoiceItemId =:Id");
		query.setParameter("Id", Id);
		int rowsDeleted = query.executeUpdate();
		return rowsDeleted;

	}

	@SuppressWarnings("unchecked")
	public List<NonPoDto> getNonPo4DtlReport(String requestId) {
		Query query = super.getEntityManager().createQuery("SELECT v FROM NonPoDo v WHERE v.requestId =:requestId");
		query.setParameter("requestId", requestId);
		List<NonPoDo> nonPoDos = query.getResultList();
		return exportDtoList(nonPoDos);
	}

}
