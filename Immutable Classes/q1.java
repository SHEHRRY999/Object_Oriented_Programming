
final class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) 
    {
        if (denominator == 0) 
        {
            System.out.println("Denominator Cant be Zero. Setting to Default Value 1");
            this.numerator = numerator;
            this.denominator = 1;
        }
        else
        {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }
    public int getNumerator() 
    {
        return numerator;
    }
    public int getDenominator() 
    {
        return denominator;
    }
    public Fraction add(Fraction other) 
    {
        int newNumerator = this.numerator * other.getDenominator() + other.getNumerator() * this.denominator;
        int newDenominator = this.denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) 
    {
        int newNumerator = this.numerator * other.getDenominator() - other.getNumerator() * this.denominator;
        int newDenominator = this.denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) 
    {
        int newNumerator = this.numerator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) 
    {
        if (other.getNumerator() == 0) 
        {
            System.out.println("Cannot divide by zero. Returning the original fraction.");
            return this;
        }
        int newNumerator = this.numerator * other.getDenominator();
        int newDenominator = this.denominator * other.getNumerator();
        return new Fraction(newNumerator, newDenominator);
    }
}
public class q1
{
    public static void main(String [] args)
    {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction sum = f1.add(f2);
        Fraction difference = f1.subtract(f2);  
        Fraction product = f1.multiply(f2);
        Fraction quotient = f1.divide(f2);
        System.out.println("f1: " + f1.getNumerator() + "/" + f1.getDenominator());
        System.out.println("f2: " + f2.getNumerator() + "/" + f2.getDenominator());
        System.out.println("Sum: " + sum.getNumerator() + "/" + sum.getDenominator());
        System.out.println("Difference: " + difference.getNumerator() + "/" + difference.getDenominator());
        System.out.println("Product: " + product.getNumerator() + "/" + product.getDenominator());
        System.out.println("Quotient: " + quotient.getNumerator() + "/" + quotient.getDenominator());
    }

}