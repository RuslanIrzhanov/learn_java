package arrays_240123;

public class Task1_6 {

    // 6. Дан массив. Вывести на экран сначала его неотрицательные элементы, затем отрицательные.

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void outputOfPositiveValues(int[] array) {
        for (int i : array) {
            if (i >= 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void outputOfNegativeValues(int[] array) {
        for (int i : array) {
            if (i < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {23, -40, 65, 92, -77, 34, 55, 87, -15};
        printArray(array);

        // Выводим все неотрицательные элементы
        outputOfPositiveValues(array);

        // Выводим все отрицательные элементы
        outputOfNegativeValues(array);

    }

}
