//Geoffrey Fuller
package Chapter4;

import java.util.Scanner;

/**
 * Program accepts two alpha-numeric characters, a letter and a number, and
 * based on the combination you choose, tells you the year and major you are in
 * college
 *
 * @author Geoffrey Fuller
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two character, the first letter of your major and the year you're in.");
        String in = input.nextLine();

        char major = in.charAt(0);
        char year = in.charAt(1);

        String sMajor = "";
        String sYear = "";
        switch (major) {
            case 'M':
                sMajor = "Mathematics";
                break;

            case 'C':
                sMajor = "Computer Science";
                break;

            case 'I':
                sMajor = "Information Technology";
                break;

            default:
                System.out.println("Invalid");
                System.exit(0);
                break;
        }
        switch (year) {
            case '1':
                sYear = "freshman";
                break;
            case '2':
                sYear = "sophomore";
                break;
            case '3':
                sYear = "junior";
                break;
            case '4':
                sYear = "senior";
                break;
            default:
                System.out.println("Invalid");
                System.exit(0);
                break;
        }
        System.out.println(sMajor + " " + sYear);
    }

}
