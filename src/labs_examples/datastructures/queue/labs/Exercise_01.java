package labs_examples.datastructures.queue.labs;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue (DONE)
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7 (DONE, see bottom)
 */
class Exercise_01 {
    public static void main(String[] args) {
        Queue queuePractice = new Queue() {
            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        queuePractice.add("Word here");
        queuePractice.add(1234);
        queuePractice.add(true);

        queuePractice.peek();
        queuePractice.contains("brandon");       // 7 methods demonstrated
        queuePractice.element();
        queuePractice.remove();
        queuePractice.poll();
        queuePractice.clear();



    }
}