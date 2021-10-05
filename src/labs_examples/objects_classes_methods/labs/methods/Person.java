package labs_examples.objects_classes_methods.labs.methods;

public class Person {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", height =" + height +
                ", weight =" + weight +
                '}';
    }
}
