package com.preparation.algos.sorting;

/**
 * Created by chaitanya.ak on 04/07/16.
 */
public class Sorting {

  /**
   * Pass through the list and swap individual pairs of elements if they are out of order
   * At the end of the first pass, the maximal element has “bubbled up” to the end of
   * the list. Repeat this process n times
   *
   * @return sorted array
   */
  public static int[] bubbleSort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      for (int j = 1; j < array.length - i; j++) {
        if (array[j - 1] > array[j]) {
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }

    return array;
  }

  /**
   * Iterate through the elements in the list and
   * find the minimal element in the list and Swap the minimal element with the “first” element
   * or
   * find the maximum element in the list and Swap the maximum element with the “last” element
   * Repeat the process on the remaining n − 1 elements
   *
   * Starting index from 0
   */
  public static int[] selectionSort(int[] array) {

    int maxValueIndex;
    int count = 0;
    while (0 < array.length - count) {
      maxValueIndex = 0;
      for (int j = 1; j < array.length - count; j++) {
        if (array[maxValueIndex] < array[j]) {
          maxValueIndex = j;
        }
      }

      int temp = array[array.length - count - 1];
      array[array.length - count - 1] = array[maxValueIndex];
      array[maxValueIndex] = temp;
      count++;
    }

    return array;
  }

  /**
   * Iterate through the elements in the list and
   * find the minimal element in the list and Swap the minimal element with the “first” element
   * or
   * find the maximum element in the list and Swap the maximum element with the “last” element
   * Repeat the process on the remaining n − 1 elements
   *
   * Starting index from array length
   * @param array
   * @return
   */
  //public static int[] selectionSort(int[] array) {
  //
  //  int maxValueIndex;
  //  for (int i = array.length - 1; i > 0; i--) {
  //    maxValueIndex = i;
  //    for (int j = 0; j < i; j++) {
  //      if (array[maxValueIndex] < array[j]) {
  //        maxValueIndex = j;
  //      }
  //    }
  //
  //    int temp = array[i];
  //    array[i] = array[maxValueIndex];
  //    array[maxValueIndex] = temp;
  //  }
  //
  //  return array;
  //}

  /**
   *
   * @return sorted array
   */
  //public static int[] chaituSort(int[] array) {
  //
  //  int loopCount = 0;
  //  for (int i = 0; i < array.length; i++) {
  //    for (int j = i + 1; j < array.length; j++) {
  //      if (array[i] > array[j]) {
  //        int temp = array[i];
  //        array[i] = array[j];
  //        array[j] = temp;
  //      }
  //      loopCount++;
  //    }
  //  }
  //
  //  System.out.println("loop count : " + loopCount);
  //  return array;
  //}

