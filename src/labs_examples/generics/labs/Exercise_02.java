package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 * <p>
 * Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 * Numbers in the ArrayList. Demonstrate how to call this method from the main() method. (DONE)
 */

class Demo {

    public Demo() {
    }

    public <N extends Number> void sum(ArrayList<N> list) {
        double sum = 0.0;
        for (N l : list) {
            sum += l.doubleValue();
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Demo example = new Demo();
        ArrayList<Number> list = new ArrayList<>();
        list.add(56);
        list.add(76.89);
        list.add(45.7f);


        example.sum(list);

    }


}