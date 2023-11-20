/* Assignment 3 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)

Many companies use telephone numbers like 555-GET-Food so the number is easier for their customers to remember.
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:

A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
The application should display the telephone number with any alphabetic characters that appeared in the original
translated to their numeric equivalent.

Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;
import java.util.*;
public class Q3_AlphabeticPhoneNumber
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number = 0; // 'number' is the digital phone number to compute from the initial alphabetic phone number.



        /* place your code here */
        // code is assuming you have the ###-###-#### format everytime
        String result = "";
        for (int i =0;i<12;i++){
            // iterates through every character for the right alphabet and adds it to a string
            char character = initial_phone_number.charAt(i);
            if (character == 'A' || character == 'B' || character == 'C'){
                result = result + '2';
            }else if (character == 'D' || character == 'E' || character == 'F'){
                result = result + '3';
            }else if (character == 'G' || character == 'H' || character == 'I'){
                result = result + '4';
            }else if (character == 'J' || character == 'K' || character == 'L'){
                result = result + '5';
            }else if (character == 'M' || character == 'N' || character == 'O'){
                result = result + '6';
            }else if (character == 'P' || character == 'Q' || character == 'R' || character == 'S'){
                result = result + '7';
            }else if (character == 'T' || character == 'U' || character == 'V'){
                result = result + '8';
            }else if (character == 'W' || character == 'X' || character == 'Y' || character == 'Z'){
                result = result + '9';
            }else if (character != '-'){
                // ignores dash
                result = result + character;
            }
        }
        // turns string to long
        number = Long.parseLong(result);


        // Return actual number only at the end of the function
        return number;

    }// End of full_number function
}
