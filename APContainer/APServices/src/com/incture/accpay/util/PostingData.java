package com.incture.accpay.util;

import java.math.BigDecimal;

public class PostingData {

	private BigDecimal gramount;
	private int count;
	private int MaterialCount;
	
	
	public int getMaterialCount() {
		return MaterialCount;
	}
	public void setMaterialCount(int materialCount) {
		MaterialCount = materialCount;
	}
	PostingData()
	{
		this.gramount = BigDecimal.ZERO;
	}
	public BigDecimal getGramount() {
		return gramount;
	}
	public void setGramount(BigDecimal gramount) {
		this.gramount = gramount;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
