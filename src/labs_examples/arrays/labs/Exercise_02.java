package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1-10");
        int number = scanner.nextInt();
        if(number < 1 || number > 10){
            System.out.println("Invalid Entry, please run again");
        }else{
            System.out.println("Index of " + number + " holds " + array[number]);
        }

        // not sure if I'm doing this right, or have the problem reversed
    }
}