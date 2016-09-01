package com.training.resources;

import java.util.HashMap;


import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import com.owlike.genson.Genson;
//http://localhost:4040/RestWebService/rest/simple
@Path("/simple")
public class SimpleResource {
	
	HashMap<Integer, String> map ;
	public void init() {
		map = new HashMap<Integer,String>();
		map.put(1, "Sonnysss");
		map.put(2, "Sonny5sdsd");
		map.put(3, "Sonny6sdsd");
	}
	
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage(){
		return "hello world";
	}
	
	@Path("/inv")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getInfo(){
		Invoice inv = new Invoice(101, "Ramesh", 4500);
		Genson serializer = new Genson();
		String resp = serializer.serialize(inv);
		return resp;
	}	
	//http://localhost:4040/RestWebService/rest/simple/find/1
	@Path("/find/{userId}")
	@GET
	public String findUser(@PathParam("userId") int id){
		init();
		System.out.println(id);
		System.out.println(map.toString());
		return map.get(id);
	}
	//http://localhost:4040/RestWebService/rest/simple/delete?userId=1
	@Path("/delete/{userId}")
	@GET
	public String deleteUser(@PathParam("userId") int id){
		init();
		System.out.println(id);
		System.out.println(map.toString());
		return map.remove(id);
	}	
	
	@Path("/add")
	@POST
	public String addUser (@FormParam("userId") int id, @FormParam("name") String name){
		init();
		map.put(id, name);
		return map.toString();
	}
}
