package home_work_100123;

import java.util.Scanner;

public class Task_qq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число: ");
        double num = sc.nextDouble();
        if (num % 1 != 0 || num < 0) {
            System.out.println("Error");
        }

        
    }
}
