// JAVA NOTES
// Printf Statement

// Printf Statement in Java:
// In Java, the printf statement is used to format and print text to the console.
// It allows you to control the layout of the output by specifying format specifiers.
// %[flags][width][.precision][specifier-character]
// the above is the syntax of printf statement

// string name = "John";
// System.out.printf("Hello, %s!", name); // Output: Hello, John!

// the difference between println and printf is that println automatically adds a new line after printing, whereas printf does not unless you explicitly include a newline character (\n) in the format string.
// and also printf allows for formatted output using format specifiers.
// Advantage of Printf over Println:
// 1. Formatted Output: Printf allows you to format the output in a specific way using format specifiers, making it easier to control the appearance of the output.
// 2. Alignment and Padding: You can specify the width and alignment of the output, which is useful for creating tables or aligning text.
// 3. Precision Control: For floating-point numbers, you can control the number of decimal places displayed.
// 4. Multiple Variables: You can print multiple variables in a single printf statement using multiple format specifiers.
// Example of Printf with Multiple Variables and Formatting:
// public class Learning_4 {
//     public static void main(String[] args) {
//         String name = "Alice";
//         int age = 30;
//         double height = 5.7;
//         System.out.printf("Name: %s, Age: %d, Height: %.2f feet\n", name, age, height);
//     }
// }
// In this example, %s is used for the string (name), %d for the integer (age), and %.2f for the floating-point number (height) with 2 decimal places.

// You can also use flags, width, and precision to further format the output.
// Example with Flags, Width, and Precision:
// public class Learning_4 {
//     public static void main(String[] args) {
//         double number = 123.456789;
//         System.out.printf("Formatted Number: %+10.3f\n", number);
//     }
// }
// In this example, %+10.3f formats the number to always show the sign (+), with a total width of 10 characters, and 3 decimal places.
 
// In short printf provides more control over the formatting of the output compared to println, making it a powerful tool for creating well-structured console output.
