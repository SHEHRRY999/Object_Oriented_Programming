class Account
{
    private int balance;
    public Account()
    {
        balance = 0;
    }
    public Account(int bal)
    {
        if(bal > 0)
        {
            balance = bal;
        }
        else
        {
            System.out.println(" INVALID VALUE   Assigning Default value 1000");
        }
    }
    public void deposit(int bal)
    {
        if(bal > 0)
        {
            balance = balance + bal;
        }
        else
        {
            System.out.println(" INVALID VALUE   DEPOSIT FAILED");
        }
    }
    public int getbalance()
    {
        return balance;
    }
    public void withdraw(int bal)
    {
        if(bal > 0 && bal < balance)
        {
            balance = balance - bal;
        }
        else
        {
            System.out.println(" INVALID VALUE      WITHDRAW FAILED");
        }
    }
    public Account(Account a)
    {
        this.balance = a.balance;
    }
}
public class task2
{
    public static void main(String[] args) 
    {
        Account a1 = new Account(9400);
        a1.deposit(6700);
        a1.withdraw(90000);
        System.out.println("Balance for account 1 " + a1.getbalance());
        Account a2 = new Account(a1);
        System.out.println("Balance for account 2 " + a2.getbalance());
    }
}
