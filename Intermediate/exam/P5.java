package Intermediate.exam;

/*
# Problem: Add Binary Strings

## Problem Description

Given two binary strings `A` and `B`, return their sum as a binary string.

---

## Problem Constraints

- `1 <= length of A <= 10^5`
- `1 <= length of B <= 10^5`
- `A` and `B` are binary strings containing only `0` and `1`.

---

## Input Format

The two arguments `A` and `B` are binary strings.

---

## Output Format

Return a binary string representing the sum of `A` and `B`.

---

## Example Input

### Input 1

A = "100"
B = "11"

### Input 2

A = "110"
B = "10"

---

## Example Output

### Output 1

"111"

### Output 2

"1000"

---

## Example Explanation

### Explanation 1

The sum of binary numbers `100` and `11` is `111`.

### Explanation 2

The sum of binary numbers `110` and `10` is `1000`.

*/

public class P5 {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }

            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}
