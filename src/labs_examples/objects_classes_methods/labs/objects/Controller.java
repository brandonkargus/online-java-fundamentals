package labs_examples.objects_classes_methods.labs.objects;

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}
class Lake{
    String name;

    public Lake(String name) {
        this.name = name;
    }
}

public class Controller {
    public static void main(String[] args) {

        Person brandon = new Person("Brandon");
        Lake lakeSuperior = new Lake("Lake Superior");

        System.out.println(brandon.name + " swims in " + lakeSuperior.name);

    }
}
