package com.nitish.resources;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

@Component
@Path("/")
public class HelloResource {
	
	@GET
	@Path("sayHello/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello(@PathParam("name") String name){
		System.out.println("It came here with name "+name);
		return "{\"Message\":\"Hello "+name+"\"}";
	}
	
	

}
