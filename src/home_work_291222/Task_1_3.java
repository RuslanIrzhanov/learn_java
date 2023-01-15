package home_work_291222;

import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {

        /*
        Дано двузначное число. Определить:
        1. Является ли сумма его цифр двузначным числом;
        2. Больше ли самого числа сумма его цифр.
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Введите двузначное число: ");
        int num = in.nextInt();
        if (num < 10 || num > 99) {
            System.out.println("Введите двузначное целое число!");
        } else {
            System.out.println("Первая цифра числа " + num + " равна: " + num / 10);
            System.out.println("Вторая цифра числа " + num + " равна: " + num % 10);

            if (num / 10 + num % 10 > 9) {
                System.out.println("Сумма цифр числа " + num + " является двузначным числом");
            } else {
                System.out.println("Сумма цифр числа " + num + " не является двузначным числом");
            }

            if (num / 10 + num % 10 > num) {
                System.out.println("Сумма цифр числа " + num + " больше самого числа " + num);
            } else {
                System.out.println("Сумма цифр числа " + num + " меньше самого числа " + num);
                System.out.println("А по другому быть и не может!");
            }
        }
    }
}
