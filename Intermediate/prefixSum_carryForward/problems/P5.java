package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Sum of Odd Indexed Elements in a Range

## Problem Description
Given:
- An integer array A.
- A list of range queries B, where each query is represented as [L, R].

For each query, calculate the sum of all elements in A that are present at odd indices within the range [L, R].

Note: Array indexing is 0-based.

---

## Input Format
- The first input is an integer array A.
- The second input is a 2D integer array B, where each row contains two integers [L, R].

---

## Output Format
Return an integer array where each element represents the sum of elements at odd indices for the corresponding query.

---

## Example Input

A = [2, 8, 3, 9, 15]

B = [
  [1, 4],
  [0, 2],
  [2, 3]
]

---

## Example Output

[17, 8, 9]

*/

// tc - O(N)
public class P5 {
    public int[] sumOfOddIndexedElements(int[] A, int[][] B) {
        int n = A.length;

        // odd prefixSum
        int[] oddPfx = new int[n];
        oddPfx[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0)
                oddPfx[i] = oddPfx[i - 1] + A[i];
            else
                oddPfx[i] = oddPfx[i - 1];
        }

        // query Execution
        int q = B.length;
        int[] ansArr = new int[q];
        for (int j = 0; j < q; j++) {
            int left = B[j][0], right = B[j][1];

            if (left == 0)
                ansArr[j] = oddPfx[right];
            else
                ansArr[j] = oddPfx[right] - oddPfx[left - 1];
        }

        return ansArr;
    }
}
