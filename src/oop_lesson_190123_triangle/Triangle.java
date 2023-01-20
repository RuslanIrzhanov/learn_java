package oop_lesson_190123_triangle;

public class Triangle {

    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        if ((a > 0) && (b > 0) && (c > 0) && (a + b > c) && (a + c > b) && (c + b > a)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.perimeter();
            this.square();
        } else System.out.println("Triangle cannot be created!");
    }

    private double perimeter() {
        return this.a + this.b + this.c;
    }

    private double square() {
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double getPerimeter() {
        return this.perimeter();
    }

    public double getSquare() {
        return this.square();
    }

    public void print() {
        System.out.printf("Triangle has sides: %.2f, %.2f, %.2f. ", this.a, this.b, this.c);
        System.out.printf("Square = %.2f, perimeter = %.2f\n", this.square(), this.perimeter());
    }

    public void whoIsBigger(Triangle tr) {
        if (this.getSquare() > tr.getSquare())
            System.out.println("Current triangle is bigger!");
        else if (this.getSquare() < tr.getSquare())
            System.out.println("Another triangle is bigger!");
        else
            System.out.println("Triangles have the same square!");
    }
}
