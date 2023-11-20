/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. (see the following example)
 * Your subroutine should directly print the result and do not return anything.

*
* Example:
* For n=7, the rhombus structure is:
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1

* For n=3, the rhombus structure is:
  1
 212
32123
 212
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombus {
    /* place your subroutine code here */
    static void rhombus(int n){
        int space = n - 1;
        int num = 1;
        String numbers = "1";

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your n value?");
        Integer n = input.nextInt();
        rhombus(n);

    }
}
