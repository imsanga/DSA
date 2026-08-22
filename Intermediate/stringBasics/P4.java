package Intermediate.stringBasics;

/*
# Problem: String Operations

## Problem Description
Given a string A consisting of lowercase and uppercase English alphabets, perform the following operations in the given order:

1. Concatenate the string with itself.
2. Delete all uppercase letters.
3. Replace every lowercase vowel with '#'.

The vowels are: 'a', 'e', 'i', 'o', 'u'.

Return the resultant string.

---

## Input Format
The first and only input is a string A.

---

## Output Format
Return the resultant string after performing all the given operations.

---

## Example Input

A = "aeiOUz"

---

## Example Output

"###z###z"

*/

public class P4 {
    public String solve(String A) {
        StringBuilder sb = new StringBuilder(A);

        // Concatenate the string with itself
        sb.append(A);

        // Delete all the uppercase letters
        int n = sb.length();
        StringBuilder sbDelete = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                sbDelete.append(sb.charAt(i));
            }
        }

        // Replace each vowel with '#'
        for (int i = 0; i < sbDelete.length(); i++) {
            if (sbDelete.charAt(i) == 'a' || sbDelete.charAt(i) == 'e'
                    || sbDelete.charAt(i) == 'i' || sbDelete.charAt(i) == 'o'
                    || sbDelete.charAt(i) == 'u') {
                sbDelete.setCharAt(i, '#');
            }
        }

        return sbDelete.toString();

    }
}
