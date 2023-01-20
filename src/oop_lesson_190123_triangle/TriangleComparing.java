package oop_lesson_190123_triangle;

public class TriangleComparing {

    public void compare(Triangle t1, Triangle t2) {
        if (t1.getSquare() > t2.getSquare()) {
            System.out.print("The bigger triangle is: ");
            t1.print();
        }
        else if (t1.getSquare() < t2.getSquare()) {
            System.out.print("The bigger triangle is: ");
            t2.print();
        }
        else System.out.println("Triangles have the same square!");
    }
}

