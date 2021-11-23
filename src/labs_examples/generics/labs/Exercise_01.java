package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 * <p>
 * 1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods. (DONE)
 * 2.) Create a few objects of your generic class with different data types to demonstrate its
 * dynamic usage. (DONE)
 */

class Exercise_01<T> {
    private T value1;
    private T value2;
    private T value3;

    public Exercise_01(T value1, T value2, T value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public T getValue3() {
        return value3;
    }

    public void setValue3(T value3) {
        this.value3 = value3;
    }

    @Override
    public String toString() {
        return
                "value1 = " + value1 +
                        ", value2 = " + value2 +
                        ", value3 = " + value3;
    }

    public static void main(String[] args) {
        Exercise_01 example1 = new Exercise_01("String here", 145.55, true);
        Exercise_01 example2 = new Exercise_01(7, 'B', 78.9f);                                      //all parameters were of type <T>, yet they all hold different data types

        System.out.println(example1.toString());
        System.out.println(example2.toString());

    }

}


