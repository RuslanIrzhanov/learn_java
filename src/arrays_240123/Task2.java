package arrays_240123;

import java.util.Random;

public class Task2 {

    /*
    Задача N2.
    Используя датчик случайных чисел, заполнить массив из двадцати элементов неповторяющимися числами.
    Вывести полученные массивы на экран.
    */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] generateArray(int n) {

        Random r = new Random();
        int[] array = new int[n];
        for (int  i = 0; i < array.length; i++) {
            array[i] = r.nextInt(5000);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = generateArray(10);
        printArray(array);
    }
}
