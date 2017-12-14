package de.hoppel;

import org.rapidpm.ddi.DI;

public class Application {

  public void start(){
    DI.bootstrap();
    DI.activatePackages("de.hoppel");

    DI.activateDI(Service.class);
  }

}
