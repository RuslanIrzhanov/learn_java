package arrays_240123;

public class Task1_3 {

    // 3. Вывести сумму всех положительных элементов массива.

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void sumOfPositiveArrayElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        System.out.println("Sum of positive array elements: " + sum);
    }

    public static void main(String[] args) {

        int[] array = {23, -40, 65, 92, -77, 34, 55, 87, -15};
        printArray(array);

        // Сумма всех положительных элементов массива
        sumOfPositiveArrayElements(array);

    }

}
