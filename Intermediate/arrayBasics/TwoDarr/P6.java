package Intermediate.arrayBasics.TwoDarr;

/*
# Problem: Matrix Transpose

## Problem Description
Given a 2D integer matrix A, return the transpose of A.

The transpose of a matrix is obtained by switching its rows and columns. In other words, the element at position A[i][j] moves to position A[j][i] in the transposed matrix.

---

## Input Format
The first and only input is a 2D integer matrix A.

---

## Output Format
Return the transpose of the given matrix.

---

## Example Input

A = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]

---

## Example Output

[
  [1, 4, 7],
  [2, 5, 8],
  [3, 6, 9]
]

*/

public class P6 {
    public int[][] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int[][] ans = new int[col][row];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                ans[i][j] = A[j][i];
            }
        }

        return ans;
    }
}
