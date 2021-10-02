package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers, an upper and lower boundary");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        scanner.close();
        int lower = 0;
        int upper = 0;
        double count = 0;
        int sum = 0;
        if(value1 > value2){
            upper = value1;
            lower = value2;
        }else{
            upper = value2;
            lower = value1;
        }
        for(int i = lower; i <= upper; i++){
            sum += i;
            count++;
        }
        double average = sum / count;
        System.out.println(sum);
        System.out.println(average);

    }
}
