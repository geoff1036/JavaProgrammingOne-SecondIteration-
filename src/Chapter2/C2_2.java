//Geoffrey Fuller
package Chapter2;

import java.util.Scanner;

/**
 * Program finds the area and volume of a circle and cylinder using scanners
 *
 * @author Geoffrey Fuller
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter length: ");
        double length = input2.nextDouble();
        double area = radius * radius * 3.14;
        double volume = area * length;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
    }

}
