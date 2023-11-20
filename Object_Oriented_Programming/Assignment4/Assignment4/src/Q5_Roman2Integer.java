/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 5 (20 marks)
 *
 * Write a java program to convert Roman numbers to integer.
 * Roman numerals are represented by seven different symbols:
 * I, V, X, L, C, D and M
 *
 * Symbol   Value
 *   I        1
 *   V        5
 *   X        10
 *   L        50
 *   C        100
 *   D        500
 *   M        1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written
 * as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *  I can be placed before V (5) and X (10) to make 4 and 9.
 *  X can be placed before L (50) and C (100) to make 40 and 90.
 *  C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Input: Roman number (user input, string type)
 * Output: print out corresponding integer
 *
 * Example: if the user enters 'LVIII', the program should output 'LVIII -> 58'
 *
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q5_Roman2Integer {
    /* place your subroutine code here */
    // LVIII
    // add L (+50)
    // add V (+55)
    // add I (+56)
    // add I (+57)
    // add I (+58)

    // IX
    // subtract I (-1)
    // add X (+9)
    public static int romantoint(String roman){
        // creating conversion dictionary
        Map<Character,Integer> conversion = new HashMap<>();
        conversion.put('I',1);
        conversion.put('V',5);
        conversion.put('X',10);
        conversion.put('L',50);
        conversion.put('C',100);
        conversion.put('D',500);
        conversion.put('M',1000);
        // initial ans
        Integer ans = 0;
        // iterating through roman numeral
        for (int i=0;i<(roman.length());i++){
            char letter = roman.charAt(i);
            // compares if current numeral is lower than next
            // also makes sure there is a next numeral to compare. If not, adds it
            if ((i<roman.length()-1) && (conversion.get(letter) < conversion.get(roman.charAt(i+1)))){
                //subtract current numeral
                ans = ans - conversion.get(letter);
            }else{
                // adds current numeral
                ans = ans + conversion.get(letter);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("What is your roman numeral?");
        String roman = input.next();
        System.out.println("Your answer is:");
        System.out.println(romantoint(roman));

    }
}
