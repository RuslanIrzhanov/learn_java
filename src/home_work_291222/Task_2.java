package home_work_291222;

public class Task_2 {
    public static void main(String[] args) {

        //  Задача № 2. Найти значения температур по шкале Фаренгейта и Кельвина исходя из значения 36,6 по Цельсию

        double Cel = 36.6;
        double f = Cel * 1.8 + 32;  // формула расчета значения по фаренгейту
        double k = Cel + 273.15;    // формула расчета значения по кельвину

        String f1 = String.format("%.2f", f);
        System.out.println(f1);
        System.out.println(k);
    }
}
