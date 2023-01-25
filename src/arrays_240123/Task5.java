package arrays_240123;

public class Task5 {

        /*
        Задача N5.
        Дан массив. Напечатать:
        1. Все неотрицательные элементы
        2. Все элементы, не превышающие число 100.
        */

    public static void sortArray(int[] array) {
        // Проверка и вывод неотрицательных чисел
        for (int i : array) if (i >= 0) System.out.print(i + " ");
        System.out.println();
        // Проверка и вывод чисел, не превышающих 100
        for (int i : array) if (i < 100) System.out.print(i + " ");
    }

    public static void main(String[] args) {
        int[] array = {-15, 0, 23, 12, 123, 444, -45};
        sortArray(array);
    }
}
