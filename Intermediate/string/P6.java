package Intermediate.string;

/*
# Problem: Isalnum()

## Problem Description

You are given a character array `A`.

Return `1` if all the characters in the array are alphanumeric (a-z, A-Z, and 0-9). Otherwise, return `0`.

---

## Problem Constraints

- `1 <= |A| <= 10^5`

---

## Input Format

The only argument is a character array `A`.

---

## Output Format

Return `1` if all the characters in the character array are alphanumeric (a-z, A-Z, and 0-9).

Otherwise, return `0`.

---

## Example Input

### Input 1

A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']

### Input 2

A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']

---

## Example Output

### Output 1

1

### Output 2

0

*/

public class P6 {
    public int solve(char[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] >= 'a' && A[i] <= 'z' ||
                    A[i] >= 'A' && A[i] <= 'Z' ||
                    A[i] >= '0' && A[i] <= '9') {
                continue;
            } else
                return 0;
        }

        return 1;
    }
}
