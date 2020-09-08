package com.preparation.threading;


/**
 * https://www.geeksforgeeks.org/joining-threads-in-java/
 */
public class ThreadJoinDemo {


  public static void main(String[] args) {
    ThreadJoin threadJoinT1 = new ThreadJoin();
    ThreadJoin threadJoinT2 = new ThreadJoin();
    ThreadJoin threadJoinT3 = new ThreadJoin();

    threadJoinT1.start();

//    List<Integer> l = Arrays.asList(1, 2, 3,4);
//
//    Stream stream;


//    Thread t;
//    t.setPriority(Thread.MAX_PRIORITY);
//
//    JavaNioAccess javaNioAccess;
//
//    BlockingQueue b;
////    b.add()
//
//    BlockingDeque bd;
////    bd.addLast();
//
//
//    Object d = 10;

    Object d = new Object();
    d = 10;
    System.out.println(d.getClass().getName());



    try {
      threadJoinT1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    threadJoinT2.start();

    try {
      threadJoinT2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    threadJoinT3.start();
  }

  static class ThreadJoin extends Thread {

    @Override
    public void run() {
      super.run();

      for (int i = 0; i < 3; i++) {
        try {
          Thread.sleep(2000);
          System.out.println("Current Thread: " + Thread.currentThread().getName());
        } catch (Exception ex) {
          System.out.println("Exception has" + " been caught" + ex);
        }
        System.out.println(i);
      }
    }
  }
}
