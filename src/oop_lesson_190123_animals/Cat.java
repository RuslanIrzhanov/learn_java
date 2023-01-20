package oop_lesson_190123_animals;

public class Cat extends Pet {


    public Cat(String nickname, int age, double weight) {
        super(nickname, age, weight);
    }

    @Override
    public void say() {
        System.out.printf("%s is saying: Meooowwww!\n", this.nickname);
    }

    @Override
    public void makeTrick() {
        System.out.printf("%s has jumped\n", this.nickname);
    }
}
