/* Assignment 6 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (20 marks)
 *
 * Write a Java program, user input a 1-dimension array of integers, firstly
 * sorting it in non-increasing order, and then remove the duplicates in the
 * array (if exists).
 *
 * INPUT: user input a 1-dimension array.
 * OUTPUT: sorted array in non-increasing order, and without any repeating element.
 *
 * Note: You must write sort algorithm by yourself, you are not supposed to
 * use Arrays.sort() to output the result directly.
 *
 * Hint: you can use bubble sorting algorithm or other sorting algorithms.
 *
 * Keep the input format in the example and make your code user-friendly.
 *
 * Example 1:
 * INPUT: [0, 1, 1, 0, 1, 2, 2, 3, 3, 4]
 * OUTPUT: [4, 3, 2, 1, 0]
 *
 * Example 2:
 * INPUT: [7, 0, 4, 2, 9]
 * OUTPUT: [9, 7, 4, 2, 0]
 *
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q3_RemoveDuplicates {
    /* place your subroutine code here */
    public static int[] remove(int[] arr){
        HashSet<Integer> duplicate = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if (duplicate.contains(arr[i])){
                continue;
            }else {
                ans.add(arr[i]);
                duplicate.add(arr[i]);
            }
        }
        int[] s2 = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            s2[i] = ans.get(i);
        }

        for (int j = 0; j < s2.length - 1; j++) {
            boolean swap = false;
            for (int k=0; k < s2.length - j - 1; k++){
                if (s2[k] < s2[k+1]){
                    int temp = s2[k];
                    s2[k] = s2[k+1];
                    s2[k+1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        return s2;
    }
    public static void main(String[] args) {
        /* place your code to run your subroutine here */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        int[] arr = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        int[] printans = remove(arr);
        System.out.print("[");
        for (int i = 0; i < printans.length; i++) {
            System.out.print(printans[i]);
            if (i < printans.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
