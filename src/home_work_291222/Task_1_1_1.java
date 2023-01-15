package home_work_291222;

import java.util.Scanner;

public class Task_1_1_1 {
    public static void main(String[] args) {

        /*
        В чемпионате по футболу команде за выигрыш дается 3 очка, за проигрыш — 0, за ничью — 1.
        Известно количество очков, полученных командой за игру.
        Определить словесный результат игры (выигрыш, проигрыш или ничья).
         */

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число 0, 1 или 3: ");
        int num = in.nextInt();

        switch (num) {
            case 3:
                System.out.println("Выигрыш");
                break;
            case 0:
                System.out.println("Проигрыш");
                break;
            case 1:
                System.out.println("Ничья");
                break;
            default:
                System.out.println("Введите число в соответствии с условием");
                break;
        }
    }
}
