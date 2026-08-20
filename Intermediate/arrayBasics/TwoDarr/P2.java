package Intermediate.arrayBasics.TwoDarr;

/*
# Problem: Column Sum

## Problem Description
Given a 2D integer matrix A, compute the sum of elements in each column.

Return a 1D array where each element represents the sum of the corresponding column in the matrix.

---

## Input Format
The first and only input is a 2D integer matrix A.

---

## Output Format
Return an integer array containing the sum of each column.

---

## Example Input

A = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 2, 3, 4]
]

---

## Example Output

[15, 10, 13, 16]

*/

// tc - O(N^2)
public class P2 {
    public int[] solve(int[][] A) {
        int noOfcolumns = A[0].length;
        int[] ansArr = new int[noOfcolumns];

        // column wise sum
        for (int i = 0; i < A[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum += A[j][i];
            }
            ansArr[i] = sum;
        }

        return ansArr;
    }
}
