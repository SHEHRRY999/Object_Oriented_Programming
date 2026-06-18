import java.util.*;

class Contact {
    String firstName;
    String lastName;
    String phoneNumber;
    String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return firstName + " " + lastName + " | " + phoneNumber + " | " + emailAddress;
    }
}

class ContactList<T> {
    private ArrayList<T> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

    public T searchContact(String searchString) {
        String foundString = searchString.toLowerCase();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).toString().toLowerCase().contains(foundString)) {
                return contacts.get(i);
            }
        }
        return null;
    }

    public void deleteContact(T contact) {
        contacts.remove(contact);
    }
}

public class task1 {
    public static void main(String[] args) {
        ContactList<Contact> contactList = new ContactList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search for Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email address: ");
                    String emailAddress = scanner.nextLine();
                    Contact contact = new Contact(firstName, lastName, phoneNumber, emailAddress);
                    contactList.addContact(contact);
                    break;
                case 2:
                    contactList.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter search string: ");
                    String searchString = scanner.nextLine();
                    Contact foundContact = contactList.searchContact(searchString);
                    if (foundContact != null) {
                        System.out.println("Contact found: " + foundContact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter search string to delete: ");
                    String deleteString = scanner.nextLine();
                    Contact contactToDelete = contactList.searchContact(deleteString);
                    if (contactToDelete != null) {
                        contactList.deleteContact(contactToDelete);
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}