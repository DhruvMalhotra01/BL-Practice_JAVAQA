CREATE TABLE Book (
    book_id INT PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(150),
    price DECIMAL(10,2)
);

CREATE TABLE Member (
    member_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE,
    phone VARCHAR(20)
);

CREATE TABLE Librarian (
    librarian_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) UNIQUE
);
CREATE TABLE BookIssue (
    issue_id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT NOT NULL,
    member_id INT NOT NULL,
    librarian_id INT NOT NULL,
    issue_date DATE NOT NULL,
    return_date DATE,

    FOREIGN KEY (book_id)
        REFERENCES Book(book_id),

    FOREIGN KEY (member_id)
        REFERENCES Member(member_id),

    FOREIGN KEY (librarian_id)
        REFERENCES Librarian(librarian_id)
);