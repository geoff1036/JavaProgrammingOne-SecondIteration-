//Geoffrey Fuller
package Chapter4;

import java.util.Scanner;

/**
 * Program finds the gross and net pay, the tax removed from the check, and the
 * hours the employee worked
 *
 * @author Geoffrey Fuller
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week:");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double rate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double ftax = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double stax = input.nextDouble();
        double grossPay = rate * hours;
        double fWitholding = grossPay * ftax;
        double sWitholding = grossPay * stax;
        double netPay = grossPay - (fWitholding + sWitholding);

        System.out.printf("\nEmployee Name: %s", name);

        System.out.printf("\nHours Worked: %.2f", hours);

        System.out.printf("\nPayRate: $%.2f", rate);

        System.out.printf("\nGross Pay: $%.2f", grossPay);

        System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (ftax * 100), fWitholding, (stax * 100), sWitholding, (sWitholding + fWitholding));

        System.out.printf("\nNet Pay: $%.2f", netPay);
    }

}
