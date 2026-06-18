class Fraction
{
    private int num1;
    private int num2;
    public Fraction()
    {
        num1 = 0;
        num2 = 1;
    }
    public Fraction(int a, int b)
    {
        num1 = a;
        num2 = b;
    }
    public void setNum1(int a)
    {
        num1 = a;
    }

    public void setNum2(int b)
    {
        num2 = b;
    }
    public int getNum1()
    {
        return num1;
    }

    public int getNum2()
    {
        return num2;
    }
    public void display()
    {
        System.out.println(num1 + "/" + num2);
    }
    public boolean equals(Fraction f0)
    {
        return num1 * f0.num2 == num2 * f0.num1;
    }
}
public class task3
{
    public static void main(String[] args)
    {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(2, 4);

        f1.setNum1(8);
        f1.setNum2(16);

        f1.display();
        f2.display();

        if(f1.equals(f2))
        {
            System.out.println("Both Ratios Are Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}