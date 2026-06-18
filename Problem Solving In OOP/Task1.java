import java.util.Scanner;
class Student
{
    public int age;
    public int rollNo;
    public double gpa;
    public void display()
    {
        System.out.println("Age : " + age + " Roll No : " + rollNo + " gpa : " + gpa);
    }
    public void canRead()
    {
        System.out.println(" Roll No : " + rollNo + " can Read ");
    }
    public void canAsk()
    {
        System.out.println(" Roll No : " + rollNo + " asked a question ");
    }
    public void regCourses(int x) 
    {
        System.out.println(" Roll No : " + rollNo + " has registered " + x + " courses");
    }
}
public class Task1
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();
        s1.age = 19;
        s1.rollNo = 45;
        s1.gpa = 3.9;
        s1.display();
        s1.canRead();
        s1.canAsk();
        System.out.println("Enter Number Of courses You want to register : ");
        int num = input.nextInt();
        s1.regCourses(num);
        input.close();
    }
}