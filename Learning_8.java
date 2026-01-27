// JAVA NOTES
// Methods, Overloaded Methods and Variable Scope

// Methods: In Java, a method is a block of code that performs a specific task.
// It is a way to organize code into reusable components.
// executed when it is called or invoked.
// Syntax of a method:
// returnType methodName(parameter1Type parameter1, parameter2Type parameter2, ...) {
//     // code block to be executed
//     return returnValue; // if returnType is not void
// }
// Example of defining and calling a method in Java:
// public class Learning_8 {
//     // Method to add two integers and return the result
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         // Calling the add method and storing the result
//         int sum = add(5, 10);
//         System.out.println("Sum: " + sum); // Output: Sum: 15
//     }
// }

// Overloaded Methods
// Method overloading is a feature in java that share the same name but have different parameter lists (different type, number, or both).
// This allows methods to perform similar functions with different types or numbers of inputs.
// signature must be different.
// signature includes the method name and the parameter list.
// Example of method overloading in Java:
// public class Learning_8 {
//     // Overloaded method to add two integers
//     public static int add(int a, int b) {
//         return a + b;
//     }

//     // Overloaded method to add three integers
//     public static int add(int a, int b, int c) {
//         return a + b + c;
//     }

//     // Overloaded method to add two double values
//     public static double add(double a, double b) {
//         return a + b;
//     }

//     public static void main(String[] args) {
//         // Calling the overloaded add methods
//         int sum1 = add(5, 10); // Calls add(int, int)
//         int sum2 = add(5, 10, 15); // Calls add(int, int, int)
//         double sum3 = add(5.5, 10.5); // Calls add(double, double)

//         System.out.println("Sum of two integers: " + sum1); // Output: Sum of two integers: 15
//         System.out.println("Sum of three integers: " + sum2); // Output: Sum of three integers: 30
//         System.out.println("Sum of two doubles: " + sum3); // Output: Sum of two doubles: 16.0
//     }
// }

// Variable Scope
// Variable scope refers to the accessibility of a variable within different parts of a program.
// In Java, variables can have different scopes based on where they are declared:
// 1. Local Scope: Variables declared within a method are local to that method and cannot be accessed outside of it.
// 2. Instance Scope: Variables declared within a class but outside of any method are instance variables and can be accessed by all methods within the class.
// 3. Static Scope: Variables declared with the static keyword are class variables and can be accessed by all static methods within the class.
// class scope is the same as instance scope for non-static variables.
// java will use a local variable first if there is a name conflict between local and instance/static variables.

// Simple Demonstration of all type of scope in Java:
// public class Learning_8 {
//     // Instance variable (Instance Scope)
//     int instanceVar = 10;

//     // Static variable (Static Scope)
//     static int staticVar = 20;

//     // Method to demonstrate Local Scope
//     public void demonstrateScope() {
//         // Local variable (Local Scope)
//         int localVar = 30;
//         System.out.println("Local Variable: " + localVar);
//         System.out.println("Instance Variable: " + instanceVar);
//         System.out.println("Static Variable: " + staticVar);
//     }

//     public static void main(String[] args) {
//         Learning_8 obj = new Learning_8();
//         obj.demonstrateScope();

//         // Accessing instance variable through object
//         System.out.println("Accessing Instance Variable from main: " + obj.instanceVar);

//         // Accessing static variable directly
//         System.out.println("Accessing Static Variable from main: " + staticVar);
//     }
// }