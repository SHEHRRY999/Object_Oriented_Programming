class Person {
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
class Book {
    String bookName;
    String publisher;
    Person author;

    public Book(String bookName, String publisher, Person author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }
}
public class q2 {
    public static void main(String[] args) {
        Person author = new Person("Sherry", "123 Main St");
        Book book = new Book("Java Programming", "Tech Books Publishing", author);

        book.author.address = "456 Elm St";

        System.out.println("Author's Name: " + book.author.name);
        System.out.println("Author's Address: " + book.author.address);
    }
}
