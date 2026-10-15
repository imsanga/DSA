package Intermediate.exam;

/*
# Problem: Bob the Builder

## Problem Description

Sophie is a nutritionist who is obsessed with healthy eating. She has a list `A` of size `N` containing the nutritional values of different foods.

Sophie gives Bob a query array `B` of size `Q`. For each query, she provides a range from `L` to `R` and asks him to find the count of foods with nutritional values strictly greater than `10` in the subarray:

`A[L], A[L + 1], ..., A[R]`

Bob is busy building a new gym, so he asks you to find the answers to all of Sophie's queries.

**Note:** The queries in array `B` use 1-based indexing. Subtract `1` from the given indices when accessing the array.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^5`
- `1 <= Q <= 10^5`
- `1 <= L, R <= N`

---

## Input Format

The first argument `A` is an array of integers.

The second argument `B` is a 2D array of integers, where each row contains two integers `L` and `R` representing a query range.

---

## Output Format

Return an array of integers where the `i`-th element contains the count of integers strictly greater than `10` in the range from `A[B[i][0]]` to `A[B[i][1]]`, using the given 1-based indexing.

---

## Example Input

### Input 1

A = [1, 101, 201, 3]

B = [
    [1, 2],
    [1, 4]
]

### Input 2

A = [100, 11, 21, 1]

B = [
    [2, 4],
    [1, 3]
]

---

## Example Output

### Output 1

[1, 2]

### Output 2

[2, 3]

---

## Example Explanation

### Explanation 1

1. Query `[1, 2]` contains the subarray `[1, 101]`. The count of integers greater than `10` is `1`.
2. Query `[1, 4]` contains the subarray `[1, 101, 201, 3]`. The count of integers greater than `10` is `2`.

Hence, the output is `[1, 2]`.

### Explanation 2

1. Query `[2, 4]` contains the subarray `[11, 21, 1]`. The count of integers greater than `10` is `2`.
2. Query `[1, 3]` contains the subarray `[100, 11, 21]`. The count of integers greater than `10` is `3`.

Hence, the output is `[2, 3]`.

*/

import java.util.*;

public class P4 {
    public static void main(String[] args) {
        int[] A = { 1, 101, 201, 3 };

        int[][] B = {
                { 1, 2 },
                { 1, 4 }
        };

        // pfx > 10
        int n = A.length;
        int[] pfx = new int[n + 1];
        pfx[0] = 0;

        for (int i = 0; i < n; i++) {
            if (A[i] > 10)
                pfx[i + 1] = pfx[i] + 1;
            else
                pfx[i + 1] = pfx[i];
        }

        // query execution
        int bl = B.length;
        int[] ans = new int[bl];
        for (int i = 0; i < bl; i++) {
            int left = B[i][0];
            int right = B[i][1];

            if (left == 0)
                ans[i] = pfx[right];
            else {
                ans[i] = pfx[right] - pfx[left - 1];
            }

        }
        System.out.println(Arrays.toString(ans));
    }
}
