package home_work_120123;

public class Task3 {

    /*
    Напечатать полную таблицу сложения в виде:
    1 + 1 = 2   1 + 2 = 3   ...    1 + 9 = 10
    2 + 1 = 3   2 + 2 = 4   ...    2 + 9 = 11
    ...
    9 + 1 = 10  9 + 2 = 11  ...    9 + 9 = 18
     */

    public static void main(String[] args) {
        makeTableAddition();
    }

    public static void makeTableAddition() {
        for (int i = 1; i < 10; i ++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d + %d = %d \t\t", i, j, j + i);
            }
            System.out.println();
        }
    }
}
