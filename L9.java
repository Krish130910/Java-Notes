// JAVA NOTES
// Arrays, User Input In Arrays and Searching In Arrays

// Array
// An array is a data structure that can hold multiple values of the same type.
// It is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
// Each value in an array is called an element, and each element is identified by an index (or subscript).
// In Java, arrays are objects that are dynamically created and can hold primitive data types or objects

// Syntax to declare and create an array:
// dataType[] arrayName = new dataType[arraySize];

// import java.util.Arrays;
// public class Learning_9 {  
//     public static void main(String[] args) {  
//         // Declare, create, and initialize an array of strings  
//         String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};   

//        fruits[1] = "Mango";

//        int numberOfFruits = fruits.length;
//        System.out.println("Number of fruits: " + numberOfFruits); // Output: Number of fruits: 5

//       for(int i = 0; i < fruits.length; i++) {
//           System.out.println("Fruit at index " + i + ": " + fruits[i]);
//       }
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));

//        Arrays.fill(fruits, "Kiwi");
//        System.out.println(Arrays.toString(fruits));
//     }
// }
// in the above example, we declare, create, and initialize an array of strings called fruits.  
// We then modify an element, get the length of the array, iterate through the elements using a for loop, sort the array, and fill the array with a specific value using methods from the Arrays class.

// public class Learning_9 {
//     public static void main(String[] args) {
//         String[] foods = new String[4];
//         foods[0] = "Pizza";
//         foods[1] = "Burger";
//         foods[2] = "Pasta";
//         foods[3] = "Salad";
//         for(String food : foods)
//             System.out.println(food);
//     }
// }

// User Input in Arrays
// import java.util.Scanner;
// public class Learning_9 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String[] foods;
//         int size;
        
//         System.out.println("what are your favorite foods?");
//         size = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character
//         foods = new String[size];

//         for(int i = 0; i < foods.length; i++) {
//             System.out.print("Enter food item: ");
//             foods[i] = scanner.nextLine();
//         }

//         for(String food : foods)
//             System.out.println(food);

//         scanner.close();
//     }
// }
// the above example demonstrates how to take user input to populate an array in Java.
// key points:
// 1. We import the Scanner class to read user input.
// 2. We prompt the user to enter the size of the array and create the array accordingly.
// 3. We use a for loop to iterate through the array indices and take input for each element using scanner.nextLine().
// 4. Finally, we print the contents of the array using an enhanced for loop.
// Note: Always remember to close the scanner object after use to prevent resource leaks.

// Searching in Arrays
// public class L9 {
//     public static void main(String[] args) {
//         String[] foods = {"Pizza", "Burger", "Pasta", "Salad", "Sushi"};
//         String targetFood = "Pasta";
//         boolean found = false;

//         for(String food : foods) {
//             if(food.equals(targetFood)) {
//                 found = true;
//                 break;
//             }
//         }

//         if(found) {
//             System.out.println(targetFood + " is found in the array.");
//         } else {
//             System.out.println(targetFood + " is not found in the array.");
//         }
//     }
// }
// Here in the above example, we search for a specific food item ("Pasta") in the foods array.
// We use a for-each loop to iterate through each element in the array and check if it matches the target food using the equals() method.
// If a match is found, we set the found flag to true and break out of the loop.
// Finally, we check the found flag and print whether the target food was found in the array or not.