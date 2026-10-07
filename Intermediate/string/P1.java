package Intermediate.string;

/*
# Problem: Toggle Case

## Problem Description
Given a character string A containing only lowercase and uppercase English letters, toggle the case of every character.

For example:
- 'A' becomes 'a'
- 'a' becomes 'A'
- 'E' becomes 'e'
- 'e' becomes 'E'

---

## Input Format
The first and only input is a character string A.

---

## Output Format
Return the string after toggling the case of every character.

---

## Example Input

A = "Hello"

---

## Example Output

hELLO

*/

/* 

public class Solution {
    public String solve(String A) {
        // using char[]
        int n = A.length();
        char[] ans = new char[n];
        // char[] ans = A.toCharArray();

        for(int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans[i] = (char) (ch + 32);
            } else {
                ans[i] = (char) (ch - 32);
            }
        }

        return new String(ans);
        // return String.valueOf(ans);
    }
}

*/

public class P1 {
    public String solve(String A) {
        // using StringBuilder
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, (char) (ch + 32));
            } else {
                sb.setCharAt(i, (char) (ch - 32));
            }
        }

        return sb.toString();
    }
}
