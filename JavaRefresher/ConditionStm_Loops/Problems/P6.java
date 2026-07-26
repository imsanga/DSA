package JavaRefresher.ConditionStm_Loops.Problems;

/*
# Problem: Highest Common Factor (HCF)

## Problem Description
Take two integers A and B as input and print their Highest Common Factor (HCF).

The HCF (also known as the Greatest Common Divisor or GCD) of two positive integers is the largest positive integer that divides both numbers without leaving a remainder.

---

## Input Format
The first and only line contains two integers A and B.

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

// HCF (or GCD) is the largest common factor of two numbers.
// Factors are numbers that divide the given number exactly.
public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int min = Math.min(A, B);
        int max = Math.max(A, B);
        int i = min;

        while (true) {
            if (min % i == 0 && max % i == 0) {
                System.out.print(i);
                break;
            }
            i--;
        }
    }
}