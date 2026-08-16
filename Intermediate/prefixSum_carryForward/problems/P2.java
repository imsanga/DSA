package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Range Sum of Even Indexed Elements Using Prefix Sum

## Problem Description
Given an integer array and multiple range queries, find the sum of elements at even indices within each query range.

Use a prefix sum array that stores the cumulative sum of elements located only at even indices.

Note: Array indexing is 0-based.

---

## Input Format
- The first input is an integer array.
- The second input is a 2D integer array where each row represents a query [start, end].

---

## Output Format
For each query, print the sum of elements present at even indices in the specified range.

---

## Example Input

Array = [2, 3, 1, 6, 4, 5]

Queries = [
  [1, 3],
  [2, 5],
  [0, 4],
  [3, 3]
]

---

## Example Output

query sum: 1 to 3 -> 1
query sum: 2 to 5 -> 5
query sum: 0 to 4 -> 7
query sum: 3 to 3 -> 0

*/

// optimised approach
// tc - O(N)
// sc - O(1)
public class P2 {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 4, 5 };
        int n = arr.length;

        int[][] query = {
                { 1, 3 },
                { 2, 5 },
                { 0, 4 },
                { 3, 3 }
        };

        // even prefix array
        int[] pfxArr = new int[n];

        pfxArr[0] = arr[0];

        for (int i = 1; i <= n - 1; i++) {
            if (i % 2 == 0) {
                pfxArr[i] = pfxArr[i - 1] + arr[i];
            } else {
                pfxArr[i] = pfxArr[i - 1];
            }
        }

        // query execution
        for (int j = 0; j <= query.length - 1; j++) {
            int start = query[j][0], end = query[j][1], sum;

            if (start == 0) {
                sum = pfxArr[end];
            } else {
                sum = pfxArr[end] - pfxArr[start - 1];
            }

            System.out.println("query sum: " + start + " to " + end + " -> " + sum);
        }

    }
}
