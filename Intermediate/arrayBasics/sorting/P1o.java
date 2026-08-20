package Intermediate.arrayBasics.sorting;

// noble integer - elements present before should be equal to the element

// tc - O(nlogn + n) => O(nlogn)
import java.util.*;
/* 
public class P1o {
    public static void main(String[] args) {
        int[] arr = { 1, -5, 3, 5, -10, 4 };
        int n = arr.length;

        // asc sort
        Arrays.sort(arr);

        // count no of noble integers present
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                count++;
                System.out.println(count + " -> " + arr[i]);
            }
        }

        System.out.println("no of noble integers present in given array is: " + count);
    }
}

*/

// with repeated elements

public class P1o {

    public static void main(String[] args) {
        int[] arr = { 9, 3, 3, 1, 1, -2, 3, 3, 3 };
        int n = arr.length;

        // asc sort
        Arrays.sort(arr);

        // count no of noble integers present
        int count = 0;

        if (arr[0] == 0) {
            count++;
            System.out.println(count + " -> " + arr[0]);
        }

        int start = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == i) {
                count++;
                start = i;
                System.out.println(count + " -> " + arr[i]);
            } else if (arr[i] == arr[i - 1]) {
                if (arr[i] == start) {
                    count++;
                    System.out.println(count + " -> " + arr[i]);
                }
            }

        }

        System.out.println("no of noble integers present in given array is: " + count);
    }
}
