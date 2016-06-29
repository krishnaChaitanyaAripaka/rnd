package com.preparation.datastructures.tree;

import com.preparation.datastructures.tree.BinarySearchTree;

/**
 * Describes a mTree which is nothing but collection of nodes having a parent-child relation
 * 1. Top Node is <b>root</b>
 * 2. Nodes are connecting by <b>edges</b>
 * i. Edges define parent and child nodes
 * 3. Nodes with no children are called <b>leaves</b>
 * 4. Nodes that share same parent are called siblings
 * 5. A <b>path</b> is a sequence of  nodes such that next node in the sequence is a child of the
 * previous
 * 6. Nodes <b>depth</b> is the length of the path from root
 * 7. <b>Height</b> of the mTree is the maximum depth
 * 8. If a path exists between two nodes, one is an <b>ancestor</b> and the other is descendant.
 *
 * @author Krishna Chaitanya
 * @since 04/06/16
 */
public class BSTDemo {


  public static void main(String a[]) throws InterruptedException {
    BinarySearchTree<Integer> bst = new BinarySearchTree<>();

    bst.insert(23);
    bst.insert(14);
    bst.insert(31);
    bst.insert(7);
    bst.insert(9);
    bst.insert(17);
    bst.insert(15);
    bst.insert(25);
    bst.insert(35);
    bst.insert(24);
    bst.insert(26);
    bst.insert(34);
    bst.insert(36);
    bst.delete(31);
    bst.breadthFirstTraversal();

    System.out.println(bst.contains(23));
    BinarySearchTree<String> b = new BinarySearchTree<>();
    b.insert("Hi");
    b.insert("Hello");

  }
}
