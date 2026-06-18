interface Shape {
    double getArea();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;
    }
}

public class task1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(4.33);
        Rectangle r1 = new Rectangle(4.3, 5.8);
        System.out.println("Area of Circle: " + c1.getArea());
        System.out.println("Area of Rectangle: " + r1.getArea());
    }

}