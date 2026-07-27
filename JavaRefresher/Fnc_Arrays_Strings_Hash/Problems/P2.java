package JavaRefresher.Fnc_Arrays_Strings_Hash.Problems;

/*
# Problem: Highest Common Factor (HCF)

## Problem Description
Take two integers A and B as input and print their Highest Common Factor (HCF).

The HCF (also known as the Greatest Common Divisor or GCD) of two positive integers is the largest positive integer that divides both numbers without leaving a remainder.

---

## Input Format
The first and only line contains two space-separated integers A and B.

---

## Output Format
Print a single integer representing the HCF of A and B.

---

## Example Input

24 36

---

## Example Output

12

*/

import java.lang.*;
import java.util.*;

public class P2 {

    static void hcf(int A, int B) {
        int min = Math.min(A, B);
        int max = Math.max(A, B);
        int temp = min;

        while (true) {
            if (min % temp == 0 && max % temp == 0) {
                System.out.print(temp);
                break;
            }
            temp--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        hcf(A, B);

    }
}
