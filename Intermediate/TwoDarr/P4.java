package Intermediate.TwoDarr;

// print all diagonals from right to left

/*
# Problem: Anti Diagonals

## Problem Description

Given an `N * N` square matrix `A`, return an array containing all its anti-diagonals.

The output should be a 2D integer array of size `(2 * N - 1) * N`.

Each row represents one anti-diagonal of the input matrix.

Any vacant positions in the output grid should be filled with `0`.

---

## Problem Constraints

- `1 <= N <= 1000`
- `1 <= A[i][j] <= 10^9`

---

## Input Format

The only argument is a 2D array `A` of size `N * N`.

---

## Output Format

Return a 2D integer array of size `(2 * N - 1) * N`, representing the anti-diagonals of the input matrix.

Fill all vacant positions in the output grid with `0`.

---

## Example Input

### Input 1

A = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

### Input 2

A = [
    [1, 2],
    [3, 4]
]

---

## Example Output

### Output 1

[
    [1, 0, 0],
    [2, 4, 0],
    [3, 5, 7],
    [6, 8, 0],
    [9, 0, 0]
]

### Output 2

[
    [1, 0],
    [2, 3],
    [4, 0]
]

---

## Example Explanation

### Explanation 1

For the input matrix:

[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

The anti-diagonals are:

1. `[1]` → `[1, 0, 0]`
2. `[2, 4]` → `[2, 4, 0]`
3. `[3, 5, 7]` → `[3, 5, 7]`
4. `[6, 8]` → `[6, 8, 0]`
5. `[9]` → `[9, 0, 0]`

### Explanation 2

For the input matrix:

[
    [1, 2],
    [3, 4]
]

The anti-diagonals are:

1. `[1]` → `[1, 0]`
2. `[2, 3]` → `[2, 3]`
3. `[4]` → `[4, 0]`

*/

/*

public class Solution {
    public int[][] diagonal(int[][] A) {

        int m = A.length;
        int n = A[0].length;

        int[][] ans = new int[2*m-1][n];
        int M = 0;

        // 1st half
        for(int i = 0; i < n; i++) {
            int row = 0, col = i, N = 0;

            while(row < m && col >= 0) {
                ans[M][N] = A[row][col];
                row++;
                col--;
                N++;
            }
            M++;
        }

        // 2nd half
        for(int i = 1; i < m; i++) {
            int row = i, col = n-1, N = 0;

            while(row < m && col >= 0) {
                ans[M][N] = A[row][col];
                row++;
                col--;
                N++;
            }
            M++;
        }

        return ans;
    }
}

*/

// tc - O(M*N)
public class P4 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int m = mat.length; // no of rows
        int n = mat[0].length; // no of columns

        // 1st half of matrix
        for (int i = 0; i < n; i++) {
            int row = 0, col = i;

            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }

            System.out.println();
        }

        // 2nd half of matrix
        for (int i = 1; i < m; i++) {
            int row = i, col = n - 1;

            while (row < m && col >= 0) {
                System.out.print(mat[row][col] + " ");
                row++;
                col--;
            }

            System.out.println();
        }

    }
}
