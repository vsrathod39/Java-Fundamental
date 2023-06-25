package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 15;
        double maxHours = 40;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        while(hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hors must be less than or equal to " + maxHours + ". Please enter again.");
            hoursWorked = scanner.nextDouble();
        };
        System.out.println("Gross pay: " + (rate * hoursWorked));
    }
}
