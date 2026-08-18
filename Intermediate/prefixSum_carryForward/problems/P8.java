package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Leaders in an Array

## Problem Description
Given an integer array A containing distinct elements, find all the leader elements in the array.

A leader is an element that is strictly greater than all the elements to its right.

Note:
- The rightmost element is always a leader.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return an integer array containing all the leader elements.

---

## Example Input

A = [16, 17, 4, 3, 5, 2]

---

## Example Output

[17, 5, 2]

*/

import java.util.ArrayList;

// tc - O(N)
public class P8 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ansArr = new ArrayList<>();
        int max = 0;
        for (int i = A.size() - 1; i >= 0; i--) {
            if (A.get(i) > max) {
                max = A.get(i);
                ansArr.add(max);
            }
        }

        return ansArr;
    }
}