package arrays_240123;
public class Task6 {

    /*
    Задача N6.
    Дан массив. Определить:
            1. Максимальный элемент
            2. Минимальный элемент
            3. Насколько максимальный элемент больше минимального
            4. Индекс максимального элемента
            5.Индекс минимального элемента
     */

    public static void sortArray(int[] array) {
        int max_elem = 0;
        int min_elem = 0;

        for (int i : array) {
            if (i > max_elem) max_elem = i;
            if (i < min_elem) min_elem = i;
        }
        int difference = max_elem - min_elem;

        System.out.println("Максимальный элемент массива: " + max_elem);
        System.out.println("Минимальный элемент массива: " + min_elem);
        System.out.println("Разница максимального и минимального значения: " + difference);

        for (int j = 0; j < array.length; j++) {
            if (array[j] == max_elem) System.out.println("Индекс максимального значения: " + j);
            if (array[j] == min_elem) System.out.println("Индекс минимального значения: " + j);
        }
    }

    public static void main(String[] args) {
        int[] array = {-23, 7, 12, 89, 234, 67, -34, 88};
        sortArray(array);
    }
}
