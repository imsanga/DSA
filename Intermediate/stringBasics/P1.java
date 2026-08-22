package Intermediate.stringBasics;

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
public class P1 {
    public String solve(String A) {
        
        char[] ans = new char[n];

        for(int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
               ans[i] = (char) (ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z') {
               ans[i] = (char) (ch - 32);
            }
        }

        return new String(ans);

    }
}

*/

public class P1 {
    public String solve(String A) {
        int n = A.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char temp = (char) (ch + 32);
                sb.append(temp);
            } else if (ch >= 'a' && ch <= 'z') {
                char temp = (char) (ch - 32);
                sb.append(temp);
            }
        }

        return sb.toString();
    }
}
