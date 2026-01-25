import java.util.Scanner;

public class ShoppingCart_Prg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currencySymbol = '$';
        double total;

        System.out.println("Welcome to the Shopping Cart Program!");
        System.out.println("--------------------------------------");
        System.out.print("what item do you want to buy?: ");
        item = scanner.nextLine();

        System.out.print("what is the price of " + item + "?: ");
        price = scanner.nextDouble();

        System.out.print("how many " + item + " do you want to buy?: ");
        quantity = scanner.nextInt();
        total = price * quantity;

        System.out.println("\nYou have purchased " + quantity + " " + item + "/s at a price of " + currencySymbol + price + " each.");
        System.out.println("Your total is: " + currencySymbol + total);
        

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}