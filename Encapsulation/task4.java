class HotDogStand
{
    private int ID;
    private int Total;
    public HotDogStand(int id, int total)
    {
        System.out.println("Object Created");
        ID = id;
        Total = total;
        System.out.println("Invoking justSold Method");
        justSold();
    }
    public void justSold()
    {
        Total++;
    }
    public int gettotal()
    {
        return Total;
    }
}
public class task4
{
    public static void main(String[] args) 
    {
        HotDogStand h1 = new HotDogStand(345, 12);
        HotDogStand h2 = new HotDogStand(445, 21);
        HotDogStand h3 = new HotDogStand(88, 14);
        int totalh1 = h1.gettotal();
        System.out.println("Hotdogs Sold by Stand 1 " + totalh1);
        int totalh2 = h2.gettotal();
        System.out.println("Hotdogs Sold by Stand 2 " + totalh2);
        int totalh3 = h3.gettotal();
        System.out.println("Hotdogs Sold by Stand 3 " + totalh3);
    }
}