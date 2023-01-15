package home_work_120123;

import java.util.Scanner;

public class Task1_2 {

    /*
    Имеется зарплата сотрудника - натуральное число. Реализовать функцию, которая
    рассчитывает премию сотрудника - вещественное число, исходя из таблицы
    Зарплата сотрудника         Премия
    < 40000                     50% от зарплаты
    40000 <= x < 80000          70% от зарплаты
    >= 80000                    110% от зарплаты
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите зарплаты сотрудника: ");
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Зарплата не может быть меньше или равна 0!");
        else {
            System.out.print("Премия сотрудника составляет: ");
            getSalary(n);
        }
    }

    public static void getSalary(int n) {
        if (n < 40000) System.out.println(n * 0.5f);
        else if (n >= 40000 && n < 80000) System.out.println(n * 0.7f);
        else System.out.println(n * 1.1f);
    }
}
