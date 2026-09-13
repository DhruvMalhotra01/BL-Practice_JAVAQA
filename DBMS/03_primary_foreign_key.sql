CREATE TABLE Department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL UNIQUE
);
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department_id INT,
    salary DECIMAL(10,2),

    FOREIGN KEY (department_id)
        REFERENCES Department(department_id)
);
INSERT INTO Employee
(id, name, department_id, salary)
VALUES
(1, 'Rahul', 101, 60000),
(2, 'Amit', 102, 50000),
(3, 'Priya', 103, 55000),
(4, 'Neha', 101, 70000);
INSERT INTO Employee
(id, name, department_id, salary)
VALUES
(1, 'Rahul', 101, 60000),
(2, 'Amit', 102, 50000),
(3, 'Priya', 103, 55000),
(4, 'Neha', 101, 70000);