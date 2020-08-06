package com.lti.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")

public class HelloResource {
	
	/*@GET
	public String hello() {
		return "hello from jax-rs"
	}*/
	
	/*@GET
	public String hello(@QueryParam("name") String name) {
	return "Hello " + name +". Welcome to JAX-RS";
}*/
	/*@Path("/{name}")
	@GET
	public String hello(@PathParam("name") String name) {
		return "hello " + name +". Welcome to JAX-RS";
	}*/
	
	//http://localhost:8181/RESTApp/api/hello;name=vranda
	@GET
	public String hello(@MatrixParam("name") String name) {
		return "hello " + name +". Welcome to JAX-RS";
	}

}
