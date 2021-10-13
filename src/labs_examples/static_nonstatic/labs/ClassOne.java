package labs_examples.static_nonstatic.labs;

public class ClassOne {
    private int someValue;
    private String someName;



    public static void methodOne(){
        addNumbers(7, 8);         // (1)
        ClassTwo.doSomething();         // (3)
        ClassTwo ob = new ClassTwo();
        ob.createAName("Brandon");   // (4)

    }
    public static int addNumbers(int n, int i){
        ClassOne obj = new ClassOne();          // (2)
        obj.nonStaticMethod();
        return n + i;


    }
    public void nonStaticMethod(){
        anotherNonStaticMethod();        // (5)
        ClassTwo name = new ClassTwo();
        name.createAName("Steffani");    // (6)

    }
    public void anotherNonStaticMethod(){
        addNumbers(90, 76);            // (7)
        ClassTwo example = new ClassTwo();
        ClassTwo.doSomething();             // (8)

    }


}
