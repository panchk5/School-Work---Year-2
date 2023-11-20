/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a java program, use "subroutine" to finish sorting a 2-dimension matrix[0]ay.
 *
 * User input a 2-dimension matrix[0]ay of double type, return it in non-decreasing
 * order according to values in the first raw, if there are two or more same
 * element in the first raw, keep the original sequence.
 *
 * INPUT: a user input 2-dimension matrix[0]ay.
 * OUTPUT: sorted input matrix[0]ay in non-decreasing order according to values in the first row.
 *
 * Note: considering how to take users' input, you can set some rules (give users some hints)
 * to make your code user-friendly.
 * User will follow your instruction to input test example.
 *
 * Example 1
 * INPUT: if user input matrix[0]ay (Order 2*4) is
 *        1.45  0.25  8.95  0.99
 *        2.56  5.67  0.47  2.65
 *
 * OUTPUT: 0.25  0.99  1.45  8.95
 *         5.67  2.65  2.56  0.47
 *
 * Example 2
 * INPUT: if user input matrix[0]ay (Order 5*5) is
 *        0.95  0.23  0.95  0.95  0.65
 *        2.56  5.67  0.47  2.65  0.47
 *        1.45  0.25  8.95  0.99  0.67
 *        5.67  2.65  0.25  8.95  0.99
 *        1.23  4.21  0.97  7.64  8.52
 *
 * OUTPUT: 0.23  0.65  0.95  0.95  0.95
 *         5.67  0.47  2.56  0.47  2.65
 *         0.25  0.67  1.45  8.95  0.99
 *         2.65  0.99  5.67  0.25  8.95
 *         4.21  8.52  1.23  0.97  7.64
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Sort2DArray {
    /* place your subroutine code here */
    public static double[][] sort(double[][] matrix){
        int i, j,k;
        double temp;
        for (i = 0; i < matrix[0].length - 1; i++) {
            boolean swap = false;
            for (j = 0; j < matrix[0].length - i - 1; j++) {
                if (matrix[0][j] > matrix[0][j + 1]) {
                    // Swap matrix[0][j] and matrix[0][j+1]
                    // swap the columns too
                    for (k=0;k<matrix.length;k++){
                        System.out.println(matrix[k][j]);
                        System.out.println(matrix[k][j+1]);
                        temp = matrix[k][j];
                        matrix[k][j] = matrix[k][j + 1];
                        matrix[k][j + 1] = temp;
                    }
                }
                if (!swap){
                    break;
                }
            }
        }

        return matrix;
    }
    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your array size?");
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = input.nextDouble();
            }
        }
        double[][] ans = sort(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }
}
