package home_work_120123;

import java.util.Scanner;

public class Task6_minimumValue {

    /*
    Реализовать функцию нахождения минимума:
    1. Из трёх чисел
    2. Из четырёх чисел
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число a: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число b: ");
        int b = sc.nextInt();
        System.out.print("Введите третье число c: ");
        int c = sc.nextInt();
        System.out.print("Введите четвертое число d: ");
        int d = sc.nextInt();

        System.out.print("Минимальное значение из трёх чисел a, b, c равно: ");
        System.out.println(getComparisonsMinOfThree(a, b, c));
        System.out.print("Минимальное значение из четырёх чисел a, b, c, d равно: ");
        System.out.println(getComparisonsMinOfFour(getComparisonsMinOfThree(a, b, c), d));

    }

    public static int getComparisonsMinOfThree(int a, int b, int c) {
        if (a <= b && b <= c) return a;
        if (b <= a && a <= c) return b;
        else return c;
    }

    public static int getComparisonsMinOfFour(int minAbc, int c) {
        if (minAbc <= c) return minAbc;
        else return c;
    }
}
