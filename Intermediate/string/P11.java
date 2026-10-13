package Intermediate.string;

/*
# Problem: Find the Maximum Number of Consecutive 1s After Replacement

## Problem Description

Given an array consisting of `1`s and `0`s, you are allowed to replace at most one `0` with `1`.

Find the maximum number of consecutive `1`s that can be obtained after making the replacement.

---

## Input Format

An integer array `A` consisting of `1`s and `0`s.

---

## Output Format

Return an integer representing the maximum number of consecutive `1`s that can be obtained after replacing at most one `0` with `1`.

---

## Example Input

A = [1, 1, 0, 1, 1, 0, 1, 1]

---

## Example Output

5

*/

// tc: O(N^2)
public class P11 {
    public static void main(String[] args) {
        int[] A = { 1, 1, 0, 1, 1, 0, 1, 1 };
        int n = A.length, maxy = 0;

        for (int i = 0; i < n; i++) {

            if (A[i] == 0) {
                int left = i - 1, right = i + 1;
                int leftCount = 0, rightCount = 0;

                // iterate left part
                while (left >= 0 && A[left] == 1) {
                    left--;
                    leftCount++;
                }

                // iterate right part
                while (right < n && A[right] == 1) {
                    right++;
                    rightCount++;
                }

                int currentLength = leftCount + 1 + rightCount;

                maxy = Math.max(maxy, currentLength);
            }

        }

        System.out.print(maxy);
    }
}
