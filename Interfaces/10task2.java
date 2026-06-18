interface Payable {
    double getPaymentAmount();
}

class invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPaymentAmount() {
        return quantity * pricePerItem;
    }
}

abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
            String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getPaymentAmount() {
        return weeklySalary;
    }
}

public class task2 {
    public static void main(String[] args) {
        Payable i1 = new invoice("1234",
                "Part", 10, 35.0);
        Payable e1 = new SalariedEmployee("SK",
                "999", "123-45-6789",
                50000.0);
        System.out.println("Payment for Invoice: " +
                i1.getPaymentAmount());
        System.out.println("Payment for Employee: " +
                e1.getPaymentAmount());
    }
}