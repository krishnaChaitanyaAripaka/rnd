package com.preparation.datastructures;

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
  public static Tree mTree;

  public static void main(String a[]) {
    insert(23);
    insert(14);
    insert(31);
    insert(7);
    insert(9);
    insert(17);
    insert(15);

    mTree = delete(mTree, 23);

    //System.out.println(contains(mTree, 23));

    preOrder(mTree);
    //inOrder(mTree);
    //postOrder(mTree);
  }

  /******************************************************************************/
  // Insert a Node

  /******************************************************************************/
  private static void insert(int value) {
    if (null == mTree) {
      Tree temp = new Tree();
      temp.value = value;
      mTree = temp;
    } else {
      insertNode(mTree, value);
    }
  }

  private static void insertNode(Tree root, int value) {
    if (value < root.value) {
      if (null == root.left) {
        Tree temp = new Tree();
        temp.value = value;
        root.left = temp;
      } else {
        insertNode(root.left, value);
      }
    } else {
      if (null == root.right) {
        Tree temp = new Tree();
        temp.value = value;
        root.right = temp;
      } else {
        insertNode(root.right, value);
      }
    }
  }

  /******************************************************************************/
  // Contains

  /******************************************************************************/
  private static boolean contains(Tree root, int value) {
    if (root == null) {
      return false;
    } else if (value == root.value) {
      return true;
    } else {
      if (value < root.value) {
        return contains(root.left, value);
      } else {
        return contains(root.right, value);
      }
    }
  }

  /******************************************************************************/
  // Depth First Traversal

  /******************************************************************************/
  private static void preOrder(Tree root) {
    if (root == null) return;

    System.out.println(root.value);
    preOrder(root.left);
    preOrder(root.right);
  }

  private static void inOrder(Tree root) {
    if (root == null) return;

    inOrder(root.left);
    System.out.println(root.value);
    inOrder(root.right);
  }

  private static void postOrder(Tree root) {
    if (root == null) return;

    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.value);
  }
  /*
      ====================23=============================   	depth = 0, height =3
      =========14=========================31============== 		depth = 1, height =2
      =====7========17================25======35==========   	depth = 2, height =1
      =======9===15=======================================   	depth = 3, height =0
  case 1: Node to be deleted is a leaf(i.e, node has not children)
  case 2: Node to be deleted has one child and it is a left sub child
  case 3: Node to be deleted has one child and it is a right sub child
  case 4: Node to be deleted has two children
  1. Find node to delete - 7
  2. Find max(node) of left sub tree from node to delete / min(node) of right sub tree from node to delete - 6 / 10
  3. Find parent node of the node to be deleted - 5
  4. f( max(node) of left sub tree in temp - 6 / 10
  5. Replace node to be deleted with max(node) of left sub tree - 6 / 10
   */
  /******************************************************************************/
  // Delete a Node

  /******************************************************************************/
  private static Tree delete(Tree root, int value) {
    Tree nodeToDelete = findNode(root, value);
    if (nodeToDelete == null) return root;

    Tree parent = findParentNode(root, nodeToDelete);
    if (parent == null && nodeToDelete.left == null && nodeToDelete.right == null) {
      root = null;
      return root;
    }

    if (nodeToDelete.left == null && nodeToDelete.right == null) {//case 1
      if (nodeToDelete.value < parent.value) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    } else if (nodeToDelete.right == null) {//case 2
      if (nodeToDelete.value < parent.value) {
        parent.left = nodeToDelete.left;
      } else {
        parent.right = nodeToDelete.left;
      }
    } else if (nodeToDelete.left == null) {//case 3
      if (nodeToDelete.value < parent.value) {
        parent.left = nodeToDelete.right;
      } else {
        parent.right = nodeToDelete.right;
      }
    } else {//case 4
      Tree maxValue = maxValueOfLeftSubTree(nodeToDelete);
      nodeToDelete.value = maxValue.value;
      root.left = delete(root.left, maxValue.value);
    }

    return root;
  }

  /******************************************************************************/
  // Find a Node

  /******************************************************************************/
  private static Tree findNode(Tree root, int value) {
    if (root == null) {
      return null;
    } else if (value == root.value) {
      return root;
    } else {
      if (value < root.value) {
        return findNode(root.left, value);
      } else {
        return findNode(root.right, value);
      }
    }
  }

  /******************************************************************************/
  // Find a Parent Node

  /******************************************************************************/
  private static Tree findParentNode(Tree root, Tree value) {//23,1 (7,1)
    if (root == null) {
      return null;
    } else if (value.value == root.value) {
      return null;
    } else if (value.value < root.value) {
      if (root.left.value == value.value) {
        return root;
      } else {
        return findParentNode(root.left, value);
      }
    } else {
      if (root.right.value == value.value) {
        return root;
      } else {
        return findParentNode(root.right, value);
      }
    }
  }

  /******************************************************************************/
  // Find a Parent Node

  /******************************************************************************/
  private static Tree maxValueOfLeftSubTree(Tree value) {//23,1 (7,1)
    value = value.left;
    while (value.right != null) {
      value = value.right;
    }

    return value;
  }
}
