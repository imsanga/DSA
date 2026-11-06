package JavaRefresher.Fnc_Arrays_Strings_Hash;

// Arrays - single variable can hold more than one value of same data type

import java.util.*;

public class ArraysBasics {
    public static void main(String[] args) {

        // *** 1d array ***

        // array creation
        // int[] arr1 = new int[3];
        // int[] arr2 = new int[] { 1, 2, 3 };
        // int[] arr3 = { 1, 2, 3, 4, 5 };

        // empty array
        // int[] arr4 = new int[0];

        // 1d array
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        for (int i : arr)
            System.out.println(i);

        // Compare 2 arrays
        int[] arr0 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.equals(arr, arr0));

        // *** 2d array (array of arrays) ***

        // 1. Specify size
        int[][] arr1 = new int[2][3];

        // 2. Using new with values
        int[][] arr2 = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // 3. Direct initialization
        int[][] arr3 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        // 4. Empty array
        int[][] arr4 = new int[0][0];

        // Compare 2 arrays
        System.out.println(Arrays.deepEquals(arr2, arr3));

        // example
        int[][] arr2d = { { 1 }, { 1, 2 }, { 1, 2, 3 } };

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j]);
            }
            System.out.println();
        }

        for (int[] i : arr2d) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
