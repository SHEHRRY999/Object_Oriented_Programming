import java.util.*;
class Time
{
    public String time;
    public int minutes;

    public void display()
    {
        System.out.println("You are talking about " + time);
        System.out.println("Hours : " + minutes / 60);
    }
}
public class Task2
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which Time (Present, Past, Future ?");
        String userinput = input.next();
        Time t1 = new Time();
        t1.time = userinput;
        t1.minutes = 120;
        t1.display();
    }
}