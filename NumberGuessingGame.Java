import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int guess;
        int attempts;
        int randomNumber = random.nextInt(1, 11); // generates a random number between 1 and 10 
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 10. Can you guess it?"); 
        for (attempts = 1; attempts <= 3; attempts++) {
            System.out.print("Enter your guess (Attempt " + attempts + " of 3): ");
            guess = scanner.nextInt();
            
            if (guess == randomNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + randomNumber);
                break;
            } else {
                System.out.println("Wrong guess. Try again!");
            }
        }






        scanner.close();
    }
}