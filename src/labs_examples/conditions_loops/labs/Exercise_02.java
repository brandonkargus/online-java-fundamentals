package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1-7.....");
        int value = scanner.nextInt();
        if(value < 1 || value > 7){
            System.out.println("Invalid entry, please run again");
        }else{
            switch(value){
                case 1:
                    System.out.println("Monday");break;
                case 2:
                    System.out.println("Tuesday");break;
                case 3:
                    System.out.println("Wednesday");break;
                case 4:
                    System.out.println("Thursday");break;
                case 5:
                    System.out.println("Friday");break;
                case 6:
                    System.out.println("Saturday");break;
                default:
                    System.out.println("Sunday");
            }
        }

    }
}
