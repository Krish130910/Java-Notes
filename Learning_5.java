// JAVA NOTES
// Nested If Statements and Few String Methods

// Nested if statements are if statements placed inside another if statement.
// They are used to test multiple conditions in a hierarchical manner.
// The syntax for nested if statements is as follows:
// if (condition1) {
//     // code to be executed if condition1 is true
//     if (condition2) {
//         // code to be executed if condition2 is true
//     } else {
//         // code to be executed if condition2 is false
//     }
// } else {
//     // code to be executed if condition1 is false        

// Example of nested if statements:
// public class Learning_5 {
//     public static void main(String[] args) {
//         int number = 10;

//         if (number > 0) {
//             System.out.println("The number is positive.");

//             if (number % 2 == 0) {
//                 System.out.println("The number is even.");
//             } else {
//                 System.out.println("The number is odd.");
//             }
//         } else {
//             System.out.println("The number is not positive.");
//         }
//     }
// }
// In the above example:
// 1. The outer if statement checks if the number is greater than 0.
// 2. If true, it prints "The number is positive." and then checks if the number is even or odd using a nested if statement.
// 3. If the number is even, it prints "The number is even." Otherwise, it prints "The number is odd."
// 4. If the outer if condition is false, it prints "The number is not positive."
// You can have multiple levels of nested if statements, but it's important to keep the code readable and maintainable.
// You can also use else if statements within nested if structures to handle multiple conditions more efficiently.

// Example of nested if-else if statements:
// public class Learning_5 {
//     public static void main(String[] args) {
//         int score = 85;
//         if (score >= 90) {
//             System.out.println("Grade: A");
//         } else if (score >= 80) {
//             System.out.println("Grade: B");
//         } else if (score >= 70) {
//             System.out.println("Grade: C");
//         } else if (score >= 60) {
//             System.out.println("Grade: D");
//         } else {
//             System.out.println("Grade: F");
//         }
//     }
// }
// In this example, we check the score and assign a grade based on the value using else if statements.
// The program prints the corresponding grade based on the score value.

// Note: While nested if statements can be useful, excessive nesting can make code harder to read and maintain.
// It's often better to use logical operators (&&, ||) or switch statements for complex conditions when appropriate.
// Always strive for clean and understandable code!


// String Methods in Java:
// Strings in Java are objects that represent sequences of characters.
// Java provides several built-in methods to manipulate and work with strings.
// Some commonly used string methods include with an example for each:
// public class Learning_5 {
//     public static void main(String[] args) {
//         String name = "John Doe";

//         // 1. length() - returns the length of the string
//         int length = name.length(); 
//         System.out.println(length); // Output: 8 

//         // 2. charAt(int index) - returns the character at the specified index
//         char firstChar = name.charAt(0);
//         System.out.println(firstChar); // Output: J

//         // 3. indexOf(String str) - returns the index of the first occurrence of the specified substring
//        int index = name.indexOf("D");
//        System.out.println(index); // Output: 5

//         // 4. LastIndexOf(String str) - returns the index of the last occurrence of the specified substring
//         int lastIndex = name.lastIndexOf("o");
//         System.out.println(lastIndex); // Output: 7

//         // 5. ToUpperCase() - converts the string to uppercase
//         String upperCaseName = name.toUpperCase();
//         System.out.println(upperCaseName); // Output: JOHN DOE

//        // 6. ToLowerCase() - converts the string to lowercase
//         String lowerCaseName = name.toLowerCase();
//         System.out.println(lowerCaseName); // Output: john doe

//        // 7. Trim() - removes leading and trailing whitespace
//         String stringWithSpaces = "   Hello World!   ";
//         String trimmedString = stringWithSpaces.trim();
//         System.out.println(trimmedString); // Output: Hello World!

//         // 8. Substring(int beginIndex, int endIndex) - returns a substring from the specified begin index to end index
//         String subString = name.substring(0, 4);
//         System.out.println(subString); // Output: John

//         // 9. Replace(CharSequence target, CharSequence replacement) - replaces occurrences of the target sequence with the replacement sequence
//         String replacedString = name.replace("Doe", "Smith");
//         System.out.println(replacedString); // Output: John Smith

//         // 10. isEmpty() - checks if the string is empty
//         boolean isEmpty = name.isEmpty();
//         System.out.println(isEmpty); // Output: false
//     }
// }

// These are just a few examples of the many string methods available in Java.
// You can explore more string methods in the Java documentation to enhance your string manipulation skills.
// Note: String methods are case-sensitive, so be mindful of the case when using them.

// The Substring method will be discussed in detail in the next lesson.