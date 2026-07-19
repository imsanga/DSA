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
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
