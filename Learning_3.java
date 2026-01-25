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