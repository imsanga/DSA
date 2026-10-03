package Intermediate.slidingWindow_contribution;

/*
# Problem: Subarray with Given Sum and Length

## Problem Description

Given an array `A` of length `N`. Also given two integers `B` and `C`.

Return `1` if there exists a subarray of length `B` whose sum is equal to `C`.
Otherwise, return `0`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^4`
- `1 <= B <= N`
- `1 <= C <= 10^9`

---

## Input Format

The first argument `A` is an array of integers.

The remaining arguments `B` and `C` are integers.

---

## Output Format

Return `1` if a subarray of length `B` with sum `C` exists.

Otherwise, return `0`.

---

## Example Input

### Input 1

A = [4, 3, 2, 6, 1]
B = 3
C = 11

### Input 2

A = [4, 2, 2, 5, 1]
B = 4
C = 6

---

## Example Output

### Output 1

1

### Output 2

0

*/

// tc: O(N)
public class P3 {
    public int solve(int[] A, int B, int C) {
        int n = A.length;

        // sum from 0 -> B
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        if (sum == C)
            return 1;

        for (int j = 1; j < n - B + 1; j++) {
            sum = sum - A[j - 1] + A[j + B - 1];
            if (sum == C)
                return 1;
        }

        return 0;
    }
}
