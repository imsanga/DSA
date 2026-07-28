package JavaRefresher.Fnc_Arrays_Strings_Hash.Problems;

/*
# Problem: Character Index String

## Problem Description
Given a string A containing only lowercase English letters, update the string by inserting the alphabetical index of each character immediately after it.

The alphabetical positions are:
- a = 1
- b = 2
- ...
- z = 26

For example:
If A = "azd", the updated string will be:

a1z26d4

---

## Input Format
The first and only input is a string A.

---

## Output Format
Return the updated string after appending the alphabetical index of each character.

---

## Example Input

scaler

---

## Example Output

s19c3a1l12e5r18

*/

public class P3 {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A.length(); i++) {
            int temp = A.charAt(i) - 97 + 1;
            sb.append(A.charAt(i) + "" + temp);
        }
        return sb.toString();
    }
}
