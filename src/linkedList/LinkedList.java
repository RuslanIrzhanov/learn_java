public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void remove(int data) {
        Node currrentNode = head;
        Node previousNode = null;

        while (currrentNode.next != null) {
            if (currrentNode.data == data) {
                if (currrentNode == head) {
                    head = currrentNode.next;
                } else {
                    previousNode.next = currrentNode.next;
                }
            }
            previousNode = currrentNode;
            currrentNode = currrentNode.next;
        }
    }

    public void print() {
        Node currentNode = head;

        if (head != null) {
            System.out.print(head.data + " ");
        }

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.print(currentNode.data + " ");
        }
        System.out.println();
    }
}
