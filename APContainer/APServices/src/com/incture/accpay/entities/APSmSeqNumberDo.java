package com.incture.accpay.entities;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Comments: Sequence Number Generation,
*/
@Entity
@Table(name="AP_SEQ_NUM")
public class APSmSeqNumberDo implements BaseDo, Serializable {
	public static final long serialVersionUID = 558142837969712138L;

	@Id
	@Column(name="REF_COD", length=255)
	private String referenceCode;

	@Column(name="RUN_NUM")
	private Integer runningNumber;

	@Override
	public Object getPrimaryKey() {
		return referenceCode;
	}

	 public APSmSeqNumberDo(String referenceCode,int runningNumber){
			super();
			this.referenceCode = referenceCode;
			this.runningNumber = runningNumber;
	    }
	public APSmSeqNumberDo() {
		super();
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public Integer getRunningNumber() {
		return runningNumber;
	}

	public void setRunningNumber(Integer runningNumber) {
		this.runningNumber = runningNumber;
	}

	public Boolean getValidForUsage() {
		return Boolean.TRUE;
	}
}