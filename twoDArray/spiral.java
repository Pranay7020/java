package twoDArray;

public class spiral {
    public static void spiral(int matrix[][]) {

        int srow = 0;
        int erow = matrix.length - 1;
        int scol = 0;
        int ecol = matrix[0].length - 1;

        while (srow <= erow && scol <= ecol) {

            // Top row
            for (int j = scol; j <= ecol; j++) {
                System.out.print(matrix[srow][j] + " ");
            }

            // Right column
            for (int i = srow + 1; i <= erow; i++) {
                System.out.print(matrix[i][ecol] + " ");
            }

            // Bottom row
            if (srow < erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    System.out.print(matrix[erow][j] + " ");
                }
            }

            // Left column
            if (scol < ecol) {
                for (int i = erow - 1; i >= srow + 1; i--) {
                    System.out.print(matrix[i][scol] + " ");
                }
            }

            // Move boundaries inward
            srow++;
            erow--;
            scol++;
            ecol--;
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiral(matrix);
    }
}
