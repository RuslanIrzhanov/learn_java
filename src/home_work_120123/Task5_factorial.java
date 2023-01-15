package home_work_120123;

import java.util.Scanner;

public class Task5_factorial {

    // Написать рекурсивную функцию для вычисления факториала натурального числа n.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        long n = sc.nextLong();
        System.out.print("Факториал числа n равен: ");
        System.out.println(getFactorial(n));
    }

    public static long getFactorial(long n) {
        if (n == 1) return 1;
        return n * getFactorial(n - 1);
    }
}
