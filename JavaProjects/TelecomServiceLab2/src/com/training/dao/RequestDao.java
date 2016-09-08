package com.training.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;

import com.training.domains.Request;
import com.training.interfaces.DaoInterface;

public class RequestDao implements DaoInterface<Request>{
	
	
	private HashMap<Integer, Request> requestDatabase;
	

	/**
	 * @return the requestDatabase
	 */
	public HashMap<Integer, Request> getRequestDatabase() {
		return requestDatabase;
	}

	/**
	 * @param requestDatabase the requestDatabase to set
	 */
	public void setRequestDatabase(HashMap<Integer, Request> requestDatabase) {
		this.requestDatabase = requestDatabase;
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
	
	public List<Request> getAll(){
		
		List<Request> requestList = new ArrayList<Request>();
		for(Entry<Integer, Request> req:requestDatabase.entrySet()){
			requestList.add(req.getValue());
		}
		return requestList;
	}

}
