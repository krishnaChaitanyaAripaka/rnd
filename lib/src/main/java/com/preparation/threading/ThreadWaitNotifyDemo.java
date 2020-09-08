package com.preparation.threading;

import java.io.IOException;

public class ThreadWaitNotifyDemo {

  public static void main(String[] args) {
    String msg = "ThreadWaitNotifyDemo";
    WaiterRunnable waiterRunnable = new WaiterRunnable(msg);
    NotifierRunnable notifierRunnable = new NotifierRunnable(msg);

    new Thread(waiterRunnable).start();
    new Thread(notifierRunnable).start();
  }

  public static class WaiterRunnable implements Runnable {

    private static final String TAG = "WaiterRunnable";
    private final String msg;

    public WaiterRunnable(String msg) {
      this.msg = msg;
    }

    @Override
    public void run() {
      synchronized (msg) {
        try {
          log("Waiting to get notified");
          msg.wait();
        } catch (InterruptedException e) {
          log("Exception in calling wait");
        }

        log("Resumed after notify is called");
      }
    }

    private void log(String msg) {
      System.out.println(TAG + " : " + msg);
    }
  }

  public static class NotifierRunnable implements Runnable {

    private static final String TAG = "NotifierRunnable";
    private final String msg;

    public NotifierRunnable(String msg) {
      this.msg = msg;
    }

    @Override
    public void run() {
      synchronized (msg) {
        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        log("Waiting for a key to notify");
        try {
          System.in.read();
        } catch (IOException e) {
          e.printStackTrace();
        }

        msg.notify();

        log("Notifying...");

        try {
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }

        log("Notified such that waiting thread will resume");
      }
    }

    private void log(String msg) {
      System.out.println(TAG + " : " + msg);
    }
  }
}