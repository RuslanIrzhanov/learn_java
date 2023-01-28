package arrays_240123;

public class Task1_5 {

    //    Найти номер последнего минимального элемента массива.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void indexOfLastMinimumArrayValue(int[] array) {
        int lastMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[lastMin]) {
                lastMin = i;
            }
        }
        System.out.println("Index of last minimum array value: " + lastMin);

    }
    public static void main(String[] args) {

        int[] array = {8, 2, 65, 92, 9, 34, 2, 8, 15};
        printArray(array);

        // Индекс последнего минимального вхождения
        indexOfLastMinimumArrayValue(array);




    }


}
