package com.training.iface;

import java.util.HashMap;

public class HindiTranslate implements TranslatorService {
	private HashMap<String,String> dictionary;
	/**
	 * 
	 */
	public HindiTranslate() {
		super();
		dictionary = new HashMap<String,String>();
		dictionary.put("Banana", "Kela");
		dictionary.put("Rice", "Chawal");
		dictionary.put("Ten", "Dus");
		
	}

	@Override
	public String englishtoHindi(String engWord) {
	
		return dictionary.get(engWord);
	}

}
