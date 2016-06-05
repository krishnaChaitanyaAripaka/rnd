package com.preparation.designpatterns.creational.protype;

/**
 * Created by chaitanya.ak on 04/05/16.
 */
public class Data implements Cloneable {

  // As this is a field, changes made to original object doesn't reflect cloned object,
  private int id;
  // As this is a field, changes made to original object doesn't reflect cloned object,
  private String name;
  // As this is an object reference, changes made to original object reflects cloned object
  // because it carries the memory address to the cloned copy
  private final com.preparation.designpatterns.creational.protype.Company company;

  Data(int idT, String nameT, String companyT) {
    this.id = idT;
    this.name = nameT;
    this.company = new com.preparation.designpatterns.creational.protype.Company();
    this.company.setName(companyT);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public com.preparation.designpatterns.creational.protype.Company getCompany() {
    return company;
  }

  /**
   * Override the default clone and specify your own clone logic
   * @return Object
   * @throws CloneNotSupportedException
   */
  @Override protected Object clone() throws CloneNotSupportedException {
    System.out.println("Data Clone");
    return super.clone(); // returns the cloned object
    //return this; // returns this object without clone
  }

  @Override public boolean equals(Object obj) {

    if (obj == null) return false;

    if (obj == this) return true;

    return true;
  }
}
