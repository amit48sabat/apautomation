package com.incture.accpay.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.rpc.ServiceException;

import com.incture.accpay.dao.AccountAssignmentDao;
import com.incture.accpay.dao.GrnDao;
import com.incture.accpay.dao.GrnItemsTotalDao;
import com.incture.accpay.dao.InvoiceDetailDao;
import com.incture.accpay.dao.PurchaseOrderDao;
import com.incture.accpay.dto.AccountAssignmentDto;
import com.incture.accpay.dto.GrnDto;
import com.incture.accpay.dto.GrnItemDto;
import com.incture.accpay.dto.GrnItemTotalDto;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.dto.InvoiceItemDto;
import com.incture.accpay.dto.PoItemDto;
import com.incture.accpay.dto.PurchaseOrderDto;
import com.incture.accpay.dto.ReponseDto;
import com.incture.accpay.exception.ExecutionFault;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.exception.NoResultFault;
import com.incture.accpay.pi.pogrn.PO_Details_Request;
import com.incture.accpay.pi.pogrn.PO_Details_Request_Sync_Out;
import com.incture.accpay.pi.pogrn.PO_Details_Request_Sync_OutBindingStub;
import com.incture.accpay.pi.pogrn.PO_Details_Request_Sync_OutServiceLocator;
import com.incture.accpay.pi.pogrn.PO_Details_Response;
import com.incture.accpay.pi.pogrn.PO_Details_ResponseCONVERSION_TABLEItem;
import com.incture.accpay.pi.pogrn.PO_Details_ResponseGR_ITEMITEM;
import com.incture.accpay.pi.pogrn.PO_Details_ResponsePOACCOUNT_ASSIGNItem;
import com.incture.accpay.pi.pogrn.PO_Details_ResponsePOItemITEM;
import com.incture.accpay.response.dto.AccPayResponseDTO;
import com.incture.accpay.util.PIUtil;
import com.incture.accpay.util.ServicesUtil;

/**
 * Session Bean implementation class PersonBean2
 */
@Stateless
@LocalBean
public class PO_GRN_PIservice implements PO_GRN_PIServiceLocal {

	@PersistenceContext(name = "ACCOUNT_PAYEE_PU")
	private EntityManager em;

	private DecimalFormat twoDecFormatter = new DecimalFormat("#,##0.00");

	@Override
	public ReponseDto getPoDetailsBpm(String requestId, String vendorId) {

		// logger.logDebug("[AP][AbbyyConsumer] [ getPoDetailsBpm ] Start :" +
		// requestId + " : " + vendorId + ":" + new Date());

		InvoiceDetailDao dao = new InvoiceDetailDao(em);
		InvoiceDetailDto detailDto = new InvoiceDetailDto();
		detailDto.setId(requestId);
		;
		InvoiceDetailDto invoiceDetailDto = null;
		try {
			invoiceDetailDto = dao.getByKeys(detailDto);
		} catch (ExecutionFault e) {
			e.printStackTrace();
		} catch (InvalidInputFault e) {
			e.printStackTrace();
		} catch (NoResultFault e) {
			e.printStackTrace();
		}
		ReponseDto response = new ReponseDto();

		/** The below code is for reporting that is sent to bpm **/
		AccPayResponseDTO dto = storePoDetails(invoiceDetailDto, null, vendorId);

		if (dto == null) {
			response.setMessage("NON PO");
			return response;
		}

		if (!ServicesUtil.isEmpty(invoiceDetailDto)) {
			response.setInvoiceNumber(invoiceDetailDto.getInvoiceNumber());
			response.setCreatedDate(new Date());

			// if(invoiceDetailDto.getTotal() != null)
			response.setInvoiceTotal(
					twoDecFormatter.format(ServicesUtil.nullHandler(invoiceDetailDto.getTotal())).toString());
			// else
			// response.setInvoiceTotal("");

			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
			if (!ServicesUtil.isEmpty(invoiceDetailDto.getInvoiceDate())) {
				response.setInvoiceDate(format.format(invoiceDetailDto.getInvoiceDate()));
			}

			// if(!ServicesUtil.isEmpty(invoiceDetailDto.getVendorName()))
			response.setVendorName(invoiceDetailDto.getVendorName());
			// logger.logDebug("vendorName from Invoice data:
			// "+invoiceDetailDto.getVendorName());
		}

		response.setMessage("sucess");
		// logger.logDebug("[AP][AbbyyConsumer] [ getPoDetailsBpm ] Exit :" +
		// requestId + " : " + vendorId + ":" + new Date());

		return response;
	}

