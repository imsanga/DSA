package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Closest MinMax

## Problem Description
Given an integer array A, find the length of the smallest subarray that contains at least one occurrence of the minimum element and at least one occurrence of the maximum element of the array.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return a single integer representing the length of the smallest subarray containing both the minimum and maximum elements.

---

## Example Input

A = [2, 6, 1, 6, 9]

---

## Example Output

3

*/

// tc - O(N)
public class P11 {
    public int solve(int[] A) {
        int n = A.length;

        // min and max in array
        int min = A[0], max = A[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(A[i], min);
            max = Math.max(A[i], max);
        }

        // prefix min and max array
        int[] pfxMin = new int[n];
        int[] pfxMax = new int[n];
        pfxMax[0] = A[0] == max ? 0 : -1;
        pfxMin[0] = A[0] == min ? 0 : -1;

        for (int j = 1; j < n; j++) {
            if (A[j] == min) {
                pfxMin[j] = j;
            } else {
                pfxMin[j] = pfxMin[j - 1];
            }

            if (A[j] == max) {
                pfxMax[j] = j;
            } else {
                pfxMax[j] = pfxMax[j - 1];
            }
        }

        // closestMinMax
        int closestMinMax = n;
        for (int k = 0; k < n; k++) {
            if (pfxMin[k] != -1 && pfxMax[k] != -1) {
                int subArr = k - Math.min(pfxMin[k], pfxMax[k]) + 1;
                closestMinMax = Math.min(subArr, closestMinMax);
            }
        }

        return closestMinMax;
    }
}
