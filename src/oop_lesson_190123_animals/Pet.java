package oop_lesson_190123_animals;

public abstract class Pet extends Animal {

    String nickname;
    Person master;


    public Pet(String nickname, int age, double weight) {
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
    }

    public abstract void makeTrick();

    public void whoIfYourMaster() {
        if (this.master == null) System.out.printf("%s doesn't have master :-(\n", this.nickname);
        else System.out.printf("My master is %s\n", master.name);
    }
}
