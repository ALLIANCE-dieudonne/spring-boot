package org.alliance;

public class Doctor implements Staff{
  public void doc(){
    System.out.println("This is the doctor");
  }

  @Override
  public void assist() {
    System.out.println("the doctor is assisting!");
  }
}
