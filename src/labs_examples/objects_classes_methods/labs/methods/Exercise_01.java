package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        multiply(5, 7);
        divide(76, 8);
        whatIsBrownAndSticky();
        yearsInSeconds(35);
        lengthOfArray(5, 7, 6, 3, 2 ,7);
    }
    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        System.out.println(a*b);
        return a*b;
    }
    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static double divide(int a, int b){
        System.out.println(a/b);
        return a / b;
    }
    // 3) Create a static void method that will print of joke of your choice to the console
    static void whatIsBrownAndSticky(){
        System.out.println("a Stick");
    }
    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int yearsInSeconds(int years){
        System.out.println(years*365*24*60*60);
        return years * 365 * 24 * 60 * 60;
    }
    // 5) Create a varargs method that will return the length of the varargs array passed in
    static int lengthOfArray(int...varargs){
        System.out.println(varargs.length);
        return varargs.length;
    }
}
