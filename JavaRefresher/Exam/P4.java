package JavaRefresher.Exam;

/*
# Problem: Tom's Mathematical Operation

## Problem Description
Given an integer array A, find the sum of all elements that are present at odd indices.

Note: Use 0-based indexing.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return a single integer representing the sum of all elements at odd indices.

---

## Example Input

A = [2, 1, 3, 5]

---

## Example Output

6

*/

public class P4 {
    public int solve(int[] A) {
        int ans = 0;

        for (int i = 1; i < A.length; i += 2) {
            ans += A[i];
        }

        return ans;
    }
}
