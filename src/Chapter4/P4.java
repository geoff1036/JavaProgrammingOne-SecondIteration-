//Geoffrey Fuller
package Chapter4;

import java.util.Scanner;

/**
 * The program compares two bidder's bids and decides which of the two bidders
 * won the auction
 *
 * @author Geoffrey Fuller
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.print("What is the first bidder's name? ");
        String nameOne = one.nextLine();
        Scanner oneTwo = new Scanner(System.in);
        System.out.print("How many hours did the first bidder work? ");
        double hoursOne = oneTwo.nextDouble();
        System.out.print("How much do you charger per hour? ");
        double perHour = oneTwo.nextDouble();

        Scanner two = new Scanner(System.in);
        System.out.print("What is the Second bidder's name? ");
        String nameTwo = one.nextLine();
        Scanner twoTwo = new Scanner(System.in);
        System.out.print("How many hours did the second bidder work? ");
        double hoursTwo = twoTwo.nextDouble();
        System.out.print("How much do you charger per hour? ");
        double perHourTwo = twoTwo.nextDouble();
        double costOne = hoursOne * perHour;
        double costTwo = hoursTwo * perHourTwo;
        if (costOne < costTwo) {
            System.out.printf("The winner is " + nameOne + " with a total cost of %.2f", costOne);
        } else if (costTwo < costOne) {
            System.out.printf("The winner is " + nameTwo + " with a total cost of %.2f", costTwo);
        } else if (costOne == costTwo && hoursOne < hoursTwo) {
            System.out.printf("The winner is " + nameOne + " with a total cost of %.2f and" + hoursOne + " hours", costOne);
        } else if (costOne == costTwo && hoursTwo < hoursOne) {
            System.out.printf("The winner is " + nameTwo + " with a total cost of %.2f and" + hoursTwo + " hours", costTwo);
        } else if (costOne == costTwo && hoursOne == hoursTwo) {
            System.out.printf("You have identical bids. Working %.0f hours and %.0f per hour. ", hoursOne, perHour);
            System.out.printf("You have identical bids. Working %.2f hours and %.2f per hour", hoursOne, perHour);
        }
    }
}
