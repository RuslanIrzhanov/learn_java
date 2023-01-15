package home_work_120123;

import java.util.Scanner;

public class Task7_triangle {

    /*
    Даны стороны двух треугольников.
    Найти сумму их периметров и сумму их площадей.
    (Определить процедуру для расчета периметра и площади треугольника по его сторонам.)

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону a первого треугольника: ");
        double a1 = sc.nextDouble();
        System.out.print("Введите сторону b первого треугольника: ");
        double b1 = sc.nextDouble();
        System.out.print("Введите сторону c первого треугольника: ");
        double c1 = sc.nextDouble();
        if (a1 <= 0 || b1 <= 0 || c1 <= 0 || (a1 + b1) < c1 || (a1 + c1) < b1 || (b1 + c1) < a1)
            System.out.println("Стороны первого треугольника введены неверно!");
        else {
            System.out.print("Периметр первого треугольника равен: ");
            System.out.println(perimeterOfTriangle(a1, b1, c1));
            System.out.print("Площадь первого треугольника равна: ");
            System.out.println(areaOfTriangle(a1, b1, c1));
        }
        System.out.println();

        System.out.print("Введите сторону a второго треугольника: ");
        double a2 = sc.nextDouble();
        System.out.print("Введите сторону b второго треугольника: ");
        double b2 = sc.nextDouble();
        System.out.print("Введите сторону c второго треугольника: ");

        double c2 = sc.nextDouble();
        if (a2 <= 0 || b2 <= 0 || c2 <= 0 || (a2 + b2) < c2 || (a2 + c2) < b2 || (b2 + c2) < a2)
            System.out.println("Стороны второго треугольника введены неверно!");
        else {
            System.out.print("Периметр второго треугольника равен: ");
            System.out.println(perimeterOfTriangle(a2, b2, c2));
            System.out.print("Площадь второго треугольника равна: ");
            System.out.println(areaOfTriangle(a2, b2, c2));
        }
        System.out.println();

        System.out.print("Сумма периметров двух треугольников равна: ");
        System.out.println(perimeterOfTriangle(a1, b1, c1) + perimeterOfTriangle(a2, b2, c2));
        System.out.print("Сумма площадей двух треугольников равна: ");
        System.out.println(areaOfTriangle(a1, b1, c1) + areaOfTriangle(a2, b2, c2));
    }

    public static double perimeterOfTriangle(double a, double b, double c) {
        double perimeter = a + b + c;
        return perimeter;
    }

    public static double areaOfTriangle(double a, double b, double c) {
        double semi_per = (a + b + c) / 2;
        double area_triangle = Math.sqrt(semi_per * (semi_per - a) * (semi_per - b) * (semi_per - c));
        return area_triangle;
    }
}
