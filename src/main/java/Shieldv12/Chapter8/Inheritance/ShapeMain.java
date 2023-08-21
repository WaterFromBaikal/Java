package Shieldv12.Chapter8.Inheritance;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        circle1.getSquare();
    }
}

abstract class Shape {
    void getSquare() {

    }
}

class Circle extends Shape {
    int r;

    Circle(int r) {
        this.r = r;
    }

    void getSquare() {
        System.out.println(3.14 * r * r);
    }
}