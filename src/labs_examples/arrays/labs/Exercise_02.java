package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.List;
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

        Integer[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1-10");
        int number = scanner.nextInt();
        List<Integer> al = Arrays.asList(array);
        if(number < 1 || number > 10){
            System.out.println("Invalid Entry, please run again");
        }else{
            System.out.println("Number " + number + " is at index " + al.indexOf(number) );
        }
    }
}