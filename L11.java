// JAVA NOTES
// Object-Oriented Programming (OOP) Concepts, Constructor

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
