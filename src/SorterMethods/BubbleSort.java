public class BubbleSort extends SelectionSort {

    // Сортировка пузырьком

    public static void main(String[] args) {

        int[] array = {23, 99, 56, 12, 78};
        printArray(array);

        sortArrayBubble(array);
        printArray(array);


    }

    private static void sortArrayBubble(int[] array) {

        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

}
