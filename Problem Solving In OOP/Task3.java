import java.util.Scanner;
class Car 
{
    public String modelNumber;
    public String partNumber;
    public String cost;
    public void display() 
    {
        System.out.println("Model Number: " + modelNumber + "Part Number: " + partNumber+ "Cost: " + cost);
    }
}
public class Task3
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Car car1 = new Car();
        System.out.println("What is Model Number?");
        System.out.println("What is Part Number?");
        System.out.println("What is Cost?");
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        car1.modelNumber = a;
        car1.partNumber = b;
        car1.cost = c;
        car1.display();
    }
}