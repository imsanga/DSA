package Intermediate.prefixSum_carryForward.problems;

/*
# Problem: Range Sum Query (Brute Force)

## Problem Description
Given an integer array and multiple queries, compute the sum of elements within the specified range for each query.

Each query consists of two indices:
- start
- end

For every query, calculate the sum of all elements from index start to end (both inclusive).

---

## Input Format
- The first input is an integer array.
- The second input is a 2D integer array where each row represents a query [start, end].

---

## Output Format
For each query, print the sum of elements in the specified range.

---

## Example Input

Array = [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]

Queries = [
  [4, 8],
  [3, 7],
  [1, 3],
  [0, 4],
  [7, 7]
]

---

## Example Output

query sum: 4 to 8 -> 9
query sum: 3 to 7 -> 10
query sum: 1 to 3 -> 12
query sum: 0 to 4 -> 14
query sum: 7 to 7 -> -9

*/

// tc - O(N^2)
// sc - O(1)

/* 
public class P1 {
    public static void main(String[] args) {
        int[] arr = { -3, 6, 2, 4, 5, 2, 8, -9, 3, 1 };

        int[][] query = {
                { 4, 8 },
                { 3, 7 },
                { 1, 3 },
                { 0, 4 },
                { 7, 7 }
        };

        for (int i = 0; i <= query.length - 1; i++) {
            int start = query[i][0], end = query[i][1], sum = 0;

            for (int j = start; j <= end; j++) {
                sum += arr[j];
            }

            System.out.println("query sum: " + start + " to " + end + " -> " + sum);
        }
    }
}

*/

// optimised approach
// tc - O(N)
// sc - O(1)
public class P1 {
    public long[] rangeSum(int[] A, int[][] B) {

        // prefix sum array
        int n = A.length;
        long[] pfxArr = new long[n];

        pfxArr[0] = A[0];
        for (int i = 1; i < n; i++) {
            pfxArr[i] = pfxArr[i - 1] + A[i];
        }

        // query execution
        int q = B.length;
        long[] ans = new long[q];
        for (int j = 0; j < q; j++) {
            int left = B[j][0], right = B[j][1];

            if (left == 0) {
                ans[j] = pfxArr[right];
            } else {
                ans[j] = pfxArr[right] - pfxArr[left - 1];
            }
        }

        return ans;
    }
}
