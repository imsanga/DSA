package JavaRefresher.Exam;

/*
# Problem: Valid Palindrome

## Problem Description
Given a string s, determine whether it is a palindrome after:
- Converting all uppercase letters to lowercase.
- Removing all non-alphanumeric characters.

A palindrome reads the same forward and backward.

Return true if the processed string is a palindrome; otherwise, return false.

---

## Input Format
The first and only input is a string s.

---

## Output Format
Return true if the processed string is a palindrome; otherwise, return false.

---

## Example Input

s = "A man, a plan, a canal: Panama"

---

## Example Output

true

*/

public class P9 {
    public boolean isPalindrome(String s) {
        String lc = s.toLowerCase();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < lc.length(); i++) {
            if (lc.charAt(i) >= 'a' && lc.charAt(i) <= 'z' || lc.charAt(i) >= '0' && lc.charAt(i) <= '9') {
                sb1.append(lc.charAt(i));
                sb2.append(lc.charAt(i));
            }
        }
        if (sb1.toString().equals(sb2.reverse().toString()))
            return true;
        else
            return false;
    }
}
