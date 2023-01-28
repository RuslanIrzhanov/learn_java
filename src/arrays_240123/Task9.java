package arrays_240123;

import java.util.Scanner;

public class Task9 {

    /*
    Задача N 9.
    Дан двумерный массив из m строк и n столбцов.
    Заполнить его значениями, вводимыми с консоли.
    Заполнение проводить по строкам, начиная с первой (а в ней — начиная с первого элемента).
    */

    public static void createMatrix(int m, int n) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter the value of the matrix number : ");
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number m: ");
        int m = sc.nextInt();
        System.out.print("Enter number n: ");
        int n = sc.nextInt();

        // Создаем матрицу исходя из введенных значений размеров строки и столбца
        // Сразу выводим на печать
        createMatrix(m, n);
    }
}
