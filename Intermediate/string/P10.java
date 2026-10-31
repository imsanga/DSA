package Intermediate.string;

/*
# Problem: Longest Common Prefix

## Problem Description

Given an array of strings `A`, find the longest string `S` that is a prefix of all the strings in the array.

The longest common prefix of two strings `S1` and `S2` is the longest string `S` that is a prefix of both `S1` and `S2`.

For example, the longest common prefix of "abcdefgh" and "abcefgh" is "abc".

---

## Problem Constraints

- `0 <= sum of lengths of all strings <= 10^6`

---

## Input Format

The only argument given is an array of strings `A`.

---

## Output Format

Return the longest common prefix of all strings in `A`.

---

## Example Input

### Input 1

A = ["abcdefgh", "aefghijk", "abcefgh"]

### Input 2

A = ["abab", "ab", "abcd"]

---

## Example Output

### Output 1

"a"

### Output 2

"ab"

*/

public class P10 {
    public String longestCommonPrefix(String[] A) {
        int n = A.length;
        String initial = A[0];

        int x = initial.length();
        for (int i = 1; i < n; i++) {
            String temp = A[i];
            if (temp.length() < x) {
                x = temp.length();
            }

            int tempy = 0;
            for (int j = 0; j < x; j++) {
                if (initial.charAt(j) == temp.charAt(j)) {
                    tempy++;
                } else {
                    x = tempy;
                    if (x == 0)
                        return "";
                    break;
                }
            }
        }

        return initial.substring(0, x);
    }
}
