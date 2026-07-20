package JavaRefresher.IO_DataTypes_Operators.Problems;

/*
# Problem: Right-Aligned Star Triangle

## Problem Description
Print the following pattern in output:

    *
   **
  ***
 ****
*****

---

## Output Format
Print the pattern in 5 lines with:
- 4 spaces and 1 star in the first line
- 3 spaces and 2 stars in the second line
- 2 spaces and 3 stars in the third line
- 1 space and 4 stars in the fourth line
- 0 spaces and 5 stars in the fifth line

---

## Example Output

    *
   **
  ***
 ****
*****

*/

import java.lang.*;
import java.util.*;

public class P2 {
    public static void main(String[] args) {
        // row space star
        // 1 4 1
        // 2 3 2
        // 3 2 3
        // 4 1 4
        // 5 0 5

        // space => n-row
        // star => row

        int n = 5;

        for (int rows = 1; rows <= n; rows++) {
            // spaces
            for (int spaces = 1; spaces <= n - rows; spaces++) {
                System.out.print(" ");
            }

            // stars
            for (int stars = 1; stars <= rows; stars++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}