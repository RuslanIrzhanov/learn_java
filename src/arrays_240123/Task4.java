package arrays_240123;

public class Task4 {

   /* Задача N4.
    Дан массив. Все его элементы:
            1. увеличить в 2 раза
            2. уменьшить на число А
            3. разделить на первый элемент.
    */

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Метод для увеличения элементов в 2 раза
    public static void multiplyByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }
    }

    // Метод для уменьшения элементов на число А
    public static void decreaseByNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - number;
        }
    }

    // Метод для деления элементов массива на первый элемент
    public static void divideByFirstElement(double[] array) {
        double array_first = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array_first == 0) {
                System.out.println("Первое число массива является 0!");
                break;
            } else {
                array[i] = array[i] / array_first;
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {3, 5, 6, 7, 12, 56, 90};
        printArray(array);
        multiplyByNumber(array, 2);
        printArray(array);
        System.out.println();

        int[] array2 = {45, 34, 76, 12, 67, 98, 2};
        printArray(array2);
        decreaseByNumber(array2, 2);
        printArray(array2);
        System.out.println();

        double[] array3 = {4, 34, 56, 23, 88, 76, 89};
        printArray(array3);
        divideByFirstElement(array3);
        printArray(array3);
    }
}
