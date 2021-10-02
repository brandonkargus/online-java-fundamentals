package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for(int i = 0; i < 75; i++){
            if(i == 56){
                continue;
            }
            System.out.println(i);
            //will skip 56 and print the rest
        }
    }
}
