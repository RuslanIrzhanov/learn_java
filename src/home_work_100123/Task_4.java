package home_work_100123;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        // 4. Вычислить сумму 1 + 1/2 + 1/3 + 1/4 + ... 1/n. (гармонический ряд)

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = sc.nextInt();

        // Инициализируем переменную с суммой гармонического ряда
        double sum = 1;

        // Объявляем цикл c переменной i от 2 до n включительно
        for (double i = 2; i <= n; i++) {
            sum += 1 / i;
        }

        System.out.println(sum);
    }
}
