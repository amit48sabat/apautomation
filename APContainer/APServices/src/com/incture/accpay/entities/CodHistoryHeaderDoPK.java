package com.incture.accpay.entities;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

/**
 * ID class for entity: CodHistoryHeaderDo
 * 
 */
@TableGenerator(name = "APACodHistHeadNo", table = "APA_SEQ_NUM", allocationSize = 1, initialValue = 0, pkColumnName = "GEN_KEY", valueColumnName = "GEN_VALUE", pkColumnValue = "APACodHistHeadNo")
@Embeddable
public class CodHistoryHeaderDoPK implements Serializable {

	@Column(name = "BASECODER_EMAIL", length = 50)
	private String basecoderEmail;

	@Column(name = "VENDOR_ID", length = 10)
	private String vendorId;

	@GeneratedValue(strategy = GenerationType.TABLE, generator = "APASequenceNumber")
	@Column(name = "TEMPLATE_NO", length = 25)
	private String templateNo;
	
	private static final long serialVersionUID = 1L;

	public CodHistoryHeaderDoPK() {
	}

	public String getBasecoderEmail() {
		return this.basecoderEmail;
	}

	public void setBasecoderEmail(String basecoderEmail) {
		this.basecoderEmail = basecoderEmail;
	}

	public String getVendorId() {
		return this.vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getTemplateNo() {
		return this.templateNo;
	}

	public void setTemplateNo(String templateNo) {
		this.templateNo = templateNo;
	}

	/*
	 * @see java.lang.Object#equals(Object)
	 */
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (!(o instanceof CodHistoryHeaderDoPK)) {
			return false;
		}
		CodHistoryHeaderDoPK other = (CodHistoryHeaderDoPK) o;
		return true
				&& (getBasecoderEmail() == null ? other.getBasecoderEmail() == null
						: getBasecoderEmail().equals(other.getBasecoderEmail()))
				&& (getVendorId() == null ? other.getVendorId() == null
						: getVendorId().equals(other.getVendorId()))
				&& (getTemplateNo() == null ? other.getTemplateNo() == null
						: getTemplateNo().equals(other.getTemplateNo()));
	}

	/*
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (getBasecoderEmail() == null ? 0 : getBasecoderEmail().hashCode());
		result = prime * result + (getVendorId() == null ? 0 : getVendorId().hashCode());
		result = prime * result + (getTemplateNo() == null ? 0 : getTemplateNo().hashCode());
		return result;
	}

}
