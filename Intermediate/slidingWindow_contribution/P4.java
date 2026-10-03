package Intermediate.slidingWindow_contribution;

/*
# Problem: Maximum Subarray Easy

## Problem Description

You are given an integer array `C` of size `A`.

Find a contiguous subarray such that:
- The sum of its elements is maximum.
- The sum must not exceed `B`.

Return the maximum possible sum.

---

## Problem Constraints

- `1 <= A <= 10^3`
- `1 <= B <= 10^9`
- `1 <= C[i] <= 10^6`

---

## Input Format

The first argument is the integer `A`, representing the size of the array.

The second argument is the integer `B`, representing the maximum allowed sum.

The third argument is the integer array `C`.

---

## Output Format

Return a single integer denoting the maximum sum of a contiguous subarray that does not exceed `B`.

---

## Example Input

### Input 1

A = 5
B = 12
C = [2, 1, 3, 4, 5]

### Input 2

A = 3
B = 1
C = [2, 2, 2]

---

## Example Output

### Output 1

12

### Output 2

0

*/

// tc: O(N^2)
public class P4 {
    public int maxSubarray(int A, int B, int[] C) {

        int maxSubarraySum = 0;

        for (int i = 0; i < A; i++) {
            int sum = 0;
            for (int j = i; j < A; j++) {
                sum += C[j];
                if (sum > maxSubarraySum && sum <= B) {
                    maxSubarraySum = sum;
                }
            }
        }

        return maxSubarraySum;
    }
}
