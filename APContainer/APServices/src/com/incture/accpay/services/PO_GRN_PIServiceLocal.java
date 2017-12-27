package com.incture.accpay.services;

import javax.ejb.Local;

import com.incture.accpay.dto.ReponseDto;

@Local
public interface PO_GRN_PIServiceLocal {


	ReponseDto getPoDetailsBpm(String requestId, String vendorId);


}
