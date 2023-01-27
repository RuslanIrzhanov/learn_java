package arrays_240123;

public class Task7 {

    /*
    Задача N7.
    Дан массив. Поменять местами:
        1. второй и пятый элементы;
        2. третий и максимальный элементы. Если элементов с максимальным значением
           несколько, то в обмене должен участвовать первый из них.
    */

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void swappingIndexOfElement(int[] array, int a, int b) {
        if (a >= array.length || b >= array.length || a < 0 || b < 0) {
            System.out.println("Индексы элементов вне диапазона массива!");
        } else {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }

    public static void swappingThirdAndFirstHighestElement(int[] array) {
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[indexMax]) {
                indexMax = i;
            }
        }
        int temp = array[2];
        array[2] = array[indexMax];
        array[indexMax] = temp;
    }


    public static void main(String[] args) {

        int[] array = {12, 23, 34, 45, 89, 67, 78, 89};
        printArray(array);
        System.out.println();

        /*swappingIndexOfElement(array, 1, 4);
        printArray(array);
        System.out.println();*/

        swappingThirdAndFirstHighestElement(array);
        printArray(array);

    }
}
