package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class ExceptionDemo2{
    public static void main(String[] args) {

        String myName = "Brandon Kargus";
        try{
            System.out.println(myName.charAt(15));
        }catch(StringIndexOutOfBoundsException ex){
            System.out.println("Your String is only 14 characters long, and like a fool you've tried to print the 15th");
        }catch(Exception ex){
            System.out.println("Testing to see if this general exception will be thrown");      //was not reached
        }

    }
}


