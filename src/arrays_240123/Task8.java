package arrays_240123;

public class Task8 {

    /*
    Задача N 8.
    Дан двумерный массив.
    1. Вывести на экран элемент, расположенный в правом верхнем углу массива
    2. Вывести на экран элемент, расположенный в левом нижнем углу массива
    */

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        int[][] matrix = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};

        // Выводим двумерный массив в виде матрицы
        printMatrix(matrix);

        // Элемент с правого верхнего угла массива
        System.out.println(matrix[0][2]);

        // Элемент с левого нижнего угла массива
        System.out.println(matrix[2][0]);

    }
}
