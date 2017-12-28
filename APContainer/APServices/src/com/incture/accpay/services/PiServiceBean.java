package com.incture.accpay.services;

import java.rmi.RemoteException;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.xml.rpc.ServiceException;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.ReponseDto;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;
import com.incture.accpay.util.PIUtil;
import com.incture.accpay.util.ServicesUtil;

import AccountsPayable.CW.Po_Posting_Request;
import AccountsPayable.CW.Po_Posting_Request_Synch_Out;
import AccountsPayable.CW.Po_Posting_Request_Synch_OutBindingStub;
import AccountsPayable.CW.Po_Posting_Request_Synch_OutServiceLocator;
import AccountsPayable.CW.Po_Posting_Response;
import AccountsPayable.CW.ThreeWay_Matching_RequestItems;
import AccountsPayable.CW.ThreeWay_Matching_Request_Sync_Out;
import AccountsPayable.CW.ThreeWay_Matching_Request_Sync_OutBindingStub;
import AccountsPayable.CW.ThreeWay_Matching_Request_Sync_OutServiceLocator;
import AccountsPayable.CW.ThreeWay_Matching_ResponseITEMS;

/**
 * Session Bean implementation class PersonBean2
 */

@Stateless
@LocalBean
public class PiServiceBean implements PiServiceBeanLocal {

	@EJB
	InvoiceDetailServicesLocal invoiceDetailServices;

	@Override
	public AccountPayDto doThreewayMatch(AccountPayDto dto1) {
		// logger.logDebug("[AP][PIServiceBean] [doThreewayMatch] Started : " +
		// dto1.toString());

		ThreeWay_Matching_RequestItems request[] = PIUtil.setThreewayRequest(dto1);
		// logger.logDebug("[AP][PIServiceBean] [doThreewayMatch] control after
		// threeway match request");

		if (ServicesUtil.isEmpty(request)) {
			return dto1;
		} else {
			ThreeWay_Matching_Request_Sync_OutBindingStub stub;
			try {
				ThreeWay_Matching_Request_Sync_Out po_Details_Request_Sync_Out = new ThreeWay_Matching_Request_Sync_OutServiceLocator()
						.getHTTP_Port();
				stub = (ThreeWay_Matching_Request_Sync_OutBindingStub) po_Details_Request_Sync_Out;
				stub.setUsername("S0017305201");
				stub.setPassword("94@Srey$");
				ThreeWay_Matching_ResponseITEMS[] response = po_Details_Request_Sync_Out
						.threeWay_Matching_Request_Sync_Out(request);
				PIUtil.setResponse(response, dto1);
				// System.out.println(response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// logger.logDebug("[AP][PIServiceBean] [doThreewayMatch] control
			// after threeway match response"
			// + response);
			return dto1;
		}

	}

	@Override
	public ReponseDto postPoInvoices(AccountPayDto accpayDto) {
		// logger.logDebug("[AP][PIServiceBean] [postPoInvoices]" +
		// accpayDto.toString());
		ReponseDto resp = new ReponseDto();
		try {
			InvoiceDetailResponseDTO inDetailResponseDTO = invoiceDetailServices.updateInvoiceDetails(accpayDto);
			if (inDetailResponseDTO.isStatus()) {
				System.err.println("amit" + 44);
				Po_Posting_Request_Synch_OutBindingStub stub;
				Po_Posting_Request_Synch_Out posting_Request_Synch_Out;

				try {
					posting_Request_Synch_Out = new Po_Posting_Request_Synch_OutServiceLocator().getHTTP_Port();
					stub = (Po_Posting_Request_Synch_OutBindingStub) posting_Request_Synch_Out;
					Po_Posting_Request poDataRequest = new Po_Posting_Request();
					System.err.println("amit" + 0);
					poDataRequest = PIUtil.setPOPostingRequest(accpayDto);
					System.err.println("amit" + 1);
					stub.setUsername("S0017305201");
					stub.setPassword("94@Srey$");
					Po_Posting_Response po_Posting_Response = posting_Request_Synch_Out
							.po_Posting_Request_Synch_Out(poDataRequest);
					if (!ServicesUtil.isEmpty(po_Posting_Response.getINVOICEDOCNUMBER())) {
						accpayDto.getInvoiceDetailUIDto()
								.setSapInvoiceNumber(po_Posting_Response.getINVOICEDOCNUMBER());
						resp.setStatus("true");
					} else
						resp.setStatus("false");

					resp.setInvoiceNumber(po_Posting_Response.getINVOICEDOCNUMBER());
					System.err.println(po_Posting_Response.getMESSAGE());
					resp.setMessage(po_Posting_Response.getMESSAGE());
					System.err.println("amit" + 2);
					// resp.setInvoiceDate(po_Posting_Response.);

				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (Exception e) {
			resp.setStatus("false");
			resp.setMessage("Error in submitting task");
			// logger.logError("[AP][PIServiceBean] [postPoInvoices] Error :
			// "+e.toString());
		}
		return resp;
	}

}
