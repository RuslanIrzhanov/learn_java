import java.util.Scanner;


public class InputOut {
    public static void main(String[] args) {

        // Принимает имя, отчество и год рождения от пользователя.
        // Выводит приветствие и рассчитывает возраст пользователя.

        Scanner sc = new Scanner(System.in);

        String name, surName;
        int yearBorn, yearNow;
        System.out.print("Введите Ваше имя: ");
        name = sc.nextLine();
        System.out.print("Введите Ваше отчество: ");
        surName = sc.nextLine();

        System.out.println();
        System.out.print("Введите текущий год: ");
        yearNow = sc.nextInt();
        System.out.print("В каком году Вы родились: ");
        yearBorn = sc.nextInt();
        System.out.println();

        System.out.println("Здравствуйте, " + name + " " + surName + "!");
        System.out.println("Ваш возраст: " + (yearNow - yearBorn) + " лет");
    }
}