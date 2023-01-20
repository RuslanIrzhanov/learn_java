package oop_lesson_190123_animals;

public class Person extends Animal {

    String name;
    Pet pet;


    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public void say() {
        System.out.printf("Hello! My name is %s\n", this.name);
    }

    public void setPet(Pet p) {
        System.out.printf("%s is taking %s\n", this.name, p.nickname);
        this.pet = p;
        p.master = this;

    }
}
