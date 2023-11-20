/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 4 (20 marks)
 * 
 * Write a Java program to print the area and perimeter of a circle.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: radius input by a user.
 * OUTPUT: the area and the perimeter of the circle defined by the radius. All results must use two significant digits after decimal point.
 * 
 * Hint: you may use java.util.Scanner to take user input real valued radius.
 * 
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q4_AreaOfCircle {
	public static void main(String[] args) {
		/* Place your code here */
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius?");
		double radius = input.nextDouble();
		Double Area = (Math.PI) * Math.pow(radius, 2);
		Double Perimeter = 2 * (Math.PI) * radius;
		DecimalFormat form = new DecimalFormat("##.00");
		System.out.println("Perimeter");
		System.out.println(form.format(Perimeter));
		System.out.println("Area");
		System.out.println(form.format(Area));

	}
}
