package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Count Even Numbers in a Range

## Problem Description
Given:
- An integer array A.
- A list of range queries B, where each query is represented as [L, R].

For each query, count the number of even elements present in the range A[L] to A[R] (both inclusive).

---

## Input Format
- The first input is an integer array A.
- The second input is a 2D integer array B, where each row contains two integers [L, R].

---

## Output Format
Return an integer array where each element represents the count of even numbers for the corresponding query.

---

## Example Input

A = [1, 2, 3, 4, 5]

B = [
  [0, 2],
  [2, 4],
  [1, 4]
]

---

## Example Output

[1, 1, 2]

*/

// tc - O(N)
public class P6 {
    public int[] solve(int[] A, int[][] B) {

        int n = A.length;

        // evenPrefix array
        int[] evenPfx = new int[n];
        evenPfx[0] = (A[0] % 2 == 0) ? 1 : 0;

        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0)
                evenPfx[i] = evenPfx[i - 1] + 1;
            else
                evenPfx[i] = evenPfx[i - 1];
        }

        // query execution
        int q = B.length;
        int[] ansArr = new int[q];

        for (int j = 0; j < q; j++) {
            int left = B[j][0], right = B[j][1];
            if (left == 0)
                ansArr[j] = evenPfx[right];
            else
                ansArr[j] = evenPfx[right] - evenPfx[left - 1];
        }

        return ansArr;

    }
}
