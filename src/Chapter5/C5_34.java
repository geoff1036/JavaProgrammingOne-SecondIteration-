
package Chapter5;
import java.util.Scanner;
/**
 * Program accepts two alpha-numeric characters, a letter and a number, and
 * based on the combination you choose, tells you the year and major you are in
 * college
 *
 * @author Geoffrey Fuller
 */
public class C5_34 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
        public static void main(String[] args){
        int compWins = 0;
        int userWins = 0;
        
        while (userWins != compWins * 2 && compWins != userWins * 2 || userWins == 0 && compWins == 0)
        {
            int computerHand = (int) (Math.random() * 3);
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
            int playerHand = input.nextInt();

            String computer = getHand(computerHand);
            String player = getHand(playerHand);
            String gameStats = getGameStatus(computerHand, playerHand);

            if (gameStats.equals("You won")) userWins++;

            if (gameStats.equals("You lost")) compWins++;

            System.out.println("The computer is " + computer + ". You are " + player + ". " + gameStats+ ".");
        }

        if (userWins > compWins)
        {
            System.out.println("You won! " + "Player wins: " + userWins +" Computer wins: " + compWins);
        } 
        else
        {
            System.out.println("You lost... " + "Player wins: " + userWins +" Computer wins: " + compWins);

        }

    }

    public static String getHand(int hand)
    {

        String handGuess;
        switch (hand) {
            case 0: handGuess = "Scissors";
            break;
            case 1: handGuess = "Rock";
            break;
            case 2: handGuess = "Paper";
            break;
            default:
                handGuess = null;
        }
        return handGuess;
    }

    public static String getGameStatus(int computer, int player)
    {
        if (computer == player) return "It's a draw";

        String status = "";
        switch (player) {
            case 0: status = (computer != 1) ? "You won" : "You lost"; break;
            case 1: status = (computer != 2) ? "You won" : "You lost"; break;
            case 2: status = (computer != 0) ? "You won" : "You lost"; break;
        }

        return status;
    }

}
