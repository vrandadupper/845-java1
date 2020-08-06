package com.lti.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.lti.dao.ProductDao;
import com.lti.entity.Product;

@Path("/product")
public class ProductResource {
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Product get(@PathParam("id") int id) {
		ProductDao dao=new ProductDao();
		return dao.select(id);
	}

	@Path("/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getAll() {
		ProductDao dao=new ProductDao();
		return dao.selectAll();
	}
	
	@Path("/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN) //can be json too
	//whatever json client will get stored,we will dynamically receive it as Product object
	public String post(Product product) {
		ProductDao dao=new ProductDao();
		dao.insert(product);
		return "Product added succesfully!";//actually we should reply in json format again,this is not good
		
		
	}

}
