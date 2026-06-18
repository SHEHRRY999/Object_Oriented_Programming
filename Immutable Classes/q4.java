/*    Write a Java class representing an immutable rectangle, with four fields representing the x 
and y coordinates of the top-left corner, and the width and height. Include a constructor and 
getter methods for each field, as well as a method to calculate the area of the rectangle.  */
final class Rectangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int calculateArea() {
        return width * height;
    }
}
public class q4
{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(0, 0, 5, 10);
        System.out.println("X: " + rect.getX());
        System.out.println("Y: " + rect.getY());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.calculateArea());
    }
}