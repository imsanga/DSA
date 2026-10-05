package Intermediate.array_sorting.sorting;

/*
# Problem: Elements Removal

## Problem Description

Given an integer array `A` of size `N`, you can remove any element from the array in one operation.

The cost of each operation is equal to the sum of all elements present in the array before that operation.

Find the minimum total cost required to remove all elements from the array.

---

## Problem Constraints

- `0 <= N <= 1000`
- `1 <= A[i] <= 10^3`

---

## Input Format

The first and only argument is an integer array `A`.

---

## Output Format

Return an integer denoting the minimum total cost of removing all elements from the array.

---

## Example Input

### Input 1

A = [2, 1]

### Input 2

A = [5]

---

## Example Output

### Output 1

4

### Output 2

5

*/

import java.util.*;

public class P2 {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0;

        // sort descending
        A.sort(Collections.reverseOrder());

        // iterate using carry forward - O(N^2)
        // for(int i = 0; i < n; i++) {
        // for(int j = i; j < n; j++) {
        // sum += A.get(j);
        // }
        // }

        // iterate using contribution technique - O(N)
        for (int i = 0; i < n; i++) {
            sum += A.get(i) * (i + 1);
        }

        return sum;
    }
}
