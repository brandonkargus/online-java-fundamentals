package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {


    public static int getDivision(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {

        try{
            int r = getDivision(6, 0);
        }catch(ArithmeticException ex){
            System.out.println("Exception thrown from the getDivision() method, no division by zero allowed");
        }


    }

}