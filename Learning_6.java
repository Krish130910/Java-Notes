// JAVA NOTES
// Substring Method and Ternary Operator

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

