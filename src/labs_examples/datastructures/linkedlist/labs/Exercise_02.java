package labs_examples.datastructures.linkedlist.labs;

import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 *      Also, instead of using the index in the get() and remove() methods, these methods should
 *      get() and remove() based by the Node's value, not it's index. (DONE)
 */
public class Exercise_02<T> {
    private Node<T> head;
    private Node<T> tail;

    private int size = 0;
    static class Node<T> {
        Node<T> next;
        T value;
        Node(T value){
            this.value = value;
        }
    }

    public Exercise_02(T... data) {

    }

    public void addFirst(T val){
        Node<T> temp = new Node(val);
        temp.next = head;
        head = temp;

        if(tail == null) {
            tail = temp;
        }
        size++;
    }
    public void addLast(T val) {
        if(tail == null) {
            addFirst(val);
            return;
        }
        Node<T> temp = new Node<T>(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
    public int getSize() {
        return size;
    }

    public T getItem(T val) {
        LinkedList<T> list = new LinkedList<>();
        return list.get(list.indexOf(val));
    }
    public T removeItem(T val) {
        LinkedList<T> list = new LinkedList<>();
        return list.remove(list.indexOf(val));
    }
}
