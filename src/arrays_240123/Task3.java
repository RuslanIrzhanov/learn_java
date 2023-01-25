package arrays_240123;

import java.util.Random;


public class Task3 {

    /*
    Задача N3.
    Дан массив. Составить программу:
        1. Расчета квадратного корня из любого элемента массива;
        2. Расчета среднего арифметического двух любых элементов массива
           Предусмотреть возможность ошибочных обращений вне границ массива.
     */

    public static void squareRootOfArrayElement(double[] array) {
        // Узнаем длину массива
        int len_arr = array.length;
        // Подключаем рандом
        Random r = new Random();
        // Генерируем рандомный индекс из диапазона чисел 0 <= x < array.length
        int array_index = r.nextInt(len_arr);
        // Выводим сгенерированный индекс
        System.out.println(array_index);
        // Проверка на отрицательное число
        if (array[array_index] < 0) {
            System.out.println("Извлечение квадратного корня из отрицательного числа не имеет смысла!");
        } else {
            // Выводим квадратный корень из найденного по индексу числа
            System.out.println(Math.sqrt(array[array_index]));
        }
    }

    public static void main(String[] args) {

         double[] array = {23, 45, 78, -34, 15, 7, 36};
         squareRootOfArrayElement(array);





    }
}
