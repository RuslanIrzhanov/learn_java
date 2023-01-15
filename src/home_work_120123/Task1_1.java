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
        else getBoolean(n);

    }

    public static void getBoolean(int n) {
        Boolean a = true;
        Boolean b = false;
        if (n % 2 == 0) System.out.println(a);
        else System.out.println(b);
    }
}
