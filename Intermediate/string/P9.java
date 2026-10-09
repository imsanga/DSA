package Intermediate.string;

/*
# Problem: Check Anagrams

## Problem Description

You are given two lowercase strings `A` and `B`, each of length `N`.

Return `1` if the strings are anagrams of each other; otherwise, return `0`.

Two strings `A` and `B` are called anagrams if `A` can be formed by rearranging the letters of `B`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `A` and `B` contain only lowercase English letters.

---

## Input Format

Both arguments `A` and `B` are strings.

---

## Output Format

Return `1` if the strings are anagrams of each other.

Otherwise, return `0`.

---

## Example Input

### Input 1

A = "cat"
B = "bat"

### Input 2

A = "secure"
B = "rescue"

---

## Example Output

### Output 1

0

### Output 2

1

*/

import java.util.*;

/* 
soln 1:
public class P9 {
    public int solve(String A, String B) {
        int a = A.length();
        int b = B.length();

        // initial check
        if (a != b)
            return 0;

        // iterate A string and store frequency
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < a; i++) {
            char ch = A.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        // iterate B string and store frequency
        HashMap<Character, Integer> hs = new HashMap<>();
        for (int i = 0; i < b; i++) {
            char ch = B.charAt(i);
            if (hs.containsKey(ch)) {
                hs.put(ch, hs.get(ch) + 1);
            } else {
                hs.put(ch, 1);
            }
        }

        // iterate hm HashMap annd check hs frequency
        for (char ch : hm.keySet()) {
            if (hm.get(ch).equals(hs.get(ch)))
                continue;
            else
                return 0;
        }

        return 1;
    }
}

soln 2:
public class Solution {
    public int solve(String A, String B) {
        int a = A.length();
        int b = B.length();

        // initial check
        if(a != b) return 0;

        // iterate A & B string and store frequency
        int[] freq = new int[26];
        for(int i = 0; i < a; i++) {
            char chA = A.charAt(i);
            char chB = B.charAt(i);
            freq[chA - 'a']++;
            freq[chB - 'a']--;
        }

        // iterate freq array and check all element is 0
        for(int dummy : freq) {
            if(dummy != 0) return 0;
        }

        return 1;
    }
}

*/
public class P9 {
    public int solve(String A, String B) {
        int a = A.length();
        int b = B.length();

        // initial check
        if (a != b)
            return 0;

        // iterate A string and store frequency
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < a; i++) {
            char ch = A.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // iterate B string and delete frequency if presents
        for (int i = 0; i < b; i++) {
            char ch = B.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) - 1);

            if (hm.get(ch) < 0)
                return 0;
        }

        // iterate hm HashMap and check all value is 0
        for (int dummy : hm.values()) {
            if (dummy != 0)
                return 0;
        }

        return 1;
    }
}
