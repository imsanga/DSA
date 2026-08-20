package Intermediate.arrayBasics.sorting;

/*
# Problem: Elements Removal

## Problem Description
Given an integer array A, you can remove one element from the array in each operation.

The cost of removing an element is equal to the sum of all elements present in the array before that operation.

Find the minimum total cost required to remove all elements from the array.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return a single integer representing the minimum total cost to remove all elements from the array.

---

## Example Input

A = [2, 1]

---

## Example Output

4

*/

// tc - O(nlogn)

import java.util.Arrays;

public class P2 {
    public int solve(int[] A) {
        int n = A.length;

        // sort asc
        Arrays.sort(A);

        // running prefix and calculate sum
        int sum = 0, pfx = 0;
        for (int j = 0; j < n; j++) {
            pfx += A[j];
            sum += pfx;
        }

        return sum;
    }
}
