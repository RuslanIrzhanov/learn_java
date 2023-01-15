package home_work_120123;

import java.util.Scanner;

public class Task1_1 {

    /*
    Написать метод, который принимает на вход натуральное число и возвращает true,
    если число четное
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Вы ввели неправильное число!");
        else System.out.println(getBoolean(n));

    }

    public static boolean getBoolean(int n) {
        if (n % 2 == 0) return true;
        else return false;
    }
}
