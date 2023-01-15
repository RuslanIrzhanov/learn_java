package home_work_291222;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        // Дано натуральное число. Определить является ли оно четным и оканчивается ли на цифру 7

        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число " + a + " является четным");
        } else {
            System.out.println("Число " + a + " является нечетным");
        }

        if (a % 10 == 7) {
            System.out.println("Число " + a + " оканчивается на цифру 7");
        } else {
            System.out.println("Число " + a + " не оканчивается на цифру 7");
        }
    }
}
