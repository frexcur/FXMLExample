package com.company;

import java.util.Date;

public abstract class Product implements Item {

  int currentProductionNumber = 1;
  int serialNumber;
  Date manufacturedOn;
  String name;

  public Product(String name) {
    this.name = name;
    serialNumber = currentProductionNumber;
    currentProductionNumber++;
    manufacturedOn = new Date(System.currentTimeMillis());
  }

  public void setProductionNumber(int newValue) {
    currentProductionNumber = newValue;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n" +
        "Serial Number: " + serialNumber + "\n" +
        "Date: " + manufacturedOn + "\n" +
        "Name: " + name + "\n";
  }
}
