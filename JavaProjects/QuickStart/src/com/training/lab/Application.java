package com.training.lab;

public class Application {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    WebPortal Philanthropy_com = new WebPortal("www.philanthropy.com", "Philanthropy.com is a online Web Portal, supporting Service projects of various non-governmental Organization in India and abroad.");
    //areas of Cancer Cure, Primary Education and Old Age Home
   	Project CancerCure = new Project("CancerCure", "Organization for Cancer Cure", 1000);
   	Product medicine = new Product("Blue Potion", "Some sort of stange liquid.", 10000);
   	CancerCure.addProduct(medicine);

    Project PrimaryEducation = new Project("HighSchools Project","Building highschools for highschool students", 2000);
    Product SirjohnMcdonald =  new Product("Sir John A. McDonald", "A highschool located in Hamilton, Ontario Canada", 100);
    PrimaryEducation.addProduct(SirjohnMcdonald);

    Product cruddyschool =  new Product("Cruddy School", "A highschool located in Hamilton, Ontario Canada", 100);
    PrimaryEducation.addProduct(cruddyschool);


    Project OldAgeHome = new Project("Old Broken House Prokect", "Old house that nobody wants.", 10000);		
    Product CruddyHouse = new  Product("Cruddy House", "building a half broken house for people", 100);
    OldAgeHome.addProduct(CruddyHouse);

    Philanthropy_com.addProject(PrimaryEducation);
    Philanthropy_com.addProject(OldAgeHome); 
    Philanthropy_com.addProject(CancerCure); 
    
    
    InputSystem userInterface = new InputSystem(Philanthropy_com);
    userInterface.startApplication();



  }

}
