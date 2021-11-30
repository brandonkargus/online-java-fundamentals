package labs_examples.lambdas.labs;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Lambdas Exercise 1:
 * <p>
 * 1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void (DONE)
 * 2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface. (DONE)
 * <p>
 * 3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 * value of the same type as the parameter (DONE)
 * 4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface. (DONE)
 * <p>
 * 5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 * value (DONE)
 * 6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 * an anonymous inner class from this interface. (DONE)
 * <p>
 * 7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package. (DONE)
 */
@FunctionalInterface
interface Exercise_01 {
    public void sampleInterfaceMethod();   // 1.
}

@FunctionalInterface
interface Exercise_01_2 {
    public int sampleInterfaceMethod2(int a);  // 3.
}

@FunctionalInterface
interface Exercise_01_3 {
    public int sampleInterfaceMethod2(String a, String b);   // 5.
}

class Main {
    public static void main(String[] args) {
        Exercise_01 usage = () -> {     // 2.
            System.out.println("Sample Interface Method used");
        };
        usage.sampleInterfaceMethod();

        Exercise_01_2 usage2 = (int a) -> a * 7 + 6;    // 4.
        System.out.println(usage2.sampleInterfaceMethod2(7));

        Exercise_01_3 usage3 = (String a, String b) -> a.length() + b.length();    // 6.
        System.out.println(usage3.sampleInterfaceMethod2("Brandon", "Kargus"));

        Predicate<Double> equalTo = i -> (i == 7.00);      // 7.
        System.out.println(equalTo.test(7.01));

        Function<Double, Double> half = b -> b / 2.0;
        System.out.println(half.apply(765766.50));

    }
}

