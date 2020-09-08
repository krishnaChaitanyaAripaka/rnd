package com.preparation.hackerearth;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by chaitanya.ak on 22/08/16.
 */
public class TicketCounter {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int paths = in.nextInt();

    Ticket ticket = new Ticket();
    for (int i = 0; i < paths; i++) {
      int startNode = in.nextInt();
      int endNode = in.nextInt();
      int weight = in.nextInt();
      ticket.addEdge(startNode, endNode, weight);
    }

    System.out.println(ticket.size());

    ticket.findPath();
  }

  static class Ticket {

    static final int LEFT = 1;
    static final int RIGHT = 2;
    private LinkedHashMap<Integer, Node> mEdges = new LinkedHashMap<>();
    private Node mRoot;

    public void findPath() {
      while(true) {
        findPath(getRootNode());
      }
    }

    public void findPath(Node node) {
      if (node == null) return;

      if (node.childRemoved == 0) {
        if (node.leftNode != null && node.leftNodeWeight > node.rightNodeWeight) {
          node.leftNodeWeight--;
          node.childRemoved = LEFT;
          findPath(node.leftNode);
        } else if (node.rightNode != null) {
          node.rightNodeWeight--;
          node.childRemoved = RIGHT;
          findPath(node.rightNode);
        }
      } else if (node.rightNode != null && node.childRemoved == LEFT) {
        node.rightNodeWeight--;
        node.childRemoved = RIGHT;
        findPath(node.rightNode);
      } else if (node.leftNode != null && node.childRemoved == RIGHT) {
        node.leftNodeWeight--;
        node.childRemoved = LEFT;
        findPath(node.leftNode);
      }
    }

    class Node {
      Node leftNode;
      Node rightNode;
      int value;
      int leftNodeWeight;
      int rightNodeWeight;
      int childRemoved = 0;
    }

    public void addEdge(int child, int parent, int weight) {
      Node parentNode = mEdges.get(parent);
      Node childNode = mEdges.get(child);

      if (childNode != null) {
        if (parentNode == null) {
          parentNode = new Node();
          parentNode.value = parent;
          parentNode.leftNode = childNode;
          parentNode.leftNodeWeight = weight;
        } else {
          parentNode.rightNode = childNode;
          parentNode.rightNodeWeight = weight;
        }
        mEdges.remove(child);
        mEdges.put(parent, parentNode);
      } else {
        if (parentNode == null) {
          parentNode = new Node();
          parentNode.value = parent;
          parentNode.leftNodeWeight = weight;
          if (null == parentNode.leftNode) {
            Node leftNode = new Node();
            leftNode.value = child;
            parentNode.leftNode = leftNode;
          }
        } else {
          if (null == parentNode.rightNode) {
            Node rightNode = new Node();
            rightNode.value = child;
            parentNode.rightNodeWeight = weight;
            parentNode.rightNode = rightNode;
          }
        }
        mEdges.put(parent, parentNode);
      }
    }

    public Node getRootNode() {
      if (mEdges != null) {
        Iterator<Map.Entry<Integer, Node>> iterator = mEdges.entrySet().iterator();
        while (iterator.hasNext()) {
          Map.Entry<Integer, Node> current = iterator.next();
          mRoot = current.getValue();
          mEdges = null;
          break;
        }
      }

      return mRoot;
    }

    public int size() {
      return mEdges.size();
    }
  }
}
