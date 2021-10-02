package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int b = 7;
        for(int i = 7;; i++){
            System.out.println(b);
            b++;
            if(b == 76){
                break;
            }
        }
    // will print all numbers from 1-75, exiting at 76, preventing an infinite loop
    }
}
