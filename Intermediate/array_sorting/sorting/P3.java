package Intermediate.array_sorting.sorting;

/*
# Problem: Arithmetic Progression?

## Problem Description

Given an integer array `A` of size `N`, return `1` if the array can be rearranged to form an arithmetic progression. Otherwise, return `0`.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.

---

## Problem Constraints

- `2 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`

---

## Input Format

The first and only argument is an integer array `A` of size `N`.

---

## Output Format

Return `1` if the array can be rearranged to form an arithmetic progression.

Otherwise, return `0`.

---

## Example Input

### Input 1

A = [3, 5, 1]

### Input 2

A = [2, 4, 1]

---

## Example Output

### Output 1

1

### Output 2

0

*/

import java.util.*;

public class P3 {
    public int solve(int[] A) {
        int n = A.length;

        // sort ascending
        Arrays.sort(A);

        // iterate the Arrays
        // arithmetic progression: a, a+d, a+2d
        int cd = A[1] - A[0];
        for (int i = 0; i < n - 1; i++) {
            if (A[i + 1] - A[i] != cd)
                return 0;
        }

        return 1;
    }
}