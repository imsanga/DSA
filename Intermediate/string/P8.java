package Intermediate.string;

/*
# Problem: Reverse the String

## Problem Description

You are given a string `A` of size `N`.

Return the string `A` after reversing the order of its words.

## Notes

- A sequence of non-space characters constitutes a word.
- The reversed string should not contain leading or trailing spaces, even if they are present in the input string.
- If there are multiple spaces between words, reduce them to a single space in the reversed string.

---

## Problem Constraints

- `1 <= N <= 3 * 10^5`

---

## Input Format

The only argument given is the string `A`.

---

## Output Format

Return the string `A` after reversing the order of its words.

---

## Example Input

### Input 1

A = "the sky is blue"

### Input 2

A = "this is ib"

---

## Example Output

### Output 1

"blue is sky the"

### Output 2

"ib is this"

*/

public class P8 {
    public String solve(String A) {
        // -> trim() is used to remove space in begin and end of the string

        // -> split("\\s+") is used for splitting a string whenever it encounters one or
        // more consecutive whitespace characters and stores in array

        String[] temp = A.trim().split("\\s+");
        int n = temp.length;

        StringBuilder ans = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            ans.append(temp[i]);

            if (i != 0)
                ans.append(" ");
        }

        return ans.toString();
    }
}
