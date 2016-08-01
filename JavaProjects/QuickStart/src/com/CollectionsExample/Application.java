package com.CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

  public static void main(String[] args) {
   DonorImpl donorManager1 = new DonorImpl();
 
   Donor sonny = new Donor(0, "d", 1, "tusonny@asd;laskd.com");
   Donor sonny2 = new Donor(1, "b", 3, "tusonny@asd;laskd.com2");
   Donor sonny3 = new Donor(2, "a", 2, "tusonny@asd;laskd.com3");
   Donor sonny4 = new Donor(3, "c", 5, "tusonny@asd;laskd.com4");
   
   donorManager1.addDonor(sonny);
   System.out.println("Printing donorManager 1:");
   donorManager1.printDonorList();
  
   donorManager1.addDonors(sonny2, sonny3, sonny4);
   System.out.println("Printing donorManager 1:");
   donorManager1.printDonorList();
   
   List<Donor> newlist = donorManager1.getDonorList();
   DonorImpl donorManager2 = new DonorImpl(newlist);
   System.out.println("Printing donorManager 2:");
   donorManager2.printDonorList();
   
   
   List<String> nameList = new ArrayList<String>();
   nameList.add(new String("Zahir0"));
   nameList.add(new String("Aahir1"));
   nameList.add(new String("Yahir2"));
   nameList.add(new String("Bahir3"));
   
  // Collections.sort(nameList);
   //System.out.println(nameList);
  // Collections.sort(newlist);
   //System.out.println(newlist);
   
   DonorCodeComparator test = new DonorCodeComparator();
   NameComparator test2 = new NameComparator();
   
  
   donorManager2.printOrder(test);
   donorManager1.printOrder(test2); 
 
  }

}
