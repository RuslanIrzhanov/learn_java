package oop_lesson_170123;

public class Phone {

    String number;
    String model;
    int price;
    Employee owner;

    public Phone(String number, String model, int price) {
        this.number = number;
        this.model = model;
        this.price = price;
    }

    public void printInfo() {
        System.out.printf("Phone is %s, number = %s, price = %d\n", this.model, this.number, this.price);
    }
}