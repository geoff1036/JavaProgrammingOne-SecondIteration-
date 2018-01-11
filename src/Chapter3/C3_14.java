//Geoffrey Fuller
package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Program allows user to guess "heads" or "tails" and then relates that answer
 * to a randomly generated outcome, notifying the user of whether or not they
 * were right
 *
 * @author Geoffrey Fuller
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess as a 1 for heads or a 0 for tails: ");
        int Guess;
        Guess = input.nextInt();

        Random randomNumber = new Random();
        int Number = randomNumber.nextInt(2) + 1;
        if (Guess == Number) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You guessed incorrectly.");
        }
    }

}
