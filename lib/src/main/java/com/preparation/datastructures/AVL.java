package com.preparation.datastructures;

/**
 * Created by chaitanya.ak on 14/06/16.
 */
public class AVL<E> extends BinarySearchTree {

  @Override public void insertNode(Tree root, Object value) {
    super.insertNode(root, value);
    //checkTreeBalance(root);
  }

  public void rightRotation() {
    if (mTree != null && mTree.left != null) {
      Tree current = mTree.left;
      mTree.left = current.right;
      current.right = mTree;
      mTree = current;
    }
  }

  public void leftRotation() {
    if (mTree != null && mTree.right != null) {
      Tree current = mTree.right;
      mTree.right = current.left;
      current.left = mTree;
      mTree = current;
    }
  }

  public int findHeight(Tree tree) {
    if (tree == null) return -1;

    return Math.max(findHeight(tree.left), findHeight(tree.right)) + 1;
  }

  public void checkTreeBalance(Tree tree) {

    //if (tree == null) return;
    tree = mTree;

    if (findHeight(tree.left) - findHeight(tree.right) > 1) { //left is greater
      if (findHeight(tree.left.left) - findHeight(tree.left.right) > 0) {//left greater
        rightRotation();
      } else {//right is greater
        leftRotation();
        rightRotation();
      }
    } else if (findHeight(tree.left) - findHeight(tree.right) < -1) { //right greater
      if (findHeight(tree.left.left) - findHeight(tree.left.right) < 0) {//right greater
        leftRotation();
      } else {//left greater
        rightRotation();
        leftRotation();
      }
    }
  }
}
