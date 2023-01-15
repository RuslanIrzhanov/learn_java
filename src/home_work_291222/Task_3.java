package home_work_291222;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        //  Задача № 3. Определить уместится ли круг в квадрате и наоборот если известны их площади

        Scanner in = new Scanner(System.in);
        System.out.print("Введите площадь квадрата: ");
        double sSquare = in.nextDouble();
        System.out.print("Введите площадь круга: ");
        double sCircle = in.nextDouble();

        // Круг уместится в квадрат, если диаметр круга будет меньше стороны квадрата
        // Квадрат уместится в круг, если диагональ квадрата будет меньше диаметра круга

        double dCircle = 2 * Math.sqrt(sCircle / Math.PI);  // находим диаметр круга по площади
        System.out.println("Диаметр круга равен: " + dCircle);
        double aSquare = Math.sqrt(sSquare);    // находим длину стороны квадрата
        System.out.println("Сторона квадрата равна: " + aSquare);
        double dSquare = Math.sqrt(2 * sSquare);    // находим диагональ квадрата
        System.out.println("Диагональ квадрата равна: " + dSquare);

        if (dCircle < aSquare) {
            System.out.println("Круг уместится в квадрате");
        } else {
            System.out.println("Круг не уместится в квадрате");
        }

        if (dSquare < dCircle) {
            System.out.println("Квадрат уместится в круг");
        } else {
            System.out.println("Квадрат не уместится в круг");
        }
    }
}
