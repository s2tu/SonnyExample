package com.CollectionsExample;

import java.util.Comparator;

public class NameComparator implements Comparator<Donor>{

  @Override
  public int compare(Donor o1, Donor o2) {
    // TODO Auto-generated method stub
    return o1.getDonorName().compareTo(o2.getDonorName());
  }

}
