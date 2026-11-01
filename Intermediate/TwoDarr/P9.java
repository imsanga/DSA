package Intermediate.TwoDarr;

/*
# Problem: Count Increasing Triplets

## Problem Description

You are given an array `A` of `N` elements.

Find the number of triplets `(i, j, k)` such that:

- `i < j < k`
- `A[i] < A[j] < A[k]`

---

## Problem Constraints

- `1 <= N <= 10^3`
- `1 <= A[i] <= 10^9`

---

## Input Format

The first argument `A` is an array of integers.

---

## Output Format

Return an integer representing the number of triplets satisfying the given conditions.

---

## Example Input

### Input 1

A = [1, 2, 4, 3]

### Input 2

A = [2, 1, 2, 3]

---

## Example Output

### Output 1

2

### Output 2

1

---

## Example Explanation

### Explanation 1

The triplets that satisfy the conditions are:

- `[1, 2, 3]`
- `[1, 2, 4]`

Hence, the output is `2`.

### Explanation 2

The triplet that satisfies the conditions is:

- `[1, 2, 3]`

Hence, the output is `1`.

*/

public class P9 {
    public int solve(int[] A) {
        int n = A.length;
        int triplets = 0;

        // take each element as middle and iterate
        for (int i = 0; i < n; i++) {
            int left = 0, right = 0;

            // leftPart
            for (int j = 0; j < i; j++) {
                if (A[j] < A[i])
                    left++;
            }

            // rightPart
            for (int k = i + 1; k < n; k++) {
                if (A[k] > A[i])
                    right++;
            }

            triplets += left * right;
        }

        return triplets;
    }
}
