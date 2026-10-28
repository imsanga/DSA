package Intermediate.string;

/*
# Problem: Toggle Case

## Problem Description

You are given a character string `A` of length `N`, consisting only of lowercase and uppercase Latin letters.

Toggle the case of each character in string `A`.

For example:
- `'A'` changes to `'a'`.
- `'e'` changes to `'E'`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `A[i]` belongs to `['a'-'z', 'A'-'Z']`.

---

## Input Format

The first and only argument is a character string `A`.

---

## Output Format

Return a character string after toggling the case of every character.

---

## Example Input

### Input 1

A = "Hello"

### Input 2

A = "tHiSiSaStRiNg"

---

## Example Output

### Output 1

"hELLO"

### Output 2

"ThIsIsAsTrInG"

---

## Example Explanation

### Explanation 1

- `'H'` changes to `'h'`.
- `'e'` changes to `'E'`.
- `'l'` changes to `'L'`.
- `'l'` changes to `'L'`.
- `'o'` changes to `'O'`.

### Explanation 2

The string `"tHiSiSaStRiNg"` changes to `"ThIsIsAsTrInG"`.

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
