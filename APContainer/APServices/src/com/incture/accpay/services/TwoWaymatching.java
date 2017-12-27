package com.incture.accpay.services;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.apache.commons.lang.StringUtils;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.GrnDto;
import com.incture.accpay.dto.GrnItemDto;
import com.incture.accpay.dto.GrnItemTotalDto;
import com.incture.accpay.dto.InvoiceItemDto;
import com.incture.accpay.dto.PoItemDto;
import com.incture.accpay.dto.PurchaseOrderDto;
import com.incture.accpay.util.ServicesUtil;

public class TwoWaymatching {
	// private LogUtil logger = new LogUtil(TwoWaymatching.class);

	// private AppProps props = new AppProps();
	// private List<InvoiceItemUIDto> invoiceProcessList = null;
	// private List<InvoiceItemUIDto> finalList = null;

	/** Does 2-Way Match between certain fields of Invoice & PO */
	/** STEP 1 : Match based on vendor Material Number */
	/** STEP 2 : Match based on UPC */
	/** STEP 3 : Matching on Master Material */
	/** STEP 4 : Match based on description */
	/** STEP 5 : Match based on position and Item ID */
	public void doTwoWayMatch(AccountPayDto request) {
		// logger.logDebug("[AP][TwoWaymatching][ doTwoWayMatch ] Started ");
		try {
			// Prerequisite, for later
			// Map<String, BigDecimal> map = getPoItemGrnMap(request);
			// List<PurchaseOrderUIDto> poList = request
			// .getPurchaseOrderUIDtoList();
			List<InvoiceItemDto> invoiceProcessList = request.getInvoiceDetailUIDto().getInvoiceItemList();
			if (!ServicesUtil.isEmpty(invoiceProcessList)) {
				// finalList = new ArrayList<InvoiceItemUIDto>();

				doMatchingOnVendorMat(request, invoiceProcessList);
				doMatchingOnUPC(request, invoiceProcessList);
				doMatchingOnMaterial(request, invoiceProcessList);
				doMatchingOnDescription(request, invoiceProcessList);
				doMatchingOnPositon(request, invoiceProcessList);

			}
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * logger.logError("[AP][TwoWaymatching] [ doTwoWayMatch ] ERROR" +
			 * ServicesUtil.getExceptionTrace(e));
			 */
		}
		// logger.logDebug("[AP][TwoWaymatching] [ doTwoWayMatch ] completed" +
		// request);
	}

	// Matching Invoice Material ID with PO Vendor Mat ID
	private void doMatchingOnVendorMat(AccountPayDto request, List<InvoiceItemDto> invoiceItemList) {
		List<PurchaseOrderDto> poList = request.getPurchaseOrderUIDtoList();
		// AppPropsRespDto appResponse = props.readAppProperties();

		for (int invoiceItemIndex = 0; invoiceItemIndex < invoiceItemList.size(); invoiceItemIndex++) {
			// Double maxPercent = appResponse.getDespThreshold();
			Double maxPercent = 70.00; // FIXME: Remove hardcode
			int matchPoIndex = -1;
			int matchPoItemIndex = -1;
			InvoiceItemDto invoiceItemUIDto = invoiceItemList.get(invoiceItemIndex);
			/*
			 * logger.
			 * logDebug("[AP][TwoWaymatching] [doMatchingOnVendorMaterial] " +
			 * invoiceItemUIDto.getVendorMaterialId());
			 */
			if (!ServicesUtil.isTrue(invoiceItemUIDto.isDeleted())) {
				if (invoiceItemUIDto.getTwowayMatchingFlag() == null
						|| invoiceItemUIDto.getTwowayMatchingFlag() == false) {
					for (int poIndx = 0; poIndx < poList.size(); poIndx++) {

						List<PoItemDto> poItemList = poList.get(poIndx).getPoItemList();
						for (int poItemIdx = 0; poItemIdx < poItemList.size(); poItemIdx++) {
							PoItemDto poItemUIDto = poItemList.get(poItemIdx);
							/*
							 * logger.
							 * logDebug("[AP][TwoWaymatching]  [doMatchingOnVendorMaterial] poItemUIDto Desc "
							 * + poItemUIDto.getVendMat());
							 */
							// Need to check if Invoice item is already matched
							// : we
							// can check by checking if invoice item has poItem
							// no
							// value filled or not

							if (ServicesUtil.isFalse(poItemUIDto.isMatched())
									&& !ServicesUtil.isTrue(poItemUIDto.getDeleted())) {
								Double percent = getMatchPercentage(invoiceItemUIDto.getVendorMaterialId(),
										poItemUIDto.getVendMat());
								if (percent >= maxPercent) {
									matchPoIndex = poIndx;
									matchPoItemIndex = poItemIdx;
									maxPercent = percent;
								}
							}
						}
					}
				}
			}
			if (matchPoIndex >= 0) {
				// Find discrepancy
				setDiscrepancy(request, invoiceItemIndex, matchPoIndex, matchPoItemIndex);
			}
		}

	}

