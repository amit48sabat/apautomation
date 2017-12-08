package com.incture.accpay.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SequenceNumber
 *
 */
@TableGenerator(name = "APASequenceNumber", table = "APA_SEQ_NUM", allocationSize = 1, initialValue = 0, pkColumnName = "GEN_KEY", valueColumnName = "GEN_VALUE", pkColumnValue = "APASerialId")
@Entity
@Table(name="APA_SEQ")
public class SequenceNumber implements BaseDo, Serializable {

	
	private static final long serialVersionUID = 1L;

	public SequenceNumber() {
		super();
	}
	
	
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "APASequenceNumber")
	@Id
	@Column(name="APA_SERIALID")
	private Integer APASerialId;

	
	public Integer getAPASerialId() {
		return APASerialId;
	}


	public void setAPASerialId(Integer aPASerialId) {
		APASerialId = aPASerialId;
	}


	@Override
	public Object getPrimaryKey() {
		// TODO Auto-generated method stub
		return null;
	}
   
}
