// JAVA NOTES
// Static, Inheritance

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

// Inheritance
// Inheritance is a fundamental object-oriented programming concept that allows a new class (called a subclass or child class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or parent class).
// The subclass can also have its own additional fields and methods, and it can override methods from the superclass to provide specific implementations.
// why to use inheritance?
// Inheritance promotes code reusability, as you can create new classes based on existing ones without having to rewrite code.
// It also helps in creating a hierarchical relationship between classes, making it easier to understand and manage
// class Animal {
//     void eat() {
//         System.out.println("This animal eats food.");
//     }
// }
// class Dog extends Animal {
//     void bark() {
//         System.out.println("The dog barks.");
//     }   
// }
// public class L12 {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat(); // Inherited method from Animal class
//         dog.bark(); // Method from Dog class
//     }
// }
// In this example, the Dog class inherits from the Animal class. The Dog class can use the eat() method defined in the Animal class, as well as its own bark() method.
// When you run the program, it will output:
// This animal eats food.
// The dog barks.
// Extends keyword is used to create a subclass in Java. It indicates that the new class (subclass) is derived from an existing class (superclass).
// The subclass inherits the properties and behaviors of the superclass, allowing for code reuse and the creation of a hierarchical relationship between classes.
// In the example above, the Dog class extends the Animal class, meaning that Dog is a subclass of Animal and inherits its methods and properties.
