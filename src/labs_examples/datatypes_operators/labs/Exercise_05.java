package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b){
            System.out.println("a or b is true");
        }

        // example of short-circuit "OR"
        if(a || b){
            System.out.println("a or b is true");
        }
        // example of "AND"
        if(a & b){
            System.out.println("a and b are true");
        }
        // example of short-circuit "AND"
        if(a && b){
            System.out.println("a and b are true");
        }
        if(a ^ b){
            System.out.println("one is true and one is false");
        }
        if(!a || b){
            System.out.println("this won't run, because a is true");
        }
    }

}

