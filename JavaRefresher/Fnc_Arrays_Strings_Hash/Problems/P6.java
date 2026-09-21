package JavaRefresher.Fnc_Arrays_Strings_Hash.Problems;

/*
# Problem: Frequency of Learners

## Problem Description
Given two integer arrays A and B:
- Array A contains the participants of various contests.
- Array B contains the learners whose participation frequency needs to be checked.

For each learner in B, find how many times that learner appears in array A.

Return an array containing the frequency of each learner in B, in the same order.

---

## Input Format
- The first input is an integer array A representing contest participants.
- The second input is an integer array B representing the learners to query.

---

## Output Format
Return an integer array containing the frequency of each learner in B as found in array A.

---

## Example Input

A = [1, 2, 1, 1]
B = [1, 2]

---

## Example Output

[3, 1]

*/

import java.util.*;

public class P6 {
    public int[] solve(int[] A, int[] B) {
        int al = A.length;
        int bl = B.length;

        int[] ans = new int[bl];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < al; i++) {
            if (hm.containsKey(A[i])) {
                hm.put(A[i], hm.get(A[i]) + 1);
            } else {
                hm.put(A[i], 1);
            }
        }

        for (int j = 0; j < bl; j++) {
            if (hm.containsKey(B[j])) {
                ans[j] = hm.get(B[j]);
            } else {
                ans[j] = 0;
            }
        }

        return ans;
    }
}
