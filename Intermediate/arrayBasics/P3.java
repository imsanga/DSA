package Intermediate.arrayBasics;
/*
# Problem: Rotate Array to the Right

## Problem Description
Given an integer array and an integer K, rotate the array to the right by K positions.

In one right rotation, the last element moves to the beginning, and all other elements shift one position to the right.

---

## Input Format
- The first input is an integer array.
- The second input is an integer K, representing the number of right rotations.

---

## Output Format
Print the array after rotating it to the right K times.

---

## Example Input

Array = [1, 2, 3, 4, 5, 6]
K = 3

---

## Example Output

4 5 6 1 2 3

*/

// tc - O(N^2)
// sc - O(1)

/*
public class P3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int[] arr = {1, 2, 3, 4, 5};

        int k = 3; // rotate
        int n = arr.length;

        for (int i = 1; i <= k; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j >= 1; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }

        System.out.print(k + " times rotate of Array: ");

        for (int l : arr)
            System.out.print(l + " ");

    }
}
*/

// optimised approach
// tc - O(N)
// sc - O(1)

public class P3 {
    static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int[] arr = {1, 2, 3, 4, 5};

        int k = 2; // rotate
        int n = arr.length;

        if (k > n)
            k = k % n;

        // reverse fully
        reverse(arr, 0, n - 1);

        // reverse k
        reverse(arr, 0, k - 1);

        // reverse remaining
        reverse(arr, k, n - 1);

        System.out.print(k + " times rotate of Array: ");

        for (int l : arr)
            System.out.print(l + " ");

    }
}