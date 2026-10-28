package Intermediate.array_sorting.sorting;

/*
# Problem: Noble Integer

## Problem Description

Given an integer array `A`, determine whether an integer `p` exists in the array such that the number of integers strictly greater than `p` in the array is equal to `p`.

---

## Problem Constraints

- `1 <= |A| <= 2 * 10^5`
- `-10^8 <= A[i] <= 10^8`

---

## Input Format

The first and only argument is an integer array `A`.

---

## Output Format

Return `1` if any such integer `p` exists.

Otherwise, return `-1`.

---

## Example Input

### Input 1

A = [3, 2, 1, 3]

### Input 2

A = [1, 1, 3, 3]

---

## Example Output

### Output 1

1

### Output 2

-1

---

## Example Explanation

### Explanation 1

For the integer `p = 2`, there are exactly two elements greater than `2` in the array: `3` and `3`.

Therefore, the output is `1`.

### Explanation 2

There is no integer in the array that satisfies the required condition.

Therefore, the output is `-1`.

*/

import java.util.*;

public class P1 {
    public int solve(int[] A) {
        int n = A.length;

        // sort asc
        Arrays.sort(A);

        // noble integer
        for (int i = 0; i < n - 1; i++) {
            if (A[i] != A[i + 1]) {
                if (A[i] == (n - 1) - (i + 1) + 1)
                    return 1;
            }
        }

        // if last digit is zero
        if (A[n - 1] == 0)
            return 1;

        return -1;
    }
}