package home_work_291222;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        // Составить программу, которая уменьшает первое введенное число в два раза,
        // если оно больше второго введенного числа по абсолютной величине.


        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = in.nextDouble();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        if (Math.abs(a) > b) {
            a = a / 2;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
