package JavaRefresher.Exam;

/*
# Problem: Single Number

## Problem Description
Given a non-empty integer array nums where every element appears exactly twice except for one element, find and return that single element.

Your solution must have:
- Linear time complexity O(n).
- Constant extra space O(1).

---

## Input Format
The first and only input is an integer array nums.

---

## Output Format
Return the single element that appears only once.

---

## Example Input

nums = [4, 1, 2, 1, 2]

---

## Example Output

4

*/

import java.util.*;

public class P10 {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i : nums) {
            if (hs.containsKey(i))
                hs.put(i, hs.get(i) + 1);
            else
                hs.put(i, 1);
        }

        for (int j : hs.keySet()) {
            if (hs.get(j) == 1)
                return j;
        }

        return 0;

    }
}
