package Chapter6;
/**
 * Program checks a password for validity and security
 *
 * @author Geoffrey Fuller
 */
import java.util.Scanner;
public class C6_18 {
            /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);	
		System.out.print("Enter a password: ");
		String password = input.nextLine();
		System.out.println(
			(isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
	}
	public static boolean isValidPassword(String password)
        {
		final int validLength = 8;	
	   final int minDigits = 2;	
		boolean validPassword = 
			isLengthValid(password, validLength) && 
			isOnlyLettersAndDigits(password) &&
			hasNDigits(password, minDigits);

		return validPassword;
	}
	public static boolean isLengthValid(String password, int validLength)
        {
		return password.length() >= validLength;
	}
	public static boolean isOnlyLettersAndDigits(String password)
        {
		for (int i = 0; i < password.length(); i++)
                {
			if (!Character.isLetterOrDigit(password.charAt(i)))
                        {
                        return false;
			}
		}
		return true;
	}
	public static boolean hasNDigits(String password, int n)
        {
		int numberOfDigits = 0;
		for (int i = 0; i < password.length(); i++)
                {
			if (Character.isDigit(password.charAt(i)))
                        {
				numberOfDigits++;
			}
			if (numberOfDigits >= n)
                        {
				return true;
			}
		}
		return false;
    }

}