	// Matching UPC Master Material with PO Material
	private void doMatchingOnMaterial(AccountPayDto request, List<InvoiceItemDto> invoiceItemList) {

		List<PurchaseOrderDto> poList = request.getPurchaseOrderUIDtoList();

		// AppPropsRespDto appResponse = props.readAppProperties();

		for (int invoiceItemIdx = 0; invoiceItemIdx < invoiceItemList.size(); invoiceItemIdx++) {
			Double maxPercent = 70.0; // FIXME: Remove hardcode
			int matchPoIndex = -1;
			int matchPoItemIndex = -1;
			InvoiceItemDto invoiceItemUIDto = invoiceItemList.get(invoiceItemIdx);
			/*
			 * logger.logDebug("[AP][TwoWaymatching] [doMatchingOnMaterial] " +
			 * invoiceItemUIDto.getUpcToMaterial());
			 */
			if (!ServicesUtil.isTrue(invoiceItemUIDto.isDeleted())) {
				if (invoiceItemUIDto.getTwowayMatchingFlag() == null
						|| invoiceItemUIDto.getTwowayMatchingFlag() == false) {

					for (int poIndx = 0; poIndx < poList.size(); poIndx++) {

						List<PoItemDto> poItemList = poList.get(poIndx).getPoItemList();

						for (int poItemIdx = 0; poItemIdx < poItemList.size(); poItemIdx++) {
							PoItemDto poItemUIDto = poItemList.get(poItemIdx);

							if (ServicesUtil.isFalse(poItemUIDto.isMatched())
									&& !ServicesUtil.isTrue(poItemUIDto.getDeleted())) {
								Double percent = getMatchPercentage(invoiceItemUIDto.getUpcToMaterial(),
										poItemUIDto.getMaterialNumber());
								if (percent >= maxPercent) {
									matchPoIndex = poIndx;
									matchPoItemIndex = poItemIdx;
									maxPercent = percent;
								}
							}
						}

					}
				}
			}
			if (matchPoIndex >= 0) {
				// Find discrepancy
				setDiscrepancy(request, invoiceItemIdx, matchPoIndex, matchPoItemIndex);
			}
		}

	}

	// Matching Invoice Article ID with PO UPC Code
	private void doMatchingOnUPC(AccountPayDto request, List<InvoiceItemDto> invoiceItemList) {

		List<PurchaseOrderDto> poList = request.getPurchaseOrderUIDtoList();

		for (int invoiceItemIdx = 0; invoiceItemIdx < invoiceItemList.size(); invoiceItemIdx++) {
			Double maxPercent = 70.0; // FIXME: Remove hardcode
			int matchPoIndex = -1;
			int matchPoItemIndex = -1;
			InvoiceItemDto invoiceItemUIDto = invoiceItemList.get(invoiceItemIdx);
			/*
			 * logger.logDebug("[AP][TwoWaymatching] [doMatchingOnUPC] " +
			 * invoiceItemUIDto.getUpcCode());
			 */
			if (!ServicesUtil.isTrue(invoiceItemUIDto.isDeleted())) {
				if (invoiceItemUIDto.getTwowayMatchingFlag() == null
						|| invoiceItemUIDto.getTwowayMatchingFlag() == false) {

					for (int poIndx = 0; poIndx < poList.size(); poIndx++) {

						List<PoItemDto> poItemList = poList.get(poIndx).getPoItemList();
						for (int poItemIdx = 0; poItemIdx < poItemList.size(); poItemIdx++) {
							PoItemDto poItemUIDto = poItemList.get(poItemIdx);

							if (ServicesUtil.isFalse(poItemUIDto.isMatched())
									&& !ServicesUtil.isTrue(poItemUIDto.getDeleted())) {
								Double percent = getMatchPercentage(invoiceItemUIDto.getUpcCode(),
										poItemUIDto.getUpsc());
								if (percent >= maxPercent) {
									matchPoIndex = poIndx;
									matchPoItemIndex = poItemIdx;
									maxPercent = percent;
								}
							}
						}

					}

				}
			}
			if (matchPoIndex >= 0) {
				// Find discrepancy
				setDiscrepancy(request, invoiceItemIdx, matchPoIndex, matchPoItemIndex);
			}
		}

	}

