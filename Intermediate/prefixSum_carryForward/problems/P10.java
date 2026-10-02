package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Pick from Both Sides

## Problem Description
Given an integer array A and an integer B, perform exactly B operations.

In each operation, you can remove either:
- The leftmost element of the array, or
- The rightmost element of the array.

Return the maximum possible sum of the B removed elements.

---

## Input Format
- The first input is an integer array A.
- The second input is an integer B.

---

## Output Format
Return a single integer representing the maximum possible sum of the removed elements.

---

## Example Input

A = [5, -2, 3, 1, 2]
B = 3

---

## Example Output

8

*/

// tc - O(N)
// sc - O(N)

/*

 A = [5,-2,3,1,2]
 B = 3
 
 lhs rhs sum
 3-6 0-0 6
 2-3 1-2 5
 1-5 2-3 8 -- ans
 0-0 3-6 6

 pfxsum = 5,3,6,7,9
 sfxSum = 2,3,6,4,9

*/

public class P10 {
    public int solve(int[] A, int B) {
        int n = A.length;

        // prefix sum
        int[] pfx = new int[n];
        pfx[0] = A[0];
        for (int i = 1; i < n; i++) {
            pfx[i] = pfx[i - 1] + A[i];
        }

        // suffix sum
        int[] sfx = new int[n];
        sfx[0] = A[n - 1];
        int j = 1;
        for (int i = n - 2; i >= 0; i--) {
            sfx[j] = sfx[j - 1] + A[i];
            j++;
        }

        // pick from both sides
        int max = Integer.MIN_VALUE;
        for (int k = B; k >= 0; k--) {
            int lhs = (k == 0) ? 0 : pfx[k - 1];
            int rhs = (B - k == 0) ? 0 : sfx[B - k - 1];

            max = Math.max(max, lhs + rhs);
        }

        return max;
    }
}
