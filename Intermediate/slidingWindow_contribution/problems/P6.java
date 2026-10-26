package Intermediate.slidingWindow_contribution.problems;

/*
# Problem: Colorful Number

## Problem Description

Given a number `A`, determine whether it is a COLORFUL number.

Return `1` if `A` is a COLORFUL number; otherwise, return `0`.

A number is called COLORFUL if the products of the digits in every possible consecutive sequence of digits are distinct.

For example, the number `3245` can be broken into consecutive sequences such as:

`3, 2, 4, 5, 32, 24, 45, 324, 245, 3245`

The number is COLORFUL if the product of the digits in each sequence is different from the product of every other sequence.

---

## Problem Constraints

- `1 <= A <= 2 * 10^9`

---

## Input Format

The first and only argument is an integer `A`.

---

## Output Format

Return `1` if integer `A` is COLORFUL.

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

---

## Example Explanation

### Explanation 1

Possible consecutive sequences: `[2, 3, 23]`

- `2` → Product = `2`
- `3` → Product = `3`
- `23` → Product = `2 * 3 = 6`

All products are distinct, so the number is COLORFUL. Hence, the output is `1`.

### Explanation 2

Possible consecutive sequences: `[2, 3, 6, 23, 36, 236]`

- `2` → Product = `2`
- `3` → Product = `3`
- `6` → Product = `6`
- `23` → Product = `2 * 3 = 6`
- `36` → Product = `3 * 6 = 18`
- `236` → Product = `2 * 3 * 6 = 36`

The product of the sequence `23` and the single digit `6` is the same. Therefore, the number is not COLORFUL, and the output is `0`.

*/

import java.util.*;

public class P6 {
    public int colorful(int A) {
        // take all the digits in A and store as arraylist
        ArrayList<Integer> al = new ArrayList<>();
        while (A > 0) {
            al.add(A % 10);
            A /= 10;
        }

        // use carryforward and multiply and store
        ArrayList<Integer> az = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) {
            int sum = 1;
            for (int j = i; j < al.size(); j++) {
                sum *= al.get(j);
                if (az.contains(sum))
                    return 0;
                else {
                    az.add(sum);
                }
            }
        }

        return 1;
    }
}
