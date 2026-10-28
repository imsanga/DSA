package Intermediate.array_sorting.sorting;

/*
# Problem: Elements Removal

## Problem Description

Given an integer array `A` of size `N`, you can remove any element from the array in one operation.

The cost of each operation is the sum of all elements present in the array before that operation.

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

---

## Example Explanation

### Explanation 1

Given array `A = [2, 1]`:

- Remove `2` from the array. The array becomes `[1]`. The cost is `2 + 1 = 3`.
- Remove `1` from the array. The array becomes `[]`. The cost is `1`.

The total cost is `3 + 1 = 4`.

### Explanation 2

There is only one element in the array. Removing it costs `5`.

Therefore, the total cost is `5`.

*/

import java.util.*;

/*
// iterate using carry forward - O(N^2)

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0;

        // sort descending
        A.sort(Collections.reverseOrder());

        // iterate using carry forward - O(N^2)
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                sum += A.get(j);
            }
        }

        return sum;
    }
}
*/

public class P2 {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int sum = 0;

        // sort descending
        A.sort(Collections.reverseOrder());

        // iterate using contribution technique - O(N)
        for (int i = 0; i < n; i++) {
            sum += A.get(i) * (i + 1);
        }

        return sum;
    }
}
