package com.preparation.threading;

public class ThreadInterruptDemo {

  private static Object o = new Object();
  public static void main(String args[]) {
    TestInterruptingThread1 t1 = new TestInterruptingThread1();
    t1.start();
    try {
      Thread.sleep(3000);
      t1.interrupt();
    } catch (Exception e) {
      System.out.println("Exception handled ");
    }

//    TestInterruptingThread2 t1 = new TestInterruptingThread2();
//    t1.start();
//    try {
//      Thread.sleep(3000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    t1.interrupt();

  }

  static class TestInterruptingThread1 extends Thread {

    public void run() {
      try {
        System.out.println("Before task");
        synchronized (o) {
          o.wait();
        }

        System.out.println("After task");
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted..." + e);
      }
      System.out.println("thread is running...");

    }


  }

  static class TestInterruptingThread2 extends Thread {

    public void run() {
      try {
        System.out.println("Before task");
        Thread.sleep(10000);
        System.out.println("After task");
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted..." + e);
      }
      System.out.println("thread is running...");
    }

  }
}