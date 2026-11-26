package Advance1.oneDarray;

/*
# Problem: Rain Water Trapped

## Problem Description

Imagine a histogram where the bar heights are given by the array A. Each bar has a uniform width of 1 unit.

When it rains, water accumulates in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

Example:

The array A = [5, 4, 1, 4, 3, 2, 7] is visualized as a histogram.

The total amount of rainwater trapped in A is 11.

---

## Problem Constraints

- 1 <= |A| <= 10^5
- 0 <= A[i] <= 10^5

---

## Input Format

The first and only argument is the integer array A.

---

## Output Format

Return an integer denoting the total amount of water that can be trapped in these valleys.

---

## Example Input

### Input 1

A = [0, 1, 0, 2]

### Input 2

A = [1, 2]

---

## Example Output

### Output 1

1

### Output 2

0

---

## Example Explanation

### Explanation 1

1 unit of water is trapped on top of the 3rd element.

### Explanation 2

No water is trapped.

*/

/*

// tc: O(n^2)
// sc: O(1)

public class Solution {
    public int trap(final int[] A) {
        int n = A.length;
        int ans = 0;

        if(n <= 1) return ans;

        for(int i = 1; i < n-1; i++) {
            int lMax = A[0];
            for(int j = 1; j <= i; j++) {
                lMax = Math.max(lMax, A[j]);
            }

            int rMax = A[n-1];
            for(int j = i; j < n-1; j++) {
                rMax = Math.max(rMax, A[j]);
            }

            int minOfBoth = Math.min(lMax, rMax);
            ans += minOfBoth - A[i];
        }

        return ans;
    }
}

*/

// tc: O(n+n+n) -- O(n)
// sc: O(4n+4n) -- O(n)

public class P6 {
    public int trap(final int[] A) {
        int n = A.length;
        int ans = 0;

        if (n <= 1)
            return ans;

        // left max array
        int[] lMax = new int[n];
        lMax[0] = A[0];

        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], A[i]);
        }

        // right max array
        int[] rMax = new int[n];
        rMax[n - 1] = A[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], A[i]);
        }

        // compute trapped water array
        for (int i = 1; i < n - 1; i++) {
            int minOfBoth = Math.min(lMax[i], rMax[i]);
            ans += minOfBoth - A[i];
        }

        return ans;
    }
}
