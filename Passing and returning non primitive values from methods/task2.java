import java.util.Scanner;
class Book
{
    public String author;
    public String[] chapterNames = new String[100];
    public Book()
    {
    }
    public Book(String a, String[] b)
    {
        author = a;

        for(int i = 0; i < b.length; i++)
        {
            chapterNames[i] = b[i];
        }
    }
    public void setAuthor(String a)
    {
        author = a;
    }
    public void setchapterNames(String[] b)
    {
        for(int i = 0; i < b.length; i++)
        {
            chapterNames[i] = b[i];
        }
    }
    public boolean CompareBooks(Book b0)
    {
        if(author.equals(b0.author))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String compareChapterNames(Book b0)
    {
        int l1 = 0;
        int l2 = 0;
        for(int i = 0; i < chapterNames.length; i++)
        {
            if(chapterNames[i] != null)
            {
                l1++;
            } 
        }
        for(int i = 0; i < b0.chapterNames.length; i++)
        {
            if(b0.chapterNames[i] != null)
            {
                l2++;
            } 
        }
        if(l1 > l2)
        {
            return author;
        }
        else
        {
            return b0.author;
        }
    }
}
public class task2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Book b1 = new Book();
        b1.setAuthor("Ali");
        String[] ch1 = new String[3];
        System.out.println("Enter 3 chapter names for first book:");
        for(int i = 0; i < ch1.length; i++)
        {
            ch1[i] = input.next();
        }
        b1.setchapterNames(ch1);
        String[] ch2 = new String[5];
        System.out.println("Enter 5 chapter names for second book:");
        for(int i = 0; i < ch2.length; i++)
        {
            ch2[i] = input.next();
        }
        Book b2 = new Book("Ali", ch2);
        boolean result = b1.CompareBooks(b2);
        if(result)
        {
            System.out.println("Both books have same author");
        }
        else
        {
            System.out.println("Different authors");
        }
        String bigAuthor = b1.compareChapterNames(b2);
        System.out.println("Author with more chapters: " + bigAuthor);
        input.close();
    }
}