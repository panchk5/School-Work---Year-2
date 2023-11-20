/* Assignment 2 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a Java program to convert a decimal number to octal number.

    Decimal number: The decimal numeral system is the standard system for denoting integer and non-integer numbers. It is also called base-ten positional numeral system.
    Octal number: The octal numeral system is the base-8 number system, and uses the digits 0 to 7.


 * INPUT: a user input decimal number x
 * OUTPUT: an octal number y converted from x

* Hint: For a decimal number x=1256, the corresponding octal number is y=2350.
 */

import java.util.Scanner;

public class Q2_Decimal2Octal {
    public static void main(String args[])
    {
        /* place your code here */
        //inputs decimal
        Scanner input = new Scanner(System.in);
        System.out.println("Input decimal:");
        int decimal = input.nextInt();
        //finds remainder and quotient
        int remainder = decimal % 8;
        int value = Math.floorDiv(decimal, 8);
        // turns the integers into string for concatenation
        String remainder_to_string = Integer.toString(remainder);
        String answer = remainder_to_string;
        // while loop keeps running until there is no quotient to divide

        while (value > 0){
            remainder = value % 8;
            value = Math.floorDiv(value, 8);
            remainder_to_string = Integer.toString(remainder);
            // joins all remainders
            answer = remainder_to_string + answer;
        };
        // converts back to int
        int ans_to_int = Integer.parseInt(answer);
        System.out.println("Answer:");
        System.out.println(ans_to_int);


    }
}
