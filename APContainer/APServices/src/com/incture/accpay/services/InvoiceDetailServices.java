package com.incture.accpay.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.incture.accpay.dao.GrnDao;
import com.incture.accpay.dao.InvoiceDetailDao;
import com.incture.accpay.dao.PurchaseOrderDao;
import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.CommunicationLogDto;
import com.incture.accpay.dto.GrnDto;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.dto.InvoiceItemDto;
import com.incture.accpay.dto.PoItemDto;
import com.incture.accpay.dto.PurchaseOrderDto;
import com.incture.accpay.entities.InvoiceDetailDo;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.response.dto.AccPayResponseDTO;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;
import com.incture.accpay.util.ServicesUtil;

/**
 * Session Bean implementation class PersonBean2
 */
@Stateless
@LocalBean
public class InvoiceDetailServices implements InvoiceDetailServicesLocal {

	/**
	 * Default constructor.
	 */
	public InvoiceDetailServices() {
	}
	
	@EJB
	private PiServiceBeanLocal piServiceBean;

	@PersistenceContext(name = "ACCOUNT_PAYEE_PU")
	private EntityManager em;

	/**
	 * Get all persons from the table.
	 */
	@Override
	public InvoiceDetailResponseDTO getAllInvoiceData() {
		InvoiceDetailResponseDTO detailResponseDTO = new InvoiceDetailResponseDTO();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
		List<InvoiceDetailDto> invoiceDetailDtos;
		try {
			invoiceDetailDtos = invoiceDetailDao.getAllResults(InvoiceDetailDo.class.getSimpleName(), "");
			detailResponseDTO.setResponseDTOs(invoiceDetailDtos);
			detailResponseDTO.setStatus(true);
			

		} catch (NoResultFault e) {
			detailResponseDTO.setStatus(false);
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return detailResponseDTO;

	}

	/**
	 * Add invoice data to table
	 */
	@Override
	public InvoiceDetailResponseDTO saveInvoiceDetails(InvoiceDetailDto invoiceDetailDto) {
		InvoiceDetailResponseDTO detailResponseDTO = new InvoiceDetailResponseDTO();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);

		Date currentDate = new Date();
		invoiceDetailDto.setDateCreated(currentDate);
		String id = SequenceNumberGen.getInstance().getNextSeqNumber("APA", 8, em);
		invoiceDetailDto.setId(id);
		if (!ServicesUtil.isEmpty(invoiceDetailDto.getInvoiceItemList()))
			
			for (InvoiceItemDto invoiceItemDto : invoiceDetailDto.getInvoiceItemList()) {
				invoiceItemDto.setDateCreated(currentDate);
			}
		if (!ServicesUtil.isEmpty(invoiceDetailDto.getCommunicationLogDtos()))
			for (CommunicationLogDto communicationLogDto : invoiceDetailDto.getCommunicationLogDtos()) {
				communicationLogDto.setDateCommented(currentDate);
			}
		try {
			invoiceDetailDao.create(invoiceDetailDto);
			detailResponseDTO.setStatus(true);
			detailResponseDTO.setId(id);
			detailResponseDTO.setMessage("invoice created successfully with id "+id);
		} catch (ExecutionFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();

		} catch (NoResultFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return detailResponseDTO;
	}

	@Override
	public InvoiceDetailResponseDTO updateInvoiceDetails(AccountPayDto accountPayDto) {
		InvoiceDetailDto invoiceDetailDto =new InvoiceDetailDto();
		if(!ServicesUtil.isEmpty(accountPayDto.getInvoiceDetailUIDto())){
			invoiceDetailDto = accountPayDto.getInvoiceDetailUIDto();
		}
		InvoiceDetailResponseDTO detailResponseDTO = new InvoiceDetailResponseDTO();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
		Date currentDate = new Date();
		invoiceDetailDto.setDateUpdated(currentDate);
		try {
			invoiceDetailDao.update(invoiceDetailDto);
			detailResponseDTO.setStatus(true);
			detailResponseDTO.setMessage("invoice updated successfully with id "+accountPayDto.getInvoiceDetailUIDto().getId());
		} catch (ExecutionFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();

		} catch (NoResultFault e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			detailResponseDTO.setMessage(e.getMessage());
			e.printStackTrace();
		}
		return detailResponseDTO;
	}

	@Override
	public AccPayResponseDTO getInvoiceDetailsByRequestId(String requestId) {

		AccPayResponseDTO accountPayResponseDto = new AccPayResponseDTO();
		AccountPayDto accountPayDto = new AccountPayDto();
		InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
		InvoiceDetailDto detailDto = new InvoiceDetailDto();
		detailDto.setId(requestId);
		try {
			accountPayDto.setInvoiceDetailUIDto(invoiceDetailDao.getByKeys(detailDto));
			accountPayDto.setPurchaseOrderUIDtoList(new PurchaseOrderDao(em).getPOListByRequestID(requestId));
			accountPayDto.setGrnUIDtoList(new GrnDao(em).getGRNListByRequestID(requestId));
			
			resetFlags(accountPayDto);
			hasGr(accountPayDto);
			piServiceBean.doThreewayMatch(accountPayDto);
			accountPayResponseDto.getResponseDTOs().add(accountPayDto);
			accountPayResponseDto.setStatus(true);
		} catch (ExecutionFault e1) {
			accountPayResponseDto.setMessage(e1.getMessage());
			e1.printStackTrace();
		} catch (InvalidInputFault e1) {
			// TODO Auto-generated catch block
			accountPayResponseDto.setMessage(e1.getMessage());
			e1.printStackTrace();
		} catch (NoResultFault e1) {
			accountPayResponseDto.setMessage(e1.getMessage());
			e1.printStackTrace();
		}

		return accountPayResponseDto;

	}

	private void hasGr(AccountPayDto accpayDto) {
		Map<String, Boolean> hasGrMap = createGRNItemMap(accpayDto);
		if (!ServicesUtil.isEmpty(accpayDto.getInvoiceDetailUIDto()
				.getInvoiceItemList())) {
			for (InvoiceItemDto invoiceItem : accpayDto
					.getInvoiceDetailUIDto().getInvoiceItemList()) {
				if (!ServicesUtil.isEmpty(invoiceItem.getTwowayMatchingFlag())
						&& invoiceItem.getTwowayMatchingFlag()
						&& hasGrMap.containsKey(invoiceItem.getPoNumber()+invoiceItem.getPoMatchingItemNoId())) {
					invoiceItem.setHasSomeGrFlag(true);
				}
				else{
					invoiceItem.setHasSomeGrFlag(false);
					invoiceItem.setPartialPosting(false);
				}
			}
		}
	} 
	
	

private static Map<String, Boolean> createGRNItemMap(AccountPayDto accpayDto) {
		Map<String, Boolean> hasGrnItem = new HashMap<String, Boolean>();
		if (!ServicesUtil.isEmpty(accpayDto.getGrnUIDtoList())) {
			for (GrnDto grnUiDto : accpayDto.getGrnUIDtoList()) {
				for(int i=0;i<ServicesUtil.nullHandler(grnUiDto.getGrnItemList());i++){
					if(grnUiDto.getGrnItemList().get(i).getMoveType().equals("101")){
						hasGrnItem.put(grnUiDto.getPoNumber()+grnUiDto.getGrnItemList().get(i).getPoItemId(),true);
					}
				}
			}
		}
		return hasGrnItem;
	} 

public static void resetFlags(AccountPayDto outputDto) {
		for(int i=0;i<ServicesUtil.nullHandler(outputDto.getInvoiceDetailUIDto().getInvoiceItemList());i++){
			InvoiceItemDto invoiceItem = outputDto.getInvoiceDetailUIDto().getInvoiceItemList().get(i);
			if (!ServicesUtil.isTrue(invoiceItem.getTwowayMatchingFlag())) {
				invoiceItem.setTwowayMatchingFlag(false);
				invoiceItem.setThreewayMatchingFlag(false);
				invoiceItem.setPoMatchingItemNoId("");
				invoiceItem.setPoMatchingNoId("");
				invoiceItem.setNetWorth(BigDecimal.ZERO);
				invoiceItem.setQuantityBaseUom("");
				invoiceItem.setPoNumber("");
				invoiceItem.setMaterial("");
				invoiceItem.setVendorMaterial("");
				invoiceItem.setHeadercharges(false);
			}
			else {
				List<PurchaseOrderDto> poList = outputDto.getPurchaseOrderUIDtoList();
				for (int poIndx = 0; poIndx < ServicesUtil.nullHandler(poList); poIndx++) {
					List<PoItemDto> poItemList = poList.get(poIndx)
							.getPoItemList();
					for (int poItemIdx = 0; poItemIdx < ServicesUtil.nullHandler(poItemList); poItemIdx++) {
						PoItemDto poItemUIDto = poItemList.get(poItemIdx);
						if (poItemUIDto.getPoItem().equals( invoiceItem.getPoMatchingItemNoId()) 
								&& poList.get(poIndx).getPoNumber().equals(invoiceItem.getInvoicePONumber())) {
							invoiceItem.setPoPrice(poItemUIDto.getNetPrice());
							invoiceItem.setPoQuantity(poItemUIDto.getQuantity());
							invoiceItem.setQuantityBaseUom(poItemUIDto.getBaseUom());
							invoiceItem.setNetWorth(poItemUIDto.getNetWorth());
							invoiceItem.setPoNumber(poList.get(poIndx).getPoNumber());
							invoiceItem.setPoOrderUnit(poItemUIDto.getPoOrderUnit());
							invoiceItem.setMaterial(poItemUIDto.getMaterialNumber());
							invoiceItem.setFreeItem(poItemUIDto.getFreeItem());
							invoiceItem.setPriceUnit(poItemUIDto.getUnitPrice());
							invoiceItem.setPoHeaderId(poList.get(poIndx).getId());
							poItemUIDto.setMatched(true);
						}
					}
				}
			}
		}
	} 
 


}
