package arrays_240123;

public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] array1 = new int[5];
        array1[0] = 3;
        array1[4] = 5;
        System.out.println(array1);

        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        String[] array2 = new String[3];
        array2[0] = "Anton";
        array2[2] = "Kate";
        for (String i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();

        printArray(array1);

        int[] array3 = {2, 4, 5, 7, 8, 12, 24, 8};
        printArray(array3);



    }
}
