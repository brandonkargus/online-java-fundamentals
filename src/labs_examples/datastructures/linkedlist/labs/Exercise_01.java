package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries) (DONE)
 *      2) add() (DONE)
 *      3) addAll() (DONE)
 *      4) addFirst() (DONE)
 *      5) addLast() (DONE)
 *      6) getFirst() (DONE)
 *      7) getLast() (DONE)
 *      8) get() (DONE)
 *      9) set() (DONE)
 *      10) push() (DONE)
 *      11) pop() (DONE)
 *      12) remove() (DONE)
 *      13) contains() (DONE)
 *      14) listIterator() (DONE)
 *      15) clear() (DONE)
 */
class Exercise_01 {
    public static void main(String[] args) {
        LinkedList<String> vehicleModels = new LinkedList<>();    // 1.

        vehicleModels.add("Explorer");
        vehicleModels.add("Grand Cherokee");       // 2.
        vehicleModels.add("4 Runner");

        Collection<String> otherCars = new ArrayList<>();
        otherCars.add("Silverado");
        otherCars.add("Yukon");
        otherCars.add("Prius");

        vehicleModels.addAll(otherCars);     // 3.

        vehicleModels.addFirst("Escort");   // 4.
        vehicleModels.addFirst("Envoy");

        vehicleModels.addLast("Excursion");   // 5.
        vehicleModels.addLast("F-150");

        vehicleModels.getFirst();  // 6.
        vehicleModels.getLast();   // 7.

        vehicleModels.get(3);  // 8.

        vehicleModels.set(2, "Touareg");   // 9.

        vehicleModels.push("Jetta");   // 10.

        vehicleModels.pop();    // 11.

        vehicleModels.remove();  // 12.

        boolean hasExplorer = vehicleModels.contains("Explorer");  // 13.

        ListIterator list = vehicleModels.listIterator(4);   // 14.
        System.out.println(list);

        vehicleModels.clear();   // 15.
    }
}
