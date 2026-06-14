package JavaRefresher.Class1.Problems;

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
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
