package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */
class ExceptionDemo{

    public static void main(String[] args) {
        int[] arr = new int[]{4, 6, 7, 8,};
        try{
            System.out.println(arr[7]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.toString());
        }

    }
}