	public AccPayResponseDTO storePoDetails(InvoiceDetailDto invoiceDetailDto, String poNumber, String vendorId) {

		// logger.logDebug("[AP][AbbyyConsumer] [ storePoDetails ] Started : " +
		// requestId);
		AccPayResponseDTO outputDto = null;

		//
		outputDto = new AccPayResponseDTO();

		if (poNumber == null) {
			Set<String> poNumbers = new HashSet<String>();
			for (InvoiceItemDto invoiceItemDto : invoiceDetailDto.getInvoiceItemList()) {
				poNumbers.add(invoiceItemDto.getInvoicePONumber());
			}
			

			if (ServicesUtil.nullHandler(poNumbers) < 1) {
				return outputDto;
			}
			if(poNumbers.size()>0){
				for (String poNo : poNumbers) {
					if (ServicesUtil.isEmpty(poNo) || poNo.equals("0000000000")) {
						continue;
					}
//					poNumber = poNo;
					storePORelatedData(invoiceDetailDto.getId(), poNo, outputDto);
				}
			}
			
		} else {
			storePORelatedData(invoiceDetailDto.getId(), poNumber, outputDto);
		}
		return outputDto;
	}

	private void storePORelatedData(String requestId, String poNumber, AccPayResponseDTO outputDto) {
		PO_Details_Request_Sync_OutBindingStub stub;
		PO_Details_Request_Sync_Out po_Details_Request_Sync_Out;
		PO_Details_Response resp = null;
		try {
			po_Details_Request_Sync_Out = new PO_Details_Request_Sync_OutServiceLocator().getHTTP_Port();
			stub = (PO_Details_Request_Sync_OutBindingStub) po_Details_Request_Sync_Out;
			PO_Details_Request poDataRequest = new PO_Details_Request();
			poDataRequest.setPONUMBER(poNumber);
			stub.setUsername("S0017305201");
			stub.setPassword("94@Srey$");
			resp = po_Details_Request_Sync_Out.PO_Details_Request_Sync_Out(poDataRequest);
			storePurchaseOrderFromECC(resp, requestId);
			storeGRNData(resp, requestId);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PurchaseOrderDto storePurchaseOrderFromECC(PO_Details_Response resp, String requestID) {
		// logger.logDebug("[AP][AbbyyConsumer] [storePurchaseOrderFromECC]
		// Started : Request Id " + requestID);

		Map<String, PO_Details_ResponseCONVERSION_TABLEItem> poskuConvMap = new HashMap<String, PO_Details_ResponseCONVERSION_TABLEItem>();
		poskuConvMap = PIUtil.createPOSKUmap(resp);
		PurchaseOrderDto po = new PurchaseOrderDto();
		UUID num = UUID.randomUUID();
		po.setId(num.toString());
		// String dateStr = resp.getPOHeader().getCREATDATE();
		// DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			BigDecimal quantity = BigDecimal.ZERO;
			BigDecimal conFactor = BigDecimal.ZERO;
			BigDecimal itemNetPrice = BigDecimal.ZERO;
			BigDecimal netWorth = BigDecimal.ZERO;

			po.setCreateDate(new Date());
			po.setUpdatedDate(new Date());
			po.setCreatedBy("System User");
			po.setUpdatedBy("System User");
			po.setCurrency(resp.getPOHeader().getCURRENCY());
			BigDecimal bd = new BigDecimal(resp.getPOHeader().getEXCH_RATE());
			po.setExchchangeRate(bd);
			po.setPaymentTerms(resp.getPOHeader().getPMNTTRMS());

			po.setPoNumber(resp.getPOHeader().getPO_NUMBER());
			po.setRequestId(requestID);
			po.setVendor(resp.getPOHeader().getVENDOR());
			po.setCompanyCode(resp.getPOHeader().getCOMP_CODE());

			// String vendorName =
			// db.getVendorName(po.getCompanyCode(),po.getVendor());
			// po.setVendorName(vendorName);
			// If the vendor is equal to invoice vendor then its a third party
			// vendor case.
			// Abhishek 16-12-2016
			if (!ServicesUtil.isEmpty(resp.getDeliveryVendorID())) {
				po.setDeliveryVendor(resp.getDeliveryVendorID());

				// Getting Vendor id from InvoiceDetails and matching it with
				// Delivery vendor
				// If matches setting flag of hasDeliveyVendor true(Third party
				// case)
				InvoiceDetailDto invoiceDetailDto = new InvoiceDetailDto();
				InvoiceDetailDao invoiceDetailDao = new InvoiceDetailDao(em);
				invoiceDetailDto = invoiceDetailDao.getInvDetailRequestNumber(requestID);
				if (!ServicesUtil.isEmpty(invoiceDetailDto.getVendorId())) {
					if (ServicesUtil.removeLeadingZeros(resp.getDeliveryVendorID())
							.equals(ServicesUtil.removeLeadingZeros(invoiceDetailDto.getVendorId()))) {
						po.setHasDeliveryVendor(true);
					} else {
						po.setHasDeliveryVendor(false);
					}
				} else {
					po.setHasDeliveryVendor(false);
				}

				if (!ServicesUtil.isEmpty(invoiceDetailDto.getVendorId())) {
					if (ServicesUtil.removeLeadingZeros(resp.getDeliveryVendorID())
							.equals(ServicesUtil.removeLeadingZeros(invoiceDetailDto.getVendorId()))
							&& !(ServicesUtil.removeLeadingZeros(resp.getDeliveryVendorID())
									.equals(ServicesUtil.removeLeadingZeros(resp.getPOHeader().getVENDOR())))) {
						po.setIsThirdParty(true);
					} else {
						po.setIsThirdParty(false);
					}
				} else {
					po.setIsThirdParty(false);
				}
			} else {
				po.setHasDeliveryVendor(false);
				po.setIsThirdParty(false);
			}

			if (!ServicesUtil.isEmpty(resp.getPOHeader().getPLANNED_COST())) {
				po.setPlannedCost(new BigDecimal(resp.getPOHeader().getPLANNED_COST()));
			}
			if (resp.getHasGRFlag().equals("X"))
				po.setHas_Gr(true);
			else
				po.setHas_Gr(false);

			if (resp.getHasHeaderCharges().equals("X")) {
				po.setHasDeliveryCharges(true);
			} else {
				po.setHasDeliveryCharges(false);
			}

			if ((resp.getPOItem() != null) && (!ServicesUtil.isEmpty(resp.getPOItem()))) {
				List<PoItemDto> poItemList = new ArrayList<PoItemDto>();
				for (PO_Details_ResponsePOItemITEM poItem : resp.getPOItem()) {

					PoItemDto poItemDto = new PoItemDto();

					PO_Details_ResponseCONVERSION_TABLEItem item = poskuConvMap
							.get(poItem.getPO_ITEM() + poItem.getMATNR());
					if (item != null) {
						poItemDto.setSkuUnit(item.getMEINS());
						poItemDto.setSkuFactor(item.getUMREZ());
						poItemDto.setSkuOrderUnit(item.getMEINH());
						poItemDto.setSkuOrderFactor(item.getUMREN());
					}
					poItemDto.setMaterialNumber(poItem.getMATNR());
					BigDecimal netPrice = new BigDecimal(poItem.getNET_PRICE());
					poItemDto.setNetPrice(netPrice);
					UUID ids = UUID.randomUUID();
					poItemDto.setId(ids.toString());
					poItemDto.setCreatedDate(new Date());
					poItemDto.setUpdatedDate(new Date());
					poItemDto.setCreatedBy("System User");
					poItemDto.setUpdatedBy("System User");
					poItemDto.setPoItem(poItem.getPO_ITEM());
					poItemDto.setUnit(poItem.getPO_UNIT());
					poItemDto.setUnitPrice(new BigDecimal(poItem.getUNIT_PRICE()));
					bd = new BigDecimal(poItem.getQUANTITY());
					poItemDto.setQuantity(bd);
					poItemDto.setShortText(poItem.getSHORT_TEXT());
					// Type casting for GR_Indicator
					Boolean grIndicator;
					if (poItem.getGR_BASEDIV().equals("X")) {
						grIndicator = true;
					} else {
						grIndicator = false;
					}
					poItemDto.setGrIndicator(grIndicator);
					poItemDto.setVendMat(poItem.getVEND_MAT());
					poItemDto.setItemCategory(poItem.getITEM_CAT());
					poItemDto.setConvNum1(poItem.getCONV_NUM1());
					poItemDto.setConvDen1(poItem.getCONV_DEN1());
					poItemDto.setUpsc(poItem.getUPC_CODE());
					poItemDto.setPoOrderUnit(poItem.getOrder_Unit());

					quantity = poItemDto.getQuantity();
					conFactor = poItemDto.getConvNum1().divide(poItemDto.getConvDen1(), 5, RoundingMode.HALF_UP);
					itemNetPrice = poItemDto.getNetPrice();
					netWorth = quantity.multiply(conFactor);
					netWorth = netWorth.multiply(itemNetPrice).divide(poItemDto.getUnitPrice(), 5,
							RoundingMode.HALF_UP);
					poItemDto.setNetWorth(netWorth);
					// poItemDto.setPosted(true);
					if (poItem.getDELETE_IND().equals("L")) {
						poItemDto.setDeleted(true);
					} else {
						poItemDto.setDeleted(false);
					}
					if (poItem.getFREE_ITEM().equals("X")) {
						poItemDto.setFreeItem(true);
					} else {
						poItemDto.setFreeItem(false);
					}
					if (!ServicesUtil.isEmpty(poItem.getACCTASSCAT())) {
						poItemDto.setAccountAssignCategory(poItem.getACCTASSCAT());
					} else {
						poItemDto.setAccountAssignCategory("");
					}
					poItemList.add(poItemDto);
				}
				po.setPoItemList(poItemList);
				PurchaseOrderDao dao = new PurchaseOrderDao(em);
				// logger.logDebug("[AP][AbbyyConsumer] [ storePoDetails ] : " +
				// requestID + "[ POItem List ]" + poItemList.toString());
				dao.create(po);
			}

			if ((resp.getPOACCOUNT_ASSIGN() != null) && (!ServicesUtil.isEmpty(resp.getPOACCOUNT_ASSIGN()))) {
				// logger.logDebug("[AP][AbbyyConsumer] [ storePoDetails ]
				// AccountAssignData
				// list:"+ServicesUtil.nullHandler(resp.getPOACCOUNTASSIGN().getItem()));
				for (PO_Details_ResponsePOACCOUNT_ASSIGNItem accAssignItem : resp.getPOACCOUNT_ASSIGN()) {

					AccountAssignmentDto accAssignDto = new AccountAssignmentDto();
					UUID ids = UUID.randomUUID();
					accAssignDto.setId(ids.toString());
					accAssignDto.setCreatedDate(new Date());
					accAssignDto.setUpdatedDate(new Date());
					accAssignDto.setCreatedBy("System User");
					accAssignDto.setUpdatedBy("System User");
					accAssignDto.setPoItem(accAssignItem.getPO_ITEM());
					accAssignDto.setSerialNo(accAssignItem.getSERIAL_NO());
					accAssignDto.setQuantity(accAssignItem.getQUANTITY());
					accAssignDto.setDistrPerc(accAssignItem.getDISTR_PERC());
					accAssignDto.setNetValue(accAssignItem.getNET_VALUE());
					if (!ServicesUtil.isEmpty(accAssignItem.getGL_ACCOUNT()))
						accAssignDto.setGlAccount(ServicesUtil.removeLeadingZeros(accAssignItem.getGL_ACCOUNT()));
					if (!ServicesUtil.isEmpty(accAssignItem.getCOSTCENTER()))
						accAssignDto.setCostCenter(ServicesUtil.removeLeadingZeros(accAssignItem.getCOSTCENTER()));
					if (!ServicesUtil.isEmpty(accAssignItem.getORDERID()))
						accAssignDto.setOrderId(ServicesUtil.removeLeadingZeros(accAssignItem.getORDERID()));
					if (!ServicesUtil.isEmpty(accAssignItem.getASSET_NO()))
						accAssignDto.setAssetNo(ServicesUtil.removeLeadingZeros(accAssignItem.getASSET_NO()));
					if (!ServicesUtil.isEmpty(accAssignItem.getSUB_NUMBER()))
						accAssignDto.setSubNumber(ServicesUtil.removeLeadingZeros(accAssignItem.getSUB_NUMBER()));
					accAssignDto.setWbsElement(accAssignItem.getWBS_ELEMENT());
					accAssignDto.setPoHeaderId(po.getId());
					if (accAssignItem.getDELETE_IND().equals("X")) {
						accAssignDto.setDeleted(true);
					} else {
						accAssignDto.setDeleted(false);
					}
					accAssignDto.setUnplannedLIne(false);
					AccountAssignmentDao accAssignDao = new AccountAssignmentDao(em);
					// ogger.logDebug("[AP][AbbyyConsumer] [ storePoDetails ]
					// AccountAssignData "+accAssignDto.toString());
					accAssignDao.create(accAssignDto);
				}
			}
		} catch (ExecutionFault e) {
			// logger.logError("[AP][AbbyyConsumer] [ storePoDetails ] :" +
			// ServicesUtil.getExceptionTrace(e));
		} catch (InvalidInputFault e) {
			// logger.logError("[AP][AbbyyConsumer] [ storePoDetails ] :" +
			// ServicesUtil.getExceptionTrace(e));
		} catch (NoResultFault e) {
			// logger.logError("[AP][AbbyyConsumer] [ storePoDetails ] :" +
			// ServicesUtil.getExceptionTrace(e));
		} catch (Exception e) {
			// logger.logError("[AP][AbbyyConsumer] [ storePoDetails ] :" +
			// ServicesUtil.getExceptionTrace(e));
		}
		// logger.logDebug("[AP][AbbyyConsumer] [storePurchaseOrderFromECC]
		// Ended RequestID : " + requestID );
		return po;

	}

	private GrnDto storeGRNData(PO_Details_Response resp, String requestId) throws Exception {
		GrnDto grnDto = new GrnDto();
		UUID id = UUID.randomUUID();
		grnDto.setId(id.toString());
		
			grnDto.setCreatedDate(new Date());
			grnDto.setUpdatedDate(new Date());
			grnDto.setCreatedBy("System User");
			grnDto.setUpdatedBy("System User");
			grnDto.setRequestId(requestId);
			grnDto.setPoNumber(resp.getPOHeader().getPO_NUMBER());
			List<GrnItemDto> grnItemList = new ArrayList<GrnItemDto>();
			Map<String, List<PO_Details_ResponseGR_ITEMITEM>> grnReferenceMap = new HashMap<String, List<PO_Details_ResponseGR_ITEMITEM>>();
			Map<String, List<PO_Details_ResponseGR_ITEMITEM>> grnItemeMap = new HashMap<String, List<PO_Details_ResponseGR_ITEMITEM>>();

			if ((resp.getGR_ITEM() != null) && (!ServicesUtil.isEmpty(resp.getGR_ITEM()))) {

				PIUtil.createmap(grnReferenceMap, grnItemeMap, resp);
				grnItemList = PIUtil.setGRNITEM(grnReferenceMap, grnItemeMap);
				grnDto.setGrnItemList(grnItemList);
				List<GrnItemTotalDto> grnItemTotalList = new ArrayList<GrnItemTotalDto>();
				for (int i = 0; i < resp.getGR_Totals().length; i++) {

					GrnItemTotalDto grnTotalDto = new GrnItemTotalDto();
					grnTotalDto.setCreatedDate(new Date());
					grnTotalDto.setUpdatedDate(new Date());
					grnTotalDto.setCreatedBy("System User");
					grnTotalDto.setUpdatedBy("System User");
					grnTotalDto.setHeaderId(grnDto.getId());
					grnTotalDto.setId(UUID.randomUUID().toString());
					grnTotalDto.setPoItem(resp.getGR_Totals()[i].getPO_ITEM());
					grnTotalDto.setSerialNo(resp.getGR_Totals()[i].getSERIAL_NO());
					grnTotalDto.setWithdrqty(new BigDecimal(resp.getGR_Totals()[i].getWITHDR_QTY()));
					grnTotalDto.setBlockedqy(new BigDecimal(resp.getGR_Totals()[i].getBLOCKED_QY()));
					grnTotalDto.setBlqty(new BigDecimal(resp.getGR_Totals()[i].getBL_QTY()));
					grnTotalDto.setDelivqty(new BigDecimal(resp.getGR_Totals()[i].getDELIV_QTY()));
					grnTotalDto.setPoprqnt(new BigDecimal(resp.getGR_Totals()[i].getPO_PR_QNT()));
					grnTotalDto.setValgrloc(new BigDecimal(resp.getGR_Totals()[i].getVAL_GR_LOC()));
					grnTotalDto.setValgrfor(new BigDecimal(resp.getGR_Totals()[i].getVAL_GR_FOR()));
					grnTotalDto.setIvqty(new BigDecimal(resp.getGR_Totals()[i].getIV_QTY()));
					grnTotalDto.setIvqtypo(new BigDecimal(resp.getGR_Totals()[i].getIV_QTY_PO()));
					grnTotalDto.setValivloc(new BigDecimal(resp.getGR_Totals()[i].getVAL_IV_LOC()));
					grnTotalDto.setValivfor(new BigDecimal(resp.getGR_Totals()[i].getVAL_IV_FOR()));
					grnTotalDto.setClvalloc(new BigDecimal(resp.getGR_Totals()[i].getCL_VAL_LOC()));
					grnTotalDto.setClvalfor(new BigDecimal(resp.getGR_Totals()[i].getCL_VAL_FOR()));
					grnTotalDto.setDopvlloc(new BigDecimal(resp.getGR_Totals()[i].getDOP_VL_LOC()));
					grnTotalDto.setIvvalloc(new BigDecimal(resp.getGR_Totals()[i].getIVVAL_LOC()));
					grnTotalDto.setIvvalfor(new BigDecimal(resp.getGR_Totals()[i].getIVVAL_FOR()));
					grnTotalDto.setDlqtytrsp(new BigDecimal(resp.getGR_Totals()[i].getDL_QTY_TRSP()));
					grnTotalDto.setBlqtytotal(new BigDecimal(resp.getGR_Totals()[i].getBL_QTY_TOTAL()));
					grnTotalDto.setDlqtytotal(new BigDecimal(resp.getGR_Totals()[i].getDL_QTY_TOTAL()));
					grnTotalDto.setIvqtytotal(new BigDecimal(resp.getGR_Totals()[i].getIV_QTY_TOTAL()));
					grnTotalDto.setCurrency(resp.getGR_Totals()[i].getCURRENCY());
					grnTotalDto.setCurrencyiso(resp.getGR_Totals()[i].getCURRENCY_ISO());
					grnItemTotalList.add(grnTotalDto);
					GrnItemsTotalDao grnItemsTotalDao = new GrnItemsTotalDao(em);
					grnItemsTotalDao.create(grnTotalDto);
				}
				grnDto.setGrnItemTotalList(grnItemTotalList);
				GrnDao grnDao = new GrnDao(em);
				grnDao.create(grnDto);
			}
		
		// logger.logDebug("[AP][AbbyyConsumer] [storeGRNData] Exit ");
		return grnDto;
	}

}
