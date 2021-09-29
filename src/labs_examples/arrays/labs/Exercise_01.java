package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Please enter 10 numbers ");
        while(count < 10){
            nums.add(scanner.nextInt());
            count++;
        }
        scanner.close();
        int sum = 0;
        for(Integer n : nums){
            sum += n;
        }
        System.out.println("Total sum = " + sum);
        System.out.println("Average of elements = " + sum / nums.size());
    }

}