package com.preparation.algos.sorting;

/**
 * Created by chaitanya.ak on 04/07/16.
 */
public class SortingDemo {
  public static void main(String[] args) {

    int[] array = new int[] { 54, 26, 93, 17, 77, 31, 44, 55, 20 };

    //array = Sorting.bubbleSort(array);
    //array = Sorting.selectionSort(array);
    //array = Sorting.insertionSort(array);
    //array = Sorting.shellSort(array);
    //array = Sorting.mergeSort(array);
    array = Sorting.quickSort(array);

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
  }
}
