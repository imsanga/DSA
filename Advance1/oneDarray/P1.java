package Advance1.oneDarray;

// max subarray sum

// brute force approach - tc: O(N^3) & sc: O(1)
// prefix sum - tc: O(N^2) & sc: O(N)
// carry forward - tc: O(N^2) & sc: O(1)

// Kadane's Algorithm - tc: O(N) & sc: O(1)
// It decides whether to extend the existing subarray or start fresh at each element.

/*
# Problem: Max Sum Contiguous Subarray

## Problem Description

Given an array `A` of length `N`, find the maximum possible sum of any non-empty contiguous subarray.

In other words, among all possible subarrays of `A`, determine the one that yields the highest sum and return that sum.

---

## Problem Constraints

- `1 <= N <= 10^6`
- `-1000 <= A[i] <= 1000`

---

## Input Format

The first and only argument is an integer array `A`.

---

## Output Format

Return an integer representing the maximum possible sum of a non-empty contiguous subarray.

---

## Example Input

### Input 1

A = [1, 2, 3, 4, -10]

### Input 2

A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

---

## Example Output

### Output 1

10

### Output 2

6

*/

// with indices 

/* 

public class Main {
    public static void main(String[] args) {
        int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0, startIndex = -1, endIndex = -1, temp = -1;

        for (int i = 0; i < n; i++) {
            if (sum == 0)
                temp = i;
            sum += A[i];

            if (sum > max) {
                startIndex = temp;
                endIndex = i;
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }

        System.out.println("max : " + max);
        System.out.println("startIndex : " + startIndex);
        System.out.println("endIndex : " + endIndex);
    }
}

*/

public class P1 {
    public int maxSubArray(final int[] A) {
        int n = A.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            max = Math.max(max, sum);
            if (sum < 0)
                sum = 0;
        }

        return max;
    }
}
