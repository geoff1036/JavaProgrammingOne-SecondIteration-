package Chapter2;

import java.util.Scanner;

/**
 * Program calculates the total for a meal, including 3 items and the amount of
 * the tip
 *
 * @author Geoffrey Fuller
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter price of food: ");
        double food = input1.nextDouble();
        System.out.println("Enter price of drink: ");
        double drink = input2.nextDouble();
        System.out.println("Enter price of dessert");
        double dessert = input3.nextDouble();
        double foodTotal = food + drink + dessert;
        double presalesTax = foodTotal * 0.10;
        double taxTotal = presalesTax + foodTotal;
        double preTip = taxTotal * 0.15;
        double Total = taxTotal + preTip;
        System.out.println("Food price was: " + foodTotal);
        System.out.println("Tax is: " + presalesTax);
        System.out.println("The tip at 15% come out to be: " + preTip);
        System.out.println("Your total is: " + Total);
    }
}
