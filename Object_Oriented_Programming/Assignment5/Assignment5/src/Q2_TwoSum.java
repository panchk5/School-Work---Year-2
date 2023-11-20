/* Assignment 5 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (30 marks)
 *
 * Write a subroutine, user input an 1D array of integers and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * INPUT: user input array and target
 * OUTPUT: the indices of the two numbers such that they add up to target.
 *
 * The array and target are parameters to the subroutine.
 * User can get hint to input array and target number, respectively.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example:
 * INPUT: [2,7,11,15], 9
 * OUTPUT: [0,1]
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Q2_TwoSum {
    /* place your subroutine code here */
    public static int[] sum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(target - arr[i])){

                int[] num = {map.get(target-arr[i]),i};
                return num;
            }
            map.put((arr[i]),i);
        }
        return null;
    }
    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner input = new Scanner(System.in);
        System.out.println("How many inputs in array?");
        Integer count = input.nextInt();
        int[] arr = new int[count];
        for (int i=0;i<count;i++){
            System.out.println("What is num"+(i+1));
            Integer num = input.nextInt();
            arr[i] = num;
        }
        System.out.println("What is your target?");
        Integer target = input.nextInt();
        String stringans = Arrays.toString(sum(arr,target));
        System.out.println(stringans);
    }

}
