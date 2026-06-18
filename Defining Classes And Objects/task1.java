class Circle
{
    public double radius;
    public Circle()
    {
        radius = 1;
    }
    public Circle(double x)
    {
        radius = x;
    }
    public double Calculate()
    {
        return 2 * Math.PI * radius;
    }
}
public class task1
{
    public static void main(String [] args)
    {
        Circle c1 = new Circle();
        System.out.println(c1.Calculate());
        Circle c2 = new Circle(2);
        System.out.println(c2.Calculate());
    }
}
