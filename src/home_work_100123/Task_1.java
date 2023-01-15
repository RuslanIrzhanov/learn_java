package home_work_100123;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        // 1. Составить программу вывода любого числа любое заданное число раз

        Scanner sc = new Scanner(System.in);

        // Инициализируем переменную, введенную пользователем (любое число)
        System.out.print("Введите любое число: ");
        double number = sc.nextDouble();

        // Инициализируем переменную, количество повторений числа, введенное пользователем (любое натуральное число)
        System.out.print("Введите количество повторений данного числа: ");
        int count = sc.nextInt();

        // Объявлям цикл for
        for (int i = 0; i < count; i++) {
            System.out.println(number);
        }
    }
}
