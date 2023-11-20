/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 3 (20 marks)
 * 
 * Write a Java program to print the result of first user input real number divided by the second user input real number.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 *
 * INPUT: user input real number x, and user input real number y
 * OUTPUT: the result of x divided y. (The result should be printed with two significant digits after the decimal point.)
 * 
 * Hint1: you may use java.util.Scanner to take user input real numbers.
 * Hint2: you may use format string of System.out.printf() when printing the result.
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q3_DivideTwoNumbers {
	public static void main(String[] args) {
		/* Place your code here */
		Scanner input = new Scanner(System.in);
		System.out.println("First num?");
		Double num1 = input.nextDouble();
		System.out.println("Second num?");
		Double num2 = input.nextDouble();
		Double division = num1 / num2;
		DecimalFormat form = new DecimalFormat("##.00");
		System.out.println(form.format(division));

	}
}
