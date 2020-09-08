package com.preparation.algos.sorting;

/**
 * Created by chaitanya.ak on 04/07/16.
 */
public class SortingDemo {
  public static void main(String[] args) {
    //190, 12, 146, 5, 2  -> 2, 5, 12, 146, 190
    //15, 11, 8, 460, 1   -> 1, 8, 11, 15, 460
    //14, 10, 7, 4        -> 4, 7, 10, 14
    //13, 9, 6, 3         -> 3, 6, 9, 13
//    int[] array = new int[] { 190, 15, 14, 13, 12, 11, 10, 9, 146, 8, 7, 6, 5, 460, 4, 3, 2, 1 };
    int[] array = new int[] {5, 1, 4, 2, 8};

    Sorting.bubbleSort(array);
    //array = Sorting.selectionSort(array);
    //array = Sorting.insertionSort(array);
//    array = Sorting.shellSort(array);
//    array = Sorting.mergeSort(array);
    //array = Sorting.quickSort(array);
    //array = Sorting.heapSort(array);

//    for (int i = 0; i < array.length; i++) {
//      System.out.print(array[i] + ", ");
//    }
  }
}
