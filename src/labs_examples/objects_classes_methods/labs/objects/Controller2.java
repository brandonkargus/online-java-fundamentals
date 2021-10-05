package labs_examples.objects_classes_methods.labs.objects;

public class Controller2 {
    public static void main(String[] args) {

        Guitar fender = new Guitar("Fender");

        Guitar lp = new Guitar("Gibson", "Les Paul");

        Guitar s7 = new Guitar("Schecter", "C-7 Deluxe", 7);

    }
}

class Guitar{
    String manufacturer;
    String model;
    int numberOfStrings;

    public Guitar(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Guitar(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Guitar(String manufacturer, String model, int numberOfStrings) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.numberOfStrings = numberOfStrings;
    }
}
