package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 2147483647;
        System.out.println("int i is: " + i);

        long l = 9223372036854775807L;
        System.out.println("long l is: " + l);

        byte b = 127;
        System.out.println("byte b is: " + b);

        short s = 32767;
        System.out.println("short s is: " + s);

        float f = 1.73463636373f;
        System.out.println("float f is: " + f);

        double d = 1.6464738393937383;
        System.out.println("double d is: " + d);

        char c = 'c';
        System.out.println("char c is: " + c);

        boolean t = true;
        System.out.println("boolean t is: " + t);


    }

}
