package com.preparation.algos.searching;

/**
 * Created by chaitanya.ak on 03/07/16.
 */
public class SearchingDemo {

  public static void main(String[] args) {

    int[] array = new int[] { 2, 3, 40, 12, 54, 29, 5, 93, 18, 30, 23 };

    int[] arrayBinary = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    System.out.println(Searching.linearSearch(array, 18));
    System.out.println(Searching.binarySearch(arrayBinary, 3));
    System.out.println(Searching.binarySearchRecursion(arrayBinary, 3, 0, arrayBinary.length - 1));
  }
}
