package linked_list;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(3);
        list.add(5);
        list.add(8);
        list.print();

        list.remove(3);
        list.print();
    }
}
