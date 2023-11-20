/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
 *
 * Write a Java program, use 'subroutine' to finds the minimum value of
 * the first N elements of an array of type int.
 * Meanwhile, your code can throw an IllegalException (custom run-time
 * exception, which can be one provided by Java) if N is not in the range
 * of the length of input array.
 *
 * Input: user input array and number N.
 * Output: the minimum value of the first N elements of the array.
 *
 * Note: The array and N are parameters to the subroutine.
 * Users will input an array with no specific length.
 *
 */

import java.util.Scanner;

public class Q1_FindMinimum {
    /* place your subroutine code here */
    public static int min_val(int[] array, int N) {
        //sets initial val
        int min_value = 0;
        try {
            // starts val at crazy high num so first num is always min
            min_value = 999999999;
            // for loop compares every num in array to min
            for (int i = 0; i < N; i++) {
                // compares and makes new min value
                if (array[i] < min_value) {
                    min_value = array[i];
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // catches out of bound exception
            System.out.println("The first elements of the array you selected is larger than the array itself.");
        }
        return min_value;
    }
    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("How big is your array?");
        Integer n = input.nextInt();
        // inputs array
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.println("How many elements do u want to check?");
        Integer N = input.nextInt();
        System.out.println("Minimum is:");
        System.out.println(min_val(array,N));
    }
}


