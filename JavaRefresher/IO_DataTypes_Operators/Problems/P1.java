package JavaRefresher.IO_DataTypes_Operators.Problems;

/*
# Problem: Star Pattern - Reverse Triangle

## Problem Description
Print the following pattern in output:

*****
****
***
**
*

---

## Output Format
Print the pattern in 5 lines with 5, 4, 3, 2, and 1 stars respectively.

---

## Example Output

*****
****
***
**
*

*/

import java.lang.*;
import java.util.*;

public class P1 {
    public static void main(String[] args) {
        // row space star
        // 1 0 5
        // 2 0 4
        // 3 0 3
        // 2 0 2
        // 1 0 1

        // star => n-row+1

        int n = 5;

        for (int row = 1; row <= n; row++) {
            // stars
            for (int stars = 1; stars <= n - row + 1; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
