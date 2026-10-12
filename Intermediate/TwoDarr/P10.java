package Intermediate.TwoDarr;

/*
# Problem: Rotate Matrix

## Problem Description

You are given an `n x n` 2D matrix `A` representing an image.

Rotate the image by 90 degrees clockwise.

The rotation must be performed in place.

Note: If you use an additional array, you will receive only partial score.

---

## Problem Constraints

- `1 <= n <= 1000`

---

## Input Format

The first argument is a 2D matrix `A` of integers.

---

## Output Format

Return the 2D matrix after rotating it 90 degrees clockwise.

---

## Example Input

### Input 1

[
    [1, 2],
    [3, 4]
]

### Input 2

[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

---

## Example Output

### Output 1

[
    [3, 1],
    [4, 2]
]

### Output 2

[
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
]

*/

import java.util.Arrays;

public class P10 {
    public void solve(int[][] A) {
        int m = A.length;
        int n = A[0].length;

        // transpose the matrix by swap
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // reverse each row
        for (int i = 0; i < m; i++) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = A[i][start];
                A[i][start] = A[i][end];
                A[i][end] = temp;
                start++;
                end--;
            }
        }

        // return the rotated array
        System.out.print(Arrays.deepToString(A));
    }
}
