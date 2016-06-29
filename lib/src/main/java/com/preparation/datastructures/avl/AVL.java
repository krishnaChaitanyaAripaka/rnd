package com.preparation.datastructures.avl;

import com.preparation.datastructures.tree.BinarySearchTree;

/**
 * Created by chaitanya.ak on 14/06/16.
 */
public class AVL<E> extends BinarySearchTree<E> {

  @Override public Tree insertNode(Tree tree, E value) {
    if (isValueLessThanTreeValue(tree.value, value)) {
      if (null == tree.left) {
        Tree temp = new Tree();
        temp.value = value;
        tree.left = temp;
      } else {
        tree.left = insertNode(tree.left, value);
        tree = checkTreeBalance(tree);
      }
    } else {
      if (null == tree.right) {
        Tree temp = new Tree();
        temp.value = value;
        tree.right = temp;
      } else {
        tree.right = insertNode(tree.right, value);
        tree = checkTreeBalance(tree);
      }
    }

    return tree;
  }

  @Override
  public Tree delete(Tree root, E value) {
    Tree nodeToDelete = findNode(root, value);
    if (nodeToDelete == null) return root;

    Tree parent = findParentNode(root, nodeToDelete);
    if (parent == null && nodeToDelete.left == null && nodeToDelete.right == null) {
      root = null;
      return root;
    }

    if (nodeToDelete.left == null && nodeToDelete.right == null) {//case 1
      Tree grandParent = findParentNode(mTree, parent);
      if (isValueLessThanTreeValue(parent.value, nodeToDelete.value)) {
        parent.left = null;
        grandParent.left = checkTreeBalance(parent);
      } else {
        parent.right = null;
        grandParent.right = checkTreeBalance(parent);
      }

    } else if (nodeToDelete.right == null) {//case 2
      if (isValueLessThanTreeValue(parent.value, nodeToDelete.value)) {
        parent.left = nodeToDelete.left;
      } else {
        parent.right = nodeToDelete.left;
      }
    } else if (nodeToDelete.left == null) {//case 3
      if (isValueLessThanTreeValue(parent.value, nodeToDelete.value)) {
        parent.left = nodeToDelete.right;
      } else {
        parent.right = nodeToDelete.right;
      }
    } else {//case 4
      //Any one logic can be used either maxValueOfLeftSubTree or minValueOfRightSubTree

      //maxValueOfLeftSubTree
      Tree maxValue = maxValueOfLeftSubTree(nodeToDelete);
      nodeToDelete.value = maxValue.value;
      nodeToDelete.left = delete(nodeToDelete.left, maxValue.value);
      parent.left = checkTreeBalance(nodeToDelete);

      //minValueOfRightSubTree
      //Tree minValue = minValueOfRightSubTree(nodeToDelete);
      //nodeToDelete.value = minValue.value;
      //nodeToDelete.right = delete(nodeToDelete.right, minValue.value);
    }

    return root;
  }

  public Tree rotationWithLeftChild(Tree tree) {
    Tree current = tree.left;
    tree.left = current.right;
    current.right = tree;

    return current;
  }

  public Tree rotationWithRightChild(Tree tree) {
    Tree current = tree.right;
    tree.right = current.left;
    current.left = tree;
    return current;
  }

  public Tree doubleRotationWithRightChild(Tree tree) {
    tree.right = rotationWithLeftChild(tree.right);
    return rotationWithRightChild(tree);
  }

  public Tree doubleRotationWithLeftChild(Tree tree) {
    tree.left = rotationWithRightChild(tree.left);
    return rotationWithLeftChild(tree);
  }

  public int findHeight(Tree tree) {
    if (tree == null) return -1;

    return Math.max(findHeight(tree.left), findHeight(tree.right)) + 1;
  }

  public Tree checkTreeBalance(Tree tree) {

    if (findHeight(tree.left) - findHeight(tree.right) > 1) { //left is greater
      if (findHeight(tree.left.left) - findHeight(tree.left.right) > 0) {//left greater
        return rotationWithLeftChild(tree); //ll rotation
      } else {//right is greater
        return doubleRotationWithLeftChild(tree);
      }
    } else if (findHeight(tree.left) - findHeight(tree.right) < -1) { //right greater
      if (findHeight(tree.right.left) - findHeight(tree.right.right) < 0) {//right greater
        return rotationWithRightChild(tree);
      } else {//left greater
        return doubleRotationWithRightChild(tree);
      }
    }

    return tree;
  }
}
