/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program to find the value of following expression.
    a) (101 + 0) / 3
    b) 3.0e-6 * 10000000.1
    c) true && true
    d) false && true
    e) (false && false) || (true && true)
    f) (false || false) && (true && true)

 * INPUT: n/a
 * OUTPUT: the value of each of the above expressions.

 */


public class Q1_ExpressionSolution {
    public static void main(String[] args) {
        /* Place your code here */
        // Part A
        double a = (101 + 0) / 3;
        System.out.printf("The answer to part a is %.2f\n", a);
        // Part B
        double b = 3.0e-6 * 10000000.1;
        System.out.printf("The answer to part b is %1.2f\n", b);
        // Part c
        boolean c = true && true;
        System.out.println(c);
        // Part d
        boolean d = true && false;
        System.out.println(d);
        // Part e
        boolean e = (false && false) || (true && true);
        System.out.println(e);
        // Part f
        boolean f = (false || false) && (true && true);
        System.out.println(f);


    }
}
