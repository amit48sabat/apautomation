package com.incture.accpay.services;

import javax.ejb.Local;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.ReponseDto;

@Local
public interface PiServiceBeanLocal {

	AccountPayDto doThreewayMatch(AccountPayDto dto);

	ReponseDto postPoInvoices(AccountPayDto dto);


}
