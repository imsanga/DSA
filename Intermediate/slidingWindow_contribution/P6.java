package Intermediate.slidingWindow_contribution;

/*
# Problem: Counting Subarrays Easy

## Problem Description

Given an array `A` of `N` non-negative numbers and a non-negative number `B`,
find the number of subarrays in `A` whose sum is less than `B`.

We may assume that there is no overflow.

---

## Problem Constraints

- `1 <= N <= 5 * 10^3`
- `1 <= A[i] <= 1000`
- `1 <= B <= 10^7`

---

## Input Format

The first argument is an integer array `A`.

The second argument is an integer `B`.

---

## Output Format

Return an integer denoting the number of subarrays in `A` having a sum less than `B`.

---

## Example Input

### Input 1

A = [2, 5, 6]
B = 10

### Input 2

A = [1, 11, 2, 3, 15]
B = 10

---

## Example Output

### Output 1

4

### Output 2

4

*/

// tc: O(N^2)
public class P6 {
    public int solve(int[] A, int B) {
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += A[j];
                if (sum < B)
                    count++;
            }
        }

        return count;
    }
}
