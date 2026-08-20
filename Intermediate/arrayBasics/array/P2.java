package Intermediate.arrayBasics.array;

/*
# Problem: Reverse an Array

## Problem Description
Given an integer array, reverse its elements in place using the two-pointer technique.

Swap the first and last elements, then move the pointers towards the center until the entire array is reversed.

---

## Input Format
The first and only input is an integer array.

---

## Output Format
Print the elements of the reversed array.

---

## Example Input

[1, 2, 3, 4, 5, 6]

---

## Example Output

Reverse of Array: 6 5 4 3 2 1

*/

// tc - O(N)
// sc - O(1)
public class P2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int[] arr = {1, 2, 3, 4, 5};

        int i = 0, j = arr.length - 1, temp;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.print("Reverse of Array: ");

        for (int k : arr)
            System.out.print(k + " ");

    }
}
