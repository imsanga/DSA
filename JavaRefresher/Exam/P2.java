package JavaRefresher.Exam;

/*
# Problem: Reverse Given Array

## Problem Description
Given an integer array A, reverse the elements of the array and return the reversed array.

The reversal should be done by swapping elements from the beginning and the end of the array until the entire array is reversed.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return the reversed array.

---

## Example Input

A = [2, 1, 3]

---

## Example Output

[3, 1, 2]

*/
import java.util.*;

public class P2 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = A.size() - 1; i >= 0; i--) {
            al.add(A.get(i));
        }

        return al;
    }
}
