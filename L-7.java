// JAVA NOTES
// While Loops, For loops, Break/Continue Statements and Nested Loops

// While Loops
// A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
// The while loop can be thought of as a repeating if statement.
// Syntax of while loop:
// while (condition) {
//     // code block to be executed
// }

// Example of using while loop in Java:
// public class Learning_7 {
//     public static void main(String[] args) {
//         int count = 1;

//         // Print numbers from 1 to 5 using while loop
//         while (count <= 5) {
//             System.out.println("Count: " + count);
//             count++; // Increment count by 1
//         }
//     }
// }   

// Example
// import java.util.Scanner;
// public class Learning_7 {  
//     public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in); 

//         String name = "";
//         // Using while loop to prompt user until they enter a non-empty name
//         while (name.isEmpty()) {
//             System.out.print("Enter your name: ");
//             name = scanner.nextLine();
//         }
//         System.out.println("Hello, " + name + "!");
//         scanner.close();
//     }
// }   

// For Loops
// A for loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
// It is typically used when the number of iterations is known beforehand.
// Syntax of for loop:
// for (initialization; condition; update) {
//     // code block to be executed
// }
// Example of using for loop in Java:
// public class Learning_7 {
//     public static void main(String[] args) {
//         // Print numbers from 1 to 5 using for loop
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("i: " + i);
//         }
//    }
// }

// Break and Continue Statements
// The break statement is used to exit a loop or switch statement prematurely.
// The continue statement is used to skip the current iteration of a loop and proceed to the next iteration.
// Shortest Example of using break and continue statements in Java:
// public class Learning_7 {
//     public static void main(String[] args) {
//        // Using break statement
//        for (int i = 1; i <= 10; i++) {
//           if (i == 5) {
//              break; // Exit the loop when i is 5
//           }
//           System.out.println("i: " + i);
//        }
//        System.out.println("Loop exited using break statement.");
//        // Using continue statement
//        for (int j = 1; j <= 10; j++) {
//           if (j % 2 == 0) {
//              continue; // Skip even numbers
//           }
//           System.out.println("j: " + j);
//        }
//     }
// }

// Nested Loops
// A nested loop is a loop inside another loop. The "inner loop" will be executed
// one time for each iteration of the "outer loop".
// Example of using nested loops in Java:   
// public class Learning_7 {
//     public static void main(String[] args) {
//         // Using nested loops to print a multiplication table
//         for (int i = 1; i <= 5; i++) { // Outer loop
//             for (int j = 1; j <= 5; j++) { // Inner loop
//                 System.out.print(i * j + "\t"); // Print product
//             }
//             System.out.println(); // New line after each row
//         }
//     }
// }

// Basically Nested loops are loops inside another loops.
