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
public class P10 {
    public int solve(int[] A, int B) {
        int n = A.length;

        // prefix array
        int[] pfx = new int[n];
        pfx[0] = A[0];
        for (int i = 1; i < n; i++)
            pfx[i] = pfx[i - 1] + A[i];

        // suffix array
        int[] sfx = new int[n];
        sfx[0] = A[n - 1];
        for (int j = n - 2; j >= 0; j--)
            sfx[n - j - 1] = sfx[n - j - 2] + A[j];

        // iterate from B -> 0
        int max = pfx[B - 1], right = 1;
        for (int left = B - 1; left >= 0; left--) {
            if (left == 0) {
                max = Math.max(sfx[right - 1], max);
            } else {
                max = Math.max(pfx[left - 1] + sfx[right - 1], max);
            }
            right++;
        }

        return max;
    }
}
