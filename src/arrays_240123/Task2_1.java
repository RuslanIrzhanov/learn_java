package arrays_240123;

public class Task2_1 {

    /*
    Дан массив. Определить:
    1. количество максимальных элементов в массиве;
    2. количество минимальных элементов в массиве
    */

    public static void main(String[] args) {

        int[] array = {12, 34, 5, 67, 11, 5, 67, 34, 5};

        // Количество максимальных элементов в массиве
        numberOfMaximumElements(array);

        // Количество минимальных элементов в массиве
        numberOfMinimumElements(array);
    }

    private static void numberOfMaximumElements(int[] array) {
        int counter = 0;
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        for (int i : array) {
            if (i == max) {
                counter++;
            }
        }
        System.out.println("Number of maximum elements: " + counter);
    }

    private static void numberOfMinimumElements(int[] array) {
        int counter = 0;
        int max = array[0];
        for (int i : array) {
            if (i < max) {
                max = i;
            }
        }
        for (int i : array) {
            if (i == max) {
                counter++;
            }
        }
        System.out.println("Number of minimum elements: " + counter);
    }

}
