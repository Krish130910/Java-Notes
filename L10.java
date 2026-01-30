// JAVA NOTES
// Varargs (Variable-Length Arguments) in Java

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

// the above example shows why varargs is better than overloaded method.