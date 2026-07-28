package JavaRefresher.Exam;

/*
# Problem: Check if Array is Sorted

## Problem Description
Given an integer array A, determine whether it is sorted in non-decreasing order.

A non-decreasing order means each element is greater than or equal to the previous element.

Return 1 if the array is sorted; otherwise, return 0.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return 1 if the array is sorted in non-decreasing order; otherwise, return 0.

---

## Example Input

A = [1, 2, 2]

---

## Example Output

1

*/

public class P5 {
    public int solve(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] < A[i])
                return 0;
        }

        return 1;
    }
}
