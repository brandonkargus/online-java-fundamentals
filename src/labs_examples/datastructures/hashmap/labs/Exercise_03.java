package labs_examples.datastructures.hashmap.labs;

import java.util.*;

/**
 * HashMaps Exercise_03
 * <p>
 * Create a new class that does the following:
 * <p>
 * 1) create a LinkedList
 * 2) create a Stack
 * 3) create a Queue
 * 4) create a HashMap
 * <p>
 * Then, add millisecond timers before and after each data structure above and print out
 * how long it takes for each to complete EACH the following tasks, and the total time for
 * each data structure:
 * <p>
 * 1) add 100 elements
 * 2) update 100 elements
 * 3) search for 100 elements
 * 4) delete 100 elements
 */
class Exercise_03 {
    public static void hashMapTimes() {
        System.out.println("HashMap stats: ");
        //add
        long[] times = new long[4];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        long hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMap.put(i, i);
        }
        long hashA = System.currentTimeMillis();
        times[0] = (hashA - hashB);
        System.out.println("Total Add Time: " + times[0]);
        //update
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMap.replace(i, 7);
        }
        hashA = System.currentTimeMillis();
        times[1] = (hashA - hashB);
        System.out.println("Total Update Time: " + times[1]);
        //search
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMap.containsValue(1000);
        }
        hashA = System.currentTimeMillis();
        times[2] = (hashA - hashB);
        System.out.println("Total Search Time: " + times[2]);
        //delete
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hashMap.remove(i);
        }
        hashA = System.currentTimeMillis();
        times[3] = (hashA - hashB);
        System.out.println("Total Remove Time: " + times[3]);
        long total = times[0] + times[1] + times[2] + times[3];
        System.out.println("Total time for all 4 actions: " + total);
    }

    public static void queueTimes() {
        System.out.println("Queue stats:");
        //add
        long[] times = new long[4];
        Queue<Integer> queue = new ArrayDeque<>();
        long hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queue.add(i);
        }
        long hashA = System.currentTimeMillis();
        times[0] = (hashA - hashB);
        System.out.println("Total Add Time: " + times[0]);
        //update
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queue.remove(i);
            queue.add(i);
        }
        hashA = System.currentTimeMillis();
        times[1] = (hashA - hashB);
        System.out.println("Total Update Time: " + times[1]);
        //search
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queue.element();
        }
        hashA = System.currentTimeMillis();
        times[2] = (hashA - hashB);
        System.out.println("Total Search Time: " + times[2]);
        //delete
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            queue.remove();
        }
        hashA = System.currentTimeMillis();
        times[3] = (hashA - hashB);
        System.out.println("Total Remove Time: " + times[3]);
        long total = times[0] + times[1] + times[2] + times[3];
        System.out.println("Total time for all 4 actions: " + total);
    }

    public static void stackTimes() {
        System.out.println("Stack stats:");
        //add
        long[] times = new long[4];
        Stack<Integer> stack = new Stack<>();
        long hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        long hashA = System.currentTimeMillis();
        times[0] = (hashA - hashB);
        System.out.println("Total Add Time: " + times[0]);
        //update
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stack.set(i, 7);
        }
        hashA = System.currentTimeMillis();
        times[1] = (hashA - hashB);
        System.out.println("Total Update Time: " + times[1]);
        //search
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stack.search(1000);
        }
        hashA = System.currentTimeMillis();
        times[2] = (hashA - hashB);
        System.out.println("Total Search Time: " + times[2]);
        //delete
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            stack.pop();
        }
        hashA = System.currentTimeMillis();
        times[3] = (hashA - hashB);
        System.out.println("Total Remove Time: " + times[3]);
        long total = times[0] + times[1] + times[2] + times[3];
        System.out.println("Total time for all 4 actions: " + total);
    }

    public static void linkedListTimes() {
        System.out.println("LinkedList stats:");
        //add
        long[] times = new long[4];
        LinkedList<Integer> linked = new LinkedList<>();
        long hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linked.add(i);
        }
        long hashA = System.currentTimeMillis();
        times[0] = (hashA - hashB);
        System.out.println("Total Add Time: " + times[0]);
        //update
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linked.set(i, 7);
        }
        hashA = System.currentTimeMillis();
        times[1] = (hashA - hashB);
        System.out.println("Total Update Time: " + times[1]);
        //search
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linked.contains(1000);
        }
        hashA = System.currentTimeMillis();
        times[2] = (hashA - hashB);
        System.out.println("Total Search Time: " + times[2]);
        //delete
        hashB = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            linked.remove();
        }
        hashA = System.currentTimeMillis();
        times[3] = (hashA - hashB);
        System.out.println("Total Remove Time: " + times[3]);
        long total = times[0] + times[1] + times[2] + times[3];
        System.out.println("Total time for all 4 actions: " + total);
    }

    public static void main(String[] args) {

        hashMapTimes();
        queueTimes();
        stackTimes();
        linkedListTimes();


    }
}