package oop_lesson_190123_animals;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Ruslan", 34, 85);
        p1.say();
        System.out.println();

        Cat c1 = new Cat("Murzik", 5, 3.0);
        c1.say();
        c1.makeTrick();
        System.out.println();

        Dog d1 = new Dog("Sharik", 4, 5);
        d1.say();
        d1.makeTrick();
        System.out.println();
        System.out.println();

        c1.whoIfYourMaster();
        d1.whoIfYourMaster();
        System.out.println();

        p1.setPet(c1);
        c1.whoIfYourMaster();

    }
}
