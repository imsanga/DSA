package Intermediate.exam;

/*
# Problem: X Crossword Puzzle

## Problem Description

Mr. X is a crossword puzzle creator who wants to ensure that each letter of the English alphabet appears at least once in the puzzle.

He has created a string `A` containing all the letters used in the puzzle, but he is not sure whether all the letters are present.

Help Mr. X determine whether the string `A` is a pangram or not.

A pangram is a sentence containing every letter of the English alphabet.

---

## Problem Constraints

- `1 <= A.length <= 10^5`
- `A[i]` contains lowercase English alphabets only.

---

## Input Format

The first argument is a string `A`.

---

## Output Format

Return an integer with the value `0` or `1`:
- Return `1` if the string contains all the letters of the English alphabet.
- Return `0` otherwise.

---

## Example Input

### Input 1

A = "helloworld"

### Input 2

A = "abcdefghijklmnopqrstuvwxyz"

---

## Example Output

### Output 1

0

### Output 2

1

---

## Example Explanation

### Explanation 1

The string `A = "helloworld"` does not contain all the lowercase English alphabet letters. Hence, the output is `0`.

### Explanation 2

The string `A = "abcdefghijklmnopqrstuvwxyz"` contains all the lowercase English alphabet letters. Hence, the output is `1`.

*/

import java.util.*;

public class P2 {
    public static void main(String[] args) {
        String A = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

        int al = A.length();

        // initial check
        if (al < 26)
            System.out.println(0);

        else {
            HashMap<Character, Integer> hm = new HashMap<>();

            // add frequency for string A
            for (int i = 0; i < al; i++) {
                char ch = A.charAt(i);
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);
            }

            // check size of hm is 26 or not
            if (hm.size() == 26) {
                System.out.println(1);
            } else
                System.out.println(0);

        }
    }
}
