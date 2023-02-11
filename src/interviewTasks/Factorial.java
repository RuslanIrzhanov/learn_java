package interviewTasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        // Вычислить значение факториала числа n

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int num = sc.nextInt();

        if (num < 0) System.out.println("Вы ввели число меньше 0!");
        if (num % 1 != 0) System.out.println("Введите целое число!");
        else if (num == 0) System.out.println("Факториал числа 0 равен 1");
        else {
            int n = 1;
            for (int i = 1; i <= num; i++) n *= i;
            System.out.printf("Факториал числа %d равен %d", num, n);
        }
    }
}
