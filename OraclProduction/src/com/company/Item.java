package com.company;

import java.util.Date;

public interface Item {

  String manufacturer = "OraclProdction";

  void setProductionNumber(int newValue);

  void setName(String name);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();
  }
}
