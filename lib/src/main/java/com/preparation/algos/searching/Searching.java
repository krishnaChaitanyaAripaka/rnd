package com.preparation.algos.searching;

/**
 * Created by chaitanya.ak on 04/07/16.
 */
public class Searching {
  public static int linearSearch(int[] array, int element) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) {
        return i;
      }
    }

    return -1;
  }

  public static int binarySearch(int[] array, int element) {
    int start = 0;
    int end = array.length - 1;
    int middle;

    while (start <= end) {
      // middle = (start + end)/2 -> This might cause overflow so the below statement servers better
      middle = start + (end - start) / 2;
      if (element == array[middle]) {
        return middle;
      } else if (element < array[middle]) {
        end = middle - 1;
      } else {
        start = middle + 1;
      }
    }

    return -1;
  }

  public static int binarySearchRecursion(int[] array, int element, int start, int end) {

    // middle = (start + end)/2 -> This might cause overflow so the below statement servers better
    int middle = start + (end - start) / 2;

    if (start > end) return -1;

    if (element == array[middle]) {
      return middle;
    } else if (element < array[middle]) {
      return binarySearchRecursion(array, element, start, middle - 1);
    } else {
      return binarySearchRecursion(array, element, middle + 1, end);
    }
  }
}
