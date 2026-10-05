package Intermediate.array_sorting.sorting;

/*
# Problem: Noble Integer

## Problem Description

Given an integer array `A`, find if an integer `p` exists in the array such that the number of integers greater than `p` in the array is equal to `p`.

Return `1` if such an integer `p` exists. Otherwise, return `-1`.

---

## Problem Constraints

- `1 <= |A| <= 2 * 10^5`
- `-10^8 <= A[i] <= 10^8`

---

## Input Format

The first and only argument is an integer array `A`.

---

## Output Format

Return `1` if any such integer `p` is present in the array.

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

*/

import java.util.*;

public class P1 {
    public int solve(int[] A) {
        int n = A.length;

        // sort asc
        Arrays.sort(A);

        // iterate array to check noble integer
        for(int i = 0; i < n; i++) {
            if(i < n-1 && A[i+1] == A[i]) continue;
            else if(A[i] == n-1-i) return 1;
        }

        return -1;
    }
}