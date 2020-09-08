package com.preparation;

public class TypeCastCheck {

  public static void main(String[] args) {
    int a = 0;
    String value = "62394892347867867856.0";

    boolean result = a > Double.parseDouble(value);

    System.out.println(a + " > " + value + " : " + result);
  }
}
