package Intermediate.arrayBasics;

/*
# Problem: Arithmetic Progression?

## Problem Description
Given an integer array A, determine whether its elements can be rearranged to form an arithmetic progression.

An arithmetic progression is a sequence in which the difference between every pair of consecutive elements is the same.

Return 1 if the array can be rearranged into an arithmetic progression; otherwise, return 0.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return 1 if the array can be rearranged to form an arithmetic progression; otherwise, return 0.

---

## Example Input

A = [3, 5, 1]

---

## Example Output

1

*/

import java.util.Arrays;

public class P7 {
    public int solve(int[] A) {

        // sort asc
        Arrays.sort(A);

        // iterate array
        int n = A.length;
        int d = A[1] - A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] - A[i - 1] != d)
                return 0;
        }

        return 1;

    }
}