	// Matching on Invoice Description with Po Description
	private void doMatchingOnDescription(AccountPayDto request, List<InvoiceItemDto> invoiceItemList) {

		List<PurchaseOrderDto> poList = request.getPurchaseOrderUIDtoList();

		for (int invoiceItemIdx = 0; invoiceItemIdx < invoiceItemList.size(); invoiceItemIdx++) {
			Double maxPercent = 70.0; // FIXME: Remove hardcode
			int matchPoIndex = -1;
			int matchPoItemIndex = -1;
			InvoiceItemDto invoiceItemUIDto = invoiceItemList.get(invoiceItemIdx);
			if (!ServicesUtil.isTrue(invoiceItemUIDto.isDeleted())) {
				if (invoiceItemUIDto.getTwowayMatchingFlag() == null
						|| invoiceItemUIDto.getTwowayMatchingFlag() == false) {

					for (int poIndx = 0; poIndx < poList.size(); poIndx++) {

						List<PoItemDto> poItemList = poList.get(poIndx).getPoItemList();
						for (int poItemIdx = 0; poItemIdx < poItemList.size(); poItemIdx++) {
							PoItemDto poItemUIDto = poItemList.get(poItemIdx);

							if (ServicesUtil.isFalse(poItemUIDto.isMatched())
									&& !ServicesUtil.isTrue(poItemUIDto.getDeleted())) {
								Double percent = getMatchPercentage(invoiceItemUIDto.getMaterialDescription(),
										poItemUIDto.getShortText());
								if (percent >= maxPercent) {
									matchPoIndex = poIndx;
									matchPoItemIndex = poItemIdx;
									maxPercent = percent;
								}
							}
						}

					}
				}
			}
			if (matchPoIndex >= 0) {
				// Find discrepancy
				setDiscrepancy(request, invoiceItemIdx, matchPoIndex, matchPoItemIndex);
			}
		}

	}

	// Matching on Invoice Positon with Po Item ID
	private void doMatchingOnPositon(AccountPayDto request, List<InvoiceItemDto> invoiceItemList) {

		List<PurchaseOrderDto> poList = request.getPurchaseOrderUIDtoList();

		for (int invoiceItemIdx = 0; invoiceItemIdx < invoiceItemList.size(); invoiceItemIdx++) {
			Double maxPercent = 100.0; // FIXME: Remove hardcode
			int matchPoIndex = -1;
			int matchPoItemIndex = -1;
			InvoiceItemDto invoiceItemUIDto = invoiceItemList.get(invoiceItemIdx);
			if (!ServicesUtil.isTrue(invoiceItemUIDto.isDeleted())) {
				if (invoiceItemUIDto.getTwowayMatchingFlag() == null
						|| invoiceItemUIDto.getTwowayMatchingFlag() == false) {

					for (int poIndx = 0; poIndx < poList.size(); poIndx++) {

						List<PoItemDto> poItemList = poList.get(poIndx).getPoItemList();
						for (int poItemIdx = 0; poItemIdx < poItemList.size(); poItemIdx++) {
							PoItemDto poItemUIDto = poItemList.get(poItemIdx);

							if (ServicesUtil.isFalse(poItemUIDto.isMatched())
									&& !ServicesUtil.isTrue(poItemUIDto.getDeleted())) {
								Double percent = getMatchPercentage(invoiceItemUIDto.getInvoiceItemId(),
										poItemUIDto.getPoItem());
								if (percent == maxPercent) {
									matchPoIndex = poIndx;
									matchPoItemIndex = poItemIdx;
									maxPercent = percent;
								}
							}
						}

					}

				}
			}
			if (matchPoIndex >= 0) {
				setDiscrepancy(request, invoiceItemIdx, matchPoIndex, matchPoItemIndex);
			}
		}

	}


	/**
	 * Phase 2: Below not fully implemented, currently return a map with Key:
	 * PoNumber+"_"+ PoItemId and value: Quantity Check if I.V. based Goods
	 * Receipt Number (GRN), If IV based GR check if GR happened If Yes
	 * calculate sum If No set a UI message If Not Iv Based Calculate sum on PO
	 * quantity
	 * 
	 * @param em
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unused")
	private Map<String, BigDecimal> getPoItemGrnMap(AccountPayDto request) {
		// Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
		/** For FD there will always be GR based Invoice */
		// if (request.getPurchaseOrderUIDtoList().get(0).getHas_Gr()) {
		List<GrnDto> grnList = request.getGrnUIDtoList();
		Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
		if (!ServicesUtil.isEmpty(grnList)) {
			for (GrnDto grnUIDto : grnList) {
				if (!ServicesUtil.isEmpty(grnUIDto.getGrnItemList())) {
					for (GrnItemDto grnItem : grnUIDto.getGrnItemList()) {
						String key = grnUIDto.getPoNumber() + "_" + grnItem.getPoItemId();
						map.put(key, grnItem.getQuantity());
					}
				} else {
					//logger.logDebug("[getPoItemGrnMap] GrnItemList size ZERO for " + grnUIDto.getId());
				}
			}
		}
		
