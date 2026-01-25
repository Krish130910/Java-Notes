// JAVA NOTES
// Nested If Statements

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