package learn_base;

public class DataTypeCasting {

    public static void main(String[] args) {

        // Приведение типов

        double x = 15.7;
        float y = 9.8f;
        float z = 34.9f;

        int a = (int) x;    // дробная часть просто отбрасывается
        int b = (int) y;    // аналогично дробная часть отбрасывается

        System.out.println(a);  // выводим преобразованное значение в int
        System.out.println(b);
        System.out.println((int) z);    // преобразовываем и сразу выводим (дробная часть также отбрасывается)

        /*
        Автоматическое приведение типов часто применяется при суммировании строки и числа.
        В этом случае число автоматически преобразуется в строку и выполняется обычная конкатенация (слияние) строк.
         */

        int yearNow = 2023;
        System.out.println("Текущий год " + yearNow);
        // Обратно преобразование из строки в число автоматически не выполняется

        String yearBorn = "1988";
        System.out.println(Integer.parseInt(yearBorn) + 12);    // преобразование строки в числовое значение и сложение

        String pi = "3.1415";
        System.out.println(Float.parseFloat(pi) + 0.1f);        // преобразование строки в числовое значение и сложение
    }
}
