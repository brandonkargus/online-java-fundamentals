package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class ExceptionDemo4{
    public static void main(String[] args) {
        int a = 89;
        int b = 0;

        try{
            double d = a/b;
        }catch(Exception ex){
            System.out.println("Print something in reference to Arithmetic Exception");

            try{

                int d = a/b;
            }catch(ArithmeticException exc){
                System.out.println("If this exception is caught, this is printed");
            }
        }

    }
}
