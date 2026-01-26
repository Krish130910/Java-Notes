import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("Temperature Converter Program");
        System.out.println("Enter temperature (e.g., 100C or 212F): ");
        temp = scanner.nextDouble();

        System.out.print("Convert to (C/F): ");
        unit = scanner.next().toUpperCase();  
        
        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;
        System.out.printf("%.1f° %s", newTemp, unit);

        scanner.close();
    }
}
