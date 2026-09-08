class Library {

    void borrowBook(String bookName) {

        System.out.println("Book borrowed: " + bookName);
    }
}


class Student {

    String name;

    Student(String name) {

        this.name = name;
    }

    void borrowBook(Library library, String bookName) {

        System.out.println(name + " is borrowing a book");

        library.borrowBook(bookName);
    }
}


public class Problem08_Association {

    public static void main(String[] args) {

        Student student = new Student("Dhruv");

        Library library = new Library();

        student.borrowBook(library, "Java Basics");
    }
}