package home_work_100123;

public class MultiplicationTable {
    public static void main(String[] args) {

        // Таблица умножения

        for (int i = 2; i <= 10; i ++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + " * " + i + " = " + i * j + "\t" + "\t");
            }
            System.out.println();
        }
    }
}
