package Intermediate.arrayBasics.TwoDarr;

/*
# Problem: Row Sum

## Problem Description
Given a 2D integer matrix A, compute the sum of elements in each row.

Return a 1D array where each element represents the sum of the corresponding row in the matrix.

---

## Input Format
The first and only input is a 2D integer matrix A.

---

## Output Format
Return an integer array containing the sum of each row.

---

## Example Input

A = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 2, 3, 4]
]

---

## Example Output

[10, 26, 18]

*/

// tc - O(N^2)
public class P1 {
    public int[] solve(int[][] A) {
        int n = A.length;
        int[] ansArr = new int[n];

        // row wise sum
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < A[i].length; j++) {
                sum += A[i][j];
            }
            ansArr[i] = sum;
        }

        return ansArr;
    }
}
