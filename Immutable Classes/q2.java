final class employee
{
    private final String name;
    private final int age;
    private final double salary;

    public employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateTax() {
        return salary * 0.20;
    }
}
public class q2
{
    public static void main(String[] args) {
        employee emp = new employee("Ali", 20, 50000);
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Tax: " + emp.calculateTax());
    }
}