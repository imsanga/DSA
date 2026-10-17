package Advance1.oneDarray;

/*
# Problem: Merge Sorted Overlapping Intervals - 2

## Problem Description

You are given a collection of intervals `A` in a 2D array format, where each interval is represented by a pair of integers `[start, end]`.

The intervals are sorted based on their start values.

Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.

---

## Problem Constraints

- `1 <= len(A) <= 100000`
- `1 <= A[i][0] <= A[i][1] <= 100000`
- `A` is sorted based on the start value `A[i][0]`.

---

## Input Format

The first argument is a list of intervals represented as a 2D array.

---

## Output Format

Return the sorted list of intervals after merging all overlapping intervals.

---

## Example Input

### Input 1

A = [[1, 3], [2, 6], [8, 10], [15, 18]]

### Input 2

A = [[2, 10], [4, 9], [6, 7]]

---

## Example Output

### Output 1

[[1, 6], [8, 10], [15, 18]]

### Output 2

[[2, 10]]

*/

import java.util.*;

public class P3 {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();

        int start = A.get(0).get(0);
        int end = A.get(0).get(1);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (n == 1) {
            ArrayList<Integer> al = new ArrayList<>();
            al.add(start);
            al.add(end);
            ans.add(al);
        } else {
            for (int i = 1; i < n; i++) {
                int tempStart = A.get(i).get(0);
                int tempEnd = A.get(i).get(1);

                if (tempStart <= end) {
                    end = Math.max(end, tempEnd);
                } else {
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(start);
                    al.add(end);
                    ans.add(al);
                    start = tempStart;
                    end = tempEnd;
                }
            }

            ArrayList<Integer> ak = new ArrayList<>();
            ak.add(start);
            ak.add(end);
            ans.add(ak);
        }

        return ans;
    }
}
