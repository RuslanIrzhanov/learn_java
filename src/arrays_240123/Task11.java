package arrays_240123;

public class Task11 {

    /*
    Задача No11
    Дан двумерный массив.
    1. поменять местами первую и третью строки
    2. поменять местами второй и последний столбцы
    */

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }

    public static void swapFirstAndThirdLines(int[][] matrix) {
        int[] temp = matrix[0];
        matrix[0] = matrix[2];
        matrix[2] = temp;
    }

    public static void swapSecondAndLastColumn(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][1];
            matrix[i][1] = matrix[i][matrix[i].length - 1];
            matrix[i][matrix[i].length - 1] = temp;
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        printMatrix(matrix);
        System.out.println();

        // Меняем местами первую и третью строки
        swapFirstAndThirdLines(matrix);
        printMatrix(matrix);
        System.out.println();

        // Меняем местами второй и последний столбец
        swapSecondAndLastColumn(matrix);
        printMatrix(matrix);
    }
}
