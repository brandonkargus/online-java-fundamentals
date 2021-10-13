package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Polymorphism {


    public void printMessage(){
        System.out.println("This message is from the original class");
    }

    public static void main(String[] args) {
        Polymorphism example = new Polymorphism();
        OverRidingExample example2 = new OverRidingExample();

        example.printMessage();
        example2.printMessage();

        OverRidingExample multiply = new OverRidingExample();
        System.out.println(multiply.overLoadedMethod(3, 6, 7));

        Motorcycles shadow = new Motorcycles("Honda", "Shadow Spirit", 1100, "Mag", 2002, 5);
        System.out.println(shadow.getCI(shadow.getCcSize()));

        Scooters vespa = new Scooters("Vespa", "Hornet", 110, "Spoke", 2010, 1);
        vespa.stop();



    }

}
class OverRidingExample extends Polymorphism{

    public int overLoadedMethod(int a){             //overloaded methods
        return a;
    }
    public int overLoadedMethod(int a, int b){
        return a * b;
    }
    public int overLoadedMethod(int a, int b, int c){
        return a * b * c;

    }
    @Override
    public void printMessage(){

        System.out.println("This message is from the overriding class");
    }

}
