package home_work_100123;

public class Task_2 {
    public static void main(String[] args) {

        /*
        2. Напечатать числе следующим образом:
        25 25.5 24.8
        26 26.5 25.8
        ...
        35 35.5 34.8
         */

        // Объявляем цикл for с i от 25 до 35 включительно
        for (int i = 25; i < 36; i++) {

            // выводим i, i.5 и (i - 1).8 (искомая последовательность)
            System.out.printf("%d %d.5 %d.8 \n", i, i, i - 1);
        }
    }
}
