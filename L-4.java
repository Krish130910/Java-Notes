// JAVA NOTES
// Printf Statement

// In Java, the printf statement is used to format and print text to the console.
// The syntax for the printf statement is as follows:
// %[flags][width][.precision][Specifier-character]
// With printf you have to use \n to print in new line otherwise it will print in the same line.

// Example of using printf in Java:
// public class Learning_4 {
//     public static void main(String[] args) {
//         String name = "John";
//         char firstLetter = 'A';
//         int age = 25;
//         double gpa = 3.75;
//         boolean isStudent = true;

//         System.out.printf("hello %s\n", name); // %s is used for strings
//         System.out.printf("First Letter: %c\n", firstLetter); // %c is used for characters
//         System.out.printf("Age: %d\n", age); // %d is used for integers
//         System.out.printf("GPA: %.2f\n", gpa); // %.2f is used for floating-point numbers with 2 decimal places
//         System.out.printf("Is Student: %b\n", isStudent); // %b is used for boolean values          
//     }
// }

// you can also format multiple variables in a single printf statement:
// public class Learning_4 {
//     public static void main(String[] args) {
//         String name = "John";
//         int age = 25;
//         double gpa = 3.75;
//         System.out.printf("Name: %s, Age: %d, GPA: %.2f\n", name, age, gpa);
//     }
// }

// precision in floating-point numbers specifies the number of digits to be displayed after the decimal point.
// public class Learning_4 {
//     public static void main(String[] args) {
//         double price1 = 9.99;
//         double price2 = 100.15;
//         double price3 = -54.01;
//         System.out.printf("Price 1: %.1f\n", price1); // 1 digit after decimal
//         System.out.printf("Price 2: %.3f\n", price2); // 3 digits after decimal
//         System.out.printf("Price 3: %.2f\n", price3); // 2 digits after decimal
//     }
// }

// Flags in printf are special characters that modify the output format.
// "+" flag forces the output to include a plus sign for positive numbers.
// "," flag adds commas as thousand separators in large numbers.
// ( flag encloses negative numbers in parentheses instead of using a minus sign.
// - flag left-justifies the output within the specified width.
// 0 flag pads the output with leading zeros instead of spaces. 
// # flag is used with floating-point numbers to ensure that a decimal point is always displayed, even if there are no digits after it.
// space flag adds a leading space before positive numbers.
// all in one example of flags:
// public class Learning_4 {
//     public static void main(String[] args) {
//         int number = 12345;
//         double negativeNumber = -9876.543;
//         System.out.printf("Number with plus sign: %+d\n", number); // + flag
//         System.out.printf("Number with commas: %,d\n", number); // , flag
//         System.out.printf("Negative number in parentheses: (%.2f)\n", negativeNumber); // ( flag
//         System.out.printf("Left-justified number: %-10dEND\n", number); // - flag
//         System.out.printf("Number with leading zeros: %010d\n", number); // 0 flag
//         System.out.printf("Floating-point with decimal point: %#.0f\n", negativeNumber); // # flag
//         System.out.printf("Number with leading space: % d\n", number); // space flag
//     }
// }

// Width in printf specifies the minimum number of characters to be printed. 
// If the output is shorter than the specified width, it will be padded with spaces (or zeros if the 0 flag is used).
// 0 = zero padding
// - = left justified padding
// number = right justified padding

// Example of width in printf:
// public class Learning_4 {
//     public static void main(String[] args) {
//         int id1 = 1;
//         int id2 = 23;    
//         int id3 = 456;
//         int id4 = 7890;  
//         System.out.printf("ID1: %05d\n", id1); // Width 5 with leading zeros
//         System.out.printf("ID2: %-5dEND\n", id2); // Width 5 left-justified
//         System.out.printf("ID3: %5d\n", id3); // Width 5 right-justified
//         System.out.printf("ID4: %5d\n", id4); // Width 5 right-justified
//     }
// }   

