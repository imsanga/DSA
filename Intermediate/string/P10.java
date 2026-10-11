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
        int x = A[0].length(); // long common prefix

        for (int i = 1; i < n; i++) {
            if (A[i].length() < x)
                x = A[i].length();
            int temp = 0;

            for (int j = 0; j < x; j++) {
                if (A[0].charAt(j) == A[i].charAt(j)) {
                    temp++;
                } else {
                    x = temp;
                    if (x == 0)
                        return "";
                    break;
                }
            }
        }

        return A[0].substring(0, x);
    }
}
