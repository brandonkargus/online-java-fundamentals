package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

class ExceptionDemo3{
    public static void main(String[] args) {

        int a = 56;
        int b = 0;
        try{
            int division = a/b;
        }catch(ArithmeticException ex){
            System.out.println("You can't divide by 0");
        }finally{
            System.out.println("There was an attempt to divide by zero, and it caused an Exception");
        }




    }
}
