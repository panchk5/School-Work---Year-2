/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import java.util.Scanner;

public class Q1_SolveQuadraticEquation {
    /* place your subroutine code here */
    static String[] calc_roots(double a, double b, double c){
        // subroutine checks discriminant for not real roots and returns no real roots
        if (((b*b)-(4*a*c)) < 0){
            String[] exception = new String[]{"The equation has no real roots."};
            return exception;
        }
        //  makes array of strings to return roots using quadratic formula and formats them to 2 decimals
        String[] root = new String[2];
        double root_1 = ((-b)+Math.sqrt((b*b)-(4*a*c))) / (2*a);
        root[0] = String.format("%.2f", root_1);
        double root_2 = ((-b)-Math.sqrt((b*b)-(4*a*c))) / (2*a);
        root[1] = String.format("%.2f", root_2);
        return root;
    };
    public static void main(String[] Strings) {
        /* place your code to run your subroutine here */
        // inputs all variables
        Scanner input = new Scanner(System.in);
        System.out.println("What is a?");
        double a = input.nextDouble();
        System.out.println("What is b?");
        double b = input.nextDouble();
        System.out.println("What is c?");
        double c = input.nextDouble();
        // calls subroutine and returns list
        String[] roots =  calc_roots(a,b,c);
        // checks list for no real roots answer
        if (roots[0].equals("The equation has no real roots.")) {
            System.out.println(roots[0]);
        } else {
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        }
    }
}
