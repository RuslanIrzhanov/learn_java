package home_work_120123;

import java.util.Scanner;

public class Task1 {

    /*
    Напечатать числа в виде следующей таблицы:
    5 5 5 5 5 5
    5 5 5 5 5 5
    5 5 5 5 5 5
    5 5 5 5 5 5

    Задание дополнено решением с произвольным выбором цифры,
    количеством строк и столбцов
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9: ");
        int a = sc.nextInt();
        System.out.print("Введите количество строк таблицы: ");
        int b = sc.nextInt();
        System.out.print("Введите количество столбцов таблицы: ");
        int c = sc.nextInt();

        // вызываем метод с введенным  числом a, который образует таблицу b строк на c столбцов
        printTableOfNumber(a, b, c);
        System.out.println();
        // вызываем метод с числом 5, который образует таблицу 3 на 6
        printTableOfNumber(5, 4, 6);
    }

    public static void printTableOfNumber(int number, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
