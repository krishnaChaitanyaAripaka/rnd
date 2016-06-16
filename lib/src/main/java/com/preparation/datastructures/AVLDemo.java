package com.preparation.datastructures;

/**
 * Created by chaitanya.ak on 14/06/16.
 */
public class AVLDemo {
  public static void main(String[] args) throws InterruptedException {
    AVL<Integer> avl =  new AVL<>();
    avl.insert(14);
    avl.checkTreeBalance(null);
    avl.insert(8);
    avl.checkTreeBalance(null);
    avl.insert(6);
    avl.checkTreeBalance(null);
    avl.insert(10);
    avl.checkTreeBalance(null);
    avl.insert(11);
    avl.checkTreeBalance(null);

    avl.breadthFirstTraversal();
  }
}
