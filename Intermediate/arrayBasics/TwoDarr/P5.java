package Intermediate.arrayBasics.TwoDarr;

/*
# Problem: Row to Column Zero

## Problem Description
Given a 2D integer matrix A, if any element A[i][j] is 0, make all elements in the i-th row and j-th column equal to 0.

Return the modified matrix after performing the required operations.

---

## Input Format
The first and only input is a 2D integer matrix A.

---

## Output Format
Return the modified 2D matrix after setting the appropriate rows and columns to zero.

---

## Example Input

A = [
  [1, 2, 3, 4],
  [5, 6, 7, 0],
  [9, 2, 0, 4]
]

---

## Example Output

[
  [1, 2, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 0, 0]
]

*/

// tc
// n * (m+m) + m * (n+n) + n*m
// n*2m + m*2n + n*m
// 2mn + 2mn + mn
// 5mn
// mn
// O(N*M)

public class P5 {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        // row wise if find 0 turn remaing elements to -1
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < m; j++) {
                if (A[i][j] == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                for (int k = 0; k < m; k++) {
                    if (A[i][k] != 0)
                        A[i][k] = -1;
                }
            }
        }

        // column wise if find 0 turn remaing elements to -1
        for (int i = 0; i < m; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (A[j][i] == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 1) {
                for (int k = 0; k < n; k++) {
                    if (A[k][i] != 0)
                        A[k][i] = -1;
                }
            }
        }

        // now where all -1 is present, change it to 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i][j] == -1) {
                    A[i][j] = 0;
                }
            }
        }

        return A;
    }
}
