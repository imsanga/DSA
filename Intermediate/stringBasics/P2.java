package Intermediate.stringBasics;

/*
# Problem: Check if a Substring is a Palindrome

## Problem Description
Given a string S and two indices start and end, check whether the substring from start to end is a palindrome.

A palindrome is a string that reads the same forward and backward.

The substring should include both the start and end indices.

---

## Input Format
- The first input is a string S.
- The second input is an integer start representing the starting index.
- The third input is an integer end representing the ending index.

---

## Output Format
Print "palindrome" if the substring from start to end is a palindrome; otherwise, print "not a palindrome".

---

## Example Input

S = "anamadamsp"
start = 3
end = 7

---

## Example Output

madam
palindrome

*/

/*

public class P2 {
    public static void main(String[] args) {
        String s1 = "anamadamsp";
        int start = 3, end = 7;

        String s2 = s1.substring(start, end + 1);
        System.out.println(s2);

        StringBuilder sb = new StringBuilder(s2);
        sb.reverse();

        if (s2.equals(sb.toString()))
            System.out.println("palindrome");
        else
            System.out.print("not a palindrome");

    }
}

*/

public class P2 {
    public static void main(String[] args) {
        String s1 = "anamadamsp";
        int start = 3, end = 7;

        while (start < end) {
            char first = s1.charAt(start);
            char last = s1.charAt(end);
            if (first != last)
                System.out.print("not a palindrome");

            start++;
            end--;
        }

        System.out.print("palindrome");

    }
}
