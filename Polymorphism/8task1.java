class Package {
    String senderName;
    String senderAddress;
    String recName;
    String recAddress;
    double weight;
    double costPerOunce;

    public Package(String sendername, String senderAddress, String recname, String recAddress, double weight,
            double costPerOunce) {
        this.senderName = sendername;
        this.senderAddress = senderAddress;
        this.recName = recname;
        this.recAddress = recAddress;
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than zero Setting Default Value : 15.0");
            this.weight = 15.0;
        }
        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else {
            System.out.println("Cost must be greater than zero Setting Default Value : 100.0");
            this.costPerOunce = 100.0;
        }
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }
}

class TwoDayPackage extends Package {
    double flatFee;

    public TwoDayPackage(String sendername, String senderAddress, String recname, String recAddress, double weight,
            double cost, double flatFee) {
        super(sendername, senderAddress, recname, recAddress, weight, cost);
        this.flatFee = flatFee;
    }

    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}

class OvernightPackage extends Package {
    double additionalFeePerOunce;

    public OvernightPackage(String sendername, String senderAddress, String recname, String recAddress, double weight,
            double cost, double additionalFeePerOunce) {
        super(sendername, senderAddress, recname, recAddress, weight, cost);
        this.additionalFeePerOunce = additionalFeePerOunce;
    }

    public double calculateCost() {
        return super.calculateCost() + (additionalFeePerOunce * weight);
    }
}

public class task1 {
    public static void main(String[] args) {
        Package standardPackage = new Package("Alice", "123 Main St", "Bob", "456 Elm St", 10, 5);
        TwoDayPackage twoDayPackage = new TwoDayPackage("Charlie", "789 Oak St", "Dave",
                "321 Pine St", 15, 4, 20);
        OvernightPackage overnightPackage = new OvernightPackage("Eve", "654 Maple St",
                "Frank", "987 Cedar St", 20, 3, 2);
        System.out.println("Standard Package Cost: $" + standardPackage.calculateCost());
        System.out.println("Two-Day Package Cost: $" + twoDayPackage.calculateCost());
        System.out.println("Overnight Package Cost: $" + overnightPackage.calculateCost());
    }
}
