package Intermediate.prefixSum_carryForward;

// Find maximum element till every index

// tc - O(N^2)
/*

import java.util.Arrays;
public class CarryForwardBasic {
  public static void main(String[] args) {

    int[] arr = {1, 10, 20, 15, 3, 5, 6, 80, 20, 4};
    int n = arr.length;
    int[] maxArr = new int[n];

    maxArr[0] = arr[0];

    for(int i = 1; i < n; i++) {
      int max = 0;
      for(int j = 0; j <= i; j++) {
        if(arr[j] > max) max = arr[j];
      }
      maxArr[i] = max;
    }

    System.out.println("Ans Array: " + Arrays.toString(maxArr));
      
  }
}

*/

// optimised approach
// tc - O(N)
import java.util.Arrays;

public class CarryForwardBasic {
  public static void main(String[] args) {

    int[] arr = { 1, 10, 20, 15, 3, 5, 6, 80, 20, 4 };
    int n = arr.length;
    int max = arr[0];

    for (int i = 1; i < n; i++) {
      max = Math.max(arr[i], max);
      arr[i] = max;
    }

    System.out.println("Ans Array: " + Arrays.toString(arr));

  }
}