  /**
   * It always maintains a sorted sub list in the lower positions of the list
   */
  public static int[] insertionSort(int[] array) {

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < i; j++) {
        if (array[j] > array[i]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }

      print(array, i);
    }
    return array;
  }

  private static void print(int[] array, int end) {
    for (int i = 0; i < end; i++) {
      System.out.print(array[i] + ", ");
    }
    System.out.println();
  }

  //*54, 26, 93,    *17, 77, 31,    *44, 55, 20,    *10, 11, 99,    *28, 32, 30 -> 10, 17, 28, 44, 54
  //54, *26, 93,    17, *77, 31,    44, *55, 20,    10, *11, 99,    28, *32, 30 -> 11, 26, 32, 55, 77
  //54, 26, *93,   17, 77, *31,    44, 55, *20,    10, 11, *99,     28, 32, *30 -> 20, 30, 31, 93, 99

  //*54, 26, 93,    *17, 77, 31,    *44, 55, 20,    *10, 11 - 11
  // 54, *26, 93,    17, *77, 31,     44, *55, 20,    10, *11 - 11
  // 54, 26, *93,    17, 77, *31,     44, 55, *20,    10, 11 - 11

  //*54, 26, 93, 17,    *77, 31, 44, 55,     *20, 10, 11, 99,    *28, 32, 30, 24 -> 20, 28, 54, 77
  //54, *26, 93, 17,    77, *31, 44, 55,     20, *10, 11, 99,    28, *32, 30, 24 -> 10, 26, 31, 32
  //54, 26, *93, 17,    77, 31, *44, 55,     20, 10, *11, 99,    28, 32, *30, 24 -> 11, 30, 44, 93
  //54, 26, 93, *17,   77, 31, 44, *55,     20, 10, 11, *99,    28, 32, 30, *24-> 17, 24, 55, 99
  public static int[] shellSort(int[] array) {

    int increment = (int) Math.sqrt(array.length); //3
    int subListNo = 0;

    while (subListNo < increment) { // 0 < 3
      for (int i = 0; i < array.length; i++) {
        for (int j = i + increment; j < array.length; j += increment) {
          if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
        }
      }

      subListNo++;
    }

    print(array, array.length);

    return insertionSort(array);
  }

  public static int[] mergeSort(int[] array) {

    int lengthArray = array.length;
    int divRule = lengthArray / 2;

    array = pythonSplit(getSubArray(array, 0, divRule), getSubArray(array, divRule, lengthArray));

    return array;
  }

  private static int[] pythonSplit(int[] leftArray, int[] rightArray) {

    int leftArrayLength = leftArray.length;
    int divLeftRule = leftArrayLength / 2;

    int rightArrayLength = rightArray.length;
    int divRightRule = rightArrayLength / 2;

    if (leftArray.length > 1) {
      leftArray = pythonSplit(getSubArray(leftArray, 0, divLeftRule),
          getSubArray(leftArray, divLeftRule, leftArrayLength));
    }

    if (rightArray.length > 1) {
      rightArray = pythonSplit(getSubArray(rightArray, 0, divRightRule),
          getSubArray(rightArray, divRightRule, rightArrayLength));
    }

    return mergeSplitItems(leftArray, rightArray);
  }

  private static int[] mergeSplitItems(int[] leftArray, int[] rightArray) {

    int merge[] = new int[leftArray.length + rightArray.length];
    int i = 0, j = 0, k = 0;

    while ((i + j) < (leftArray.length + rightArray.length)) {
      if (leftArray[i] <= rightArray[j]) {
        merge[k++] = leftArray[i++];
        if (i == leftArray.length) {
          merge[k++] = rightArray[j++];
        }
      } else {
        merge[k++] = rightArray[j++];
        if (j == rightArray.length) {
          merge[k++] = leftArray[i++];
        }
      }
    }

    return merge;
  }

  private static int[] getSubArray(int[] array, int start, int end) {
    int subArrayLength = end - start;
    int[] subArray = new int[subArrayLength];

    for (int i = 0; start < end; ) {
      subArray[i++] = array[start++];
    }

    return subArray;
  }

  public static int[] quickSort(int[] array) {

    if (array.length <= 1) return array;

    return quickSortLooper(array, 0, array.length - 1);
  }

  public static int[] quickSortLooper(int[] array, int startPoint, int endPoint) {

    if (startPoint >= endPoint) return array;

    int splitPointIndex = splitPoint(array, startPoint, endPoint);

    quickSortLooper(array, startPoint, splitPointIndex - 1);

    quickSortLooper(array, splitPointIndex + 1, endPoint);

    return array;
  }

  private static int splitPoint(int[] array, int startPoint, int endPoint) {
    int pivotIndex = startPoint;
    int leftMark = startPoint + 1;
    int rightMark = endPoint;

    while (leftMark < rightMark) {

      while (array[pivotIndex] > array[leftMark]) {
        leftMark++;
      }

      while (array[pivotIndex] < array[rightMark]) {
        rightMark--;
      }

      if (leftMark < rightMark) swap(array, leftMark, rightMark);
    }

    swap(array, pivotIndex, rightMark);
    return rightMark;
  }

  private static void swap(int array[], int positionOne, int positionTwo) {
    int temp = array[positionOne];
    array[positionOne] = array[positionTwo];
    array[positionTwo] = temp;
  }
}
