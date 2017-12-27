package com.incture.accpay.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.GrnItemDto;
import com.incture.accpay.dto.InvoiceItemDto;
import com.incture.accpay.dto.PoItemDto;
import com.incture.accpay.dto.PurchaseOrderDto;
import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.pi.pogrn.PO_Details_Response;
import com.incture.accpay.pi.pogrn.PO_Details_ResponseCONVERSION_TABLEItem;
import com.incture.accpay.pi.pogrn.PO_Details_ResponseGR_ITEMITEM;

import AccountsPayable.CW.Po_Posting_Request;
import AccountsPayable.CW.Po_Posting_RequestPosting_Header;
import AccountsPayable.CW.Po_Posting_RequestPosting_LineItems;
import AccountsPayable.CW.ThreeWay_Matching_RequestItems;
import AccountsPayable.CW.ThreeWay_Matching_ResponseITEMS;

public class PIUtil {

	public static Map<String, PO_Details_ResponseCONVERSION_TABLEItem> createPOSKUmap(PO_Details_Response resp) {
		Map<String, PO_Details_ResponseCONVERSION_TABLEItem> poskuConvMap = new HashMap<String, PO_Details_ResponseCONVERSION_TABLEItem>();
		for (int i = 0; i < resp.getCONVERSION_TABLE().length; i++) {
			PO_Details_ResponseCONVERSION_TABLEItem item = resp.getCONVERSION_TABLE()[i];
			poskuConvMap.put(item.getPO_ITEM() + item.getMATNR(), item);
		}
		return poskuConvMap;
	}

	public static void createmap(Map<String, List<PO_Details_ResponseGR_ITEMITEM>> grnReferenceMap,
			Map<String, List<PO_Details_ResponseGR_ITEMITEM>> grnItemeMap, PO_Details_Response resp) {

		for (int i = 0; i < resp.getGR_ITEM().length; i++) {
			PO_Details_ResponseGR_ITEMITEM respGRNItem = resp.getGR_ITEM()[i];
			if (respGRNItem.getHist_type().equals("Q")) {
				if (grnReferenceMap
						.containsKey(resp.getGR_ITEM()[i].getPO_ITEM() + resp.getGR_ITEM()[i].getReference_Doc())) {
					List<PO_Details_ResponseGR_ITEMITEM> list = grnReferenceMap.get(resp.getPOItem());
					list.add(respGRNItem);
					grnReferenceMap.put(resp.getGR_ITEM()[i].getPO_ITEM() + resp.getGR_ITEM()[i].getReference_Doc(),
							list);

				} else {
					List<PO_Details_ResponseGR_ITEMITEM> list = new ArrayList<PO_Details_ResponseGR_ITEMITEM>();
					list.add(respGRNItem);
					grnReferenceMap.put(resp.getGR_ITEM()[i].getPO_ITEM() + resp.getGR_ITEM()[i].getReference_Doc(),
							list);

				}
			} else if (respGRNItem.getHist_type().equals("E")) {
				if (grnItemeMap.containsKey(respGRNItem.getPO_ITEM())) {
					List<PO_Details_ResponseGR_ITEMITEM> list = grnItemeMap.get(respGRNItem.getPO_ITEM());
					list.add(respGRNItem);
					grnItemeMap.put(respGRNItem.getPO_ITEM(), list);
				} else {
					List<PO_Details_ResponseGR_ITEMITEM> list = new ArrayList<PO_Details_ResponseGR_ITEMITEM>();
					list.add(respGRNItem);
					grnItemeMap.put(respGRNItem.getPO_ITEM(), list);
				}
			}
		}
	}

