import java.util.*;
class Rectangle
{
    public double length;
    public double width;
    public void area()
    {
        System.out.println("Area : " + length * width);
    }
}
public class Task4
{
    public static void main(String[] args) 
    {
        Rectangle R1 = new Rectangle();
        R1.length = 45.76;
        R1.width = 34.87;
        R1.area();
    }
}
    
