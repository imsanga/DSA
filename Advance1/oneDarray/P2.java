package Advance1.oneDarray;

/*
# Problem: Continuous Sum Query

## Problem Description

There are `A` beggars sitting in a row outside a temple. Each beggar initially has an empty pot.

When devotees visit the temple, they donate a fixed amount of coins to a group of consecutive beggars.

Given the donation amount `P` and the range from index `L` to index `R`, where `1 <= L <= R <= A`, add `P` coins to each beggar's pot in that range.

For each devotee, the donation details are provided in the 2D array `B`, where:
- `B[i][0] = L`, the starting index.
- `B[i][1] = R`, the ending index.
- `B[i][2] = P`, the number of coins donated to each beggar in the range.

Find the final amount of money in each beggar's pot at the end of the day.

---

## Problem Constraints

- `1 <= A <= 2 * 10^5`
- `1 <= L <= R <= A`
- `1 <= P <= 10^3`
- `0 <= len(B) <= 10^5`

---

## Input Format

The first argument is a single integer `A`, representing the number of beggars.

The second argument is a 2D integer array `B`, where each row contains `[L, R, P]` representing a donation.

---

## Output Format

Return an integer array using 0-based indexing, where each element represents the total number of coins in the corresponding beggar's pot.

---

## Example Input

### Input 1

A = 5

B = [[1, 2, 10],
     [2, 3, 20],
     [2, 5, 25]]

---

## Example Output

[10, 55, 45, 25, 25]

*/

// tc: O(Q+N)
// sc: O(1)
public class P2 {
    public int[] solve(int A, int[][] B) {
        int q = B.length;
        int[] ans = new int[A];

        // add donated amount for all queries
        for (int i = 0; i < q; i++) {
            int left = B[i][0], right = B[i][1], donated = B[i][2];

            ans[left - 1] += donated;

            if (right < A) {
                ans[right] -= donated;
            }
        }

        // prefix sum for ans array
        for (int i = 1; i < A; i++) {
            ans[i] = ans[i - 1] + ans[i];
        }

        return ans;
    }
}
