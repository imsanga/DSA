package Intermediate.stringBasics;

/*
# Problem: Longest Palindromic Substring

## Problem Description
Given a string A, find and return the longest palindromic substring in A.

A substring is a continuous part of a string.

A palindrome is a string that reads the same forward and backward.

If there are multiple palindromic substrings with the same maximum length, return the one that occurs first (has the smallest starting index).

---

## Input Format
The first and only input is a string A.

---

## Output Format
Return a string representing the longest palindromic substring of A.

---

## Example Input

A = "aaaabaaa"

---

## Example Output

"aaabaaa"

*/

// tc - O(N^2)
public class P3 {
    public String longestPalindrome(String A) {

        int n = A.length();
        int maxlength = 0, length = 0;
        String temp;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            // odd center
            int left = i;
            int right = i;

            while (left >= 0 && right < n) {
                if (A.charAt(left) != A.charAt(right))
                    break;

                else {
                    length = right - left + 1;
                    if (length > maxlength) {
                        sb.delete(0, sb.length() + 1);
                        maxlength = length;
                        temp = A.substring(left, right + 1);
                        sb.append(temp);
                    }

                    left--;
                    right++;
                }
            }

            // even center
            left = i;
            right = i + 1;

            while (left >= 0 && right < n) {
                if (A.charAt(left) != A.charAt(right))
                    break;

                else {
                    length = right - left + 1;
                    if (length > maxlength) {
                        sb.delete(0, sb.length() + 1);
                        maxlength = length;
                        temp = A.substring(left, right + 1);
                        sb.append(temp);
                    }

                    left--;
                    right++;
                }
            }

        }

        return sb.toString();

    }
}
