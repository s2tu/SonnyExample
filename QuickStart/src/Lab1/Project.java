package Lab1;

public class Project {
  private String projectName;
  private String descriptionOfProject;
  private String product;
  private double projectCost;
  private String imageURLList[];
  
  public String getProjectName() {
    return projectName;
  }
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }
  public String getDescriptionOfProject() {
    return descriptionOfProject;
  }
  public void setDescriptionOfProject(String descriptionOfProject) {
    this.descriptionOfProject = descriptionOfProject;
  }
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public double getProjectCost() {
    return projectCost;
  }
  public void setProjectCost(double projectCost) {
    this.projectCost = projectCost;
  }
  public String[] imageURLList() {
    return imageURLList;
  }
  public void imageURLList(String[] imageURL) {
    this.imageURLList = imageURL;
  }
  
  
}
