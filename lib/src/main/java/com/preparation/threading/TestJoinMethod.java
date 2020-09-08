package com.preparation.threading;

/**
 * Created by chaitanya.ak on 20/09/16.
 */

class TestJoinMethod extends Thread {
  private static TestJoinMethod1 t1;
  private static TestJoinMethod2 t2;
  private static TestJoinMethod3 t3;
  public static void main(String args[]) {
    TestJoinMethod testJoinMethod = new TestJoinMethod();
    t1 = testJoinMethod.new TestJoinMethod1();
    t1.setName("T1");
    t2 = testJoinMethod.new TestJoinMethod2();
    t2.setName("T2");
    t2.setDaemon(true);
    t3 = testJoinMethod.new TestJoinMethod3();
    t3.setName("T3");
    t1.start();
    t2.start();
    t3.start();
  }

  class TestJoinMethod1 extends Thread {
    public void run() {
      for (int i = 1; i <= 5; i++) {
        try {
          Thread.sleep(500);
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.println(i + ", " + Thread.currentThread());
      }
    }
  }


  class TestJoinMethod2 extends Thread {
    public void run() {
      for (int i = 1; i <= 50; i++) {
        try {
          Thread.sleep(500);
          t1.join();
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.println(i + ", " + Thread.currentThread());
      }
    }
  }


  class TestJoinMethod3 extends Thread {
    public void run() {
      for (int i = 1; i <= 5; i++) {
        try {
          Thread.sleep(500);
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.println(i + ", " + Thread.currentThread());
      }
    }
  }
}