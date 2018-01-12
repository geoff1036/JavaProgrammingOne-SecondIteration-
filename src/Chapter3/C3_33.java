//Geoffrey Fuller
package Chapter3;

import java.util.Scanner;

/**
 * Program compares the value of two products based on weight and price.
 *
 * @author Geoffrey Fuller
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for bag1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for bag 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 / weight1 < price2 / weight2) {
            System.out.println("Bag 1 is the better deal!");
        } else if (price1 / weight1 > price2 / weight2) {
            System.out.println("Bag 2 is the better deal!");
        } else {
            System.out.println("It's the same deal.");
        }
    }

}
