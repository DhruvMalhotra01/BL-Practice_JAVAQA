package oops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Person {

    private String name;
    private String city;
    private String phone;


    Person(String name, String city, String phone) {

        this.name = name;
        this.city = city;
        this.phone = phone;
    }


    public String getName() {

        return name;
    }


    public String getCity() {

        return city;
    }


    public String getPhone() {

        return phone;
    }


    public void setName(String name) {

        this.name = name;
    }


    public void setCity(String city) {

        this.city = city;
    }


    public void setPhone(String phone) {

        this.phone = phone;
    }


    void display() {

        System.out.println(
                "Name: " + name
                + ", City: " + city
                + ", Phone: " + phone
        );
    }
}


public class AddressBook {

    private List<Person> people =
            new ArrayList<>();


    // Add person
    void addPerson(Person person) {

        if (findByPhone(person.getPhone()) != null) {

            System.out.println(
                    "Person with this phone number already exists."
            );

            return;
        }

        people.add(person);

        System.out.println(
                "Person added successfully."
        );
    }


    // Search by phone
    Person findByPhone(String phone) {

        for (Person person : people) {

            if (person.getPhone().equals(phone)) {

                return person;
            }
        }

        return null;
    }


    // Search by name
    void searchByName(String name) {

        boolean found = false;


        for (Person person : people) {

            if (person.getName()
                    .equalsIgnoreCase(name)) {

                person.display();

                found = true;
            }
        }


        if (!found) {

            System.out.println("Person not found.");
        }
    }


    // Search by city
    void searchByCity(String city) {

        boolean found = false;


        for (Person person : people) {

            if (person.getCity()
                    .equalsIgnoreCase(city)) {

                person.display();

                found = true;
            }
        }


        if (!found) {

            System.out.println(
                    "No person found in this city."
            );
        }
    }


    // Edit person
    void editPerson(
            String phone,
            String newName,
            String newCity) {

        Person person = findByPhone(phone);


        if (person == null) {

            System.out.println("Person not found.");

            return;
        }


        person.setName(newName);
        person.setCity(newCity);


        System.out.println(
                "Person updated successfully."
        );
    }


    // Delete person
    void deletePerson(String phone) {

        Person person = findByPhone(phone);


        if (person == null) {

            System.out.println("Person not found.");

            return;
        }


        people.remove(person);

        System.out.println(
                "Person deleted successfully."
        );
    }


    // Display all
    void displayAll() {

        System.out.println("\nAddress Book:");

        for (Person person : people) {

            person.display();
        }
    }


    // Sort by name
    void sortByName() {

        people.sort(
                Comparator.comparing(Person::getName)
        );

        System.out.println(
                "\nAddress book sorted by name."
        );
    }


    public static void main(String[] args) {

        AddressBook book = new AddressBook();


        book.addPerson(
                new Person(
                        "Raj",
                        "Delhi",
                        "9876543210"
                )
        );


        book.addPerson(
                new Person(
                        "Amit",
                        "Mumbai",
                        "9123456789"
                )
        );


        book.addPerson(
                new Person(
                        "Neha",
                        "Delhi",
                        "9988776655"
                )
        );


        // Duplicate phone number
        book.addPerson(
                new Person(
                        "Another Person",
                        "Pune",
                        "9876543210"
                )
        );


        book.displayAll();


        System.out.println("\nSearch by name:");

        book.searchByName("Raj");


        System.out.println("\nSearch by city:");

        book.searchByCity("Delhi");


        book.editPerson(
                "9876543210",
                "Raj Kumar",
                "Chandigarh"
        );


        book.deletePerson("9123456789");


        book.sortByName();

        book.displayAll();
    }
}