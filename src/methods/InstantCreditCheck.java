package methods;

import java.util.Scanner;

/*
 * PASSING ARGUMENTS TO METHODS
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject the others.
 */
public class InstantCreditCheck {

    public static void main(String[] args) {
        // Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        // Check if the user is qualified
        boolean isQualified = isUserQualified(creditScore, salary);
        notifyUser(isQualified);
    }

    public static boolean isUserQualified(int creditScore, double salary) {
        double requiredSalary = 25000;
        int reqiuredCreditScore = 700;

        if (creditScore >= reqiuredCreditScore && salary >= requiredSalary) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified) {
        if (isQualified) {
            System.out.println("You are qualified for the loan!");
        } else {
            System.out.println("Sorry, you are not qualified for the loan.");
        }
    }
}
