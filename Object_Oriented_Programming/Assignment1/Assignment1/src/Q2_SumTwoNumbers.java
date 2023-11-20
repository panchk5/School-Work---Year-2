/* Assignment 1 (100 marks in total; 5% of the final score of this course) 
 * 
 * Question 2 (20 marks)
 * 
 * Write a Java program to print the sum of two user input integer numbers.
 * Also submit a screenshot to demonstrate that you have successfully ran
 * javac and java commandline to compile and run the code of Q1_HelloWorld.java
 * 
 * INPUT: two user input integer numbers
 * OUTPUT: the sum of the two user input integer numbers
 * 
 * Hint1: you may use java.util.Scanner to take user input numbers.
 * 
 */

import java.util.Scanner;


public class Q2_SumTwoNumbers {
	public static void main(String[] args) {
		/* Place your code here */
		Scanner input = new Scanner(System.in);
		System.out.println("num 1?");
		Integer num1 = input.nextInt();
		System.out.println("num 2?");
		Integer num2 = input.nextInt();
		Integer sum = num1 + num2;
		System.out.println(sum);

	}
}
