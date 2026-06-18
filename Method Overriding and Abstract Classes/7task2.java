class Simple {
    int num1;
    int num2;

    public Simple(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

}

class VerifiedSimple extends Simple {
    public VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int add() {
        if (num1 > 0 && num2 > 0) {
            return super.add();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for addition.");
            return 0;
        }
    }

    @Override
    public int subtract() {
        if (num1 > 0 && num2 > 0) {
            return super.subtract();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for subtraction.");
            return 0;
        }
    }

    @Override
    public int multiply() {
        if (num1 > 0 && num2 > 0) {
            return super.multiply();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for multiplication.");
            return 0;
        }
    }

    @Override
    public int divide() {
        if (num1 > 0 && num2 > 0) {
            return super.divide();
        } else {
            System.out.println("Error: Both numbers must be greater than 0 for division.");
            return 0;
        }
    }
}

public class task2 {
    public static void main(String[] args) {
        VerifiedSimple vs = new VerifiedSimple(10, 5);
        System.out.println("Addition: " + vs.add());
        System.out.println("Subtraction: " + vs.subtract());
        System.out.println("Multiplication: " + vs.multiply());
        System.out.println("Division: " + vs.divide());

        VerifiedSimple vsInvalid = new VerifiedSimple(-10, 5);
        System.out.println("Addition: " + vsInvalid.add());
        System.out.println("Subtraction: " + vsInvalid.subtract());
        System.out.println("Multiplication: " + vsInvalid.multiply());
        System.out.println("Division: " + vsInvalid.divide());
    }
}
