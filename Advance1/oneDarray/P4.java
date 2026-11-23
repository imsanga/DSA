package Advance1.oneDarray;

/*
# Problem: Merge Intervals - 2

## Problem Description

You have a set of non-overlapping intervals. You are given a new interval [start, end]. Insert this new interval into the set of intervals and merge if necessary.

You may assume that the intervals were initially sorted according to their start times.

---

## Problem Constraints

- 0 <= |intervals| <= 10^5

---

## Input Format

The first argument is a vector of intervals.

The second argument is the new interval to be merged.

---

## Output Format

Return the vector of intervals after inserting and merging the new interval.

---

## Example Input

### Input 1

Given intervals = [[1, 3], [6, 9]]

Insert [2, 5].

### Input 2

Given intervals = [[1, 3], [6, 9]]

Insert [2, 6].

---

## Example Output

### Output 1

[[1, 5], [6, 9]]

### Output 2

[[1, 9]]

---

## Example Explanation

### Explanation 1

The interval [2, 5] overlaps with [1, 3] and merges with it, resulting in [1, 5]. The interval [6, 9] remains unchanged.

### Explanation 2

The interval [2, 6] overlaps with both existing intervals and merges them into a single interval [1, 9].

*/

import java.util.*;

// tc: O(nlogn)
// sc: O(n)
public class P4 {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {

        // add B arrayList to A
        A.add(B);

        // sort arrayList A based on start intervals
        A.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));

        int n = A.size();
        int start1 = A.get(0).get(0);
        int end1 = A.get(0).get(1);

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            int start2 = A.get(i).get(0), end2 = A.get(i).get(1);

            if (start2 <= end1) {
                end1 = Math.max(end1, end2);
            } else {
                ArrayList<Integer> temp = new ArrayList<>();

                temp.add(start1);
                temp.add(end1);
                ans.add(temp);

                start1 = start2;
                end1 = end2;
            }
        }

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(start1);
        temp.add(end1);
        ans.add(temp);

        return ans;
    }
}
