package main.com.incture.accpay.contollers;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.ReponseDto;
import com.incture.accpay.services.PiServiceBeanLocal;

@Path("/services")
public class PIRestServices {
	@EJB
	PiServiceBeanLocal  piServiceBean;
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/threewaymatch")
	public AccountPayDto savePOGRNdataFromPI(AccountPayDto accountPayDto) {
		return piServiceBean.doThreewayMatch(accountPayDto);
	}
	
	@Path("/poposting")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ReponseDto poPosting(AccountPayDto dto)
	{
		System.err.println("inside rest");
		return piServiceBean.postPoInvoices(dto);
	}

}
