package com.preparation.threading;

/**
 * Created by chaitanya.ak on 22/09/16.
 */

public class TestShutdown {
  class MyThread extends Thread {
    public void run() {
      System.out.println("shut down hook task completed..");
    }
  }

  public static void main(String[] args) throws Exception {

    Runtime r = Runtime.getRuntime();
    r.addShutdownHook(new TestShutdown().new MyThread());

    System.out.println("Now main sleeping... press ctrl+c to exit");
    try {
      Thread.sleep(3000);
      r.halt(2);
    } catch (Exception e) {
    }
  }
}