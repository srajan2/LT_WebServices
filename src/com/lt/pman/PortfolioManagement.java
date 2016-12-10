package com.lt.pman;
 
/**
 * @author Crunchify.com
 */
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/pman")
public class PortfolioManagement {
	@GET
	@Produces("application/xml")
	public String getPortfoliosF() {
		//instansiate a new Facade that will call the business logic, DAO and other POJOs
		//return the DTO returned by the facade
		//The DTO will be converted into XML by JAXB on the fly so it can be sent over the network to client
		return "<userPortFolio>" + "details obtained from Facade" + "</userPortFolio>";
	}

}