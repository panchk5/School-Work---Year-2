/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
 *
 * Use a "subroutine" and a lambda expression to implement function
 * f(x,y) = sqrt(x*x-y*y), both x and y are real numbers.
 * Meanwhile, your code can throw an IllegalException (custom run-time exception,
 * which can be one provided by Java) if the value of (x*x-y*y) is negative.
 *
 * INPUT: the value of x and y (user input)
 * OUTPUT: the value of sqrt(x*x-y*y)
 *
 * Note: output must be displayed using four significant digits after decimal point.
 *
 */

import java.util.Scanner;

public class Q2_LambdaExpression {
    /* place your subroutine code here */
    interface Function{
        double valueAt(double x,double y);
    }
    public static double value(double a, double b){
        if (a < b){
            throw new IllegalArgumentException("Square root is negative!");
        }
        Function f = (x,y) -> {return Math.sqrt(x*x-y*y);};
        return f.valueAt(a,b);
    }
    public static void main(String[] args){
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("Value of x:");
        double x = input.nextDouble();
        System.out.println("Value of y:");
        double y = input.nextDouble();
        System.out.printf("Your value is %.4f",value(x,y));
    }
}
