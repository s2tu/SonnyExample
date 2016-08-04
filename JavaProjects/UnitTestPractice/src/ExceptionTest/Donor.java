/**
 * 
 */
package ExceptionTest;

/**Represents the donor to various service project
 * @author stu1
 *
 */
public class Donor implements Comparable<Donor>{
  private long donorCode;
  private String donorName;
  private long handPhone;
  private String email;
  public long getDonorCode() {
    return donorCode;
  }

  public void setDonorCode(long donorCode) {
    this.donorCode = donorCode;
  }

  public String getDonorName() {
    return donorName;
  }

  public void setDonorName(String donorName) {
    this.donorName = donorName;
  }

  public long getHandPhone() {
    return handPhone;
  }

  public void setHandPhone(long handPhone) {
    this.handPhone = handPhone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * 
   */
  public Donor() {
    super();
    // TODO Auto-generated constructor stub
  }
  
  /**
   * @param donorCode
   * @param donorName
   * @param handPhone
   * @param email
   */
  public Donor(long donorCode, String donorName, long handPhone, String email) {
    super();
    this.donorCode = donorCode;
    this.donorName = donorName;
    this.handPhone = handPhone;
    this.email = email;
  }

  /*
   * (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString(){
    StringBuffer buffer = new StringBuffer();
    buffer.append(this.donorCode).append(":").append(this.donorName).append(":").append(this.handPhone).append(":").append(email);
    return buffer.toString();
  }
/*
 * (non-Javadoc)
 * @see java.lang.Comparable#compareTo(java.lang.Object)
 */
  @Override
  public int compareTo(Donor obj) {
    if(this.handPhone > obj.handPhone)return -1;
    if(this.handPhone < obj.handPhone)return 1;
    // TODO Auto-generated method stub
    return 0;
  }

  

  
}
