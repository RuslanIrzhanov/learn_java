public class Task3 {

    /*
    Задача 3.
    Дан массив. Составить программу:
        1. расчета квадратного корня из любого элемента массива
        2. расчета среднего арифметического двух любых элементов массива

        Предусмотреть возможность ошибочных обращений вне границ массива.
    */

    public static void main(String[] args) {

        int[] array = {2, 4, -6, 8, 10, 3, 5, 7, 9, 11}; // Дан произвольный числовой массив

        calculateTheSquareRoot(array, 2);   // Корень числа с индексом 2
        calculateTheSquareRoot(array, 1);   // Корень числа с индексом 1
        calculateTheSquareRoot(array, 8);   // ...
        System.out.println();

        calculationOfTheArithmeticMean(array, 2, 4);    // Среднее арифметическое чисел с индексами 2 и 4
        calculationOfTheArithmeticMean(array, 1, 5);    // Среднее арифметическое чисел с индексами 1 и 5
        calculationOfTheArithmeticMean(array, 3, 8);    // ...

    }

    // Создаем метод для нахождения квадратного корня элемента массива, на вход подаем сам массив и индекс элемента
    private static void calculateTheSquareRoot(int[] array, int index) {

        // Проверка на ошибочные обращение вне границ массива
        if (index < 0 || index > array.length - 1) {
            System.out.println("Индекс вне границ массива!");
        } else if (array[index] < 0) {
            System.out.println("Нельзя извлечь корень из отрицательного числа!");
        } else {
            System.out.printf("Квадратный корень элемента с индексом %d равен: %.2f \n",
                    index, Math.sqrt(array[index]));
        }
    }

    // Создаем метод для нахождения среднего арифметического двух элементов массива, на вход подаем сам массив,
    // индекс первого элемента и индекс второго элемента
    private static void calculationOfTheArithmeticMean(int[] array, int index1, int index2) {

        // Проверка на ошибочные обращение вне границ массива
        if (index1 < 0 || index2 < 0 || index1 > array.length - 1 || index2 > array.length - 1) {
            System.out.println("Индексы вне границ массива!");
        } else {

            // среднее арифметическое
            double mean = ((double) array[index1] + array[index2]) / 2;
            System.out.printf("Среднее арифметическое элементов с индексами %d и %d равно: %.2f \n",
                    index1, index2, mean);
        }
    }
}
