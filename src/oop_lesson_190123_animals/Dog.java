package oop_lesson_190123_animals;

public class Dog extends Pet {
    public Dog(String nickname, int age, double weight) {
        super(nickname, age, weight);
    }

    @Override
    public void say() {
        System.out.printf("%s is saying: Woof-woof!!!\n", this.nickname);
    }

    @Override
    public void makeTrick() {
        System.out.printf("%s has given a paw\n", this.nickname);
    }
}
