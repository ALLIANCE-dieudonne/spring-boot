package org.alliance;

public class Doctor implements Staff{

  private String qualifications;

  public void doc(){
    System.out.println("This is the doctor");
  }

  @Override
  public void assist() {
    System.out.println("the doctor is assisting!");
  }

  public String getQualifications() {
    return qualifications;
  }

  public void setQualifications(String qualifications) {
    this.qualifications = qualifications;
  }
}
