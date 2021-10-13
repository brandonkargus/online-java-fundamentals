package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class InterfaceAsInstanceVariable {
    IEngineBehavior variable;

    public InterfaceAsInstanceVariable(IEngineBehavior variable) {
        this.variable = variable;
    }
    public void tests(){
        variable.accelerate();
        variable.decelerate();
        variable.isRunning();
        variable.speed();
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {

        Motorcycles shadow = new Motorcycles("Honda", "Shadow Spirit", 1100, "Mag", 2002, 5);
        Scooters vespa = new Scooters("Vespa", "Hornet", 110, "Spoke", 2010, 1);

        InterfaceAsInstanceVariable exampleHere = new InterfaceAsInstanceVariable(shadow);  //similar example to video, demonstrating using an interface as a variable
        exampleHere.tests();

        exampleHere.setVariable(vespa);
        exampleHere.tests();
    }

    public void setVariable(IEngineBehavior variable) {
        this.variable = variable;
    }
}
