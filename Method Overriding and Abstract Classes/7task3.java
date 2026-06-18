abstract class Shape {
    int numberOfLines;
    String penColor;
    String fillColor;

    abstract void draw();

    public Shape(int numberOfLines, String penColor, String fillColor) {
        this.numberOfLines = numberOfLines;
        this.penColor = penColor;
        this.fillColor = fillColor;
    }
}

class Circle extends Shape {
    public Circle(int numberOfLines, String penColor, String fillColor) {
        super(numberOfLines, penColor, fillColor);
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle with " + numberOfLines + " lines, pen color: " + penColor
                + ", fill color: " + fillColor);
    }
}

class Square extends Shape {
    public Square(int numberOfLines, String penColor, String fillColor) {
        super(numberOfLines, penColor, fillColor);
    }

    @Override
    void draw() {
        System.out.println("Drawing a square with " + numberOfLines + " lines, pen color: " + penColor
                + ", fill color: " + fillColor);
    }
}

class Triangle extends Shape {
    public Triangle(int numberOfLines, String penColor, String fillColor) {
        super(numberOfLines, penColor, fillColor);
    }

    @Override
    void draw() {
        System.out.println("Drawing a triangle with " + numberOfLines + " lines, pen color: " + penColor
                + ", fill color: " + fillColor);
    }
}

public class task3 {
    public static void main(String[] args) {
        Shape circle = new Circle(1, "red", "blue");
        Shape square = new Square(4, "green", "yellow");
        Shape triangle = new Triangle(3, "black", "white");

        circle.draw();
        square.draw();
        triangle.draw();
    }
}