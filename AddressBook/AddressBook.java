package AddressBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressBook {

    private final List<Person> contacts;
    private final Set<String> phoneNumbers;

    public AddressBook() {
        contacts = new ArrayList<>();
        phoneNumbers = new HashSet<>();
    }

    // CREATE
    public boolean addContact(Person person) {

        if (person == null) {
            return false;
        }

        if (phoneNumbers.contains(person.getPhoneNumber())) {
            System.out.println("Duplicate contact. Phone number already exists.");
            return false;
        }

        contacts.add(person);
        phoneNumbers.add(person.getPhoneNumber());

        System.out.println("Contact added successfully.");
        return true;
    }

    // READ
    public Person getContact(String phoneNumber) {

        for (Person person : contacts) {

            if (person.getPhoneNumber().equals(phoneNumber)) {
                return person;
            }
        }

        return null;
    }

    // UPDATE
    public boolean updateContact(
            String phoneNumber,
            String newName,
            String newCity) {

        Person person = getContact(phoneNumber);

        if (person == null) {
            return false;
        }

        person.setName(newName);
        person.setCity(newCity);

        return true;
    }

    // DELETE
    public boolean deleteContact(String phoneNumber) {

        Person person = getContact(phoneNumber);

        if (person == null) {
            return false;
        }

        contacts.remove(person);
        phoneNumbers.remove(phoneNumber);

        return true;
    }

    // SEARCH BY NAME
    public List<Person> searchByName(String name) {

        List<Person> result = new ArrayList<>();

        for (Person person : contacts) {

            if (person.getName()
                    .toLowerCase()
                    .contains(name.toLowerCase())) {

                result.add(person);
            }
        }

        return result;
    }

    // SEARCH BY CITY
    public List<Person> searchByCity(String city) {

        List<Person> result = new ArrayList<>();

        for (Person person : contacts) {

            if (person.getCity()
                    .equalsIgnoreCase(city)) {

                result.add(person);
            }
        }

        return result;
    }

    // SORT BY NAME
    public void sortByName() {

        contacts.sort(
            Comparator.comparing(
                Person::getName,
                String.CASE_INSENSITIVE_ORDER
            )
        );
    }

    // SORT BY CITY
    public void sortByCity() {

        contacts.sort(
            Comparator.comparing(
                Person::getCity,
                String.CASE_INSENSITIVE_ORDER
            )
        );
    }

    // DISPLAY ALL
    public void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.");
            return;
        }

        for (Person person : contacts) {
            System.out.println(person);
        }
    }

    // RETURN A COPY
    public List<Person> getAllContacts() {
        return new ArrayList<>(contacts);
    }
}
