class Distance
{
    public int feet;
    public int inches;
    public Distance()
    {

    }
    public Distance(int f, int i)
    {
        feet = f;
        inches = i;
    }
    public void display()
    {
        System.out.println("feet " + feet + " inches " + inches);
    }
}
public class task3
{
    public static void main(String [] args)
    {
        Distance d1 = new Distance();
        d1.display();
        Distance d2 = new Distance(32, 8);
        d2.display();
    }
}