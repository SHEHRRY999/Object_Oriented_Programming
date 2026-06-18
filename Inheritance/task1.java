import java.util.Scanner;

class Person
{
	protected String name;
	protected String address;
	protected String phone;
	protected String email;

	public void setPerson(Scanner input)
	{
		System.out.print("Enter Name: ");
		name = input.nextLine();

		System.out.print("Enter Address: ");
		address = input.nextLine();

		System.out.print("Enter Phone: ");
		phone = input.nextLine();

		System.out.print("Enter Email: ");
		email = input.nextLine();
	}

	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
		System.out.println("Email: " + email);
	}
}

class Student extends Person
{
	private String status;

	public void setStudent(Scanner input)
	{
		setPerson(input);
		System.out.print("Enter Status: ");
		status = input.nextLine();
	}

	public void display()
	{
		super.display();
		System.out.println("Status: " + status);
	}
}

class Employee extends Person
{
	protected String office;
	protected double salary;
	protected String dateHired;

	public void setEmployee(Scanner input)
	{
		setPerson(input);

		System.out.print("Enter Office: ");
		office = input.nextLine();

		System.out.print("Enter Salary: ");
		salary = input.nextDouble();
		input.nextLine();

		System.out.print("Enter Date Hired: ");
		dateHired = input.nextLine();
	}

	public void display()
	{
		super.display();
		System.out.println("Office: " + office);
		System.out.println("Salary: " + salary);
		System.out.println("Date Hired: " + dateHired);
	}
}

class Faculty extends Employee
{
	private String officeHours;
	private String rank;

	public void setFaculty(Scanner input)
	{
		setEmployee(input);

		System.out.print("Enter Office Hours: ");
		officeHours = input.nextLine();

		System.out.print("Enter Rank: ");
		rank = input.nextLine();
	}

	public void display()
	{
		super.display();
		System.out.println("Office Hours: " + officeHours);
		System.out.println("Rank: " + rank);
	}
}

class Staff extends Employee
{
	private String title;

	public void setStaff(Scanner input)
	{
		setEmployee(input);

		System.out.print("Enter Title: ");
		title = input.nextLine();
	}

	public void display()
	{
		super.display();
		System.out.println("Title: " + title);
	}
}

public class task1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		Student s = new Student();
		Faculty f = new Faculty();
		Staff st = new Staff();

		System.out.println("\n--- Student ---");
		s.setStudent(input);
		s.display();

		System.out.println("\n--- Faculty ---");
		f.setFaculty(input);
		f.display();

		System.out.println("\n--- Staff ---");
		st.setStaff(input);
		st.display();
	}
}