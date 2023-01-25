package oop_lesson_190123_Cake;

import java.util.SortedMap;

public class Cake {

    String name;
    double weight;
    int price;

    static int counter;

    public Cake(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        counter++;
    }

    public void print() {
        System.out.printf("Name = %s, weight = %.2f, price = %d\n", this.name, this.weight, this.price);
    }

    public void getCounter() {
        System.out.println("# of cakes = " + counter);

    }
}
