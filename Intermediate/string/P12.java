package Intermediate.string;

/*
# Problem: Length of Longest Consecutive Ones

## Problem Description

Given a binary string `A`, you may perform at most one swap, which exchanges any one `0` in the string with any one `1`.

The two characters do not have to be adjacent.

Return the length of the longest run of consecutive `1`s that can be achieved after performing at most one swap.

---

## Problem Constraints

- `1 <= |A| <= 10^6`
- `A` contains only the characters `0` and `1`.

---

## Input Format

The only argument is the binary string `A`.

---

## Output Format

Return an integer representing the length of the longest consecutive run of `1`s that can be achieved.

---

## Example Input

### Input 1

A = "111000"

### Input 2

A = "111011101"

---

## Example Output

### Output 1

3

### Output 2

7

*/

public class P12 {
    public int solve(String A) {
        int n = A.length(), maxy = 0, countOne = 0;

        // count 1
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1')
                countOne++;
        }

        if (countOne == n)
            return n;

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                int left = i - 1, right = i + 1;
                int leftCount = 0, rightCount = 0;

                // iterate left part
                while (left >= 0 && A.charAt(left) == '1') {
                    left--;
                    leftCount++;
                }

                // iterate right part
                while (right < n && A.charAt(right) == '1') {
                    right++;
                    rightCount++;
                }

                int currentLength = leftCount + rightCount;

                if (currentLength < countOne) {
                    currentLength++;
                }

                maxy = Math.max(maxy, currentLength);
            }

        }

        return maxy;
    }
}
