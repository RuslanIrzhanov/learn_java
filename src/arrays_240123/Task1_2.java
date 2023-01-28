package arrays_240123;

public class Task1_2 {

    /*
    2. Определить:
        1. сумму всех элементов массива;
        2. произведение всех элементов массива;
        3. сумму квадратов всех элементов массива;
        4. сумму шести первых элементов массива
     */


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sumOfElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("Sum of elements: " + sum);
    }

    private static void productOfArrayNumbers(int[] array) {
        int counter = 1;
        for (int i : array) {
            counter *= i;
        }
        System.out.println("Product of elements: " + counter);
    }

    private static void sumOfSquaresOfArrayElements(int[] array) {
        int sumOfSquares = 0;
        for (int i : array) {
            sumOfSquares += Math.pow(i, 2);
        }
        System.out.println("Sum of squares of elements: " + sumOfSquares);
    }

    private static void sumOfSixElements(int[] array) {
        int sumSix = 0;
        for (int i = 0; i < 6; i++) {
            sumSix += array[i];
        }
        System.out.println("Sum of six elements: " + sumSix);
    }


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printArray(array);

        // Сумма всех элементов массива
        sumOfElements(array);

        // Произведение всех элементов массива
        productOfArrayNumbers(array);

        // Сумма квадратов всех элементов массива
        sumOfSquaresOfArrayElements(array);

        // Сумма шести первых элемента массива
        sumOfSixElements(array);

    }

}
