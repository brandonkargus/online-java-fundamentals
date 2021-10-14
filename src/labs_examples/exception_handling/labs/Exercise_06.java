package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ExceptionDemo6{
    public static void main(String[] args) {

        try{
            char letter = name().charAt(10);
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("The name \"Steffani\" has only 8 letters.  You've attempting to retrieve a 10th.");
        }

    }

    public static String name() throws ArithmeticException{
        return "Steffani";
    }

}