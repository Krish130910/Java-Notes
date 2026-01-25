// Compound Interest Calculator
// Basic Formula: A = P (1 + r/n)^(nt)

import java.util.Scanner;
public class CompoundIntCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount (P): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage, e.g., 5 for 5%): ");
        rate = scanner.nextDouble() / 100; // Convert percentage to decimal

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years the money is invested (t): ");
        years = scanner.nextInt();

        // Calculate the amount using the compound interest formula
        amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);
        System.out.printf("The amount after %d years is $%.2f", years, amount); 

        scanner.close();
    }
}
