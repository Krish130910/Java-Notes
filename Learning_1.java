// JAVA NOTES 
// JAVA Introduction, Variables, Data Types, Basic Syntax, Comments and User Input.

// Java is a high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle).
// It is widely used for building web applications, mobile applications, desktop applications, and more.
// Java is platform-independent, meaning that Java code can run on any device with a Java Virtual Machine (JVM) installed.

// to start coding with java, we need two things:
// 1. JDK (Java Development Kit) - to compile and run Java programs\
// 2. IDE (Integrated Development Environment) - to write and manage Java code easily

// A compiler is a program that translates high-level code (like Java) into machine code that the computer can understand
// IDE basically means workspace to write code.

// There are several populart tutorials on youtube for how to install and setup JDK and IDE like IntelliJ IDEA, Eclipse, etc.

// Sample Java Program:
// public class Learnings {
//     public static void main(String[] args) {
//         System.out.println("Hello, Java!");
//     }    
// }

// In the above code:
// 1. 'public class Learnings' defines a class named Learn
// 2. 'public static void main(String[] args)' is the main method where the program execution starts
// 3. 'System.out.println("Hello, Java!");' prints the text "Hello, Java!" to the console   

// public static void main(String[] args) {    "this line is a magic spell to run the program"
// sout + TAB is a shortcut to generate System.out.println() statement quickly.
// you can write println or /n to print in new line.

// Comments in Java:
// to write comments in java use // for single line comments and /* */ for multi line comments.

// Variables and Data Types in Java:
// Variables are used to store data. Each variable has a data type that defines the kind of data it can hold.

// primitive data types means basic data types provided by the programming language.
// primitive data types in Java include:
// 1. int - for integers (whole numbers) 
// 2. double - for floating-point numbers (decimal numbers)
// 3. char - for single characters
// 4. boolean - for true/false values
// 5. float - for single-precision floating-point numbers
// 6. long - for large integers
// 7. short - for smaller range of integers
// 8. byte - for very small integers

// reference data types are more complex data types that refer to objects.
// reference data types in Java include:
// 1. String - for sequences of characters
// 2. Arrays - for collections of data
// 3. objects - instances of classes

// two steps to use a variable:
// 1. Declaration - specifying the variable's name and data type
// 2. Initialization or assignment - assigning a value to the variable

// int age; // Declaration
// age = 25; // Initialization or assignment
// or we can do both in a single line:
// int age = 25; // Declaration and initialization

// float height = 5.9f; // 'f' suffix is used to indicate a float literal
// char grade = 'A'; // char values are enclosed in single quotes
// boolean isStudent = true; // boolean values are either true or false
// double gpa = 3.75; // double values can hold decimal numbers
// long population = 7800000000L; // 'L' suffix is used to indicate a long literal
// short temperature = 30; // short values are smaller range of integers
// byte level = 5; // byte values are very small integers
// void means no value or no return type

// stick to int, double, char, boolean for most basic programming needs.

// string name = "John Doe"; // String values are enclosed in double quotes

// User Input in Java:
// to take user input in Java, we can use the Scanner class from the java.util.scanner package.
// import java.util.Scanner; // import the Scanner class
// Scanner scanner = new Scanner(System.in); // create a Scanner object
// System.out.print("Enter your name: "); // prompt the user for input
// String name = scanner.nextLine(); // read a line of text from the user
// System.out.println("Hello, " + name + "!"); // print a greeting message


// import java.util.Scanner;
// public class Learnings {
//     public static void main(String[] args) {
//         // Create a Scanner object to read user input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for their name
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine(); // Read a line of text from the user

//         // Prompt the user for their age
//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt(); // Read an integer from the user

//         // Prompt the user for their GPA            
//         System.out.print("Enter your GPA: ");
//         double gpa = scanner.nextDouble(); // Read a double from the user

//         // Take boolean input
//         System.out.println("Are you a student? (true/false): ");
//         boolean isStudent = scanner.nextBoolean(); // Read a boolean from the user


//         System.out.println("Hello, " + name + "!");
//         System.out.println("You are " + age + " years old.");
//         System.out.println("Your GPA is: " + gpa);
//         System.out.println("Student status: " + isStudent);

//         // Close the scanner to prevent resource leaks
//         scanner.close();
//     }
// }

// difference between next() and nextline()
// next() reads input until a space is encountered, while nextLine() reads the entire line including spaces.
// in int() if you use float or double value it will give error. use nextFloat() or nextDouble() respectively.

// Common Issues:
//  Scanner scanner = new Scanner(System.in);
//  System.out.print("Enter your age: ");
//  int age = scanner.nextInt();
//  System.out.print("Enter your fav color: ");
//  String color = scanner.nextLine(); // This may skip input

// To fix the above issue, add an extra scanner.nextLine() after reading int or double
//  Scanner scanner = new Scanner(System.in);
//  System.out.print("Enter your age: ");
//  int age = scanner.nextInt();
//  scanner.nextLine(); // Consume the leftover newline
//  System.out.print("Enter your fav color: ");
//  String color = scanner.nextLine(); // Now it works correctly
// Always remember to close the scanner object after use to prevent resource leaks.

// Conclusion
// In this lesson, we covered the basics of Java programming including its introduction, variables, data types, basic syntax, comments, and user input.

