/*
 * package com.incture.accpay.dao;
 * 
 * import java.math.RoundingMode;
 * 
 * import javax.persistence.EntityManager;
 * 
 * import com.incture.accpay.dto.InvoiceHistoryDto; import
 * com.incture.accpay.entities.InvoiceHistoryDo; import
 * com.incture.accpay.exception.ExecutionFault; import
 * com.incture.accpay.exception.InvalidInputFault; import
 * com.incture.accpay.exception.NoResultFault; import
 * com.incture.accpay.util.ServicesUtil;
 * 
 * public class InvoiceHistoryDao extends BaseDao<InvoiceHistoryDo,
 * InvoiceHistoryDto> {
 * 
 * public InvoiceHistoryDao(EntityManager entityManager) { super(entityManager);
 * }
 * 
 * @Override protected InvoiceHistoryDo importDto(InvoiceHistoryDto inputDto)
 * throws ExecutionFault, NoResultFault, InvalidInputFault { InvoiceHistoryDo
 * outputDo = new InvoiceHistoryDo();
 * 
 * outputDo.setVendorName(inputDto.getVendorName());
 * outputDo.setCompanyCode(inputDto.getCompanyCode());
 * outputDo.setCurrency(inputDto.getCurrency());
 * outputDo.setDeliveryDate(inputDto.getDeliveryDate());
 * outputDo.setTotalDiscount(inputDto.getTotalDiscount());
 * outputDo.setHeaderPatternMatchingFlag(inputDto
 * .getHeaderPatternMatchingFlag()); outputDo.setId(inputDto.getId());
 * outputDo.setInvoiceNumber(inputDto.getInvoiceNumber());
 * outputDo.setPostingDate(inputDto.getPostingDate());
 * outputDo.setInvoiceDate(inputDto.getInvoiceDate()); outputDo
 * .setPurchaseOrderReference(inputDto.getPurchaseOrderReference());
 * outputDo.setRequestId(inputDto.getRequestId());
 * outputDo.setRoute(inputDto.getRoute());
 * outputDo.setSubTotal(inputDto.getSubTotal());
 * outputDo.setTaxIndicator(inputDto.getTaxIndicator());
 * outputDo.setTotal((ServicesUtil.nullHandler(inputDto.getTotal()))
 * .setScale(2, RoundingMode.HALF_UP));
 * outputDo.setTotalInvoiceAmount((ServicesUtil.nullHandler(inputDto
 * .getTotalInvoiceAmount())).setScale(2, RoundingMode.HALF_UP));
 * outputDo.setVendorId(inputDto.getVendorId());
 * outputDo.setPaymentBlock(inputDto.getPaymentBlock());
 * outputDo.setPaymentMethod(inputDto.getPaymentMethod());
 * outputDo.setPaymentTerms(inputDto.getPaymentTerms());
 * outputDo.setFreight(inputDto.getFreight());
 * outputDo.setStorage(inputDto.getStorage());
 * outputDo.setSurcharge(inputDto.getSurcharge());
 * outputDo.setFee_percentage(inputDto.getFee_percentage());
 * outputDo.setFreight_percentage(inputDto.getFreight_percentage());
 * outputDo.setImportFees(inputDto.getFee_percentage());
 * outputDo.setAbbyNetPrice(inputDto.getAbbyNetPrice());
 * outputDo.setGrossPrice(inputDto.getGrossPrice());
 * outputDo.setBalanceAmount(inputDto.getBalanceAmount());
 * outputDo.setDeleted(inputDto.isDeleted());
 * outputDo.setUserCreated(inputDto.getUserCreated());
 * outputDo.setUserUpdated(inputDto.getUserUpdated());
 * outputDo.setDateCreated(inputDto.getDateCreated());
 * outputDo.setDateUpdated(inputDto.getDateUpdated());
 * 
 * return outputDo; }
 * 
 * @Override public InvoiceHistoryDto exportDto(InvoiceHistoryDo inputDo) {
 * InvoiceHistoryDto outputDto = new InvoiceHistoryDto();
 * 
 * outputDto.setVendorName(inputDo.getVendorName());
 * outputDto.setCompanyCode(inputDo.getCompanyCode());
 * outputDto.setCurrency(inputDo.getCurrency());
 * outputDto.setDeliveryDate(inputDo.getDeliveryDate());
 * outputDto.setTotalDiscount(inputDo.getTotalDiscount());
 * outputDto.setInvoiceDate(inputDo.getInvoiceDate());
 * outputDto.setHeaderPatternMatchingFlag(inputDo
 * .getHeaderPatternMatchingFlag()); if
 * (!ServicesUtil.SPECIAL_CHAR.equals(inputDo.getId())) {
 * outputDto.setId(inputDo.getId()); }
 * outputDto.setInvoiceNumber(inputDo.getInvoiceNumber());
 * outputDto.setPostingDate(inputDo.getPostingDate()); outputDto
 * .setPurchaseOrderReference(inputDo.getPurchaseOrderReference());
 * outputDto.setRequestId(inputDo.getRequestId());
 * outputDto.setRoute(inputDo.getRoute());
 * outputDto.setVendorId(inputDo.getVendorId());
 * outputDto.setSubTotal(inputDo.getSubTotal());
 * outputDto.setTaxIndicator(inputDo.getTaxIndicator());
 * outputDto.setTotal((ServicesUtil.nullHandler(inputDo.getTotal()))
 * .setScale(2, RoundingMode.HALF_UP));
 * outputDto.setTotalInvoiceAmount((ServicesUtil.nullHandler(inputDo
 * .getTotalInvoiceAmount())).setScale(2, RoundingMode.HALF_UP));
 * outputDto.setPaymentBlock(inputDo.getPaymentBlock());
 * outputDto.setPaymentMethod(inputDo.getPaymentMethod());
 * outputDto.setPaymentTerms(inputDo.getPaymentTerms());
 * outputDto.setFreight(inputDo.getFreight());
 * outputDto.setStorage(inputDo.getStorage());
 * outputDto.setSurcharge(inputDo.getSurcharge());
 * outputDto.setFee_percentage(inputDo.getFee_percentage());
 * outputDto.setFreight_percentage(inputDo.getFreight_percentage());
 * outputDto.setImportFees(inputDo.getFee_percentage());
 * outputDto.setAbbyNetPrice(inputDo.getAbbyNetPrice());
 * outputDto.setGrossPrice(inputDo.getGrossPrice());
 * outputDto.setBalanceAmount(inputDo.getBalanceAmount());
 * outputDto.setDeleted(inputDo.isDeleted());
 * outputDto.setUserCreated(inputDo.getUserCreated());
 * outputDto.setUserUpdated(inputDo.getUserUpdated());
 * outputDto.setDateCreated(inputDo.getDateCreated());
 * outputDto.setDateUpdated(inputDo.getDateUpdated());
 * 
 * return outputDto; }
 * 
 * }
 */