package Intermediate.exam;

/*
# Problem: Treasure Hunter

## Problem Description

You are a treasure hunter and have found a locked chest containing a string of letters `A`. You also have a key containing a string of letters `B`.

You can unlock the chest if the string `B` can be constructed using the letters from string `A`.

Determine whether you can unlock the chest.

Each character in `A` can be used only as many times as it appears in `A`.

---

## Problem Constraints

- `1 <= |A|, |B| <= 10^5`
- `A` and `B` consist of lowercase English letters.

---

## Input Format

Two arguments `A` and `B` are strings.

---

## Output Format

Return `1` if string `B` can be constructed using the letters from string `A`.

Otherwise, return `0`.

---

## Example Input

### Input 1

A = "cbaab"
B = "abc"

### Input 2

A = "bbab"
B = "aab"

---

## Example Output

### Output 1

1

### Output 2

0

---

## Example Explanation

### Explanation 1

We can use characters from `A` to form the string `B`.

### Explanation 2

The string `B` cannot be formed from the string `A` because `A` does not contain enough occurrences of the required characters.

*/

import java.util.*;

public class P1 {
    public static void main(String[] args) {
        String A = "bbab";
        String B = "aab";

        int al = A.length();
        int bl = B.length();
        boolean flag = false;

        HashMap<Character, Integer> hm = new HashMap<>();

        // add frequency for string A
        for (int i = 0; i < al; i++) {
            char ch = A.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // check frequency for string B in A
        for (int i = 0; i < bl; i++) {
            char ch = B.charAt(i);

            if (hm.containsKey(ch) && hm.get(ch) > 0) {
                hm.put(ch, hm.get(ch) - 1);
            } else {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println(0);
        } else
            System.out.println(1);

    }
}
