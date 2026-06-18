class Time
{
    public int hrs;
    public int mins;
    public int secs;
    public Time()
    {

    }
    public Time(int h, int m, int s)
    {
        if(h < 25 && m < 61 && s < 61)
        {
            hrs = h;
            mins = m;
            secs = s;
        }
        else
        {
            System.out.println("Invalid Time");
        }
    }
    public void display()
    {
        System.out.println(hrs + "hours " + mins + " minutes " + secs + "seconds");
    }
}
public class task5
{
    public static void main(String[] args) 
    {
        Time t1 = new Time();
        t1.display();
        Time t2 = new Time(24, 17, 54);
        t2.display();
    }
}