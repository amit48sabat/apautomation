package main.com.incture.accpay.contollers;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.incture.accpay.entities.Person;
import com.incture.accpay.services.PersonBean2Local;

@Path("/person")
public class PersonRest {

	@EJB
	private PersonBean2Local local;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllPersons() {
		return local.getAllPersons();

	}

}
