package Intermediate.slidingWindow_contribution;

/*
# Problem: Subarray with Least Average

## Problem Description

Given an array `A` of size `N`, find the subarray of size `B` with the least average.

---

## Problem Constraints

- `1 <= B <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`

---

## Input Format

The first argument contains an integer array `A` of size `N`.

The second argument contains an integer `B`.

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

---

## Example Output

### Output 1

3

### Output 2

4

*/

// tc: O(N)
public class P8 {
    public int solve(int[] A, int B) {
        int n = A.length;

        // count numbersLessThanB
        int numLTb = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= B)
                numLTb++;
        }

        // numbersLessThanB is the subarray we want to construct in minimum swaps
        int subArrLen = numLTb;

        // inital window count numbersGreaterthanB from 0 -> subArrLen
        int numGTb = 0;
        for (int j = 0; j < subArrLen; j++) {
            if (A[j] > B)
                numGTb++;
        }

        // traverse the remaining array
        int minSwap = numGTb;
        for (int x = 1; x <= n - subArrLen; x++) {
            if (A[x - 1] > B)
                numGTb--;
            if (A[x + subArrLen - 1] > B)
                numGTb++;
            minSwap = Math.min(minSwap, numGTb);
        }

        return minSwap;

    }
}
