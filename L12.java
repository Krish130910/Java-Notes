// JAVA NOTES
// Static

// Static
// Static variables and methods belong to the class rather than to any specific instance of the class. 
// They can be accessed without creating an object of the class.
// Static members are shared among all instances of the class, meaning that they have the same value for all objects.
// why to use static?
// lets understand with an example
// class Counter {
//     // Static variable to keep track of the number of instances
//     static int instanceCount = 0;

//     // Constructor
//     Counter() {
//         // Increment the static variable each time a new instance is created
//         instanceCount++;
//     }

//     // Static method to get the current count of instances
//     static int getInstanceCount() {
//         return instanceCount;
//     }
// }
// public class L12 {
//     public static void main(String[] args) {
//         // Creating instances of Counter
//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//         // Accessing the static method to get the instance count
//         System.out.println("Number of instances created: " + Counter.getInstanceCount());
//     }
// }
// In this example, the static variable instanceCount keeps track of how many instances of the Counter class have been created.
// Each time a new Counter object is instantiated, the constructor increments this static variable.
// The static method getInstanceCount() allows us to access the current count of instances without needing to create an object of the Counter class.
// When you run the program, it will output:
// Number of instances created: 3
// This demonstrates how static members can be used to share data across all instances of a class.
// Output:
// Number of instances created: 3