	public static List<GrnItemDto> setGRNITEM(Map<String, List<PO_Details_ResponseGR_ITEMITEM>> grnReferenceMap,
			Map<String, List<PO_Details_ResponseGR_ITEMITEM>> grnItemeMap) {
		List<GrnItemDto> grnItemList = new ArrayList<GrnItemDto>();
		for (Entry<String, List<PO_Details_ResponseGR_ITEMITEM>> entry : grnItemeMap.entrySet()) {
			List<PO_Details_ResponseGR_ITEMITEM> itemList = entry.getValue();
			for (PO_Details_ResponseGR_ITEMITEM respGRNItem : itemList) {
				GrnItemDto grnItemDto = new GrnItemDto();
				grnItemDto.setId(UUID.randomUUID().toString());
				grnItemDto.setCreatedDate(new Date());
				grnItemDto.setUpdatedDate(new Date());
				grnItemDto.setCreatedBy("System User");
				grnItemDto.setUpdatedBy("System User");
				grnItemDto.setDocNo(respGRNItem.getDoc_No());
				grnItemDto.setGrItemId(respGRNItem.getGR_ITEM_ID());
				grnItemDto.setQuantity(respGRNItem.getQuantity());
				grnItemDto.setPoItemId(respGRNItem.getPO_ITEM());
				grnItemDto.setCostForeignCurrency(respGRNItem.getValue_Foreign_Currency());
				grnItemDto.setCostLocalCurrency(respGRNItem.getValue_Local_Currency());
				grnItemDto.setInvoiceCostForeign(respGRNItem.getValue_Foreign_Currency());
				grnItemDto.setInvoiceCostLocal(new BigDecimal(respGRNItem.getIV_Local_currency()));
				grnItemDto.setMaterialId(respGRNItem.getMaterial());
				grnItemDto.setDocYear(respGRNItem.getRef_Doc_Year());
				grnItemDto.setMoveType(respGRNItem.getMOVE_TYPE());
				// grnItemDto.setRefQuantity(respGRNItem.getRefQuantity);

				grnItemDto.setDelivQty(new BigDecimal(respGRNItem.getDELIV_QTY()));
				grnItemDto.setDelivUnit(respGRNItem.getDELIV_UNIT());
				DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
				Date pstngDate = new Date();
				try {
					pstngDate = date.parse(respGRNItem.getPOSTNG_DATE());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				grnItemDto.setPostingDate(pstngDate);
				if (grnReferenceMap.containsKey(respGRNItem.getPO_ITEM() + respGRNItem.getDoc_No())) {
					List<PO_Details_ResponseGR_ITEMITEM> list = grnReferenceMap
							.get(respGRNItem.getPO_ITEM() + respGRNItem.getDoc_No());
					BigDecimal quantity = BigDecimal.ZERO;
					BigDecimal costForeign = BigDecimal.ZERO;
					BigDecimal costLocal = BigDecimal.ZERO;
					BigDecimal invCostLocal = BigDecimal.ZERO;
					BigDecimal invCostForeign = BigDecimal.ZERO;
					for (PO_Details_ResponseGR_ITEMITEM item : list) {
						quantity = quantity.add(ServicesUtil.catchNull(item.getDELIV_QTY()));
						costForeign = costForeign.add(ServicesUtil.catchNull(item.getValue_Foreign_Currency()));
						costLocal = costLocal.add(ServicesUtil.catchNull(item.getValue_Local_Currency()));
						invCostLocal = invCostLocal.add(ServicesUtil.catchNull(item.getIV_Local_currency()));
						invCostForeign = invCostForeign.add(ServicesUtil.catchNull(item.getIV_Foreign_currency()));

					}
					grnItemDto.setRefQuantity(quantity);
					grnItemDto.setRefCostFOREIGN(costForeign);
				} else {
					grnItemDto.setRefQuantity(BigDecimal.ZERO);
					grnItemDto.setRefCostFOREIGN(BigDecimal.ZERO);
				}
				grnItemList.add(grnItemDto);
			}
		}
		return grnItemList;
	}

	public static ArrayList<ThreeWay_Matching_RequestItems> setThreewayRequest(AccountPayDto dto) {

		ArrayList<ThreeWay_Matching_RequestItems> threewayMatchingRequest = new ArrayList<ThreeWay_Matching_RequestItems>();

		Map<String, PoItemDto> map = new HashMap<String, PoItemDto>();
		for (int i = 0; i < ServicesUtil.nullHandler(dto.getPurchaseOrderUIDtoList()); i++) {
			PurchaseOrderDto purchaseOrderDto = dto.getPurchaseOrderUIDtoList().get(i);
			if (!ServicesUtil.isEmpty(purchaseOrderDto.getPoItemList())) {
				for (PoItemDto item : purchaseOrderDto.getPoItemList()) {
					map.put(purchaseOrderDto.getPoNumber() + item.getPoItem(), item);
				}
			}
		}
		// // logger.logDebug("[AP][PIUtil] GrnUiDto list size " +
		// ServicesUtil.nullHandler(dto.getGrnUIDtoList()));
		Map<String, List<GrnItemDto>> mapGrn = new HashMap<String, List<GrnItemDto>>();
		for (int i = 0; i < ServicesUtil.nullHandler(dto.getGrnUIDtoList()); i++) {
			if (!ServicesUtil.isEmpty(dto.getGrnUIDtoList().get(i).getGrnItemList())) {
				for (GrnItemDto grnItem : dto.getGrnUIDtoList().get(i).getGrnItemList()) {
					if (mapGrn.containsKey(dto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId())) {
						List<GrnItemDto> list = mapGrn
								.get(dto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId());
						list.add(grnItem);
						mapGrn.put(dto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId(), list);
					} else {
						List<GrnItemDto> list = new ArrayList<GrnItemDto>();
						list.add(grnItem);
						mapGrn.put(dto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId(), list);
					}
				}
			}
		}

		List<InvoiceItemDto> invoiceList = dto.getInvoiceDetailUIDto().getInvoiceItemList();

		// *** commented 2 way match
		// List<InvoiceItemUIDto> invoice2WaySuccessList =
		// getOnly2WaySuccessItems(invoiceList);

		if (!ServicesUtil.isEmpty(invoiceList)) {
			for (InvoiceItemDto item : invoiceList) {
				if (item.isHasSomeGrFlag()) {
					PoItemDto poItemUIDto = map.get(item.getPoNumber() + item.getPoMatchingItemNoId());
					List<GrnItemDto> grnList = mapGrn.get(item.getPoNumber() + item.getPoMatchingItemNoId());

					BigDecimal totalInvQty = item.getQuantity();

					for (int grIndx = 0; grIndx < ServicesUtil.nullHandler(grnList); grIndx++) {
						GrnItemDto grnUIItem = grnList.get(grIndx);
						if (grnUIItem.getMoveType().equals("101")) {
							// Items lineItem = new Items();
							ThreeWay_Matching_RequestItems lineItem = new ThreeWay_Matching_RequestItems();

							BigDecimal grQty = totalInvQty;

							if (grIndx < grnList.size() - 1) {
								// grQty = ServicesUtil.min(totalInvQty,
								// grnUIItem.getQuantity().subtract(grnUIItem.getRefQuantity()));
								grQty = ServicesUtil.min(totalInvQty,
										grnUIItem.getDelivQty().subtract(grnUIItem.getRefQuantity()));
								// // logger.logDebug("grQty 1 -> " + grQty);
							} else {
								grQty = totalInvQty;
								// // logger.logDebug("grQty 2 -> " + grQty);
							}

							// grQty = ServicesUtil.min(totalInvQty,
							// grnUIItem.getQuantity().subtract(grnUIItem.getRefQuantity()));
							// totalInvQty =
							// totalInvQty.subtract(grnUIItem.getDelivQty());
							totalInvQty = totalInvQty.subtract(grQty);

							// // logger.logDebug("new totalInvQty " +
							// totalInvQty);

							// Add GR line items if quantity is >0
							if (BigDecimal.ZERO.compareTo(grQty) <= -1) {
								// BigDecimal net_worth =
								// poItemUIDto.getQuantity().multiply(poItemUIDto.getNetPrice());
								lineItem.setPO_NUMBER(item.getPoNumber());
								// lineItem.setPONUMBER(dto.getPurchaseOrderUIDtoList().get(0).getPoNumber());
								lineItem.setPO_ITEM_ID(poItemUIDto.getPoItem());
								lineItem.setPOITEM_CONV_NUM1(poItemUIDto.getConvNum1());
								lineItem.setPOITEM_CONV_DEN1(poItemUIDto.getConvDen1());
								lineItem.setPOITEM_QUANTITY(poItemUIDto.getQuantity());
								lineItem.setPOHEADER_CURRENCY(dto.getPurchaseOrderUIDtoList().get(0).getCurrency());
								lineItem.setPOHEADER_COMP_CODE(dto.getPurchaseOrderUIDtoList().get(0).getCompanyCode());
								lineItem.setPOHISTORY_MAT_DOC(grnUIItem.getDocNo());
								lineItem.setNET_WORTH(poItemUIDto.getNetWorth());
								lineItem.setPOITEM_ITEM_CAT(poItemUIDto.getItemCategory());
								lineItem.setDOC_AMOUNT_CURRENCY((grQty.multiply(item.getUnitPrice()))
										.divide(item.getPriceUnit(), 5, RoundingMode.HALF_UP));
								lineItem.setPOHISTORY_TOTALS_PO_PR_QNT(grQty);
								grQty = grQty.divide(poItemUIDto.getConvNum1(), 8, RoundingMode.HALF_UP);
								grQty = grQty.multiply(poItemUIDto.getConvDen1());
								lineItem.setDR_CR_INDICATOR("S");
								// BigDecimal BPMNG =
								// lineItem.getPOITEMCONVNUM1().divide(lineItem.getPOITEMCONVDEN1(),
								// 3, RoundingMode.HALF_UP);
								lineItem.setPOHISTORY_TOTALS_IV_QTY(grnUIItem.getRefQuantity());
								// BPMNG = BPMNG.multiply(grQty);
								lineItem.setPOHISTORY_TOTALS_DELIV_QTY(grnUIItem.getQuantity());
								lineItem.setINVOICE_QUANTITY(grQty.setScale(3, RoundingMode.HALF_UP));
								lineItem.setPOHISTORY_TOTALS_VAL_IV_FOR(grnUIItem.getRefCostFOREIGN());
								lineItem.setPOHISTORY_TOTALS_VAL_GR_FOR(grnUIItem.getCostForeignCurrency());
								// // logger.logDebug("Item set is (at PIUtil@262)
								// " + lineItem.toString());
								threewayMatchingRequest.add(lineItem);
							}
						}
					}
					if (ServicesUtil.isEmpty(grnList)) {
						ThreeWay_Matching_RequestItems lineItem = new ThreeWay_Matching_RequestItems();
						lineItem.setPO_NUMBER(dto.getPurchaseOrderUIDtoList().get(0).getPoNumber());
						lineItem.setPO_ITEM_ID(poItemUIDto.getPoItem());
						threewayMatchingRequest.add(lineItem);
					}
				}
			}
		}
		// // logger.logDebug("[AP][PIUtil] no of three way match items set"+
		// threewayMatchingRequest.getItems().size());
		return threewayMatchingRequest;

	}

	public static void setResponse(ThreeWay_Matching_ResponseITEMS[] response, AccountPayDto dto) {
		// // logger.logDebug(" [AP][PIUtil]setThreeWayResponse control inside");
		resetThreewayMAtchTextAndErrorFlag(dto);
		Map<String, List<String>> mapResponse = new HashMap<String, List<String>>();
		List<InvoiceItemDto> invoiceItemList = dto.getInvoiceDetailUIDto().getInvoiceItemList();
		if (!ServicesUtil.isEmpty(response) && !ServicesUtil.isEmpty(response)) {

			// // logger.logDebug("[ Threeway match setResponse] response size is"
			// + response.length);
			// List<ITEMS> itemList = response.getITEMS();
			for (ThreeWay_Matching_ResponseITEMS items : response) {

				if (items.getPOITEM_ID() != null && items.getPONUMBER() != null) {
					if (mapResponse.containsKey(items.getPOITEM_ID() + items.getPONUMBER())) {
						List<String> list = mapResponse.get(items.getPOITEM_ID() + items.getPONUMBER());
						// // logger.logDebug("Item contained in Map "+items+"
						// "+items.getPOITEMID() + items.getPONUMBER());
						list.add(items.getMESSAGE());
					} else {
						List<String> tempList = new ArrayList<String>();
						tempList.add(items.getMESSAGE());
						// // logger.logDebug("items " + items + " "
						// +items.getPOITEMID() + items.getPONUMBER());
						mapResponse.put(items.getPOITEM_ID() + items.getPONUMBER(), tempList);
					}
				}
				// // logger.logDebug("[AP][PIUtil][ Threeway match setResponse]" +
				// items.toString());
			}

			for (int j = 0; j < ServicesUtil.nullHandler(invoiceItemList); j++) {
				InvoiceItemDto invoiceItemUIDto = invoiceItemList.get(j);
				if (ServicesUtil.isTrue(invoiceItemUIDto.getTwowayMatchingFlag())
						&& ServicesUtil.isFalse(invoiceItemUIDto.isHasErrorFlag())
						&& ServicesUtil.isFalse(invoiceItemUIDto.isDeleted())) {
					invoiceItemUIDto.setThreewayMatchingFlag(true);
					String key = invoiceItemUIDto.getPoMatchingItemNoId() + invoiceItemUIDto.getPoNumber();
					// // logger.logDebug("[ Threeway match loop over
					// invoiceItemList key=]" + key);
					if (ServicesUtil.isTrue(invoiceItemUIDto.getTwowayMatchingFlag()) && mapResponse.containsKey(key)) {
						List<String> temp = mapResponse.get(key);
						// // logger.logDebug("[ Threeway match loop over
						// invoiceItemList temp = ]" + temp);
						if (!ServicesUtil.isEmpty(temp)) {
							// invoiceList.get(j).getThreewayMatchingFlag(false);
							invoiceItemUIDto.setHasErrorFlag(true);
							// invoiceItemUIDto.setUnitPriceMismatchFlag(0);
							// invoiceItemUIDto.setQuantityMismatchFlag(0);
							invoiceItemUIDto.setThreeWayMatchText(temp);

							if (invoiceItemUIDto.getQuantityMismatchFlag() != 2) {
								invoiceItemUIDto.setQuantityMismatchFlag(0);
							}
							if (invoiceItemUIDto.getUnitPriceMismatchFlag() != 2) {
								invoiceItemUIDto.setUnitPriceMismatchFlag(0);
							}

							for (String string : temp) {
								string = string.toLowerCase();
								if (string.contains("price")) {
									invoiceItemUIDto.setUnitPriceMismatchFlag(1);
								}
								if (string.contains("quantity")) {
									invoiceItemUIDto.setQuantityMismatchFlag(1);
								}

							}
						}
					} else {
						if (invoiceItemUIDto.getQuantityMismatchFlag() != 2) {
							invoiceItemUIDto.setQuantityMismatchFlag(0);
						}
						if (invoiceItemUIDto.getUnitPriceMismatchFlag() != 2) {
							invoiceItemUIDto.setUnitPriceMismatchFlag(0);
						}
					}
				}
				// // logger.logDebug(invoiceItemUIDto.toString());
			}
		}
		// Else part by Abhishek on 15-12-2016
		// If all items pass three way match then nothing will be returned in
		// response.
		// Then we set three_way_match flag true if the line item has
		// two_way_match_flag true
		// and has_error_flag false.
		else {
			// // logger.logDebug("All Line Items passes three way match ");
			if (!ServicesUtil.isEmpty(invoiceItemList)) {
				for (InvoiceItemDto invoiceItemUIDto : invoiceItemList) {
					if (ServicesUtil.isTrue(invoiceItemUIDto.getTwowayMatchingFlag())
							&& ServicesUtil.isFalse(invoiceItemUIDto.isHasErrorFlag())) {

						invoiceItemUIDto.setThreewayMatchingFlag(true);
						if (invoiceItemUIDto.getQuantityMismatchFlag() != 2) {
							invoiceItemUIDto.setQuantityMismatchFlag(0);
						}
						if (invoiceItemUIDto.getUnitPriceMismatchFlag() != 2) {
							invoiceItemUIDto.setUnitPriceMismatchFlag(0);
						}
					}
				}
			}
		}
	}

	private static void resetThreewayMAtchTextAndErrorFlag(AccountPayDto dto) {
		if (!ServicesUtil.isEmpty(dto.getInvoiceDetailUIDto().getInvoiceItemList())) {
			for (InvoiceItemDto invoiceItem : dto.getInvoiceDetailUIDto().getInvoiceItemList()) {
				invoiceItem.setThreeWayMatchText(null);
				invoiceItem.setHasErrorFlag(false);
				// invoiceItem.setUnitPriceMismatchFlag(0);
				// invoiceItem.setQuantityMismatchFlag(0);

			}
		}
	}
	
	public static Po_Posting_Request setPOPostingRequest(AccountPayDto accpayDto) throws Exception {
		
		 PostingData data  = new PostingData();
//		 count is maintained at a higher level since sequence number needs to
//		 be maintained
		int count = 0;
		Po_Posting_Request request = new Po_Posting_Request();
		//ACCOUNTINGDATA accData = new ACCOUNTINGDATA();
		//request.getACCOUNTINGDATA().add(accData);
		if (accpayDto.getPurchaseOrderUIDtoList().get(0).getHasDeliveryVendor() && accpayDto.getPurchaseOrderUIDtoList().get(0).getIsThirdParty() )  {
			//// logger.logDebug("Third Party case " + accpayDto.getPurchaseOrderUIDtoList().get(0)
							//.getHasDeliveryVendor().toString());
			//setThirdPartyItems(request, accpayDto, data);
		} else {
			/*// logger.logDebug("Not a third party case " + accpayDto.getPurchaseOrderUIDtoList().get(0)
							.getHasDeliveryVendor().toString());*/
			setItemFileds(request, accpayDto, data);
		}
		
		//// logger.logDebug(" [AP][PIUtil]after set itemfields " +data.getGramount()+" count is"+count);
		//glCodingUnplannedCost(request,accpayDto,data);
		// logger.logDebug("[AP][PIUtil] after GL itemfields " + data.getGramount().toString()+" count is"+count);
		//setGLCoding(request, accpayDto, data);
		// logger.logDebug("[AP][PIUtil] after line item glcoding "+ data.getGramount());
		setHeaderFields(request, accpayDto, data);
		// logger.logDebug("[AP][PIUtil]Material");
		return request;
	}
	
	private static void setHeaderFields(Po_Posting_Request request, AccountPayDto accpayDto,PostingData data) throws Exception {
		Po_Posting_RequestPosting_Header header = new Po_Posting_RequestPosting_Header();

		if(!ServicesUtil.isEmpty(accpayDto.getPurchaseOrderUIDtoList()) && accpayDto.getPurchaseOrderUIDtoList().size() >0){
		header.setINVOICE_IND("X");
//		By Shanker
//		String currDate = ServicesUtil.formatDate(new Date());
//		header.setDOCDATE(currDate);
		header.setDOC_DATE(ServicesUtil.formatDate(accpayDto.getInvoiceDetailUIDto().getInvoiceDate()));
		
//		 Edited by Abhishek on 11-11-2016
//		 Getting the posting date from UI
//		logger.logDebug("Posting date from UI "+ simpleDateFormat.format(accpayDto.getInvoiceDetailUIDto().getPostingDate()));
//		logger.logDebug("Posting date from UI "+ accpayDto.getInvoiceDetailUIDto().getPostingDate());
//		if(!simpleDateFormat.format(accpayDto.getInvoiceDetailUIDto().getPostingDate()).isEmpty()){
//			logger.logDebug("Posting date from UI "+ ServicesUtil.formatDate(accpayDto.getInvoiceDetailUIDto().getPostingDate()));
			header.setPSTNG_DATE(ServicesUtil.formatDate(accpayDto.getInvoiceDetailUIDto().getPostingDate()));
//		}
//		else
//		{
//			header.setPSTNGDATE(currDate);
//		}
		
//		Edited by Abhishek on 11-11-2016
		header.setCOMP_CODE(accpayDto.getPurchaseOrderUIDtoList().get(0).getCompanyCode());
		header.setCURRENCY(accpayDto.getPurchaseOrderUIDtoList().get(0).getCurrency());
		BigDecimal gramount = data.getGramount();
		//logger.logDebug("before tax " + gramount.toString());
		//header.setDELCOSTS(BigDecimal.valueOf(100.00));
		//gramount= gramount.add(header.getDELCOSTS());
		
		//gramount = gramount.multiply(BigDecimal.valueOf(1.16));
		header.setREF_DOC_NO(accpayDto.getInvoiceDetailUIDto().getInvoiceNumber());
		header.setGROSS_AMOUNT(gramount);
		//logger.logDebug("amount that is set "+ gramount.toString());
		header.setCALC_TAX_IND("X");
//		header.setPMNTTRMS(accpayDto.getPurchaseOrderUIDtoList().get(0).getPaymentTerms());
		header.setPMNTTRMS(accpayDto.getInvoiceDetailUIDto().getPaymentTerms()); 
		
//		 Edit begin by Abhishek on 11-11-2016
//		 Getting the baseline date from UI
//		logger.logDebug("Base Line date from UI "+ simpleDateFormat.format(accpayDto.getInvoiceDetailUIDto().getBaseLineDate()));
		//logger.logDebug("Base Line date from UI "+ accpayDto.getInvoiceDetailUIDto().getBaseLineDate());
//		if(!simpleDateFormat.format(accpayDto.getInvoiceDetailUIDto().getBaseLineDate()).isEmpty()){
//			logger.logDebug("Base Line date from UI "+ simpleDateFormat.format(accpayDto.getInvoiceDetailUIDto().getBaseLineDate()));
			header.setBLINE_DATE(ServicesUtil.formatDate(accpayDto.getInvoiceDetailUIDto().getBaseLineDate()));
//		}
//		else{
//			header.setBLINEDATE(currDate);
//		}
			
//		 above code Edit end by Abhishek on 11-11-2016
		
		header.setPMNT_BLOCK(accpayDto.getInvoiceDetailUIDto().getPaymentBlock());
		header.setPYMT_METH(accpayDto.getInvoiceDetailUIDto().getPaymentMethod());
		
//		for (PurchaseOrderUIDto purchaseOrderUIDtos : accpayDto.getPurchaseOrderUIDtoList()) {
//			if(ServicesUtil.isTrue(purchaseOrderUIDtos.getHasDeliveryVendor())){
//			   logger.logDebug("Delivery  Vendor " + purchaseOrderUIDtos.getVendor() + "Invoice Vendor " + accpayDto.getInvoiceDetailUIDto().getVendorId());
//				if(!ServicesUtil.removeLeadingZeros(purchaseOrderUIDtos.getVendor()).equals(ServicesUtil.removeLeadingZeros(accpayDto.getInvoiceDetailUIDto().getVendorId()))){
					header.setDIFF_INV(accpayDto.getInvoiceDetailUIDto().getVendorId());
//					break;
//				}
//			}
//		}
		//logger.logDebug(header.toString());
    	}
		request.setPosting_Header(header);
	}
	
	
	private static Map<String, PoItemDto> createItemMap(AccountPayDto accpayDto) {
		Map<String, PoItemDto> map = new HashMap<String, PoItemDto>();
//		 loop through all po's available
		for (int i = 0; i < ServicesUtil.nullHandler(accpayDto.getPurchaseOrderUIDtoList()); i++) {
			PurchaseOrderDto purchaseOrderDto = accpayDto.getPurchaseOrderUIDtoList().get(i);
			if (!ServicesUtil.isEmpty(purchaseOrderDto.getPoItemList())) {
				for (PoItemDto item : purchaseOrderDto.getPoItemList()) {
					map.put(purchaseOrderDto.getPoNumber() + item.getPoItem(), item);
				}
			}
		}
		return map;
	}
	
	private static Map<String, List<GrnItemDto>> createGrnMap(AccountPayDto accpayDto) {
		Map<String, List<GrnItemDto>> mapGrn = new HashMap<String, List<GrnItemDto>>();
		for (int i = 0; i < ServicesUtil.nullHandler(accpayDto.getGrnUIDtoList()); i++) {
		   if(!ServicesUtil.isEmpty(accpayDto.getGrnUIDtoList().get(i).getGrnItemList())){
			for (GrnItemDto grnItem : accpayDto.getGrnUIDtoList().get(i).getGrnItemList()){
				if (mapGrn.containsKey(accpayDto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId())) {
					List<GrnItemDto> list = mapGrn.get(accpayDto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId());
					list.add(grnItem);
					mapGrn.put(accpayDto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId(), list);
				} else {
					List<GrnItemDto> list = new ArrayList<GrnItemDto>();
					list.add(grnItem);
					mapGrn.put(accpayDto.getGrnUIDtoList().get(i).getPoNumber() + grnItem.getPoItemId(), list);
				}
			}
		  }
		}
		return mapGrn;
	}
	
	private static List<InvoiceItemDto> get3WayAndPartiallyPost(List<InvoiceItemDto> invoiceList) {
		List<InvoiceItemDto> list = new ArrayList<InvoiceItemDto>(ServicesUtil.nullHandler(invoiceList));
		if(!ServicesUtil.isEmpty(invoiceList)){
			for (InvoiceItemDto item : invoiceList) {
				System.err.println(item);
				//logger.logDebug("partial flag" + item.isPartialPosting() + " three way match flag " + item.getThreewayMatchingFlag());
				if (!ServicesUtil.isEmpty(item)) 
				//if (!ServicesUtil.isEmpty(item.getThreewayMatchingFlag()) /*&& item.isPartialPosting()*/ /*&& item.getThreewayMatchingFlag()*/ /*&& !item.getFreeItem()*/ && ServicesUtil.isFalse(item.isDeleted())) {
					//logger.logDebug("line item added" + item.toString());
					list.add(item);
				//}
			}
		}
		return list;
	}

	private static void setItemFileds(Po_Posting_Request request, AccountPayDto accpayDto, PostingData data) {
		// logger.logDebug("[AP] [setItemFileds] entering functions");
//		 create a grn map key = PoNumber + PoItem
		Map<String, PoItemDto> poItemMap = createItemMap(accpayDto);

//		 create a grn map key = PoNumber + PoItem
		Map<String, List<GrnItemDto>> grnMap = createGrnMap(accpayDto);

//		 create a Delivery Cost map key = PoNumber + PoItem
//		Map<String, DeliveryCostItemUIDto> deliveryItemMap = createDliveryItemMap(accpayDto);
		//Map<String, DeliveryCostItemUIDto> deliveryItemMap = createDliveryItemMapThirdParty(accpayDto);
	       
//		 create a list of invoice line items
		List<InvoiceItemDto> invoiceList = new ArrayList<InvoiceItemDto>();
		
		if(!ServicesUtil.isEmpty(accpayDto.getInvoiceDetailUIDto().getInvoiceItemList())){
			invoiceList = accpayDto.getInvoiceDetailUIDto().getInvoiceItemList();
		}
		
//		create a list of invoice line items where two way match = true and
		List<InvoiceItemDto> invoice3WaySuccessList = get3WayAndPartiallyPost(invoiceList);
		// logger.logDebug("invoice list for line items " + ServicesUtil.nullHandler(invoice2WaySuccessList));
//		 need to calculate GR amount to send in header
		System.err.println("invoice3WaySuccessList+"+invoice3WaySuccessList);

		ArrayList<Po_Posting_RequestPosting_LineItems> posting_LineItems = new ArrayList<Po_Posting_RequestPosting_LineItems>();

		if(!ServicesUtil.isEmpty(invoice3WaySuccessList)){
			
		for (InvoiceItemDto item : invoice3WaySuccessList) {
			PoItemDto poItemUIDto = poItemMap.get(item.getPoNumber() + item.getPoMatchingItemNoId());
			List<GrnItemDto> grnList = grnMap.get(item.getPoNumber() + item.getPoMatchingItemNoId());
			
//			BigDecimal totalInvQty = poItemUIDto.getConvDen1().divide(poItemUIDto.getConvNum1(), 3, RoundingMode.HALF_UP);
//			totalInvQty = totalInvQty.multiply(item.getQuantity());

			BigDecimal totalInvQty = item.getQuantity();
			BigDecimal totalNetPrice = item.getNetPrice();
			if(!ServicesUtil.isEmpty(poItemUIDto))
			if(!poItemUIDto.getGrIndicator()){
				int count = data.getCount();
	            BigDecimal gramount = data.getGramount();
				BigDecimal grQty = totalInvQty;
				// logger.logDebug("GR Indicator not set, hence grQty is totalInvQty"); 
//				grQty = ServicesUtil.min(totalInvQty, grn.getQuantity().subtract(grn.getRefQuantity()));
//				totalInvQty = totalInvQty.subtract(grQty);
				// logger.logDebug("Item " + item.toString());
				
//				 Add GR line items if quantity is > 0
				if (BigDecimal.ZERO.compareTo(grQty) <= -1) {
					Po_Posting_RequestPosting_LineItems lineItem = new Po_Posting_RequestPosting_LineItems();
					try {
						lineItem.setINVOICE_DOC_ITEM(ServicesUtil.appendLeadingChars(Integer.toString(++count), '0', 6));
					} catch (InvalidInputFault e) {
						e.printStackTrace();
					}
					
					/*
					 * This method sets the line items needs to be posted.
					 */
					lineItem.setPO_PR_QNT(grQty);
//					lineItem.setITEMAMOUNT(grQty.multiply(item.getUnitPrice()));
//					Setting net price as amount when GRIndicator is not checked
					lineItem.setITEM_AMOUNT(item.getNetPrice());

					lineItem.setPO_NUMBER(item.getPoNumber());
					lineItem.setPO_ITEM(poItemUIDto.getPoItem());
//					BigDecimal BPMNG = poItemUIDto.getConvNum1().divide(poItemUIDto.getConvDen1(), 2, RoundingMode.HALF_UP);
//					BPMNG= BPMNG.multiply(grQty);
					grQty = grQty.divide(poItemUIDto.getConvNum1(), 8,RoundingMode.HALF_UP);
					
					grQty = grQty.multiply(poItemUIDto.getConvDen1());
//					lineItem.setPOPRQNT(BPMNG);

					// logger.logDebug("POPRQTY " + lineItem.getPOPRQNT() +"ITEMAMT " +lineItem.getITEMAMOUNT() + " grQty "  + grQty   );
					lineItem.setPO_PR_UOM(poItemUIDto.getPoOrderUnit());
					lineItem.setTAX_CODE("V1");
//					lineItem.setITEMAMOUNT(BPMNG.multiply(item.getUnitPrice()));
					lineItem.setQUANTITY(grQty.setScale(3, RoundingMode.HALF_UP));
					lineItem.setPO_UNIT(poItemUIDto.getUnit());
					// logger.logDebug("adding  item ");
					posting_LineItems.add(lineItem);
					gramount = gramount.add(lineItem.getITEM_AMOUNT());
					data.setGramount(gramount);
					data.setCount(count);
//					if(!ServicesUtil.isEmpty(item.getAccDtoList())){
//						BigDecimal serialNo= new BigDecimal(0);
//							for (AccountAssignmentUIDto accUIDto : item.getAccUIDtoList()) {
//								if(item.getAccAssignCount().compareTo(serialNo)>0){
//									String unplannedLine = "";
//									serialNo = serialNo.add(new BigDecimal(1));
//									setAccAssignData(request, poItemUIDto,lineItem, serialNo, accUIDto,unplannedLine);}
//							else{
//								String unplannedLine = "X";
//								serialNo = serialNo.add(new BigDecimal(1));
//								setAccAssignData(request, poItemUIDto,lineItem, null, accUIDto,unplannedLine);}
//						}	
//					}
				}
			}
			else{
//				for(int i=0; i<ServicesUtil.nullHandler(grnList); i++){
//				for (GrnItemUIDto grn : grnList) {
				for(int grIndx=0; grIndx < ServicesUtil.nullHandler(grnList); grIndx++){	
					GrnItemDto grn = grnList.get(grIndx);
					if(grn.getMoveType().equals("101")){
//					GrnItemUIDto grn = grnList.get(i);
					// logger.logDebug("GRIndicator is set." + "\n" + "GRN item is " + grn.toString());
					int count = data.getCount();
		            BigDecimal gramount = data.getGramount();
					BigDecimal grQty = totalInvQty;
					
					BigDecimal netPrice = totalNetPrice;
					
//					grQty = ServicesUtil.min(totalInvQty, grn.getQuantity().subtract(grn.getRefQuantity()));
					if(grIndx < grnList.size() - 1){
						grQty = ServicesUtil.min(totalInvQty, grn.getDelivQty().subtract(grn.getRefQuantity()));
					}
					else{
						grQty = totalInvQty;
					}
					
					if(grIndx < grnList.size() - 1){
						netPrice = ServicesUtil.min(totalNetPrice, (grQty.multiply(item.getUnitPrice()).divide(item.getPriceUnit(), 5, RoundingMode.HALF_UP)));
					}
					else{
						netPrice = totalNetPrice;
					}
					
					
//					totalInvQty = totalInvQty.subtract(grQty);
//					totalInvQty = totalInvQty.subtract(grn.getDelivQty());
					totalInvQty = totalInvQty.subtract(grQty);
					
					totalNetPrice = totalNetPrice.subtract(netPrice);
					
					// Add GR line items if quantity is > 0
					if (BigDecimal.ZERO.compareTo(grQty) <= -1){
						Po_Posting_RequestPosting_LineItems lineItem = new Po_Posting_RequestPosting_LineItems();
						try {
							lineItem.setINVOICE_DOC_ITEM(ServicesUtil.appendLeadingChars(Integer.toString(++count), '0', 6));
						} catch (InvalidInputFault e) {
							e.printStackTrace();
						}
						
						lineItem.setPO_PR_QNT(grQty);
//						lineItem.setITEMAMOUNT(grQty.multiply(item.getUnitPrice()));
						lineItem.setITEM_AMOUNT(netPrice);
						/*
						 * This method sets the line items needs to be posted.
						 */
//						BigDecimal BPMNG = poItemUIDto.getConvNum1().divide(poItemUIDto.getConvDen1(), 3, RoundingMode.HALF_UP);
//						BPMNG= BPMNG.multiply(grQty);
						grQty = grQty.divide(poItemUIDto.getConvNum1(), 8,RoundingMode.HALF_UP);
						grQty = grQty.multiply(poItemUIDto.getConvDen1());
						
						lineItem.setPO_NUMBER(item.getPoNumber());
						lineItem.setPO_ITEM(poItemUIDto.getPoItem());
						lineItem.setREF_DOC(grn.getDocNo());
						lineItem.setREF_DOC_IT(grn.getGrItemId());
						lineItem.setREF_DOC_YEAR(grn.getDocYear());
//						lineItem.setPOPRQNT(BPMNG);
						lineItem.setPO_PR_UOM(poItemUIDto.getPoOrderUnit());
						lineItem.setTAX_CODE("V1");
//						lineItem.setITEMAMOUNT(BPMNG.multiply(item.getUnitPrice()));
						
						lineItem.setQUANTITY(grQty.setScale(3, RoundingMode.HALF_UP));
						
						lineItem.setPO_UNIT(poItemUIDto.getUnit());
						// logger.logDebug("adding  item ");
						posting_LineItems.add(lineItem);
						gramount = gramount.add(lineItem.getITEM_AMOUNT());
						data.setGramount(gramount);
						data.setCount(count);
						
//						if(!ServicesUtil.isEmpty(item.getAccUIDtoList())){
//							BigDecimal serialNo= new BigDecimal(0);
//							for (AccountAssignmentUIDto accUIDto : item.getAccUIDtoList()) {
//								if(item.getAccAssignCount().compareTo(serialNo)>0){
//									String unplannedLine = "";
//									serialNo = serialNo.add(new BigDecimal(1));
//									setAccAssignData(request, poItemUIDto,lineItem, serialNo, accUIDto,unplannedLine);
//								}
//							else{
//								String unplannedLine = "X";
//								serialNo = serialNo.add(new BigDecimal(1));
//								setAccAssignData(request, poItemUIDto,lineItem, null, accUIDto,unplannedLine);}
//							}
//						}
					}
				  }
				}
			}
			
//			 setting header cost line item values
			// logger.logDebug("status " + HasDelveiryCharges(accpayDto, item.getPoNumber()));
   		 
			/*if (ServicesUtil.nullHandler(accpayDto.getInvoiceDetailUIDto().getInvoiceItemList())!=0 && HasDelveiryCharges(accpayDto, item.getPoNumber())) {
				for(int i = 0; i < ServicesUtil.nullHandler(accpayDto.getDeliveryCostHeaderUIDto()); i++){
			         for(int j = 0; j < ServicesUtil.nullHandler(accpayDto.getDeliveryCostHeaderUIDto().get(i).getItem()); j++){
			        	DeliveryCostItemUIDto delivCostItem = accpayDto.getDeliveryCostHeaderUIDto().get(i).getItem().get(j);
						// logger.logDebug("deliveryItemMap size " + deliveryItemMap.size() + " looking for key" + delivCostItem.getPoNumber() + delivCostItem.getPoItemId()+ delivCostItem.getStunr() + delivCostItem.getZaehk());
						
						// logger.logDebug("entry criteria " + deliveryItemMap.containsKey(delivCostItem.getPoNumber() + delivCostItem.getPoItemId()+ delivCostItem.getStunr() + delivCostItem.getZaehk()));
						
						if (deliveryItemMap.containsKey(delivCostItem.getPoNumber() + delivCostItem.getPoItemId()+ delivCostItem.getStunr() + delivCostItem.getZaehk())) {
							DeliveryCostItemUIDto deliveryCost = deliveryItemMap.get(delivCostItem.getPoNumber() + delivCostItem.getPoItemId()+ delivCostItem.getStunr() + delivCostItem.getZaehk());
							// logger.logDebug("delivery cost line " + deliveryCost.toString());
							if (ServicesUtil.isTrue(deliveryCost.getIsConditionType()) && deliveryCost.getPoItemId().equals(item.getPoMatchingItemNoId())) {
							
							PostingLineItems lineItem = new PostingLineItems();
		
							int count = data.getCount();
				            BigDecimal gramount = data.getGramount();
							try {
								lineItem.setINVOICEDOCITEM(ServicesUtil.appendLeadingChars(Integer.toString(++count), '0', 6));
							} catch (InvalidInputFault e) {
								e.printStackTrace();
							}
//							lineItem.setPONUMBER(accpayDto.getPurchaseOrderUIDtoList().get(0).getPoNumber());
							lineItem.setPONUMBER(deliveryCost.getPoNumber());
							lineItem.setPOITEM(deliveryCost.getPoItemId());
//							Edit Begin 03-01-2017 Abhishek
//							BigDecimal BPMNG = poItemUIDto.getConvNum1().divide(poItemUIDto.getConvDen1(), 2, RoundingMode.HALF_UP);
//							BPMNG= BPMNG.multiply(deliveryCost.getQuantity());
							lineItem.setPOPRQNT(deliveryCost.getBpmng());
//							lineItem.setPOPRQNT(deliveryCost.getQuantity());
							lineItem.setPOPRUOM(poItemUIDto.getPoOrderUnit()); 
//							Edit End 03-01-2017 Abhishek
							lineItem.setTAXCODE("I0");
							
							lineItem.setITEMAMOUNT(deliveryCost.getAmount());
//							BigDecimal BPMNG = deliveryCost.getQuantity().divide(poItemUIDto.getConvNum1(), 3, RoundingMode.HALF_UP);
//							lineItem.setQUANTITY(BPMNG);
							lineItem.setQUANTITY(deliveryCost.getQuantity());
							lineItem.setPOUNIT(poItemUIDto.getUnit());
//							lineItem.setCONDTYPE(deliveryCost.getIndicator());
							lineItem.setFREIGHTVEN(deliveryCost.getFreightVendor());
							lineItem.setCONDCOUNT(deliveryCost.getZaehk());
							lineItem.setCONDSTNO(deliveryCost.getStunr());
							// logger.logDebug("adding line item ");
							request.getPostingLineItems().add(lineItem);
							gramount = gramount.add(lineItem.getITEMAMOUNT());
							data.setGramount(gramount);
							data.setCount(count);
							}
						}
			          }
			       }
			}*/
		 }
		
 		 // logger.logDebug("end of [setItemFileds]"+ data.getGramount().toString());
		}
		
		Po_Posting_RequestPosting_LineItems items[] =new  Po_Posting_RequestPosting_LineItems[posting_LineItems.size()];              
		for(int i =0;i<posting_LineItems.size();i++){
			items[i] = posting_LineItems.get(i);
		}
		request.setPosting_LineItems(items);
		
	/*	Po_Posting_RequestPosting_LineItems items[] = (Po_Posting_RequestPosting_LineItems) posting_LineItems.toArray();
		request.setPosting_LineItems(items);*/
//		else{
//			// logger.logDebug("Setting only delivery lines ");
//			setThirdPartyItems(request, accpayDto, data);
//		}
	}
}