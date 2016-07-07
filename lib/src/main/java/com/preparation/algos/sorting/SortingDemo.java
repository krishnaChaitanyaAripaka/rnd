package com.preparation.algos.sorting;

/**
 * Created by chaitanya.ak on 04/07/16.
 */
public class SortingDemo {
  public static void main(String[] args) {

    int[] array = new int[] { 54, 26, 93, 17, 77, 31, 44, 55, 20, 10, 11, 99, 28, 32, 30, 24 };

    //array = Sorting.bubbleSort(array);
    //array = Sorting.selectionSort(array);
    //array = Sorting.insertionSort(array);
    array = Sorting.shellSort(array);

    //for (int i = 0; i < array.length; i++) {
    //  System.out.println(array[i]);
    //}
  }
}
