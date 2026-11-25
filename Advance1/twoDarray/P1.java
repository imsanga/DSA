package Advance1.twoDarray;

/*
# Problem: First Missing Integer

## Problem Description

Given an unsorted integer array A of size N, find the first missing positive integer.

Note: Your algorithm should run in O(N) time and use constant space.

---

## Problem Constraints

- 1 <= N <= 1000000
- -10^9 <= A[i] <= 10^9

---

## Input Format

The first argument is an integer array A.

---

## Output Format

Return an integer denoting the first missing positive integer.

---

## Example Input

### Input 1

[1, 2, 0]

### Input 2

[3, 4, -1, 1]

### Input 3

[-8, -7, -6]

---

## Example Output

### Output 1

3

### Output 2

2

### Output 3

1

---

## Example Explanation

### Explanation 1

A = [1, 2, 0]

The first positive integer missing from the array is 3.

### Explanation 2

A = [3, 4, -1, 1]

The first positive integer missing from the array is 2.

### Explanation 3

A = [-8, -7, -6]

The first positive integer missing from the array is 1.

*/

import java.util.Arrays;

/* 
// tc - O(nlogn+n) -- O(n)
// sc - O(1)
public class Solution {
    public int firstMissingPositive(int[] A) {
        Arrays.sort(A);

        int missing = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == missing) {
                missing++;
            }
        }

        return missing;
    }
}

*/

// tc - O(n+n) -- O(n)
// sc - O(n)

public class P1 {
    public int firstMissingPositive(int[] A) {
        int n = A.length;

        boolean[] ans = new boolean[n + 1];
        Arrays.fill(ans, false);

        for (int i = 0; i < n; i++) {
            if (A[i] >= 1 && A[i] <= n) {
                ans[A[i]] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if (ans[i] == false) {
                return i;
            }
        }

        return n + 1;
    }
}
