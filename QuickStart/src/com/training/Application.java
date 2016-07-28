package com.training;
/**
 * 
 * @author stu1
 *
 */
public class Application {
  /**
   * 	
   * @param args
   */
  public static void main(String[] args) {
    Greeting grtObject = new Greeting();
    System.out.println(grtObject.getMessage());
    Class clsLoader = grtObject.getClass().getClassLoader().getClass();
    System.out.println("My Class loader" + clsLoader);
    String s = new String("Hello");
    Class clsLoader2 = s.getClass().getClassLoader().getClass();
    System.out.println("My Class loader" + clsLoader2);    
  }

}
