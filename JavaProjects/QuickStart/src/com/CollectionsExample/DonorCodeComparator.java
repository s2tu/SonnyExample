package com.CollectionsExample;

import java.util.Comparator;

public class DonorCodeComparator implements Comparator<Donor> {

  @Override
  public int compare(Donor o1, Donor o2) {
    if(o1.getDonorCode() > o1.getDonorCode())return 1;
    if(o1.getDonorCode() < o1.getDonorCode())return -1;
    // TODO Auto-generated method stub
    return 0;
  }

}
