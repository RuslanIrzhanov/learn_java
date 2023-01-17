package oop_lesson_170123;

public class Person {

    String name;
    int age;
    String sex;

    // Empty constructor
//    public Person() {};

    // Non-empty constructor
    public Person(String name, int age, String sex) {
        this.name = name;

        if(age < 0) {
            this.age = 0;
        }
        else {
            this.age = age;
        }

        if(sex == "female" || sex == "male") {
            this.sex = sex;
        }
    }

    public void print() {
        System.out.printf("Hello! I am person! My name = %s, age = %d, sex = %s\n", this.name, this.age, this.sex);
    }

}