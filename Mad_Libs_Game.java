import java.util.Scanner;
public class Mad_Libs_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Adjective1;
        String Noun1;
        String Adjective2;
        String Verb1;
        String Adjective3;

        System.out.print("Enter an Adjective (description): "); 
        Adjective1 = scanner.nextLine();   
        System.out.print("Enter a Noun (Animal or Person): "); 
        Noun1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description): "); 
        Adjective2 = scanner.nextLine();
        System.out.print("Enter a Verb end with -ing (Action): "); 
        Verb1 = scanner.nextLine();
        System.out.print("Enter an Adjective (description): "); 
        Adjective3 = scanner.nextLine();

        System.out.println("\nToday i went to a " + Adjective1 + " zoo.");
        System.out.println("In a exhibit, I saw a " + Noun1 + ".");
        System.out.println(Noun1 + " was very " + Adjective2 + " and " + Verb1 + "!");
        System.out.println("I was " + Adjective3 + "!");

















        scanner.close();
    }
} 