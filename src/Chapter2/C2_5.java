//Geoffrey
package Chapter2;

import java.util.Scanner;

/**
 * Program calculates an appropriate tip for a service
 *
 * @author Geoffrey Fuller
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("Enter gratuity: ");
        double gratuity = input2.nextDouble();
        double gratuityAmount = subtotal * (gratuity / 100);
        double total = gratuityAmount + subtotal;
        System.out.println("Gratuity is: $" + gratuityAmount);
        System.out.println("Your total is: $" + total);
    }

}
