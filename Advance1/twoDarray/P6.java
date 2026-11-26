package Advance1.twoDarray;

/*
# Problem: Spiral Order Matrix II

## Problem Description

Given an integer A, generate a square matrix filled with elements from 1 to A^2 in spiral order and return the generated square matrix.

---

## Problem Constraints

- 1 <= A <= 1000

---

## Input Format

The first and only argument is an integer A.

---

## Output Format

Return a 2-D matrix which consists of the elements added in spiral order.

---

## Example Input

### Input 1

1

### Input 2

2

### Input 3

5

---

## Example Output

### Output 1

[
    [1]
]

### Output 2

[
    [1, 2],
    [4, 3]
]

### Output 3

[
    [1,  2,  3,  4,  5],
    [16, 17, 18, 19, 6],
    [15, 24, 25, 20, 7],
    [14, 23, 22, 21, 8],
    [13, 12, 11, 10, 9]
]

---

## Example Explanation

### Explanation 1

Only 1 is to be arranged.

### Explanation 2

The elements are arranged in spiral order:

1 --> 2
      |
      |
4 <-- 3

### Explanation 3

The elements from 1 to 25 are arranged in spiral order, starting from the top-left corner and moving right, then down, left, and up until the matrix is filled.

*/

// tc - O(N^2)
// sc - O(1)

public class P6 {
    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int n = A, i = 0, j = 0, ele = 1;

        while (n > 1) {
            // from left to right
            for (int x = 1; x <= n - 1; x++) {
                ans[i][j] = ele;
                ele++;
                j++;
            }

            // from top to bottom
            for (int x = 1; x <= n - 1; x++) {
                ans[i][j] = ele;
                ele++;
                i++;
            }

            // from right to left
            for (int x = 1; x <= n - 1; x++) {
                ans[i][j] = ele;
                ele++;
                j--;
            }

            // from bottom to top
            for (int x = 1; x <= n - 1; x++) {
                ans[i][j] = ele;
                ele++;
                i--;
            }

            i++;
            j++;

            n = n - 2;
        }

        if (n == 1) {
            ans[i][j] = ele;
        }

        return ans;
    }
}
