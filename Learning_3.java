// JAVA NOTES
// if else Statements, Random Number and Math Class in Java

// In Java, if-else statements are used to perform conditional operations based on whether a certain condition is true or false.

// The syntax for if-else statements is as follows:
// if (condition) {
//     // Code to be executed if the condition is true
// } else {
//     // Code to be executed if the condition is false
// }

// You can also use else if to check multiple conditions:
// if (condition1) {
//     // Code to be executed if condition1 is true
// } else if (condition2) {
//     // Code to be executed if condition2 is true
// } else {
//     // Code to be executed if both conditions are false
// }    

// public class Learning_3 {
//     public static void main(String[] args) {
//         int number = 10;

//         // Check if the number is positive, negative, or zero
//         if (number > 0) {
//             System.out.println(number + " is a positive number.");
//         } else if (number < 0) {
//             System.out.println(number + " is a negative number.");
//         } else {
//             System.out.println("The number is zero.");
//         }
//     }
// }
// In this example, the program checks whether the variable 'number' is positive, negative, or zero and prints the corresponding message.

// Random Number Generation in Java:
// In Java, you can generate random numbers using the java.util.Random class or the Math.random() method.

// import java.util.Random;
// public class Learning_3 {
//     public static void main(String[] args) {
//        Random random = new Random();
//        int number;
//        number = random.nextInt();
//        System.out.println("Random Number: " + number);
//     }
// }

// In this example, we create an instance of the Random class and use the nextInt() method to generate a random integer.
// You can also specify a range for the random number. For example, to generate a random number between 0 (inclusive) and 100 (exclusive):
// int randomNumber = random.nextInt(100); // Generates a number between 0 and 99
// System.out.println("Random Number between 0 and 99: " + randomNumber);

// To generate multiple random numbers, you can assign the random number generation to a variable multiple times.
// import java.util.Random;
// public class Learning_3 {        
//     public static void main(String[] args) {
//        Random random = new Random();
//        int number1 = random.nextInt(100); // First random number between 0 and 99
//        int number2 = random.nextInt(100); // Second random number between 0 and 99
//        System.out.println("First Random Number: " + number1);
//        System.out.println("Second Random Number: " + number2);
//     }
// }
// In this example, we generate two different random numbers between 0 and 99 and print them to the console.

// Not only you can generate random integers, but you can also generate random doubles, booleans, and more using the Random class methods like nextDouble(), nextBoolean(), etc.
// import java.util.Random;
// public class Learning_3 {
//     public static void main(String[] args) {
//        Random random = new Random();
//        double randomDouble = random.nextDouble(); // Generates a random double between 0.0 and 1.0
//        boolean randomBoolean = random.nextBoolean(); // Generates a random boolean value (true or false)
       
//        System.out.println("Random Double: " + randomDouble);
//        System.out.println("Random Boolean: " + randomBoolean);
//     }
// }

// Math Class in Java:
// The Math class in Java provides various mathematical functions and constants.
// Make sure to import java.lang.Math; though it's imported by default.
// also when you use it make sure M is capitalized as Math otherwise it will raise an error.

// to get the value of pi
// double pi = Math.PI;
// System.out.println("Value of Pi: " + pi);

// to get value of e (Euler's number)
// double e = Math.E;
// System.out.println("Value of e: " + e);

// pow method to calculate power
// double power = Math.pow(2, 3); // 2 raised to the power of 3
// System.out.println("2 raised to the power of 3: " + power);

// sqrt method to calculate square root
// double squareRoot = Math.sqrt(16); // Square root of 16
// System.out.println("Square root of 16: " + squareRoot);

// abs method to get absolute value
// int absoluteValue = Math.abs(-10); // Absolute value of -10
// System.out.println("Absolute value of -10: " + absoluteValue);

// round method to round up the answer
// double roundedValue = Math.round(4.6); // Rounds 4.6 to the nearest integer
// System.out.println("Rounded value of 4.6: " + roundedValue);

// ceil method to round up the answer to larger integer
// double ceilValue = Math.ceil(4.2); // Rounds 4.2 up to the nearest integer
// System.out.println("Ceil value of 4.2: " + ceilValue);

// meanwhile floor method is used to round down the answer to smaller integer
// double floorValue = Math.floor(4.8); // Rounds 4.8 down to the nearest integer
// System.out.println("Floor value of 4.8: " + floorValue);

// Max method to get the maximum of two numbers
// double maxValue = Math.max(10, 20); // Gets the maximum of 10 and 20
// System.out.println("Maximum of 10 and 20: " + maxValue);

// Min method to get the minimum of two numbers
// double minValue = Math.min(10, 20); // Gets the minimum of 10 and 20
// System.out.println("Minimum of 10 and 20: " + minValue);

// import java.lang.Math;
// public class Learning_3 {
//     public static void main(String[] args) {
        
//         double result;
//         result = Math.PI;
//         result = Math.E;
//         result = Math.pow(2, 3);
//         result = Math.sqrt(16);
//         result = Math.abs(-10);
//         result = Math.round(4.6);
//         result = Math.ceil(4.2);
//         result = Math.floor(4.8);
//         result = Math.max(10, 20);
//         result = Math.min(10, 20);

//         System.out.println("Final Result: " + result);
//     }
// }
// the final code above demonstrates the use of various Math class methods in Java. Each method is called sequentially, and the final result is printed to the console.

// Method to find the hypotenuse of a right-angled triangle using Math class 
// Basic Formula: hypotenuse = √(sideA² + sideB²)
// import java.lang.Math;
// public class Learning_3 {
//     public static void main(String[] args) {
//         double sideA = 3.0;
//         double sideB = 4.0;

//         // Calculate the hypotenuse using the Pythagorean theorem
//         double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

//         System.out.println("The hypotenuse of the triangle with sides " + sideA + " and " + sideB + " is: " + hypotenuse);
//     }
// }

// Method to find circumference of a circle using Math class
// Basic Formula: circumference = 2 * π * radius
// import java.lang.Math;
// public class Learning_3 {
//     public static void main(String[] args) {
//         double radius = 5.0;

//         // Calculate the circumference using the formula
//         double circumference = 2 * Math.PI * radius;

//         System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
//     }
// }
// the final code above demonstrates how to calculate the circumference of a circle using the Math class in Java. The radius is defined, and the circumference is calculated using the formula 2 * π * radius, with π obtained from Math.PI. The result is then printed to the console.

// Method to find Area 
// area = π * r^2
// import java.lang.Math;
// public class Learning_3 {
//     public static void main(String[] args) {
//         double radius = 5.0;

//         // Calculate the area using the formula
//         double area = Math.PI * Math.pow(radius, 2);

//         System.out.println("The area of the circle with radius " + radius + " is: " + area);
//     }
// }

// Method to find volume of sphere
// volume = (4/3) * π * r^3
// import java.lang.Math;
// public class Learning_3 {
//     public static void main(String[] args) {
//         double radius = 5.0;
//         // Calculate the volume using the formula
//         double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
//         System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
//     }
// }

// method to find simple interest
// simple interest = (P * R * T) / 100
// import java.lang.Math;
// public class Learning_3 {
//     public static void main(String[] args) {
//         double principal = 1000.0; // P
//         double rate = 5.0; // R
//         double time = 3.0; // T in years
//         // Calculate the simple interest using the formula
//         double simpleInterest = (principal * rate * time) / 100.0;
//         System.out.println("The simple interest for principal " + principal + ", rate " + rate + "%, and time " + time + " years is: " + simpleInterest);
//     }
// }
