package AddressBook;

import java.util.List;

public class AddressBookApp {

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();

        // Add contacts
        addressBook.addContact(
            new Person("Rahul", "9876543210", "Pune")
        );

        addressBook.addContact(
            new Person("Aman", "9123456780", "Delhi")
        );

        addressBook.addContact(
            new Person("Priya", "9988776655", "Mumbai")
        );

        addressBook.addContact(
            new Person("Neha", "9876543210", "Chandigarh")
        );

        System.out.println("\n--- All Contacts ---");
        addressBook.displayContacts();

        // Search
        System.out.println("\n--- Search By Name ---");

        List<Person> result =
                addressBook.searchByName("rah");

        result.forEach(System.out::println);

        // Search city
        System.out.println("\n--- Search By City ---");

        addressBook.searchByCity("Mumbai")
                .forEach(System.out::println);

        // Update
        System.out.println("\n--- Updating Rahul ---");

        addressBook.updateContact(
            "9876543210",
            "Rahul Sharma",
            "Bangalore"
        );

        addressBook.displayContacts();

        // Sort
        System.out.println("\n--- Sorted By Name ---");

        addressBook.sortByName();
        addressBook.displayContacts();

        // Sort by city
        System.out.println("\n--- Sorted By City ---");

        addressBook.sortByCity();
        addressBook.displayContacts();

        // Delete
        System.out.println("\n--- Delete Contact ---");

        addressBook.deleteContact("9123456780");

        addressBook.displayContacts();
    }
}
