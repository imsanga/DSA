package Intermediate.string;

/*
# Problem: Amazing Subarrays

## Problem Description

You are given a string `S`. Find the total number of amazing substrings in `S`.

An amazing substring is a substring that starts with a vowel.

The vowels are: `a, e, i, o, u, A, E, I, O, U`.

---

## Problem Constraints

- `1 <= length(S) <= 10^6`
- `S` can contain special characters.

---

## Input Format

The only argument is the string `S`.

---

## Output Format

Return a single integer `X % 10003`, where `X` is the total number of amazing substrings in the given string.

---

## Example Input

S = "ABEC"

---

## Example Output

6

---

## Explanation

The amazing substrings of the given string are:

1. "A"
2. "AB"
3. "ABE"
4. "ABEC"
5. "E"
6. "EC"

The total number of amazing substrings is `6`.

Since `6 % 10003 = 6`, the output is `6`.

*/

public class P7 {
    public int solve(String A) {
        int n = A.length();
        long count = 0;

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e'
                    || A.charAt(i) == 'i' || A.charAt(i) == 'o'
                    || A.charAt(i) == 'u' || A.charAt(i) == 'A'
                    || A.charAt(i) == 'E' || A.charAt(i) == 'I'
                    || A.charAt(i) == 'O' || A.charAt(i) == 'U')
                count += n - i;
        }

        return (int) (count % 10003);
    }
}
