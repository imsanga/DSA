package Advance1.twoDarray;

// traverse all the submatrix
// tc: O(n^3 * m^3)

public class SubMatrix {
    public static void main(String[] args) {
        int[][] A = {
                { 1, 2 },
                { 3, 4 }
        };

        int n = A.length;
        int m = A[0].length;

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < m; c1++) {
                for (int r2 = r1; r2 < n; r2++) {
                    for (int c2 = c1; c2 < m; c2++) {

                        for (int i = r1; i <= r2; i++) {
                            for (int j = c1; j <= c2; j++) {
                                System.out.print(A[i][j] + " ");
                            }
                            System.out.println();
                        }
                        System.out.println("------");
                    }
                }
            }
        }

    }
}
