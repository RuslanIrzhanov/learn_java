package home_work_120123;

public class Task2 {

    /*
    Напечатать числа в виде следующей таблицы:
    5
    5 5
    5 5 5
    5 5 5 5
    5 5 5 5 5
     */

    public static void main(String[] args) {

        String num = "5 ";
        makeTable(num, 5);
    }

    public static void makeTable(String num, int rows) {
        for (int i = 1; i <= rows; i++) {
            System.out.println(num.repeat(i));
        }
    }
}
