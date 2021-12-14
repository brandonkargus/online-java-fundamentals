package labs_examples.datastructures.stack.labs;

/**
 * Stacks - Exercise_02
 * <p>
 * Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 * rather than the LinkedList as in the example we have already seen. (DONE)
 * <p>
 * Your custom Stack class must also do the following: (Ryan Take 2)
 * <p>
 * 1) throw a custom exception when trying to pop an element from an empty Stack (DONE)
 * 2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full (DONE)
 * 3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty (DONE)
 * 4) contain the methods peekFirst() and peekLast() (DONE)
 * 5) contain a size() method (DONE)
 * 6) contain a method to print out the data of all elements in the Stack (DONE)
 * <p>
 * TIP: To initialize a new array of a Generic type you can use this:
 * T[] data = (T[]) new Object[10];
 */

public class Exercise_02<V> {
    private V[] data = (V[]) new Object[10];
    private int top = 0;

    public void push(V value) {
        data[top++] = value;
        if ((double) top > (double) this.data.length * .75) {
            V[] newData = (V[]) new Object[this.data.length * 2];
            for (int i = 0; i < top; i++) {
                newData[i] = data[i];
                data = newData;
            }
        } else if ((double) top < (double) this.data.length * .25) {
            V[] newData = (V[]) new Object[this.data.length / 2];
            for (int i = 0; i < top; i++) {
                newData[i] = data[i];
                data = newData;
            }
        }

    }

    public V pop() {
        try {
            if ((double) top > (double) this.data.length * .75) {
                V[] newData = (V[]) new Object[this.data.length * 2];
                for (int i = 0; i < top; i++) {
                    newData[i] = data[i];
                    data = newData;
                }
            } else if ((double) top < (double) this.data.length * .25) {
                V[] newData = (V[]) new Object[this.data.length / 2];
                for (int i = 0; i < top; i++) {
                    newData[i] = data[i];
                    data = newData;
                }
            }
            return this.data[--top];

        } catch (Exception ex) {
            System.out.println(" Exception...the array was probably empty....." + ex);
            ex.printStackTrace();
            return null;
        }
    }

    public V peekFirst() {
        return this.data[top];
    }

    public V peekLast() {
        return this.data[0];
    }

    public int size() {
        return top;
    }

    public void printStack(V[] data) {
        for (V d : data) {
            System.out.println(d.toString());

        }
    }

    public static void main(String[] args) {
        Exercise_02 practiceArr = new Exercise_02();
        practiceArr.data[0] = 123;
        practiceArr.data[1] = "Brandon";
        practiceArr.data[2] = true;
        practiceArr.data[3] = 456576.60;
        practiceArr.push("Testing....");

        practiceArr.printStack(practiceArr.data);


    }

}
