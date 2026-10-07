package Intermediate.string;

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
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') {
                ans.append(sb.charAt(i));
            }
        }

        // Replace each vowel with '#'
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == 'a' || ans.charAt(i) == 'e' ||
                    ans.charAt(i) == 'i' || ans.charAt(i) == 'o' ||
                    ans.charAt(i) == 'u') {
                ans.setCharAt(i, '#');
            }
        }

        return ans.toString();
    }
}
