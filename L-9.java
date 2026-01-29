// JAVA NOTES
// Arrays

// Array
// An array is a data structure that can hold multiple values of the same type.
// It is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.
// Each value in an array is called an element, and each element is identified by an index (or subscript).
// In Java, arrays are objects that are dynamically created and can hold primitive data types or objects

// Syntax to declare and create an array:
// dataType[] arrayName = new dataType[arraySize];

// Example of declaring, creating, and initializing an array in Java:
// public class Learning_9 {  
//     public static void main(String[] args) {  
//         // Declare and create an array of integers with size 5  
//         int[] numbers = new int[5];  

//         // Initialize the array elements  
//         numbers[0] = 10;  
//         numbers[1] = 20;  
//         numbers[2] = 30;  
//         numbers[3] = 40;  
//         numbers[4] = 50;  

//         // Access and print the array elements  
//         for (int i = 0; i < numbers.length; i++) {  
//             System.out.println("Element at index " + i + ": " + numbers[i]);  
//         }  
//     }  
// }