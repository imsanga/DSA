package Intermediate.string;

/*
# Problem: Count Occurrences

## Problem Description

You are given a string `A` consisting of lowercase English letters.

Count the number of times the substring "bob" appears in `A`.

Overlapping matches must be counted separately.

For example, the string "bobob" contains two occurrences of "bob", starting at indices 0 and 2.

---

## Problem Constraints

- `1 <= |A| <= 1000`

---

## Input Format

The only argument is the string `A`.

---

## Output Format

Return a single integer representing the number of times the substring "bob" occurs in `A`.

---

## Example Input

### Input 1

A = "abobc"

### Input 2

A = "bobob"

---

## Example Output

### Output 1

1

### Output 2

2

*/

public class P5 {
    public int solve(String A) {
        int n = A.length();
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (A.charAt(i) == 'b' && A.charAt(i + 1) == 'o' && A.charAt(i + 2) == 'b') {
                count++;
            }
        }

        return count;
    }
}
