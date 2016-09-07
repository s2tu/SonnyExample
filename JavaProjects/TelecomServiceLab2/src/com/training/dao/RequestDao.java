package com.training.dao;

import java.util.HashMap;

import com.training.domains.Request;
import com.training.interfaces.DaoInterface;

public class RequestDao implements DaoInterface<Request>{
	
	HashMap<Integer, Request> requestDatabase;
	
	public void init(){
		requestDatabase.put(1, new Request("New Service", 1, "This is new service", 1));
		requestDatabase.put(2, new Request("New Service1", 2, "This is new service", 2));
		requestDatabase.put(3, new Request("New Service2", 3, "This is new service", 3));
		requestDatabase.put(4, new Request("New Service3", 4, "This is new service", 4));
		requestDatabase.put(5, new Request("New Service4", 5, "This is new service", 5));
		
		
	}
	public RequestDao(){
		super();
		requestDatabase = new HashMap<Integer, Request>();
	}
	
	@Override
	public void add(Request obj) {
		requestDatabase.put(obj.getRequestID(), obj);
	}

	@Override
	public Request get(int id) {
		// TODO Auto-generated method stub
		return requestDatabase.get(id);
	}

}
