package com.preparation;

import com.google.common.base.Splitter;
import java.util.Iterator;
import java.util.Map;

public class StringSplitterVerification {

  public static void main(String[] args) {


     boolean a = false, b = true ,c = true, d = false;

     System.out.print(a && b || c);
    System.out.print((a ||  b) && c || d);
//    String a = "name:chaitaya&mobile:" ;
//
//    String[] nothing = a.split(":");
////    String[] bunchOfNothing = ":".split("::::b", -1);
//
//    System.out.println(nothing.length);
//
//    System.out.println(nothing[0]);
//    System.out.println(nothing[1]);
//    System.out.println(bunchOfNothing.length);

//    String a = "key1:value1#key2:value2#key3";
//
//    String[] arr = a.split("#");
//
//    for (int i = 0; i < arr.length; i++) {
//      String[] arrNew = arr[i].split(":", -1);
//      System.out.println(arrNew[0]);
//      System.out.println(arrNew[1]);
//    }
    System.out.println();
//    Pattern pattern = Pattern.compile("#");
//    String[] stringSplit = pattern.split(a);
//
//    for (String splitValue : stringSplit) {
//      pattern = Pattern.compile(":");
//      String[] keyValue = pattern.split(splitValue);
//
//      System.out.println(keyValue[0]);
//      System.out.println(keyValue[1]);
//    }

//    splitOne(a);

//    splitTwo(a);
  }

  private static void splitOne(String a) {
    Map<String, String> map = Splitter.on("#").withKeyValueSeparator(":")

        .split(a);
    System.out.println(map);
  }

  private static void splitTwo(String a) {
    Iterator<String> itr = Splitter.on("#").split(a).iterator();
    while (itr.hasNext()) {
      String data = itr.next();
      if (data.contains(":")) {
        Iterator<String> itrNew = Splitter.on(":").split(data).iterator();
        while (itrNew.hasNext()) {
          String key = itrNew.next();
          String value = itrNew.next();
          System.out.println(key + " : " + value);
        }
      }
    }
  }
}
