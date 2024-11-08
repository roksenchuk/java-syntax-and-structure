package loops;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int runAgain;
        do {
            System.out.println("Enter a first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter a second number: ");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);

            System.out.println("Do you want to continue? Press 1 for Yes, 0 for No");
            runAgain = scanner.nextInt();
        } while (runAgain == 1);
    }
}
