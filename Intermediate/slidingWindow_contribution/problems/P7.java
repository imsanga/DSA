package Intermediate.slidingWindow_contribution.problems;

/*
# Problem: Minimum Swaps

## Problem Description

Given an array of integers `A` and an integer `B`, find and return the minimum number of swaps required to bring all the numbers less than or equal to `B` together.

It is possible to swap any two elements, not necessarily consecutive.

---

## Problem Constraints

- `1 <= length(A) <= 100000`
- `-10^9 <= A[i], B <= 10^9`

---

## Input Format

The first argument is the integer array `A`.

The second argument is an integer `B`.

---

## Output Format

Return the minimum number of swaps required to bring all elements less than or equal to `B` together.

---

## Example Input

### Input 1

A = [1, 12, 10, 3, 14, 10, 5]
B = 8

### Input 2

A = [5, 17, 100, 11]
B = 20

---

## Example Output

### Output 1

2

### Output 2

1

---

## Example Explanation

### Explanation 1

A = [1, 12, 10, 3, 14, 10, 5]

- Swap `12` and `3`: A becomes `[1, 3, 10, 12, 14, 10, 5]`.
- Swap the first occurrence of `10` and `5`: A becomes `[1, 3, 5, 12, 14, 10, 10]`.

Now, all elements less than or equal to `8` are together. The minimum number of swaps is `2`.

### Explanation 2

A = [5, 17, 100, 11]

Swap `100` and `11`: A becomes `[5, 17, 11, 100]`.

Now, all elements less than or equal to `20` are together. The minimum number of swaps is `1`.

*/

// tc: O(N)
public class P7 {
    public int solve(int[] A, int B) {
        int n = A.length;

        // calculate less than B
        int ltb = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= B)
                ltb++;
        }

        // calculate initial window by ltb as length
        int tempSwap = 0;
        for (int j = 0; j < ltb; j++) {
            if (A[j] > B)
                tempSwap++;
        }

        // using sliding window
        int miniSwap = tempSwap;
        for (int k = 1; k <= n - ltb; k++) {
            if (A[k - 1] > B)
                tempSwap--;
            if (A[k + ltb - 1] > B)
                tempSwap++;

            miniSwap = Math.min(miniSwap, tempSwap);
        }

        return miniSwap;
    }
}
