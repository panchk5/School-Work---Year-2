/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 4 (20 marks)
    Write a Java program to print integer numbers between 1 to a user input integer n, which are divisible by 3, 5 and by both.

 * INPUT: a user input integer n
 * OUTPUT: all the integer numbers between 1 and n that are either divisible by 3 or by 5 or by both.

* Hint: For n=16, the output should be as follows.
    Divided by 3 -> 3, 6, 9, 12, 15.
    Divided by 5 -> 5, 10, 15.
    Divided by 3 and 5 -> 15.
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4_FindNumbers {
    public static void main(String args[]) {
        /* place your code here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your number?");
        int n = input.nextInt();
        int div3 = 0;
        int div5 = 0;
        //makes 3 lists
        List div3list = new ArrayList<Integer>();
        List div5list = new ArrayList<Integer>();
        List div3and5list = new ArrayList<Integer>();
        // uses for loop for every num in n
        for (int i = 1; i <= n; i++) {
            // checks if its divisible
            if (i % 3 == 0) {
                div3list.add(i);
            }
            if (i % 5 == 0) {
                div5list.add(i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                div3and5list.add(i);
            }
        }
        System.out.println(div3list);
        System.out.println(div5list);
        System.out.println(div3and5list);

    }
}
