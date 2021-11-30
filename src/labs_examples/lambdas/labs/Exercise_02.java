package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 * <p>
 * 1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 * 10 of them! You can do it! You'll know so much about them when you're done! (DONE)
 */
class Exercise_02 {
    public static void main(String[] args) {
        Predicate<Double> equalTo = i -> (i == 7.00);
        System.out.println(equalTo.test(7.00));

        Function<Double, Double> half = b -> b / 2.0;
        System.out.println(half.apply(733376656766.50));

        BiFunction<Double, Double, Double> multiply = (Double a, Double b) -> a * b;
        System.out.println(multiply.apply(545.70, 34.78));

        IntFunction<Integer> minusBirthday = a -> a - 971986;
        System.out.println(minusBirthday.apply(500000));

        LongBinaryOperator multiplyLong = (long a, long b) -> a - b;
        System.out.println(multiplyLong.applyAsLong(656565656565453454L, 9223372036854775805L));

        IntPredicate equal = a -> (a == 1212121433);
        System.out.println(equal.test(1212121));

        ToIntBiFunction<Integer, String> weirdCombo = (Integer a, String b) -> a * b.length();
        System.out.println(weirdCombo.applyAsInt(464767647, "Irene Steffani Giralt Rodriguez"));

        DoubleBinaryOperator doubleDouble = (double a, double b) -> a + b + 7878.54;
        System.out.println(doubleDouble.applyAsDouble(546474.78, 1278.90));

        BinaryOperator<Integer> compareUs = (Integer a, Integer b) -> a > b ? a : b;
        System.out.println(compareUs.apply(56768, 6565));

        IntToLongFunction intToLong = a -> a;
        System.out.println(intToLong.applyAsLong(565758));

    }
}