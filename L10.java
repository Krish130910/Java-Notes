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
        
//         String[][] groceries = {{"apple", "banana", "cherry"}, {"bread", "butter", "jam"}, {"carrot", "broccoli", "spinach"}};

//        groceries[0][1] = "mango";

//        for(String[] foods : groceries) {
//            for(String food : foods) {
//                System.out.print(food + " ");
//            }
//            System.out.println(); 
//        }
//     }
// }