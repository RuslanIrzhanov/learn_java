package arrays_240123;

import java.util.Scanner;

public class Task1 {

    /* Задача N1.
    Заполнить массив из десяти элементов значениями,
    вводимыми с клавиатуры входе выполнения программы.
    */

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int[] scanArray(int n) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i ++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = scanArray(7);
        System.out.println();
        printArray(array);
    }


}
