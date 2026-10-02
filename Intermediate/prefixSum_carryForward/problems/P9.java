package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Best Time to Buy and Sell Stock I

## Problem Description
Given an integer array A where A[i] represents the price of a stock on the i-th day, determine the maximum profit that can be achieved by completing at most one transaction.

A transaction consists of:
- Buying one share of the stock on one day.
- Selling that share on a later day.

Return the maximum possible profit. If no profit can be made, return 0.

---

## Input Format
The first and only input is an integer array A representing stock prices.

---

## Output Format
Return a single integer representing the maximum possible profit.

---

## Example Input

A = [1, 4, 5, 2, 4]

---

## Example Output

4

*/

// tc - O(N)
public class P9 {
    public int maxProfit(final int[] A) {
        int n = A.length;

        if (n < 2)
            return 0;

        int maxPft = 0;
        int min = A[0];
        for (int i = 1; i < n; i++) {
            maxPft = Math.max(maxPft, A[i] - min);
            min = Math.min(min, A[i]);
        }

        return maxPft;
    }
}
