package com.preparation.leetcode;

import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    int num[] = new int[]{2, 11, 15, -2, 5, 9};
    int target = 9;
    int[] result = twoSum(num, target);

    for (int val : result) {
      System.out.println(val);
    }
  }


  //9 - 2 = (k)7, (v)0
  //9 - 11 = (k)-2, (v)1
  //9 - 15 = (k)-6, (v)3
  //9 - 7 = (k)


  //9 - 2 = (k)7, (v)0
  //9 - 11 = (k)-2, (v)1
  //9 - 15 = (k)-6, (v)3
  //9 - 7 = (k)
  private static int[] twoSum(int[] num, int target) {

    HashMap<Integer, Integer> map = new HashMap<>();
    int result[] = new int[2];

    for (int index = 0; index < num.length; index++) {
      if (map.containsKey(num[index])) {
        int value = map.get(num[index]);
        result[0] = value;
        result[1] = index;
        break;
      } else {
        map.put(target - num[index], index);
      }
    }

    return result;
  }
}