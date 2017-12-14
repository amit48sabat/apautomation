package main.com.incture.accpay.contollers;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.incture.accpay.dto.InvoiceDetailDto;
import com.incture.accpay.response.dto.InvoiceDetailResponseDTO;
import com.incture.accpay.services.InvoiceDetailServicesLocal;

@Path("/Invoice")
public class InvoiceDetailsRest {

	@EJB
	InvoiceDetailServicesLocal invoiceDetailServicesLocal;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public InvoiceDetailResponseDTO getAllPersons() {
		return invoiceDetailServicesLocal.getAllInvoiceData();

	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public InvoiceDetailResponseDTO savePerson(InvoiceDetailDto invoiceDetailDto) {
		return invoiceDetailServicesLocal.saveInvoiceDetails(invoiceDetailDto);
	}

}
