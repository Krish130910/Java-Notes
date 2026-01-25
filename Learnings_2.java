// JAVA NOTES
// Recalling User Input in Java, Arithmetic Operators, Augmented Assignment Operators and Increment and Decrement Operators

// Program to calculate the area of a rectangle
// import java.util.Scanner;
// public class Learnings_2 {
//     public static void main(String[] args) {
//         // Create a Scanner object to read user input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for the length of the rectangle
//         System.out.print("Enter the length of the rectangle: ");
//         double length = scanner.nextDouble(); // Read a double from the user

//         // Prompt the user for the width of the rectangle
//         System.out.print("Enter the width of the rectangle: ");
//         double width = scanner.nextDouble(); // Read a double from the user

//         // Calculate the area of the rectangle
//         double area = length * width;

//         // Display the area
//         System.out.println("The area of the rectangle is: " + area);

//         // Close the scanner to prevent resource leaks
//         scanner.close();
//     }
// }

// the above program was there to recall previous leesson of user input

//Arithmetic Operator 
// public class Learnings_2 {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 3;

//         // Addition
//         int sum = a + b;
//         System.out.println("Sum: " + sum);

//         // Subtraction
//         int difference = a - b;
//         System.out.println("Difference: " + difference);

//         // Multiplication
//         int product = a * b;
//         System.out.println("Product: " + product);

//         // Division
//         int quotient = a / b;
//         System.out.println("Quotient: " + quotient);

//         // Modulus
//         int remainder = a % b;
//         System.out.println("Remainder: " + remainder);
//     }
// }

// Augmented Assignment Operators
// public class Learnings_2 {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;
        
//         a += 3; // Equivalent to a = a + 3
//         System.out.println("After a += 3, a = " + a);

//         b -= 4; // Equivalent to b = b - 4
//         System.out.println("After b -= 4, b = " + b);

//         a *= 2; // Equivalent to a = a * 2
//         System.out.println("After a *= 2, a = " + a);

//         b /= 3; // Equivalent to b = b / 3
//         System.out.println("After b /= 3, b = " + b);

//         a %= 4; // Equivalent to a = a % 4
//         System.out.println("After a %= 4, a = " + a);
//     }
// }

// The above program demonstrates the use of augmented assignment operators in Java.
// how its different from arithmetic operators?
// Augmented assignment operators combine an arithmetic operation with assignment, allowing for more concise code.
// For example, a += 3 is a shorthand for a = a + 3.
// Similarly, other augmented assignment operators work in the same way for their respective arithmetic operations.

// in division operator it performs integer division when both operands are integers.
// For example, 10 / 3 results in 3, discarding the decimal part.
// To perform floating-point division and get a decimal result, at least one operand must be a floating-point number (float or double).
// For example, 10.0 / 3 or 10 / 3.0
// public class Learnings_2 {
//     public static void main(String[] args) {
//         double a = 10;
//         double b = 3;

//         // Floating-point Division
//         double quotient = a / b;
//         System.out.println("Floating-point Quotient: " + quotient);
//     }
// }
// This will output: Floating-point Quotient: 3.3333333333333335
// Here, since 'a' and 'b' are of type double, the division operation yields a floating-point result.
// If either 'a' or 'b' were integers, the result would be an integer division.
// Thus, to get a decimal result in division, ensure at least one operand is a floating-point type.

// Increment and Decrement Operators
// int x = 5;
// x = x + 1; // Increment by 1
// x++; // Increment by 1 using increment operator
// in the above both statements will result in x being 6

// x = x - 1; // Decrement by 1
// x--; // Decrement by 1 using decrement operator
// in the above both statements will result in x being 4

// Order of Operations: [P-E-M-D-A-S]
// public class Learnings_2 {
//     public static void main(String[] args) {
//         int result = 10 + 5 * 2; // Multiplication first, then addition
//         System.out.println("Result without parentheses: " + result); // Outputs 20

//         result = (10 + 5) * 2; // Parentheses first, then multiplication
//         System.out.println("Result with parentheses: " + result); // Outputs 30
//     }
// }
// This program demonstrates the order of operations in Java.
// In the first calculation, multiplication is performed before addition, resulting in 20.
// In the second calculation, the parentheses change the order, causing the addition to be performed first, resulting in 30.
// Remember to always use parentheses to make your intended order of operations clear!
