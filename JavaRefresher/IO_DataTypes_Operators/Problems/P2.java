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
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // star
            for (int k = i; k >= 1; k--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}