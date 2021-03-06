package com.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class QuickStart {
	static Logger logger = Logger.getLogger("example");
	//static Logger root = Logger.getRootLogger();
	
	public static void main(String args[]){
		logger.setAdditivity(false);  //the child logger not gonna be extended to parent one
		BasicConfigurator.configure();
		PatternLayout layout = new PatternLayout("%d [%t] %-5p %c %x - %m %n");
		logger.addAppender(new ConsoleAppender(layout));
		try{
			logger.info("Inside Try Block");  //this will print in parent 
		}catch(Exception e){
			logger.warn("Exception Message");
		}
		
	}
	
}
