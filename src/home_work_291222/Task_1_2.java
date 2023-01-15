package home_work_291222;

import java.util.Scanner;

public class Task_1_2 {
    public static void main(String[] args) {

        // Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?

        Scanner in = new Scanner(System.in);

        System.out.print("Введите радиус круга: ");
        double r = in.nextDouble();
        System.out.print("Введите длину стороны квадрата: ");
        double a = in.nextDouble();

        double Sr = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга с радиусом " + r + " равна: " + Sr);
        double Sa = Math.pow(a, 2);
        System.out.println("Площадь квадрата со стороной " + a + " равна: " + Sa);

        if (Sr > Sa) {
            System.out.println("Площадь круга больше площади квадрата");
        } else if (Sr < Sa) {
            System.out.println("Площадь квадрата больше площади круга");
        } else {
            System.out.println("Площади квадрата и круга равны");
        }
    }
}
