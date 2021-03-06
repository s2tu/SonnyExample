package com.training.lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * 
 * @author stu1
 *This class is used to manage the inputs for the user.
 */
public class InputSystem {

  private Donor customer; 
  private Scanner inputscanner;
  private WebPortal portal;
  private String input;
  private boolean teminate;
  private Printer printer;

  /**
   * 
   * @param portal for the input system to manage donations/projects/products.
   */
  public InputSystem(WebPortal portal){
    this.inputscanner = new Scanner(System.in);
    this.portal  = portal;
    this.teminate = false;
    this.printer = new Printer();
  }
  /**
   * Registration page for user to create a donor.
   */
  private void createCustomer(){
    this.printer.printTitle("Registration");
    String donorName;
    String donorEmail;
    System.out.println("Enter your Name:");
    this.input = this.inputscanner.next();
    donorName  = this.input ;
    System.out.println("Enter your Email:");
    this.input  = this.inputscanner.next();
    donorEmail = this.input ;
    customer = new Donor(donorName, donorEmail);			
    System.out.println("Congratulations you have registered.");
  }
  /**
   * 
   * @param list of inputs available for the user.
   * @return  boolean indicated if there is a invalid input.
   */
  public boolean checkInputViolations(List<Integer> list){
    this.input = this.inputscanner.next();

    try{
      for(int i:list){
        int numbericInput = Integer.parseInt(input);
        if(i == numbericInput){
          return false;
        }
      }
      throw new InvalidInputException();
    }catch(Exception e){
      System.out.println(e.getMessage());
      return true;
    }			
  }
  /**
   * Initial screen to allow the user to register or view information regarding the portal
   */
  public void RegisterScreen(){
    this.printer.printTitle("Welcome to "+ this.portal.getName() );	
    System.out.println("For more about us enter press 1");
    System.out.println("If you would like to register press 2");
    if(!this.checkInputViolations(Arrays.asList(1,2))){
      int numbericInput = Integer.parseInt(this.input);
      switch(numbericInput){
      case 1:
        System.out.println(portal.getDescription());
        RegisterScreen();
        break;
      case 2:
        createCustomer();
        break;

      }			
    }else{
      RegisterScreen();
    }

  }

  /**
   * Allows user to make a donation to a specific product or to a general project 
   */
  public void makeDonation(){
    int projectID;
    int productID;
    double donationAmount;
    this.printer.printTitle("Making Donations");
    System.out.println("Would you like to donate to a specific product? 1 = yes / 2 = no");
    if (!this.checkInputViolations(Arrays.asList(1,2))){
      int numbericInput = Integer.parseInt(this.input);
      if(numbericInput == 1){			
        System.out.println("What is the project ID?");
        this.input = this.inputscanner.next();
        projectID = Integer.parseInt(this.input);
        System.out.println("What is the product ID?");
        this.input = this.inputscanner.next();
        productID = Integer.parseInt(this.input);
        System.out.println("What is the donation amount?");
        this.input = this.inputscanner.next();
        donationAmount = Double.parseDouble(this.input);
        this.customer.makeDontation(donationAmount, projectID, productID, this.portal);
        System.out.println("Donation Complete.  Thank you for your contribution.");
      }else{
        System.out.println("Would you like to donate to a project? 1 = yes / 2 = no");
        if (!this.checkInputViolations(Arrays.asList(1,2))){
          numbericInput = Integer.parseInt(this.input);
          if(numbericInput == 1){
            System.out.println("What is the project ID?");
            this.input = this.inputscanner.next();
            projectID = Integer.parseInt(this.input);
            System.out.println("What is the donation amount?");
            this.input = this.inputscanner.next();							
            donationAmount = Double.parseDouble(this.input);
            this.customer.makeDontation(donationAmount, projectID, this.portal);
            System.out.println("Donation Complete.  Thank you for your contribution.");
          }else{
            mainMenu();
          }
        }else{
          mainMenu();
        }

      }

    }else{
      makeDonation();
    }

    mainMenu();
  }

  /**
   * Displays the options for the user to make donations, view donations details and view project/product details 
   */
  public void mainMenu(){
    this.printer.printTitle("Main Menu");
    System.out.println("To make an donation press 1");
    System.out.println("To view donations press  2");
    System.out.println("To view Projects press 3");	
    System.out.println("To exit press 4");
    if (!this.checkInputViolations(Arrays.asList(1,2,3,4))){
      int numbericInput = Integer.parseInt(this.input);
      switch(numbericInput){
      case 1:
        //donor makes donation 
        this.makeDonation();
        break;
      case 2:
        viewDonations();
        break;
      case 3:
        this.viewprojectScreen();
        break;
      case 4:
        System.out.println("System now turning off.  Thank you for using our service.");
        this.teminate = true;
        break;
      }		
    }else{
      this.mainMenu();
    }

  }
  /**
   * Page for user to view donation details for project/product
   */
  public void viewDonations(){
    int projectID;
    int productID;
    this.printer.printTitle("View Project/Product Donation Details");
    System.out.println("To view all donations press 1");
    System.out.println("To view donations for a particuar project press 2");
    System.out.println("To view donations for a particuar product press 3");
    System.out.println("To your donations press 4");		
    System.out.println("To go back to main menu press 5");
    if (!this.checkInputViolations(Arrays.asList(1,2,3,4,5))){
      int numbericInput = Integer.parseInt(this.input);
      switch(numbericInput){
      case 1:
        portal.printAllProjectProductDonations();
        viewDonations();
        break;
      case 2:
        System.out.println("What is the project ID?");
        this.input = this.inputscanner.next();
        projectID = Integer.parseInt(this.input);
        portal.printprojectDonations(projectID);
        break;
      case 3:
        System.out.println("What is the product ID?");
        this.input = this.inputscanner.next();
        productID = Integer.parseInt(this.input);
        portal.printproductDonations(productID);
        break;
      case 4:
        portal.printDonationPerson(this.customer);
        break;
      case 5:
        this.mainMenu();
      }	
    }else{
      viewDonations();
    }
    this.viewDonations();
  }
  /**
   *  Page for user to view project/product details
   */
  public void viewprojectScreen(){
    int projectID;
    int productID;
    this.printer.printTitle("View Project/Product Details");
    System.out.println("To view all projects press 1");
    System.out.println("To view details for a particuar project press 2");
    System.out.println("To view details for a particuar product press 3");
    System.out.println("To go back to main menu press 4");
    if (!this.checkInputViolations(Arrays.asList(1,2,3,4))){
      int numbericInput = Integer.parseInt(this.input);
      switch(numbericInput){
      case 1:
        portal.printProjectsProducts();
        viewprojectScreen();
        break;
      case 2:	
        System.out.println("What is the project ID?");
        this.input = this.inputscanner.next();
        projectID = Integer.parseInt(this.input);
        portal.printDetails(projectID);
        break;

      case 3:
        System.out.println("What is the project ID?");
        this.input = this.inputscanner.next();
        projectID = Integer.parseInt(this.input);
        System.out.println("What is the product ID?");
        this.input = this.inputscanner.next();
        productID = projectID = Integer.parseInt(this.input);
        portal.printDetails(projectID, productID);
        break;
      case 4:
        this.mainMenu();
      }		
    }else{
      this.viewprojectScreen();
    }

  }

  /**
   * starts the application up 
   */
  public void startApplication(){
    while(!this.teminate){
      //Registeration enter your details
      this.RegisterScreen();
      this.mainMenu();

    }

  }
}
