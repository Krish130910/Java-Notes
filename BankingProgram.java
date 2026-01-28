import java.util.Scanner;
public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    
    double balance = 0.0;
    boolean isRunning = true;
    int choice;

    while (isRunning) {
        System.out.println("Welcome to the Banking Program!");
    System.out.println("1. Show Balance");
    System.out.println("2. Deposit Money");
    System.out.println("3. Withdraw Money");
    System.out.println("4. Exit");

    System.out.print("Please enter your choice (1-4): ");
    choice = scanner.nextInt();

    switch (choice) {
        case 1 -> showBalance(balance); 
        case 2 -> balance += depositMoney();
        case 3 -> balance -= withdraw(balance);
        case 4 -> {
            exit();
            isRunning = false;
        }   
        default -> System.out.println("Invalid choice. Please try again.");
    }
    }
    System.out.println("Thank you for using the Banking Program. Goodbye!");
    scanner.close();
    }
    static void showBalance(double balance) {
        System.out.printf("Your current balance is: $%f\n", balance);
    }
    static double depositMoney() {
        double amount;
        System.out.printf("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance) {
            System.out.println("Insufficient funds.");
            return 0;
        }
        else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return 0;
        }
        else {
            return amount;
        }
    }
    static void exit() {
        System.out.println("Exiting the program...");
    }
}