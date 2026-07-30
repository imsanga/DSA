package JavaRefresher.Exam;

/*
# Problem: Reward Students

## Problem Description
Given an integer array A representing the scores of students, find the highest and second-highest scores and return their sum.

If the highest score appears more than once, it can also be considered as the second-highest score.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return a single integer representing the sum of the highest and second-highest scores.

---

## Example Input

A = [2, 3, 4, 2]

---

## Example Output

7

*/

public class P3 {
    public int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= max) {
                secondMax = max;
                max = A[i];
            } else if (A[i] > secondMax) {
                secondMax = A[i];
            }
        }

        return max + secondMax;
    }
}
