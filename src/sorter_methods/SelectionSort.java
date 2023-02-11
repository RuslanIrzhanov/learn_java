public class SelectionSort {

    // Сортировка выбором

    public static void sortArraySelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    index = j;
                    min = array[j];
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array = {3, 45, 78, -12, 5};
        printArray(array);

        sortArraySelection(array);
        printArray(array);
    }
}
