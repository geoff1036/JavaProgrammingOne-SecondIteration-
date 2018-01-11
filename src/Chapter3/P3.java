//Geoffrey Fuller
package Chapter3;

import java.util.Scanner;

/**
 * Program takes two numbers and runs them through a series of tests and then at
 * the end displays which tests they passed
 *
 * @author Geoffrey Fuller
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter a number: ");
        double num2 = input.nextDouble();
        if (num1 < num2) {
            System.out.println("The first number is less than the second.");
        } else if (num1 > num2) {
            System.out.println("The first number is greater than the second.");
        } else if (num1 == num2) {
            System.out.println("The first number is equal to the second.");
        }
        if (num1 <= num2) {
            System.out.println("The first number is less than or equal to the second");
        }
        if (num1 != num2) {
            System.out.println("The first number is not equal to the second");
        }
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
        }
        if ((num1 / num2) < 1 && (num2 != 0)) {
            System.out.println("Proper fraction");
        }
        if ((num1 / num2) > 1 && (num2 != 0)) {
            System.out.println("Improper fraction");
        }
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80 && num1 < 90) {
            System.out.println("B");
        } else if (num1 >= 70 && num1 < 80) {
            System.out.println("C");
        } else if (num1 >= 60 && num1 < 70) {
            System.out.println("D");
        } else if (num1 < 60) {
            System.out.println("F");
        }
        if (num2 >= 1 && num2 <= 100) {
            System.out.println("In range");
        } else if (num2 < 1 && num2 > 100) {
            System.out.println("Out of range");
        }
    }
}
