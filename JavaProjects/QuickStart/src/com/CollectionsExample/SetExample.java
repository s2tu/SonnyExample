package com.CollectionsExample;

import java.util.TreeSet;

public class SetExample {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    TreeSet<CreditCard> cardList = new TreeSet<CreditCard>();
    cardList.add(new CreditCard(101, "Ramesh", 10000, 0));
    cardList.add(new CreditCard(102, "Aamesh", 10000, 0));
    System.out.println(cardList);
  }

}
