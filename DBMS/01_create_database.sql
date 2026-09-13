CREATE DATABASE CompanyDB;

USE CompanyDB;

CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    department VARCHAR(100),
    salary DECIMAL(10,2)
);