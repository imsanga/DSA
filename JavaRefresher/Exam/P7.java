package JavaRefresher.Exam;

/*
# Problem: Two Sum

## Problem Description
Given an integer array nums and an integer target, return the indices of the two numbers whose sum is equal to target.

You may assume that each input has exactly one valid solution, and the same element cannot be used twice.

The indices can be returned in any order.

---

## Input Format
- The first input is an integer array nums.
- The second input is an integer target.

---

## Output Format
Return an integer array containing the indices of the two numbers whose sum is equal to target.

---

## Example Input

nums = [2, 7, 11, 15]
target = 9

---

## Example Output

[0, 1]

*/

public class P7 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return new int[0];
    }
}
