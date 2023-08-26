package org.alliance;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff {
  public void assist() {
    System.out.println("the doctor is assisting!");
  }


}
