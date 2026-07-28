package JavaRefresher.Fnc_Arrays_Strings_Hash.Problems;

/*
# Problem: Check Palindrome String

## Problem Description
Given a lowercase string A, determine whether it is a palindrome.

A palindrome is a string that reads the same forward and backward.

Return 1 if the string is a palindrome; otherwise, return 0.

---

## Input Format
The first and only input is a lowercase string A.

---

## Output Format
Return 1 if A is a palindrome; otherwise, return 0.

---

## Example Input

abcba

---

## Example Output

1

*/

public class P5 {
    public int solve(String A) {
        // brute force approach
        // String temp = "";
        // for(int i = A.length()-1; i >= 0; i--) {
        // temp += A.charAt(i);
        // }
        // if(A.equals(temp)) return 1;
        // else return 0;

        // with string builder
        StringBuilder sb = new StringBuilder(A);
        if (A.equals(sb.reverse().toString()))
            return 1;
        else
            return 0;

    }
}
