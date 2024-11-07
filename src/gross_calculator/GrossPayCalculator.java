package gross_calculator; // package declaration

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1. Get the number of hours worked
        int hours;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 25.50;

        //3. Multiply hours and pay rate
        double grossPay = hours * payRate;

        //4. Display result
        System.out.println("Gross pay: " + grossPay);
    }
}
