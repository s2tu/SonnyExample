package com.training;

import org.apache.log4j.Logger;

public class CurrencyConverter {
	
	//Logger log =  Logger.getRootLogger();
	Logger log = Logger.getLogger("com3");
	/**
	 * @param log
	 */
	public CurrencyConverter() {
		super();
	
		log.info("Constructor is called");
	}

	public double usdToINR(double usd){
			double amt = Math.abs(usd);
			log.info("Constructor is called");
			return 60*amt;
			
	}
	public double dollarToRupees(double dlrAmt){
		if(dlrAmt < 0){
			log.warn("Convering "+ dlrAmt + " in to absolute value.");
		}
		double inrAmt = dlrAmt*45.0d;
		log.info("InrAmount:"+inrAmt);
		return inrAmt;
	}


	
}
