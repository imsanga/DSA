package Intermediate.prefixSum_carryForward;

// sum all previous element till every index

// tc - O(N^2)
/*

import java.util.Arrays;
public class PrefixSumBasic {
  public static void main(String[] args) {

    int[] arr = {1, 10, 20, 15, 3, 5, 6, 80, 20, 4};
    int n = arr.length;
    int[] prefixSumArr = new int[n];

    prefixSumArr[0] = arr[0];

    for(int i = 1; i < n; i++) {
      int sum = 0;
      for(int j = 0; j <= i; j++) {
        sum += arr[j];
      }
      prefixSumArr[i] = sum;
    }
    
    System.out.println("Ans Array: " + Arrays.toString(prefixSumArr));
      
  }
}

*/

// tc - O(N)
import java.util.Arrays;

public class PrefixSumBasic {
  public static void main(String[] args) {

    int[] arr = { 1, 10, 20, 15, 3, 5, 6, 80, 20, 4 };
    int n = arr.length;
    int[] prefixSumArr = new int[n];

    prefixSumArr[0] = arr[0];

    for (int i = 1; i < n; i++) {
      prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
    }

    System.out.println("Ans Array: " + Arrays.toString(prefixSumArr));

  }
}
