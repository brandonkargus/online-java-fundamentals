package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Generics Exercise 3:
 * <p>
 * 1) Write a generic method that accepts two generic arguments. This generic method should only accept
 * arguments which are subclasses of Number. The generic method must return the sum (as a double) of whatever two
 * numbers were passed in regardless of their type. (DONE)
 * <p>
 * 2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes (DONE)
 * <p>
 * 3) Write a generic method to exchange the positions of two different elements in an array. (DONE)
 * <p>
 * 4) Write a generic method to find the largest element within the range (begin, end) of a list. (DONE)
 */

class Exercise_03 {
    public static <T extends Number> double sum(T x, T y) {   //1.
        return x.doubleValue() + y.doubleValue();
    }

    public static int palindromes(ArrayList<String> al) {    //2.  why would I make method Generic, when elements are all String?
        int count = 0;
        for (String s : al) {
            if (s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())) {
                count++;
            }
        }
        return count;
    }

    public static void exchange(Object[] arr) {     //3.
        int originalPosition = 1;
        int newPosition = arr.length - 1;
        Object temp = arr[originalPosition];
        arr[originalPosition] = arr[newPosition];
        arr[newPosition] = temp;
        System.out.println(Arrays.toString(arr));
    }

    public static <T extends Number> T largest(ArrayList<T> list) {   //4.
        T largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() > largest.doubleValue()) {
                largest = list.get(i);
            }
        }
        return largest;
    }


    public static void main(String[] args) {
        System.out.println(sum(65, 789.90));

        ArrayList<String> words = new ArrayList<>();
        words.add("mom");
        words.add("frog");
        words.add("cat");
        words.add("dad");
        words.add("spaceship");

        System.out.println(palindromes(words));

        Object[] arr = new Object[]{45, "string", 87, 34.5, 'b', 1.12f};

        System.out.println("Before swap....");
        System.out.println(Arrays.toString(arr));
        System.out.println("After swap....");
        exchange(arr);

        ArrayList<Number> nums = new ArrayList<>();
        nums.add(45.5);
        nums.add(7);
        nums.add(900.5f);
        nums.add(12343);
        nums.add(765.50);

        System.out.println(largest(nums));


    }
}