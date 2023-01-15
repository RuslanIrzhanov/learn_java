package home_work_291222;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        // Определить весовую категорию боксера, если известен его вес

        Scanner in = new Scanner(System.in);

        System.out.print("Введите вес боксера: ");
        int m = in.nextInt();

        if (m <= 0) {
            System.out.println("Вес боксера не может быть равным 0 или отрицательным");
        } else if (m < 60) {
            System.out.println("Легкий вес");
        } else if (m < 75) {
            System.out.println("Средний вес");
        } else if (m < 91) {
            System.out.println("Тяжелый вес");
        } else {
            System.out.println("Супертяжелый вес");
        }
    }
}
