package arrays_240123;

public class Task2_2 {

   /*
   Составить программу:
     1. нахождения минимального значения среди элементов любой строки двумерного массива;
     2. нахождения максимального значения среди элементов любого столбца двумерного массива
    */

    public static void main(String[] args) {

        int[][] matrix = {{91, -1, 99}, {56, -6, -99}, {89, -90, 101}};

        // Выводим матрицу в консоль
        printMatrix(matrix);
        System.out.println();

        // Минимальное значение среди элементов любой строки
        minimumValueOfAnyString(matrix, 1);

        // Максимальное значение среди элементов любого столбца
        maximumValueOfAnyColumn(matrix, 2);
    }

    private static void minimumValueOfAnyString(int[][] matrix, int n) {
        if (n > matrix.length - 1 || n < 0) {
            System.out.println("There is no such string in the array!");
        } else {
            int min = matrix[n][0];
            for (int i = 0; i < matrix[n].length; i++) {
                if (matrix[n][i] < min) {
                    min = matrix[n][i];
                }
            }
            System.out.println("Minimum value in row with index n: " + min);
        }
    }

    private static void maximumValueOfAnyColumn(int[][] matrix, int m) {
        if (m < 0) {
            System.out.println("There is no such string in the array!");
        } else {
            for (int[] ints : matrix) {
                if (m > ints.length) {
                    System.out.println("There is no such string in the array!");
                } else {
                    int max = matrix[0][m];
                    for (int[] i : matrix) {
                        if (i[m] > max) {
                            max = i[m];
                        }
                    }
                    System.out.println("Maximum value in column with index m: " + max);
                }
                break;
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

