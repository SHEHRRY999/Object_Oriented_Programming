class Account
{
    public double balance;
    public Account()
    {
        balance = 1000.0;
    }
    public Account(double x)
    {
        balance = x;
    }
    public void withDraw(double x)
    {
        if(balance > x)
        {
            balance = balance - x;
            System.out.println("balance " + balance);
        }
        else
        {
            System.out.println("Not enough balance");
        }
    }
    public void deposit(double x)
    {
        balance = balance + x;
        System.out.println("balance " + balance);
    }
}
public class task2
{
    public static void main(String [] args)
    {
        Account a1 = new Account();
        a1.withDraw(900);
        a1.deposit(800);
        Account a2 = new Account(9000);
        a2.withDraw(7000);
        a2.deposit(5000);
    }
}