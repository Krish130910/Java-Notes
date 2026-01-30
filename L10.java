// JAVA NOTES
// Varargs (Variable-Length Arguments) in Java and 2d Arrays in detail

// Varargs 
// it is a feature in Java that allows a method to accept a variable number of arguments of the same type.
// This means that you can pass zero or more arguments to a method without having to overload the method for different numbers of parameters.
// Varargs are defined using an ellipsis (...) after the parameter type in the method signature.
// Syntax of varargs:
// returnType methodName(parameterType... parameterName) {
//     // code block to be executed
// }

// Example of using varargs in Java:
// public class L10 {
//     public static void main(String[] args) {
//         System.out.println(add(1, 2, 3, 4));
        
//     }
//     static int add(int... numbers) {
//             int sum = 0;
//             for (int number : numbers) {
//                 sum += number;
//             }
//             return sum;
//         }
// }

// the above example shows why varargs is better than method overloading.
// Here, we define a method add that takes a variable number of integer arguments using varargs.
// Inside the method, we iterate through the numbers array and calculate the sum of all the integers passed to the method.
// We can call the add method with any number of integer arguments, and it will correctly compute the sum.

// 2D Arrays
// A 2D array is an array of arrays, which means it is a collection of elements arranged in rows and columns.
// It is used to represent a matrix or a table-like structure.
// Syntax to declare and create a 2D array:
// dataType[][] arrayName = new dataType[rows][columns];

// Example of using 2D arrays in Java:
// public class L10 {
//     public static void main(String[] args) {
//         // Declare, create, and initialize a 2D array
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };
//         // Print the elements of the 2D array
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[i].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println(); // New line after each row
//         }
//     }
// }
// In this example, we declare, create, and initialize a 2D array called matrix.
// We then use nested for loops to iterate through the rows and columns of the array and print each element to the console.
// You can also create a 2D array without initializing it and then assign values later:
// int[][] matrix = new int[3][3]; // Creates a 3x3 2D array
// matrix[0][0] = 1; // Assign value to first row, first column
// matrix[0][1] = 2; // Assign value to first row, second column
// and so on...
// You can also use enhanced for loops to iterate through a 2D array:
// for (int[] row : matrix) {
//     for (int element : row) {
//         System.out.print(element + " ");
//     }
//     System.out.println(); // New line after each row
// }
// In this example, we use enhanced for loops to iterate through each row of the matrix and then through each element of the row, printing them to the console.

// Note: In Java, 2D arrays can have rows of different lengths, which are called jagged arrays.
// Example of jagged array:
// int[][] jaggedArray = {
//     {1, 2, 3},
//     {4, 5},
//     {6, 7, 8, 9}
// In this example, the first row has 3 elements, the second row has 2 elements, and the third row has 4 elements.
// You can access and manipulate the elements of a jagged array in the same way as a regular 2D array.
