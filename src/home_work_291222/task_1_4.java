package home_work_291222;

import java.util.Scanner;

public class task_1_4 {
    public static void main(String[] args) {
        /*
        Даны два числа. Если квадратный корень из второго числа меньше первого числа,
        то увеличить второе число в пять раз.
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = in.nextDouble();
        System.out.print("Введите второе число: ");
        double b = in.nextDouble();

        if (Math.sqrt(b) < a) {
            System.out.println("Квадратный корень из второго числа меньше первого числа");
            b *= 5;
        }

        System.out.println(b);
    }
}
