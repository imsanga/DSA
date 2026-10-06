package Intermediate.slidingWindow_contribution;

/*
# Problem: Colorful Number

## Problem Description

Given a number `A`, determine whether it is a COLORFUL number.

Return `1` if `A` is a COLORFUL number; otherwise, return `0`.

A number can be broken into different consecutive sequences of digits.

For example, the number `3245` can be broken into sequences such as:

`3, 2, 4, 5, 32, 24, 45, 324, 245, 3245`

A number is called a COLORFUL number if the product of the digits in every consecutive sequence is different from the product of every other consecutive sequence.

---

## Problem Constraints

- `1 <= A <= 2 * 10^9`

---

## Input Format

The first and only argument is an integer `A`.

---

## Output Format

Return `1` if integer `A` is a COLORFUL number.

Otherwise, return `0`.

---

## Example Input

### Input 1

A = 23

### Input 2

A = 236

---

## Example Output

### Output 1

1

### Output 2

0

*/

import java.util.*;

public class P9 {
    public int colorful(int A) {
        // convert integer to ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        while (A > 0) {
            al.add(A % 10);
            A = A / 10;
        }

        // using carry forward - add all the product of subarray
        ArrayList<Integer> ans = new ArrayList<>();
        int n = al.size();
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= al.get(j);
                ans.add(product);
            }
        }

        HashSet<Integer> hs = new HashSet<>(ans);

        if (ans.size() == hs.size())
            return 1;
        else
            return 0;
    }
}
