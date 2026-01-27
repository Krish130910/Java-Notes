// JAVA NOTES
// While Loops

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