package labs_examples.lambdas.labs;

import java.util.function.Function;

/**
 * Lambdas Exercise 3:
 * <p>
 * 1) Demonstrate the use of a static method reference (DONE)
 * 2) Demonstrate the use of an instance method reference (DONE)
 * 3) Demonstrate the use of a constructor reference (DONE)
 */
class Exercise_03 {

    public void methodExample() {
        System.out.println("This is an Instance Method Reference...");
    }

    public static int countNegatives(Integer[] arr) {
        int count = 0;
        for (int a : arr) {
            if (a < 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{67, 78, -908, -7, 56454, -4647, 3232, -9272, -171, -6657, 8393};
        Function<Integer[], Integer> negatives = Exercise_03::countNegatives;                 // 1.
        System.out.println(negatives.apply(numbers));

        Exercise_03 exampleValue = new Exercise_03();
        IexampleInterface ex = exampleValue::methodExample;                         // 2.
        ex.display();

        IguitarCreator creator = Guitar::new;        // 3.
        Guitar lesPaul = creator.createGuitar("Gibson", "Les Paul", 6);
        Guitar tele = creator.createGuitar("Fender", "Telecaster", 6);
        System.out.println(lesPaul.toString());
        System.out.println(tele.toString());


    }
}

class Guitar {
    String manufacturer;
    String model;
    int strings;

    public Guitar(String manufacturer, String model, int strings) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "Manufacturer = " + manufacturer +
                ", Model = " + model +
                ", Strings = " + strings;
    }
}

@FunctionalInterface
interface IexampleInterface {
    void display();
}

@FunctionalInterface
interface IguitarCreator {
    Guitar createGuitar(String manufacturer, String model, int strings);
}

