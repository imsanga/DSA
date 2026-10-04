package Intermediate.slidingWindow_contribution;

/*
# Problem: Good Subarrays Easy

## Problem Description

Given an array of integers `A`, a subarray is said to be good if it satisfies any one of the following criteria:

1. The length of the subarray is even, and the sum of all the elements of the subarray is less than `B`.
2. The length of the subarray is odd, and the sum of all the elements of the subarray is greater than `B`.

Find the total number of good subarrays in `A`.

---

## Problem Constraints

- `1 <= len(A) <= 5 * 10^3`
- `1 <= A[i] <= 10^3`
- `1 <= B <= 10^7`

---

## Input Format

The first argument is the integer array `A`.

The second argument is an integer `B`.

---

## Output Format

Return the count of good subarrays in `A`.

---

## Example Input

### Input 1

A = [1, 2, 3, 4, 5]
B = 4

### Input 2

A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65

---

## Example Output

### Output 1

6

### Output 2

36

*/

public class P7 {
    public int solve(int[] A, int B) {
        int n = A.length;
        int countGoodSubArr = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                int length = j - i + 1;
                sum += A[j];
                if (sum < B && length % 2 == 0 || sum > B && length % 2 != 0) {
                    countGoodSubArr++;
                }
            }
        }

        return countGoodSubArr;
    }
}
