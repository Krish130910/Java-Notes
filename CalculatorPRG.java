import java.util.Scanner;

public class CalculatorPRG {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;

            case '/' -> {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
            }

            default -> {
                System.out.println("Error: Invalid operator.");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
