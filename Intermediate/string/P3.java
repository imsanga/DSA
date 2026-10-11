package Intermediate.string;

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
        int maxLength = 0, tempLeft = 0, tempRight = n + 1;

        // 1 center
        for (int i = 0; i < n; i++) {
            int left = i, right = i;

            while (left >= 0 && right < n) {
                if (A.charAt(left) != A.charAt(right))
                    break;
                else {
                    int length = right - left + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        tempLeft = left;
                        tempRight = right + 1;
                    }
                }

                left--;
                right++;
            }
        }

        // 2 center
        for (int i = 0; i < n - 1; i++) {
            int left = i, right = i + 1;

            while (left >= 0 && right < n) {
                if (A.charAt(left) != A.charAt(right))
                    break;
                else {
                    int length = right - left + 1;
                    if (length > maxLength) {
                        maxLength = length;
                        tempLeft = left;
                        tempRight = right + 1;
                    }
                }

                left--;
                right++;
            }
        }

        return A.substring(tempLeft, tempRight);
    }
}