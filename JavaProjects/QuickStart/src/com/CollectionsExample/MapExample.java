package com.CollectionsExample;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
  public static void main(String[] args){
    Hashtable<String, CreditCard> hashtableCredit = new Hashtable<String, CreditCard>();
    
    hashtableCredit.put("A101", new CreditCard(101, "Ramesh", 10000, 0));
    Object obj = hashtableCredit.put("A103", new CreditCard(101, "Ramesh", 10000, 0));
   // System.out.println(obj);
    hashtableCredit.put("A102", new CreditCard(102, "Sonny", 10000, 0));
   // System.out.println(hashtableCredit.get("A101"));
    Set<Entry<String, CreditCard>> set = hashtableCredit.entrySet();
    for ( Entry<String, CreditCard> aSet:set){
      System.out.println(aSet.getKey());
      System.out.println(aSet.getValue());
    }
  }
}
