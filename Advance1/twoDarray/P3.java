package Advance1.twoDarray;

/*
# Problem: Search in a Row-Wise and Column-Wise Sorted Matrix

## Problem Description

Given a matrix of integers A of size N x M and an integer B.

In the given matrix, every row and column is sorted in non-decreasing order.

Find and return the position of B in the matrix in the following form:

- If A[i][j] = B, return (i * 1009 + j).
- If B is not present, return -1.

NOTE:

1. Rows are numbered from top to bottom and columns are numbered from left to right.
2. If there are multiple occurrences of B in A, return the smallest value of
   i * 1009 + j such that A[i][j] = B.
3. Expected time complexity is linear.
4. Use 1-based indexing.

---

## Problem Constraints

- 1 <= N, M <= 1000
- -100000 <= A[i][j] <= 100000
- -100000 <= B <= 100000

---

## Input Format

The first argument given is the integer matrix A.

The second argument given is the integer B.

---

## Output Format

Return the position of B using the formula (i * 1009 + j).

If B is not present in A, return -1.

---

## Example Input

### Input 1

A = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

B = 2

### Input 2

A = [
    [1, 2],
    [3, 3]
]

B = 3

---

## Example Output

### Output 1

1011

### Output 2

2019

---

## Example Explanation

### Explanation 1

A[1][2] = 2

Position = 1 * 1009 + 2
         = 1011

Therefore, return 1011.

### Explanation 2

A[2][1] = 3

Position = 2 * 1009 + 1
         = 2019

A[2][2] = 3

Position = 2 * 1009 + 2
         = 2020

The minimum value is 2019.

Therefore, return 2019.

*/

// tc - O(N+M)
// sc - O(1)
public class P3 {
    public int solve(int[][] A, int B) {
        int n = A.length;
        int m = A[0].length;
        int i = 0, j = m - 1, ans = 0, minAns = Integer.MAX_VALUE;

        while (i < n && j >= 0) {
            if (A[i][j] == B) {
                ans = ((i + 1) * 1009) + (j + 1);

                if (ans < minAns) {
                    minAns = ans;
                }

                j--;
            } else if (A[i][j] < B) {
                i++;
            } else if (A[i][j] > B) {
                j--;
            }
        }

        if (ans == 0)
            return -1;
        else
            return minAns;
    }
}
