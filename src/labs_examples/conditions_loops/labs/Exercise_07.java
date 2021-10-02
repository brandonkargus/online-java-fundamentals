package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type a word.....");
        String word = scanner.next();
        scanner.close();

        //having trouble using a while loop in this scenario, have an alternate solution below....


        String s = word.replaceFirst("[AEIOUaeiou]", "7");
        int firstVowel = s.indexOf('7');
        System.out.println(word);
        System.out.println(word.charAt(firstVowel));
    }
}


