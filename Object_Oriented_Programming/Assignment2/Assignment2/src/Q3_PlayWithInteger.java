/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
    Write a Java program that accepts an integer (n, 0 <= n <= 9) and computes the value of n+nn+nnn.

 * INPUT: a user input integer n
 * OUTPUT: the value of n+nn+nnn.

* Hint: For n=2, the output is 2+22+222=246
 */

import java.util.Scanner;

public class Q3_PlayWithInteger {
    public static void main(String[] args) {
        /* place your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is the integer?");
        int n = input.nextInt();
        // turns integer to string
        String num_in_string = Integer.toString(n);
        int sum = 0;
        for (int i=1; i < 4 ;i++){
            //repeats number of n's by i times
            String product = num_in_string.repeat(i);
            // turns it to integer
            int string_to_num = Integer.parseInt(product);
            //adds to total
            sum = sum + string_to_num;

        };
        System.out.println(sum);

    }
}
