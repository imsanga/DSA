package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Equilibrium Index of an Array

## Problem Description
Given an integer array A, find the equilibrium index of the array.

An equilibrium index is an index such that the sum of all elements to its left is equal to the sum of all elements to its right.

Notes:
- Array indexing starts from 0.
- If there are no elements on the left or right side of an index, the corresponding sum is considered 0.
- If multiple equilibrium indices exist, return the smallest one.
- If no equilibrium index exists, return -1.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return the equilibrium index of the array. If no such index exists, return -1.

---

## Example Input

A = [-7, 1, 5, 2, -4, 3, 0]

---

## Example Output

3

*/

// tc - O(N)
// sc - O(N)
public class P4 {
    public int solve(int[] A) {

        // prefix array
        int n = A.length;
        int[] pfxArr = new int[n];

        pfxArr[0] = A[0];
        for (int i = 1; i < n; i++)
            pfxArr[i] = pfxArr[i - 1] + A[i];

        // equilibrium index => sum of left + sum of right
        for (int j = 0; j < n; j++) {
            int left = (j == 0) ? 0 : pfxArr[j - 1];
            int right = pfxArr[n - 1] - pfxArr[j];
            if (left == right)
                return j;
        }

        return -1;
    }
}
