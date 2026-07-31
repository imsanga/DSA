package JavaRefresher.Exam;

/*
# Problem: Number Pattern - Butterfly Pattern

## Problem Description
Print the following butterfly number pattern for a given integer N.

For example, if N = 5:

1        1
12      21
123    321
1234  4321
1234554321
1234  4321
123    321
12      21
1        1

---

## Input Format
The first and only line contains a single integer N.

---

## Output Format
Print the butterfly number pattern consisting of (2 × N - 1) rows.

- The upper half prints numbers from 1 to i, followed by spaces, then numbers from i to 1.
- The middle row contains numbers from 1 to N and back to 1 without spaces in between.
- The lower half is the mirror image of the upper half.

---

## Example Input

5

---

## Example Output

1        1
12      21
123    321
1234  4321
1234554321
1234  4321
123    321
12      21
1        1

*/

public class P8 {
    public static void main(String[] args) {
        int n = 5, temp1 = n;

        for (int i = 1; i <= n * 2 - 1; i++) {
            int temp2 = i > n ? --temp1 : i;
            for (int j = 1; j <= temp2; j++) {
                System.out.print(j);
            }

            int temp3 = i > n ? i - temp2 : 2 * n - 2 * i;
            for (int k = 1; k <= temp3; k++) {
                System.out.print(" ");
            }

            for (int l = temp2; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();

        }
    }
}
