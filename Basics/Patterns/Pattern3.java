package Basics.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = N - i + 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Problem Description

// Given an integer N, print the corresponding Inverted Half Pyramid pattern for
// N.

// For example if N = 4 then pattern will be like:

// ****
// ***
// **
// *

// Problem Constraints

// 1 <= N <= 100

// Input Format

// First and only line of input contains a single integer N.

// Output Format

// Output the Inverted Half Pyramid pattern corresponding to the given N.

// Example Input

// Input 1:

// 2
// Input 2:

// 3

// Example Output

// Output 1:

// **
// *
// Output 2:

// ***
// **
// *
