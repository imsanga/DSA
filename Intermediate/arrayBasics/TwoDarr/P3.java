package Intermediate.arrayBasics.TwoDarr;

/*
# Problem: Print Diagonals of a Square Matrix

## Problem Description
Given a 2D square matrix of size N × N, print its two diagonals.

- The primary diagonal consists of elements where row index equals column index (i == j).
- The secondary diagonal consists of elements where the sum of row and column indices equals N - 1 (i + j == N - 1).

Print the elements of both diagonals.

---

## Input Format
The first input is a 2D square matrix mat of size N × N.

---

## Output Format
Print the elements of the primary diagonal followed by the elements of the secondary diagonal.

---

## Example Input

mat = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]

---

## Example Output

Primary Diagonal: 1 5 9
Secondary Diagonal: 3 5 7

*/

import java.util.Arrays;

// tc - O(N)
public class P3 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = mat.length;
        int[] diagonalArr = new int[n];
        int[] antiDiagonalArr = new int[n];

        // diagonal & antiDiagonal
        for (int i = 0; i < n; i++) {
            diagonalArr[i] = mat[i][i];
            antiDiagonalArr[i] = mat[i][n - i - 1];
        }
        System.out.println("Diagonal Array" + Arrays.toString(diagonalArr));
        System.out.println("Anti Diagonal Array" + Arrays.toString(antiDiagonalArr));
    }
}
