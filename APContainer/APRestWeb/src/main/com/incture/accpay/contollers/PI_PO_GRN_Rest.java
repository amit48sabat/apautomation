package main.com.incture.accpay.contollers;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.incture.accpay.dto.AccountPayDto;
import com.incture.accpay.dto.ReponseDto;
import com.incture.accpay.services.PO_GRN_PIServiceLocal;

@Path("/pi")
public class PI_PO_GRN_Rest {
	@EJB
	PO_GRN_PIServiceLocal po_GRN_PIServiceLocal;
	private static final Logger LOGGER = LoggerFactory.getLogger(PI_PO_GRN_Rest.class);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/pogrn/{requestId}")
	public ReponseDto savePOGRNdataFromPI(@PathParam("requestId") String requestId) {
		return po_GRN_PIServiceLocal.getPoDetailsBpm(requestId, null);
	}
	

}
