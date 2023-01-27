package queue_260123;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Anton", 31, "male");
        Person p2 = new Person("Kate", 25, "female");
        Person p3 = new Person("Daria", 33, "female");
        Person p4 = new Person("Ivan", 35, "male");

        Queue q1 = new Queue();
        q1.printQueue();

        q1.push(new Node(p1));
        q1.printQueue();
        q1.push(new Node(p2));
        q1.printQueue();
        q1.push(new Node(p3));
        q1.printQueue();
        q1.push(new Node(p4));
        q1.printQueue();
        System.out.println();

        /*q1.pop(new Node(p1));
        q1.printQueue();
        q1.pop(new Node(p2));
        q1.printQueue();
        q1.pop(new Node(p3));
        q1.printQueue();
        q1.pop(new Node(p4));
        q1.printQueue();*/

        q1.findPersonOlderThan(33);

    }
}
