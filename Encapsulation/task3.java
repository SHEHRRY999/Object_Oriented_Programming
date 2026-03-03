class Student
{
    private String name;
    int [] Result_array = new int [5];
    public Student(String n, int [] arr)
    {
        name = n;
        for(int i = 0; i < arr.length; i++)
        {
            Result_array [i] = arr [i];
        }
    }
    public double Average()
    {
        int total = 0;
        for(int i = 0; i < Result_array.length; i++)
        {
            total = total + Result_array [i];
        }
        double avg = total / Result_array.length;
        return avg;
    }
    public String getName()
    {
        return name;
    }
    public int [] getMarks()
    {
        return Result_array;
    }
}
public class task3
{
    public static void main(String[] args) 
    {
        int [] marks1 = {45, 67, 89, 33, 55};
        Student s1 = new Student("Shehryar", marks1);
        double avg1 = s1.Average();
        System.out.println("Average for Student 1 " + avg1);
        int [] marks2 = {66, 33, 54, 77, 23};
        Student s2 = new Student("Ali", marks2);
        double avg2 = s2.Average();
        System.out.println("Average for Student 2 " + avg2);
        if (avg1 > avg2)
        {
            System.out.println("Student 1 has high Average");
        }
        else
        {
            System.out.println("Student 2 has high Average");
        }
        Student s3 = new Student(s1.getName(), s2.getMarks());
        String s3name = s3.getName();
        System.out.println("Name for Student 3 : " + s3name);
        int [] s3marks = s3.getMarks();
        System.out.println("Marks For Student 3");
        for(int i = 0; i < s3marks.length; i++)
        {
            System.out.println(s3marks [i]);
        }
    }
}