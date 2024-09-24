package _2DArray;
import java.util.*;
public class RowWiseReverse {

    // Method to reverse each row in the matrix
    static void reverseRows(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            reverseArray(mat[i]);  // Reverse each row
        }
    }
    
    // Helper method to reverse a single array (row)
    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
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

        reverseRows(matrix);

        System.out.println("\nMatrix after row-wise reversal:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}


