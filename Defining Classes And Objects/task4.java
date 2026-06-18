class Marks
{
    public int oop;
    public int bio;
    public int math;
    public Marks()
    {

    }
    public Marks(int x, int y, int z)
    {
        if(x > 0 && y > 0 && z > 0)
        {
            oop = x;
            bio = y;
            math = z;
        }
        else
        {
            System.out.println("Marks cant be negative");
        }
    }
    public int Sum()
    {
        return oop + bio + math;
    }
}
public class task4
{
    public static void main(String [] args)
    {
        Marks m1 = new Marks();
        System.out.println(m1.Sum());
        Marks m2 = new Marks(89,76,90);
        System.out.println(m2.Sum());
    }
}