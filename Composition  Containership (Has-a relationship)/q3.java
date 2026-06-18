class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display(){
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}
class Line{
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length(){
        int x1 = startPoint.getX();
        int y1 = startPoint.getY();
        int x2 = endPoint.getX();
        int y2 = endPoint.getY();
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
public class q3 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Line line1 = new Line(p1, p2);
        System.out.println("Length of line1: " + line1.length());

        Point p3 = new Point(1, 2);
        Point p4 = new Point(4, 6);
        Line line2 = new Line(p3, p4);
        System.out.println("Length of line2: " + line2.length());
    }
}