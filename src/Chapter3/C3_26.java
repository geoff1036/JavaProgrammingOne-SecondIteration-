//Geoffrey Fuller
package Chapter3;

import java.util.Scanner;

/**
 * Program relates a user input number to a set of pre-requisites and tells the
 * user whether it meets the pre-requisites, narrowing it down to one of three
 * options
 *
 * @author Geoffrey Fuller
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("Is " + num + " divisible by 5 and 6?");
        if ((num % 5 == 0) && (num % 6 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //----------------------------------
        System.out.println("Is " + num + " divisible by 5 or 6?");
        if ((num % 5 == 0) || (num % 6 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //----------------------------------
        System.out.println("Is " + num + " divisible by 5 or 6, but not both?");
        if ((num % 5 == 0) ^ (num % 6 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
