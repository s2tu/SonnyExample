package com.training;

import java.io.File;
import java.io.FileInputStream;

import javax.jcr.ImportUUIDBehavior;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.Property;
import javax.jcr.PropertyIterator;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.Value;

import org.apache.jackrabbit.core.TransientRepository;


public class ThirdHop {
	
	public static void printValues(Node node){
			PropertyIterator properties;
			try {
			  properties = node.getProperties();
			  while(properties.hasNext()) {
			      
			      Property prop = properties.nextProperty();
			      
			      if(!prop.getDefinition().isMultiple()) {
			        System.out.println(prop.getPath() + ":" + prop.getString());
			      } else {
			        Value[] values = prop.getValues();
			        for(int i = 0; i < values.length; i++) {
			          System.out.println(prop.getPath() + " = " + values[i].getString());
			        }
			      }
			      
			    }
			    
			    NodeIterator nodes = node.getNodes();
			    while(nodes.hasNext()) {
			      printValues(nodes.nextNode());
			    } 				
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    
			  
		
	}

	public static void main(String args[]){
		try{
			Repository repository = new TransientRepository();
			Session session = repository.login(new SimpleCredentials("admin", "admin".toCharArray()));
			Node rootNode = session.getRootNode();
			FileInputStream xmlContent = new FileInputStream(new File("bean.xml"));
			Node springBean= rootNode.addNode("beanNode");
			session.importXML(springBean.getPath(), xmlContent, ImportUUIDBehavior.IMPORT_UUID_CREATE_NEW);
			session.save();
			System.out.println("File Saved");
			printValues(rootNode);
			/*
			Node childNode = rootNode.getNode("beanNode");
			
			if(childNode.hasProperties()){
				PropertyIterator itr = childNode.getProperties();
				while(itr.hasNext()){
					Property prop = itr.nextProperty();
					
					if(!prop.isMultiple()){
						System.out.println("Single");
						System.out.println(prop.getValue().getString());
					}else{
						System.out.println("Multiple");
						for(Value val:prop.getValues()){
							System.out.println(val.getString());
						}
					}
				}
				
				
			}*/
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
