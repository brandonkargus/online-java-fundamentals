package labs_examples.datastructures.queue.labs;

/**
 * Queues - Exercise_02
 * <p>
 * Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 * rather than the LinkedList as in the example we have already seen.
 * <p>
 * Your custom Queue class must also do the following:
 * <p>
 * 1) throw a custom exception when trying to pop an element from an empty Queue (DONE)
 * 2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full (DONE)
 * 3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty (DONE)
 * 4) contain the methods peekFirst() and peekLast() (DONE)
 * 5) contain a size() method (DONE)
 * 6) contain a method to print out the data of all elements in the Queue (DONE)
 */
public class Exercise_02<V> {
    private V[] data = (V[]) new Object[10];
    private int first = 0;
    private boolean isEmpty;

    public Exercise_02() {
        this.isEmpty = true;
    }

    public V dequeuePop() {
        try {
            if ((double) first > (double) this.data.length * .75) {
                V[] newData = (V[]) new Object[this.data.length * 2];
                for (int i = 0; i < first; i++) {
                    newData[i] = data[i];
                    data = newData;
                }
            } else if ((double) first < (double) this.data.length * .25) {
                V[] newData = (V[]) new Object[this.data.length / 2];
                for (int i = 0; i < first; i++) {
                    newData[i] = data[i];
                    data = newData;
                }
            }
            return this.data[--first];

        } catch (Exception ex) {
            System.out.println(" Exception...the array was probably empty....." + ex);
            ex.printStackTrace();
            return null;
        }
    }

    public V peekFirst() {
        return this.data[first];
    }

    public V peekLast() {
        return this.data[this.data.length-1];
    }
    public int size() {
        return first;
    }
    public void printQueue(V[] data) {
        for (V d : data) {
            System.out.println(d.toString());

        }
    }

    public static void main(String[] args) {

    }


}