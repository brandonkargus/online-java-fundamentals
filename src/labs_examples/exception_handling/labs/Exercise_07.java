package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class ExceptionDemo7{
    public static void main(String[] args) {
        try{ExceptionDemo7 thursday = new ExceptionDemo7();
            thursday.getTemp(67);

        }catch(notGoingOutside ex){
            System.out.println("Stay inside!!!!");
            System.out.println(ex.toString());
        }
    }

    public class notGoingOutside extends Exception{

        @Override
        public String toString() {
            return "Weather in MN is TOO COLD today....";
        }
    }

    public void getTemp(int temp) throws notGoingOutside{
        if(temp > 32){
            System.out.println("The temperature seems ok, let's go outside");
        }else{
            throw new notGoingOutside();
        }
    }
}