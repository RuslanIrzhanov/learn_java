package queue_260123;

import java.util.SortedMap;

public class Queue {

    Node first;
    Node last;
    private int size;

    public void push(Node n) {

        if (first == null) {
            last = n;
            first = last;
            size++;
        } else {
            last.next = n;
            last = last.next;
            size++;
        }
    }

    public Node pop(Node n) {
        if (first == null) {
            return null;
        } else if (first == last) {
            Node temp = first;
            first = null;
            last = null;
            size--;
            return temp;
        } else {
            Node temp = first;
            first = first.next;
            size--;
            return temp;
        }
    }

    public void printQueue() {
        System.out.print("Queue consists of: ");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data.name + "; ");
            temp = temp.next;
        }
        System.out.println("\nSize is " + this.getSize());
    }

    public int getSize() {
        return this.size;
    }

    public void findPersonOlderThan(int age) {
        Node temp = first;
        int quantity = 0;

        while (temp != null) {
            if (temp.data.age >= age) {
                quantity++;
                System.out.println(temp.data.name + " found!");
                temp = temp.next;
            } else {
                temp = temp.next;
            }
        }

        if (quantity == 0) {
            System.out.println("Nobody has found :(");
        } else {
            System.out.printf("System has been found %d people\n", quantity);
        }

    }


}
