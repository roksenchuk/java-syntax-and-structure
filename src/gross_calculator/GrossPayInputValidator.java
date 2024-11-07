package gross_calculator;

import java.util.Scanner;

/*
 * WHILE LOOP
 * Each store employee makes $15 USD an hour. Write a program that allows the employee
 * to enter the number of hours worked for the week. Do not allow overtime
 */
public class GrossPayInputValidator {

    public static void main(String[] args) {
        // Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did employee work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while (hoursWorked > maxHours) {
            System.out.println("Please enter a valid hours worked! The value should be from 1 to 40.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        // Calculate gross
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