		return map;
	}

	public BigDecimal getGrn(String poItemId, String requestId, EntityManager em) {
		javax.persistence.Query query = em.createQuery(
				"select SUM(p.quantity)from GrnItemDo p where p.itemId = :poitemid AND p.grnDo.requestId =:requestId");
		query.setParameter("poitemid", poItemId);
		query.setParameter("requestId", requestId);

		BigDecimal sum = (BigDecimal) query.getSingleResult();
		if (sum == null)
			sum = BigDecimal.ZERO;
		return sum;
	}

	private Double getMatchPercentage(String a, String b) {
		//logger.logDebug("[AP][TwoWaymatching] [getMatchPercentage] Started : a=" + a + "     b=" + b);
		if (a == null || b == null) {
			//logger.logDebug("getMatchPercentage a=" + a + "     b=" + b);
			return 0.0d;
		} else {
			a = a.trim();
			b = b.trim();
			int maxLen = a.length() > b.length() ? a.length() : b.length();
			int dist = StringUtils.getLevenshteinDistance(a, b);
			Double percentage = ((maxLen - dist * 1d) / maxLen) * 100;
			/*logger.logDebug(
					"[AP][TwoWaymatching] [getMatchPercentage] a=" + a + "     b=" + b + "      percent=" + percentage);
*/			return percentage;
		}

	}

	private void setDiscrepancy(AccountPayDto request, int invoiceItemIndx, int matchPoIndex,
			int matchPoItemIndex) {
		//logger.logDebug("[AP][TwoWaymatching][setDiscrepancy]");
		// Set Two way match Flag
		InvoiceItemDto invoiceItemUIDto = request.getInvoiceDetailUIDto().getInvoiceItemList().get(invoiceItemIndx);
		PurchaseOrderDto purchaseOrder = request.getPurchaseOrderUIDtoList().get(matchPoIndex);
		PoItemDto poItem = request.getPurchaseOrderUIDtoList().get(matchPoIndex).getPoItemList()
				.get(matchPoItemIndex);

		invoiceItemUIDto.setTwowayMatchingFlag(true);

		// check for discrepancy
		invoiceItemUIDto.setPoMatchingItemNoId(poItem.getPoItem());
		invoiceItemUIDto.setPoMatchingNoId(poItem.getId());
		invoiceItemUIDto.setPoPrice(poItem.getNetPrice());
		invoiceItemUIDto.setPoQuantity(poItem.getQuantity());
		invoiceItemUIDto.setQuantityBaseUom(poItem.getBaseUom());
		invoiceItemUIDto.setPoNumber(purchaseOrder.getPoNumber());
		invoiceItemUIDto.setInvoicePONumber(purchaseOrder.getPoNumber());
		invoiceItemUIDto.setNetWorth(poItem.getNetWorth());
		invoiceItemUIDto.setMaterial(poItem.getMaterialNumber());
		invoiceItemUIDto.setVendorMaterial(poItem.getVendMat());
		invoiceItemUIDto.setInvoiceItemId(poItem.getPoItem());
		invoiceItemUIDto.setPoUpcCode(poItem.getUpsc());
		invoiceItemUIDto.setPoOrderUnit(poItem.getPoOrderUnit());
		invoiceItemUIDto.setMatchingPonumber(poItem.getPoItem());
		invoiceItemUIDto.setFreeItem(poItem.getFreeItem());
		invoiceItemUIDto.setPriceUnit(poItem.getUnitPrice());
		if (!ServicesUtil.isTrue(invoiceItemUIDto.isDeleted())) {
			invoiceItemUIDto.setPartialPosting(true);
		} else {
			invoiceItemUIDto.setPartialPosting(false);
		}
		if (!ServicesUtil.isEmpty(poItem.getAccAssignList())) {
			invoiceItemUIDto.setAccAssignList(poItem.getAccAssignList());
			invoiceItemUIDto.setAccAssignCount(poItem.getAccAssignCount());
		}
		invoiceItemUIDto.setPoHeaderId(purchaseOrder.getId());

		if (!ServicesUtil.isEmpty(request.getGrnUIDtoList())) {
			for (GrnDto grnUIDto : request.getGrnUIDtoList()) {
				for (int i = 0; i < ServicesUtil.nullHandler(grnUIDto.getGrnItemTotalList()); i++) {
					GrnItemTotalDto grnItemTotalUIDto = grnUIDto.getGrnItemTotalList().get(i);
					if (grnItemTotalUIDto.getPoItem().equals(invoiceItemUIDto.getPoMatchingItemNoId())) {
						BigDecimal amountDiffernce = invoiceItemUIDto.getNetPrice()
								.subtract(ServicesUtil.nullHandler(grnItemTotalUIDto.getValgrfor()));
						invoiceItemUIDto.setAmountDifference(amountDiffernce);
					}
				}
			}
		}
	}
}