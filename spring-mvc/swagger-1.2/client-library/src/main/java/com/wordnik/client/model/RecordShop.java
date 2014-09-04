package com.wordnik.client.model;

public class RecordShop {
  private String Name = null;
  private Integer storeNumber = null;
  public String getName() {
    return Name;
  }
  public void setName(String Name) {
    this.Name = Name;
  }

  public Integer getStoreNumber() {
    return storeNumber;
  }
  public void setStoreNumber(Integer storeNumber) {
    this.storeNumber = storeNumber;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordShop {\n");
    sb.append("  Name: ").append(Name).append("\n");
    sb.append("  storeNumber: ").append(storeNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

