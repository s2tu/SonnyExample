package com.CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DonorImpl implements IDonor {

  private List<Donor> donarList;
  public DonorImpl(List<Donor> donarList){
    super();
    this.donarList = donarList;
  }
  public  DonorImpl() {
    // TODO Auto-generated constructor stub
    donarList = new ArrayList<Donor>();
  }
  
  @Override
  public boolean addDonor(Donor obj) {
    boolean result = false;
    result = donarList.add(obj);
    // TODO Auto-generated method stub
    return result;
  }

  @Override
  public boolean[] addDonors(Donor... dnrList) {
    int size = dnrList.length;
    boolean result[] = new boolean[size];
    // TODO Auto-generated method stub
    int i = 0;
    for(Donor d : dnrList){
      result[i] = donarList.add(d);
      i++;     
    }
    return result;
  }

  @Override
  public void printDonorList() {
    // TODO Auto-generated method stub
    for(Donor d : this.donarList){
      System.out.println(d);
    }    
  }

  @Override
  public List<Donor> getDonorList() {
    // TODO Auto-generated method stub
    return donarList;
  }
  public void printOrder(Comparator<Donor> compare ){
    Collections.sort(this.donarList, compare);
   System.out.println(this.donarList);
  }
}
