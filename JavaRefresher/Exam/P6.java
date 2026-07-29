package JavaRefresher.Exam;

/*
# Problem: Third Maximum Number

## Problem Description
Given an integer array nums, return the third distinct maximum number in the array.

If the third distinct maximum does not exist, return the maximum number in the array instead.

Note: Duplicate values are considered only once when determining distinct maximums.

---

## Input Format
The first and only input is an integer array nums.

---

## Output Format
Return a single integer representing the third distinct maximum number. If it does not exist, return the maximum number.

---

## Example Input

nums = [2, 2, 3, 1]

---

## Example Output

1

*/

import java.util.*;

public class P6 {
    public int thirdMax(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i : nums)
            hs.add(i);

        int max1 = Integer.MIN_VALUE,
                max2 = Integer.MIN_VALUE,
                max3 = Integer.MIN_VALUE;

        for (int i : hs) {
            if (i > max1) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max3 = max2;
                max2 = i;
            } else if (i > max3)
                max3 = i;
        }

        if (hs.size() < 3)
            return max1;
        else
            return max3;
    }
}
