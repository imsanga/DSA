package JavaRefresher.ConditionStm_Loops;

/*
# Problem: Reverse a Number

## Problem Description
Given an integer A, reverse its digits and return the resulting number.

For example:
- If A = 321, return 123.
- If A = 120, return 21.

---

## Input Format
The only input is a single integer A.

---

## Output Format
Return a single integer representing the reversed number.

---

## Example Input

321

---

## Example Output

123

*/

public class P2 {
    public int reverse(int A) {
        int ans = 0;

        while (A > 0) {
            ans = ans * 10 + A % 10;
            A /= 10;
        }
        return ans;
    }
}
