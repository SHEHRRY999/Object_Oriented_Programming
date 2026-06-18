class Distance
{
    public int feet;
    public int inches;
    public Distance()
    {

    }
    public Distance(int f, int i)
    {
        feet = f;
        inches = i;
    }
    public void setFeet(int a)
    {
        feet = a;
    }
    public void setInches(int b)
    {
        inches = b;
    }
    public int getFeet()
    {
        return feet;
    }
    public int getInches()
    {
        return inches;
    }
    public Distance Display(Distance d)
    {
        int newfeet = feet + d.feet;
        int newinches = inches + d.inches;
        Distance d0 = new Distance(newfeet, newinches);
        return d0;
    }
}
public class task1
{
    public static void main(String[] args) 
    {
        Distance d1 = new Distance(56, 89);
        Distance d2 = new Distance(66, 44);
        Distance d3 = d1.Display(d2);
        System.out.println("New Feet : " + d3.getFeet());    
        System.out.println("New Inches : " + d3.getInches());
    }
}