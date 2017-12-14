package de.hoppel;

import de.hoppel.api.Service;
import org.rapidpm.ddi.DI;

public class Application {

  public void start() {
    DI.activatePackages("de.hoppel");

    final Service service = DI.activateDI(Service.class);
    service.doSomething();
  }

}
