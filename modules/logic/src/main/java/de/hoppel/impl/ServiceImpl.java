package de.hoppel.impl;

import de.hoppel.api.Service;

public class ServiceImpl implements Service {

  @Override
  public void doSomething() {
    System.out.println("woop woop");
  }
}
