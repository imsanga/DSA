package Intermediate.arrayBasics.TwoDarr;

// print all diagonal from left to right

// tc - O(N*M)
public class P4 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        int n = mat.length;
        int m = mat[0].length;

        // print diagonals 1st part
        for (int i = 0; i < m; i++) {
            int start = 0;
            int end = i;

            while (start < n && end >= 0) {
                System.out.print(mat[start][end] + " ");
                start++;
                end--;
            }

            System.out.println();
        }

        // print diagonals 2nd part
        for (int i = 1; i < n; i++) {
            int start = i;
            int end = m - 1;

            while (start < n && end >= 0) {
                System.out.print(mat[start][end] + " ");
                start++;
                end--;
            }

            System.out.println();
        }

    }
}
