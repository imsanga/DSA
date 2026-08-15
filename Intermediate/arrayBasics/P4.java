package Intermediate.arrayBasics;

/*
# Problem: Sum of Maximum and Minimum Elements

## Problem Description
Given an integer array A, find the maximum and minimum elements in the array and return their sum.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return a single integer representing the sum of the maximum and minimum elements of the array.

---

## Example Input

A = [-2, 1, -4, 5, 3]

---

## Example Output

1

*/

public class P4 {
    public int solve(int[] A) {

        int max = A[0], min = A[0];

        for (int i = 1; i <= A.length - 1; i++) {
            if (A[i] > max)
                max = A[i];
            else if (A[i] < min)
                min = A[i];
        }

        return max + min;
    }
}
