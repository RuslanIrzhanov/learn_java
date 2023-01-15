package home_work_120123;

import java.util.Scanner;

public class Task4_fibonacci {

    /*
    Последовательность Фибоначчи образуется так: первый и второй члены последовательности равны 1,
    каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n.
    1. Найти k-й член последовательности Фибоначчи.
    2. Получить первые n членов последовательности Фибоначчи.
    Решить задачу с помощью рекурсивных функций.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите k-й член последовальности: ");
        int k = sc.nextInt();
        if (k < 0 || k > 92) System.out.println("Вы вышли за рамки диапазона!");
        else {
            System.out.print("Значение k-го члена последовательности равно: ");
            System.out.println(findFib1(k));
        }

        System.out.print("Введите первые n членов последовательности Фабиначии: ");
        int m = sc.nextInt();
        if (m <= 0) System.out.println("Введите целое положительное число!");
        else {
            System.out.print("Первые n членов последовательности: ");
            findFib2(m);
        }
    }

    public static int findFib1(int n) {
        // рекурсия
        if (n == 1 || n == 2) return 1;
        return findFib1(n - 1) + findFib1(n - 2);
    }

    public static void findFib2(int n) {
        // рекурсия
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", findFib1(i));
        }
        System.out.println();
    }
}

