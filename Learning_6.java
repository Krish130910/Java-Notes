// JAVA NOTES
// Substring Method, Ternary Operator, Enhanced switches and logical operators

// Substring method is used to extract a portion of a string based on specified indices.
// Syntax for substring method:
// String.substring(start, end)
// - start: The starting index (inclusive) from where the substring begins.
// - end: The ending index (exclusive) where the substring ends.
// Substring return a new string that contains the characters from the original string starting from the 'start' index up to, but not including, the 'end' index

// Example of using substring method in Java:
// public class Learning_6 {
//     public static void main(String[] args) {
//         String email = "Bro123@gmail.com";
//         String username = email.substring(0, 6); // Extracts "Bro123"
//         String UName = email.substring(0, email.indexOf("@")); // Extracts "Bro123"
//         String DName = email.substring(email.indexOf("@") + 1); // Extracts "gmail.com" 
//         String Dnamee = email.substring(email.indexOf("@")); // Extracts "@gmail.com"
//         String domain = email.substring(6); // Extracts "gmail.com" (from index 6 to the end of the string)
//         System.out.println("Username: " + username);
//         System.out.println("Domain: " + domain);
//         System.out.println("UName: " + UName);
//         System.out.println("Dnamee: " + Dnamee);
//         System.out.println("DName: " + DName);
//     }
// }
// In this example, we extract the username and domain from an email address using the substring method.

// More SUbstring Examples:
// public class Learning_6 {
//     public static void main(String[] args) {
//         String str = "Hello, World!";
        
//         // Extracting "Hello"
//         String hello = str.substring(0, 5);
//         System.out.println(hello); // Output: Hello
        
//         // Extracting "World"
//         String world = str.substring(7, 12);
//         System.out.println(world); // Output: World
        
//         // Extracting from index 7 to the end
//         String fromIndex7 = str.substring(7);
//         System.out.println(fromIndex7); // Output: World!
//     }
// }

// Ternary Operator In java
// The ternary operator is a shorthand way of writing an if-else statement.
// It takes three operands: a condition, a value if the condition is true, and a value if the condition is false.
// Syntax of the ternary operator:
// condition ? valueIfTrue : valueIfFalse;
// Basically ternary operator is the short form of if-else statement

// Example of using the ternary operator in Java:
// public class Learning_6 {
//     public static void main(String[] args) {
//         int number = 10;
//         String result = (number % 2 == 0) ? "Even" : "Odd";
//         System.out.println("The number is " + result); // Output: The number is Even
//    } 
// }
// In this example, we check if a number is even or odd using the ternary operator.

// Enhanced Switches in Java
// Enhanced switches were introduced in Java 12 and provide a more concise way to write switch statements.
// Example of using enhanced switches in Java:
// public class Learning_6 {
//     public static void main(String[] args) {
//         int day = 3;
//         String dayName = switch (day) {
//             case 1 -> "Monday";
//             case 2 -> "Tuesday";
//             case 3 -> "Wednesday";
//             case 4 -> "Thursday";
//             case 5 -> "Friday";
//             case 6 -> "Saturday";
//             case 7 -> "Sunday";
//             default -> "Invalid day";
//         };
//         System.out.println("Day " + day + " is " + dayName); // Output: Day 3 is Wednesday
//     }
// }

// other format of enhanced switch
// import java.util.Scanner;
// public class Learning_6 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a day abbreviation (e.g., mon, tue): ");
//         String day = scanner.nextLine().toLowerCase();

//         String dayName = switch (day) {
//           case "mon", "tue", "wed", "thu", "fri" -> "Weekday";
//           case "sat", "sun" -> "Weekend";
//           default -> "Invalid day"; 
//         };

//         System.out.println("Day " + day + " is " + dayName); // Output: Day 3 is Wednesday
    
//         scanner.close();
//     }
// } 

// Logical Operators in Java
// Logical operators are used to combine multiple boolean expressions or conditions.
// The main logical operators in Java are:
// 1. AND (&&): Returns true if both operands are true.
// 2. OR (||): Returns true if at least one of the operands is true.
// 3. NOT (!): Returns true if the operand is false, and false if the operand is true.

// Example of AND(&&) logical operator in Java:
// public class Learning_6 {
//     public static void main(String[] args) {
//         int age = 25;
//         boolean hasID = true;
//         if (age >= 18 && hasID) {
//             System.out.println("You are eligible to vote.");
//         } else {
//             System.out.println("You are not eligible to vote.");
//         }
//     }
// }

// Example of OR(||) logical operator in Java:
// public class Learning_6 {
//     public static void main(String[] args) {
//         String role = "admin";
//         if (role.equals("admin") || role.equals("moderator")) {
//             System.out.println("Access granted.");
//         } else {
//             System.out.println("Access denied.");
//         }
//     }
// }

// Example of NOT(!) logical operator in Java:
// public class Learning_6 {
//     public static void main(String[] args) {
//         boolean isRaining = false;
//         if (!isRaining) {
//             System.out.println("It's a sunny day!");
//         } else {
//             System.out.println("Don't forget your umbrella.");
//         }    
//    }
// }

