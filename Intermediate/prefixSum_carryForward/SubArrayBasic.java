package Intermediate.prefixSum_carryForward;

// A subarray is a continuous (contiguous) part of an array.

import java.util.*;

// generate every subarray

/* 

public class SubArrayBasic {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40};
    int n = arr.length;
    int count = 0;
    
    for(int i = 0; i < n; i++) {
      for(int j = i; j < n; j++) {
        count++;
        System.out.print(count + " -> ");
        for(int k = i; k <= j; k++) {
          System.out.print(arr[k] + " ");
        }
        System.out.println();
      }
    }

    System.out.println("Total subarray count is: " + count);
  }
}

*/

public class SubArrayBasic {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();
        int n = A.size();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    arr.add(A.get(k));
                }
                arrList.add(arr);
            }
        }

        return arrList;
    }
}
