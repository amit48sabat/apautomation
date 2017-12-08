package com.incture.accpay.dto;

import com.incture.accpay.exception.InvalidInputFault;
import com.incture.accpay.util.EnOperation;

public class SequenceNumberDto extends BaseDto {
	private int APASerialId;

	public int getAPASerialId() {
		return APASerialId;
	}

	public void setAPASerialId(int aPASerialId) {
		APASerialId = aPASerialId;
	}

	@Override
	public Boolean getValidForUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(EnOperation enOperation) throws InvalidInputFault {
		// TODO Auto-generated method stub

	}

}
