package home_work_291222;

import java.util.Scanner;

public class Task_1_5_1 {
    public static void main(String[] args) {
        /*
        Даны три вещественных числа a, b, c.
        Проверить: 1. выполняется ли неравенство a < b < c;
        2. выполняется ли неравенство b > a > c.
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое вещественное число a: ");
        double a = in.nextDouble();
        System.out.print("Введите второе вещественное число b: ");
        double b = in.nextDouble();
        System.out.print("Введите третье вещественное число c: ");
        double c = in.nextDouble();

        if (a < b && b < c) {
            System.out.printf("Неравенство %.1f < %.1f < %.1f выполняется \n", a, b, c);
        } else {
            System.out.printf("Неравенство %.1f < %.1f < %.1f не выполняется \n", a, b, c);
        }

        if (b > a && a > c) {
            System.out.printf("Неравенство %.1f > %.1f > %.1f выполняется \n", b, a, c);
        } else {
            System.out.printf("Неравенство %.1f > %.1f > %.1f не выполняется \n", b, a, c);
        }
    }
}
