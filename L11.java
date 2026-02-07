// JAVA NOTES
// Object-Oriented Programming (OOP) Concepts, Constructor, Overloaded Constructor & Array of Objects

// OOP Concepts\
// Object-Oriented Programming (OOP) is a programming paradigm that uses "objects" to represent data and methods to manipulate that data.
// Object is a reference data type
// Class is a blueprint for creating objects

// Example of a simple class and object in Java
// class Car {
//     String color; // Variable to store the color of the car
//     String model; // Variable to store the model of the car
//     int year; // Variable to store the year of the car

//     methods can also be defined here
//     void startEngine() {
//         System.out.println("Engine started");
//     }
// }
// public class L11 {
//     public static void main(String[] args) {
//         Car car = new Car(); // Creating an object of the Car class
//         car.color = "Red"; // Setting the color of the car object
//         car.model = "Toyota"; // Setting the model of the car object
//         car.year = 2020; // Setting the year of the car object
//         System.out.println("Car Color: " + car.color); // Accessing the color of the car object
//         System.out.println("Car Model: " + car.model); // Accessing the model of the car object
//         System.out.println("Car Year: " + car.year); // Accessing the year of the car object
//         car.startEngine(); // Calling the method to start the engine
//     }
// }
// the above code demonstrates the basic concepts of Object-Oriented Programming (OOP) in Java by defining a class and creating an object of that class.                    

// Constructor
// A constructor is a special method that is called when an object is instantiated. It is used to initialize the object's properties.
// A constructor has the same name as the class and does not have a return type.
// to give unique values to different objects of the same class, we use constructors
// Syntax of Constructor:
// class ClassName {
//     // properties
//    ClassName(parameters) {
//         // initialization code
//     }
// }

// public class Student {
//     String name;
//     int age;
//     double grade;
//     boolean isPassed;
//     // Constructor to initialize the properties of the Student class
//     Student(String name, int age, double grade, boolean isPassed) {
//         this.name = name; // 'this' keyword is used to refer to the current object's properties
//         this.age = age;
//         this.grade = grade;
//         this.isPassed = grade >= 50; // Determine if the student has passed based on the grade
//     }
//     public static void main(String[] args) {
//         // Creating objects of the Student class using the constructor
//         Student student1 = new Student("Alice", 20, 85.5, true);
//         Student student2 = new Student("Bob", 22, 45.0, false);
//         // Displaying the properties of the student objects
//         System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", Grade: " + student1.grade + ", Passed: " + student1.isPassed); 
//         System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", Grade: " + student2.grade + ", Passed: " + student2.isPassed);
//     }
// }
// the above code demonstrates the use of constructors in Java to initialize the properties of objects when they are created.

// Overloaded Constructor
// Constructor Overloading is a technique in Java where a class can have multiple constructors with different parameter lists.
// This allows for different ways to initialize objects of the class.
// Example of Overloaded Constructor:
// class Rectangle {
//     int length;
//     int width;

//     // Default constructor
//     Rectangle() {
//         this.length = 1; // Default length
//         this.width = 1;  // Default width
//     }

//     // Parameterized constructor
//     Rectangle(int length, int width) {
//         this.length = length; // Initialize length with provided value
//         this.width = width;   // Initialize width with provided value
//     }

//     // Method to calculate area of the rectangle
//     int area() {
//         return length * width;
//     }
// }
// public class L11 {
//     public static void main(String[] args) {
//         // Creating an object using the default constructor
//         Rectangle rect1 = new Rectangle();
//         System.out.println("Area of rect1 (default): " + rect1.area()); // Output: 1

//         // Creating an object using the parameterized constructor
//         Rectangle rect2 = new Rectangle(5, 10);
//         System.out.println("Area of rect2 (5x10): " + rect2.area()); // Output: 50
//     }
// }
// the above code demonstrates constructor overloading in Java by defining multiple constructors in the Rectangle class to initialize objects in different ways.

// Array of Objects
// An array of objects is a collection that can hold multiple objects of the same class type.
// array of objects allows you to manage and manipulate multiple instances of a class efficiently.

// Example of Array of Objects:
// class Book {
//     String title;
//     String author;
//     int year;
//     // Constructor to initialize the properties of the Book class
//     Book(String title, String author, int year) {
//         this.title = title;
//         this.author = author;
//         this.year = year;
//     }
// }
// public class L11 {
//     public static void main(String[] args) {
//         // Creating an array to hold 3 Book objects
//         Book[] library = new Book[3];
//         // Initializing the Book objects and adding them to the array
//         library[0] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
//         library[1] = new Book("1984", "George Orwell", 1949);
//         library[2] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
//         // Displaying the details of each book in the library
//         System.out.println("Library Books:");
//         for (int i = 0; i < library.length; i++) {
//             System.out.println("Title: " + library[i].title + ", Author: " + library[i].author + ", Year: " + library[i].year);
//         }
//     }
// }
// the above code demonstrates how to create and use an array of objects in Java by defining a Book class and storing multiple Book objects in an array.
