package oop_lesson_170123;

public class Senior extends Employee {

    private double bonus;

    public Senior(int id, int salary, String name, int age, String sex) {
        super(id, salary, name, age, sex);
        this.bonus = generateBonus();
    }

    public double getBonus() {
        return this.bonus;
    }

    private double generateBonus() {
        return this.salary * age / 20.0;
    }

    public void changeSalary(int salary) {
        this.salary = salary;
        this.bonus = generateBonus();
    }
    public void print() {
        System.out.printf("Hello! I am senior! My name = %s, age = %d, sex = %s, salary = %d, happy = %b\n",
                this.name, this.age, this.sex, this.salary, this.isHappy);
    }
}