class Marks
{
    private int mark1;
    private int mark2;
    private int mark3;
    public Marks()
    {

    }
    public void setm1(int m1)
    {
        if(m1 > 0 && m1 < 100)
        {
            mark1 = m1;
        }
        else
        {
            System.out.println("Invalid Value for mark1, Setting Default Value 50");
            mark1 = 50;
        }
    }
    public void setm2(int m2)
    {
        if(m2 > 0 && m2 < 100)
        {
            mark2 = m2;
        }
        else
        {
            System.out.println("Invalid Value for mark2, Setting Default Value 50");
            mark2 = 50;
        }
    }
    public void setm3(int m3)
    {
        if(m3 > 0 && m3 < 100)
        {
            mark3 = m3;
        }
        else
        {
            System.out.println("Invalid Value for mark3, Setting Default Value 50");
            mark3 = 50;
        }
    }
    public int getm1()
    {
        return mark1;
    }
    public int getm2()
    {
        return mark2;
    }
    public int getm3()
    {
        return mark3;
    }
}
public class task1
{
    public static void main(String[] args) 
    {
        Marks m = new Marks();
        m.setm1(78);
        m.setm2(-77);
        m.setm3(90);
        System.out.println("Mark1 : " + m.getm1() + " Mark2 : " + m.getm2() + " Mark3 : " + m.getm3());
    }
}