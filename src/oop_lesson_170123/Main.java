package oop_lesson_170123;

public class Main {
    public static void main(String[] args) {

        // Create empty person
        /*
        Person p1 = new Person();
        System.out.println(p1);

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.sex);

        p1.name = "Anton";
        p1.age = 31;
        p1.sex = "male";

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.sex);
        */
        // Create two persons
        /*
        Person p2 = new Person("Daria", 25, "female");
        Person p3 = new Person("Aleksey", 32, "male");

        p2.print();
        p3.print();
        */
        // Check validations for Person
        /*
        Person p4 = new Person("Oksana", -5, "female");
        Person p5 = new Person("Dmitry", 32, "muzhik");

        p4.print();
        p5.print();
        */
        // Work with employees
        /*
        Employee e1 = new Employee("Nikolay", 23, "male");
        e1.print();

        Employee e2 = new Employee(45, 50000, "Vasilisa", 25, "female");
        e2.print();

        System.out.println(e1.getSalary());
        e1.setSalary(40000);
        System.out.println(e1.getSalary());
        e1.print();
        */
        // Work with phones
        /*Phone ph1 = new Phone("79172063447", "iPhone XR", 35000);
        ph1.printInfo();

        Employee e3 = new Employee(45, 50000, "Vasilisa", 25, "female");
        e3.print();

        e3.setPhone(ph1);

        // Print info about phone of employee e3
        e3.mobile.printInfo();

        // Print info about owner of phone ph1
        ph1.owner.print();

        // Add new employee
        Employee e4 = new Employee(56, 75000, "Marina", 33, "female");
        e4.print();

        e4.setPhone(ph1);*/
        // Create senior
        Senior s1 = new Senior(123, 75000, "Alla", 27, "female");
        s1.print();
        System.out.println(s1.getBonus());

        s1.changeSalary(100000);
        s1.print();
        System.out.println(s1.getBonus());

    }
}
