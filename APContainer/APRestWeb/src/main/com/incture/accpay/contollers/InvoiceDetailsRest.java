package main.com.incture.accpay.contollers;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.response.dto.AccPayResponseDTO;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;
import com.incture.accpay.services.InvoiceDetailServicesLocal;

@Path("/invoices")
public class InvoiceDetailsRest {

	@EJB
	InvoiceDetailServicesLocal invoiceDetailServicesLocal;
	private static final Logger LOGGER = LoggerFactory.getLogger(InvoiceDetailsRest.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public InvoiceDetailResponseDTO getAllInvoiceData() {
		return invoiceDetailServicesLocal.getAllInvoiceData();

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{requestId}")
	public AccPayResponseDTO getAllInvoiceData(@PathParam("requestId") String requestId) {
		return invoiceDetailServicesLocal.getInvoiceDetailsByRequestId(requestId);

	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public InvoiceDetailResponseDTO saveInvoiceDetails(InvoiceDetailDto invoiceDetailDto) {
		return invoiceDetailServicesLocal.saveInvoiceDetails(invoiceDetailDto);
	}

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public InvoiceDetailResponseDTO updateInvoiceDetails(AccountPayDto accountPayDto) {
		return invoiceDetailServicesLocal.updateInvoiceDetails(accountPayDto);
	}

}
