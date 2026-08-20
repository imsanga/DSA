package Intermediate.arrayBasics.sorting;

import java.util.Arrays;

/*
# Problem: Noble Integer

## Problem Description
Given an integer array A, determine whether there exists an integer p such that the number of elements strictly greater than p in the array is exactly equal to p.

Return 1 if such an integer exists; otherwise, return -1.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return 1 if a noble integer exists; otherwise, return -1.

---

## Example Input

A = [3, 2, 1, 3]

---

## Example Output

1

*/

public class P1i {
    public int solve(int[] A) {
        int n = A.length;

        // sort asc
        Arrays.sort(A);

        // iterate arr
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && A[i] == A[i + 1])
                continue;
            else if (A[i] == n - 1 - i)
                return 1;
        }

        return -1;
    }
}
