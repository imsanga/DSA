package Intermediate.slidingWindow_contribution;

/*
# Problem: Subarray with Least Average

## Problem Description

Given an array `A` of size `N`, find the subarray of size `B` that has the least average.

---

## Problem Constraints

- `1 <= B <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`

---

## Input Format

The first argument contains an array `A` of integers of size `N`.

The second argument contains an integer `B`, representing the size of the subarray.

---

## Output Format

Return the index of the first element of the subarray of size `B` that has the least average.

Array indexing starts from `0`.

---

## Example Input

### Input 1

A = [3, 7, 90, 20, 10, 50, 40]
B = 3

### Input 2

A = [3, 7, 5, 20, -10, 0, 12]
B = 2

*/

// tc: O(N)
public class P5 {
    public int solve(int[] A, int B) {
        int n = A.length;

        // initial sum 0 -> B
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        // least average = minimum sum
        int minSum = sum;
        int leastAvgStartIndex = 0;
        for (int j = 1; j <= n - B; j++) {
            sum = sum - A[j - 1] + A[j + B - 1];
            if (sum < minSum) {
                minSum = sum;
                leastAvgStartIndex = j;
            }
        }

        return leastAvgStartIndex;
    }
}
