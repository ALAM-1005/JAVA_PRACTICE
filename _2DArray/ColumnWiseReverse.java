package _2DArray;

import java.util.Arrays;

public class ColumnWiseReverse {

    // Method to reverse each column in the matrix
    static void reverseColumns(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            reverseColumn(mat, i);  // Reverse each column
        }
    }

    // Helper method to reverse a single column
    static void reverseColumn(int[][] mat, int colIndex) {
        int start = 0;
        int end = mat.length - 1;

        while (start < end) {
            int temp = mat[start][colIndex];
            mat[start][colIndex] = mat[end][colIndex];
            mat[end][colIndex] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        reverseColumns(matrix);

        System.out.println("\nMatrix after column-wise reversal:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


