package arrays_240123;

public class Task1_1 {

    // 1. Вывести элементы массива на экран в обратном порядке.

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void reversOrder(String[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void main(String[] args) {

        String[] turn = {"first", "second", "third", "fourth", "fifth", "sixth"};
        printArray(turn);
        System.out.println();

        //  Выводим элементы массива в обратном порядке
        reversOrder(turn);

    }
}
