package com.training;

import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class SecondHop {
	public static void main(String args[]){
		
		try{
			Repository repository = new TransientRepository();
			Session session = repository.login(new SimpleCredentials("admin", "admin".toCharArray()));
			Node rootNode = session.getRootNode();
			Node firstChild = rootNode.addNode("simpleContent");
			firstChild.setProperty("Sep2016", "Configuring Jack Rabbit");
			session.save();
			System.out.println("Waiting to read");
			Thread.sleep(1000);
			Node foundNode = rootNode.getNode("simpleContent");
			System.out.println((foundNode.getProperty("Sep2016")).getString());
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
