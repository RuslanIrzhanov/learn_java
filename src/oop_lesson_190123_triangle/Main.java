package oop_lesson_190123_triangle;

public class Main {

    public static void main(String[] args) {

        Triangle tr1 = new Triangle(3, 4, 5);
        tr1.print();
        System.out.println();

        Triangle tr2 = new Triangle(6, 8, 9);
        tr2.print();
        System.out.println();

        Triangle tr3 = new Triangle(3, 4, 5);

        tr1.whoIsBigger(tr2);   // Another
        tr2.whoIsBigger(tr3);   // Current
        tr3.whoIsBigger(tr1);   // Have the same
        System.out.println();

        TriangleComparing tc1 = new TriangleComparing();
        tc1.compare(tr1, tr2);
        tc1.compare(tr2, tr3);
        tc1.compare(tr3, tr1);
    }
}
