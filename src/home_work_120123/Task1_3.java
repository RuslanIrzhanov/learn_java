package home_work_120123;

import java.util.Scanner;

public class Task1_3 {

    /*
    Реализовать функцию, котора принимает на вход два числа n и m и возвращает
    n^m. Реализовать перегрузку для разных типов данных.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a для возведения в степень: ");
        int a = sc.nextInt();
        System.out.print("Введите степень числа a, b: ");
        int b = sc.nextInt();
        System.out.print("Число a в степени b равно: ");
        System.out.println(getDegreeOfNumber(a, b));
    }

    public static double getDegreeOfNumber(double a, double b) {
        return Math.pow(a, b);
    }
}

