package oop_lesson_190123_Cake;

public class Main {

    public static void main(String[] args) {

        Cake c1 = new Cake("Anton", 5, 4000);
        Cake c2 = new Cake("Daria", 2.5, 2000);
        Cake c3 = new Cake("Mike", 7, 8000);

        c1.print();
        c2.print();
        c3.print();
        System.out.println();

        c1.getCounter();
        c2.getCounter();
        c3.getCounter();

    }
}
