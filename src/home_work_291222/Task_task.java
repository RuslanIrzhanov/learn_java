package home_work_291222;

public class Task_task {
    public static void main(String[] args) {
        double S1 = 10; // Площадь квадрата
        System.out.println("S квадрата  = " + S1);

        double S2 = 0.1; // Площадь круга
        System.out.println("S круга = " + S2);

        double A = Math.sqrt(S1); // Сторона квадрата
        double D1= Math.sqrt(2)*A; // Диагональ квадрата
        double R = Math.sqrt(S2 / Math.PI); //Радиус круга
        double D2 = R*2; //Диаметр круга

        if (S1<=0) {
            System.out.println("Неверное значение поля S квадрата");
        }
        else if (S2<=0) {
            System.out.println("Неверное значение поля S круга");
        }
        else if (A>=D2) {
            System.out.println("Круг уместится в квадрате");
        }
        else if (D2>=D2){
            System.out.println("Квадрат уместится в круге");
        }
    }
}
