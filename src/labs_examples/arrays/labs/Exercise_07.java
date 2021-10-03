package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(0, 7);
        numbers.add(96);
        numbers.add(32);
        numbers.add(47);
        numbers.add(13);
        numbers.add(3, 66);
        //access elements from index
        numbers.get(0);
        numbers.get(7);
        
        //return size of list
        numbers.size();
        //return boolean whether value is present
        numbers.contains(96);

        numbers.indexOf(47);


    }
}
