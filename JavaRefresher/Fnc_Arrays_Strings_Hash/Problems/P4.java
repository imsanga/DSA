package JavaRefresher.Fnc_Arrays_Strings_Hash.Problems;

/*
# Problem: Frequency Count of Array Elements

## Problem Description
Given an integer array A, return an integer array of the same size where the i-th element represents the frequency of A[i] in the original array.

For example:
If A = [1, 2, 5, 1, 5, 1], the output should be:

[3, 1, 2, 3, 2, 3]

Note: In Java, when comparing elements of an ArrayList, use the .equals() method instead of ==.

---

## Input Format
The first and only input is an integer array A.

---

## Output Format
Return an integer array where each element contains the frequency of the corresponding element in the input array.

---

## Example Input

[1, 2, 5, 1, 5, 1]

---

## Example Output

[3, 1, 2, 3, 2, 3]

*/

import java.util.*;

public class P4 {
    public int[] solve(int[] A) {
        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int i : A) {
            if (ans.containsKey(i)) {
                ans.put(i, ans.get(i) + 1);
            } else
                ans.put(i, 1);
        }

        for (int j = 0; j < A.length; j++) {
            A[j] = ans.get(A[j]);
        }

        return A;
    }
}
