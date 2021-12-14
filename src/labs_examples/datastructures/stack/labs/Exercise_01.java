package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack (DONE)
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5 (DONE)
 */
class Exercise_01 {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<>();

        myStack.push("Kargus");
        myStack.push("Irene");
        myStack.push("Giralt");
        myStack.push("Brandon");
        myStack.push("John");

        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.search("Ted"));
        System.out.println(myStack.peek());
        System.out.println(myStack.empty());   // the 6TH method

    }

}