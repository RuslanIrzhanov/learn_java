package oop_lesson_170123;

import java.util.Objects;

public class Person {

    String name;
    int age;
    String sex;

    // Empty constructor
//    public Person() {};

    // Non-empty constructor
    public Person(String name, int age, String sex) {
        this.name = name;

        this.age = Math.max(age, 0);
        if (Objects.equals(sex, "female") || Objects.equals(sex, "male")) {
            this.sex = sex;
        }
    }

    public void print() {
        System.out.printf("Hello! I am person! My name = %s, age = %d, sex = %s\n", this.name, this.age, this.sex);
    }

}