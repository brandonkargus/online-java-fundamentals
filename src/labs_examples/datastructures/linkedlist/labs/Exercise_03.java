package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this! (DONE)
 *
 *      (example influenced heavily by https://www.javatpoint.com/java-program-to-create-and-display-a-doubly-linked-list)
 */

public class Exercise_03 {
    class Node {
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head, tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    public void show() {
        Node current = head;
        if(head == null) {
            System.out.println("Empty list");
            return;
        }
        System.out.println("Nodes in my doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Exercise_03 myDoublyLinkedList = new Exercise_03();
        myDoublyLinkedList.addNode(676);
        myDoublyLinkedList.addNode(7);
        myDoublyLinkedList.addNode(87);
        myDoublyLinkedList.addNode(1);

        myDoublyLinkedList.show();

    }


}
