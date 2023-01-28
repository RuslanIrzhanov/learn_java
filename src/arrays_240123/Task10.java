package arrays_240123;

public class Task10 {

    /*
    Задача N 10.
    Дан двумерный массив. Определить:
    1. сумму всех элементов третьей строки массива
    2. сумму всех элементов второго столбца массива
    */

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void countElementsOfThirdRow(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix[2].length; i++) {
            sum += matrix[2][i];
        }
        System.out.println("Сумма всех элементов третьей строки равна: " + sum);
    }

    public static void countElementsSecondColumn(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][1];
        }
        System.out.println("Сумма всех элементов второго столбца массива равна: " + sum);
    }

    public static void main(String[] args) {

        int[][] matrix = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
        printMatrix(matrix);
        System.out.println();

        // Выводим сумму элементов третьей строки матрицы
        countElementsOfThirdRow(matrix);

        // Выводим сумму элементов второго столбца матрицы
        countElementsSecondColumn(matrix);
    }
}
