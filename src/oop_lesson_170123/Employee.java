package oop_lesson_170123;

public class Employee extends Person {

    int salary;
    int id;
    boolean isHappy;
    Phone mobile;

    public Employee(String name, int age, String sex) {
        super(name, age, sex);
    }

    public Employee(int id, int salary, String name, int age, String sex) {
        super(name, age, sex);
        this.id = id;
        this.salary = salary;

        if(salary >= this.age * 1000) {
            this.isHappy = true;
        }
        else {
            this.isHappy = false;
        }
    }

    public void setSalary(int salary) {
        System.out.printf("Salary for %s has been updated\n", this.name);
        this.salary = salary;

        if(this.salary >= this.age * 1000) {
            this.isHappy = true;
        }
        else {
            this.isHappy = false;
        }

    }

    public int getSalary() {
        return this.salary;
    }

    public void setPhone(Phone mobile) {

        if(mobile.owner != null) {
            System.out.println("Phone has owner! " + mobile.owner.name);
        }
        else {
            this.mobile = mobile;
            mobile.owner = this;
        }
    }

    public void print() {
        System.out.printf("Hello! I am employee! My name = %s, age = %d, sex = %s, salary = %d, happy = %b\n", this.name, this.age, this.sex, this.salary, this.isHappy);
    }
}