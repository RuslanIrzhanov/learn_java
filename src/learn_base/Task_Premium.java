package learn_base;

public class Task_Premium {

    public static void main(String[] args) {

        System.out.printf("Premium is %.1f \n", getPremium(39000));
        System.out.printf("Premium is %.1f \n", getPremium(79000));
        System.out.printf("Premium is %.1f \n", getPremium(99000));

    }

    private static double getPremium(int i) {
        if (i < 40000) {
            return i * 0.5;
        } else if (i < 80000) {
            return i * 0.7;
        } else {
            return i * 1.1;
        }
    }
}
