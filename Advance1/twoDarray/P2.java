package Advance1.twoDarray;

/*
# Problem: Sum of All Submatrices

## Problem Description

Given a 2D matrix A of dimensions N x N, return the sum of all possible submatrices.

---

## Problem Constraints

- 1 <= N <= 30
- 0 <= A[i][j] <= 10

---

## Input Format

The single argument represents a 2D array A of size N x N.

---

## Output Format

Return an integer denoting the sum of all possible submatrices in the given matrix.

---

## Example Input

### Input 1

A = [
    [1, 1],
    [1, 1]
]

### Input 2

A = [
    [1, 2],
    [3, 4]
]

---

## Example Output

### Output 1

16

### Output 2

40

---

## Example Explanation

### Example 1

Number of submatrices with 1 element = 4, so the sum of all such submatrices is 4 * 1 = 4.

Number of submatrices with 2 elements = 4, so the sum of all such submatrices is 4 * 2 = 8.

Number of submatrices with 3 elements = 0.

Number of submatrices with 4 elements = 1, so the sum of such submatrices is 4.

Total Sum = 4 + 8 + 4 = 16.

### Example 2

The submatrices are:

[1], [2], [3], [4], [1, 2], [3, 4], [1, 3], [2, 4] and [[1, 2], [3, 4]].

Total sum = 40.

*/

// tc - O(n^2)
// sc - O(1)

public class P2 {
    public int solve(int[][] A) {
        int n = A.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += A[i][j] * (((i + 1) * (n - i)) * ((j + 1) * (n - j)));
            }
        }

        return ans;
    }
}
