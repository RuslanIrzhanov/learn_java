package arrays_240123;

public class Task1_4 {

    // Посчитать сумму элементов, кратных 5.

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void sumOfMultiplesOfFive(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum Multiples of five: " + sum);
    }
    public static void main(String[] args) {

        int[] array = {23, -40, 65, 92, -77, 34, 55, 87, -15};
        printArray(array);

        // Сумма элементов, кратных 5
        sumOfMultiplesOfFive(array);



    }


}
