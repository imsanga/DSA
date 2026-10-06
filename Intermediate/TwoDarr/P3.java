package Intermediate.TwoDarr;

// Diagonal and Anti Diagonal Sum

// tc - O(N)
public class P3 {
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int n = mat.length;
        int diagonalSum = 0, antiDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            diagonalSum += mat[i][i];
            antiDiagonalSum += mat[i][n - i - 1];
        }

        System.out.println("Diagonal Sum -> " + diagonalSum);
        System.out.println("Anti Diagonal Sum -> " + antiDiagonalSum);
    }
}
