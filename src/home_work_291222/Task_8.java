package home_work_291222;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        /*
        Составить программу, которая в зависимости от порядкового номера дня недели (1, 2, ..., 7)
        выводит на экран его название (понедельник, вторник, ..., воскресенье)
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 7: ");
        int day = in.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            default:
                System.out.println("Введите корректное значение!");
                break;
        }
    }
}
