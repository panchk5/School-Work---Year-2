/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)
 *
 * Write a java program to compute the transpose of a user input matrix,
 * whose elements are all integers.
 *
 * Converting rows of a matrix into columns and columns of a matrix into
 * row is called transpose of a matrix.
 *
 * INPUT: user input matrix (2D array).
 * OUTPUT: the transpose of input matrix.
 *
 * Note: considering how to take users' input, you can set some rules
 * (give users some hints) to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example:
 * INPUT: 4  6  8
 *        5  8  9
 *        2  1  8
 *
 * OUTPUT: 4  5  2
 *         6  8  1
 *         8  9  8
 *
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q3_TransposeMatrix {
    /* place your subroutine code here */
    public static int[][] transpose(int[][] matrix){
        int[][] new_matrix = new int[matrix[0].length][matrix.length];
        // making all rows
        for (int i=0;i<matrix.length;i++){
            // making all columns
            for (int j=0;j<matrix[0].length;j++){
                new_matrix[j][i] = matrix[i][j];
            }
        }
        return new_matrix;
    }
    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your array size?");
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = input.nextInt();
            }
        }
        int[][] ans = transpose(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + "\t"); // Print the element followed by a tab
            }
            System.out.println(); // Move to the next row
        }
    }
}
