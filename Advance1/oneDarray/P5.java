package Advance1.oneDarray;

// idea of the problem: in which substring it makes the total 1 count as max, i need to return the start and end index of substring

import java.util.*;

/*

public class Solution {
    public ArrayList<Integer> flip(String A) {

        int n = A.length();

        int total1 = 0;

        // Count existing 1s
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                total1++;
            }
        }

        if (total1 == n) {
            return new ArrayList<>();
        }

        int max = total1;

        ArrayList<Integer> ans = new ArrayList<>();

        // Try every starting index
        for (int i = 0; i < n; i++) {

            int count = total1;

            // Try every ending index
            for (int j = i; j < n; j++) {

                if (A.charAt(j) == '0') {
                    count++;
                } else {
                    count--;
                }

                if (count > max) {
                    max = count;
                    ans.clear();
                    ans.add(i + 1);
                    ans.add(j + 1);
                }
            }
        }

        return ans;
    }
}

*/

// tc: O(n)
// sc: O(1)
public class P5 {
    public ArrayList<Integer> flip(String A) {
        int n = A.length();

        int count = 0, max = -1, start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0')
                count++;
            else
                count--;

            if (count > max) {
                max = count;
                start = tempStart;
                end = i;
            }

            if (count < 0) {
                count = 0;
                tempStart = i + 1;
            }
        }

        if (max == -1)
            return new ArrayList<>();

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start + 1);
        ans.add(end + 1);

        return ans;
    }
}
