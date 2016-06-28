package com.preparation.datastructures.avl;

/**
 * Created by chaitanya.ak on 14/06/16.
 */
public class AVLDemo {
  public static void main(String[] args) throws InterruptedException {
    AVL<Integer> avl =  new AVL<>();
    avl.insert(14);
    avl.insert(8);
    avl.insert(6);
    avl.insert(10);
    avl.insert(11);
    avl.insert(3);
    avl.insert(2);

    avl.breadthFirstTraversal();
  }
}
