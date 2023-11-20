/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
    Write a program in Java to display (i.e. print) the pattern like right angle triangle with a number.

 * INPUT: an integer number n
 * OUTPUT: print a right angle triangle corresponding to n

 * Example1: for n=3, the right angle triangle should be:
    1
    12
    123

 * Example2: for n=5, the right angle triangle should be:
    1
    12
    123
    1234
    12345

 */

import java.util.Scanner;

public class Q5_DisplayNumber {
    public static void main(String[] args) {
        /* place your code here */
        // input number
        Scanner input = new Scanner(System.in);
        System.out.println("What is the number?");
        int n = input.nextInt();
        // create string to append to
        String ans = "";
        // increment the answer by 1
        int increments = 0;
        // create a loop for how many prints you need
        for (int i=0;i<n;i++){
            increments++;
            String increment_to_integer = Integer.toString(increments);
            ans = ans + increment_to_integer;
            System.out.println(ans);
        }
    }
}
