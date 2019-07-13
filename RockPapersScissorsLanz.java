
//Gabe Lanz

import java.util.Scanner;

public class RockPapersScissorsLanz {

	public static void main(String[] args) {

		// defines the variable to be used for player inputs
		String player1;
		String player2;

		// prompts player one for their choice of play.
		System.out
				.print("Player 1: Enter R -for Rock, P -for Paper, S -for Scissors, L -for Lizard, or SP -for Spock: ");

		// starts scanner looking for input
		Scanner in = new Scanner(System.in);

		// Assigns player1 input to the variable and converts it to uppercase (for easy
		// comparison).
		
		
			player1 = in.nextLine().toUpperCase();

			// Prompt for player 2 to enter their choice of play.
			System.out.println("Player 2: Enter Rock, Paper, Scissors, Lizard, or Spock");

			// assigns player2 input to variable and converts to uppercase.
			player2 = in.nextLine().toUpperCase();

			// closes scanner looking for input
			in.close();

			/*
			 * loop checking if player2 entered valid selection, no working either??? if
			 * (player2 != ("R")) { System.out.println("Please enter a valid character!!!");
			 * } else if (player2 != ("P")) {
			 * System.out.println("Please enter a valid character!!!"); } else if (player2
			 * != ("S")) { System.out.println("Please enter a valid character!!!"); } else
			 * if (player2 != ("L")) {
			 * System.out.println("Please enter a valid character!!!"); } else if (player2
			 * != ("SP")) { System.out.println("Please enter a valid character!!!"); }
			 */

			// would insert a command to go back to player 2 prompt if no valid input was
			// received.

			// loop to finish game if a tie is encountered.
			if (player1.equals(player2)) {
				System.out.println("Its a tie!");
			}

			// loops to compare player one input vs. player 2 input
			if (player1.equals("P")) {
				if (player2.equals("R"))
					System.out.println("Paper covers Rock, player 1 wins!");
				if (player2.equals("S"))
					System.out.println("Scissors cut Paper, player 2 wins");
				if (player2.startsWith("L"))
					System.out.println("Lizard eats paper, player 2 wins!");
				if (player2.equals("SP"))
					System.out.println("Paper disproves Spock, player 1 wins!");
			} else if (player1.equals("S")) {
				if (player2.equals("R"))
					System.out.println("Rock crushes Scissors, player 2 wins!");
				if (player2.equals("P"))
					System.out.println("Scissors cut Paper, player 1 wins!");
				if (player2.equals("L"))
					System.out.println("Scissors decapitate Lizard, player 1 wins!");
				if (player2.equals("SP"))
					System.out.println("Spock crushes Scissors, player 2 wins!");
			} else if (player1.equals("L")) {
				if (player2.equals("R"))
					System.out.println("Rock crushes Lizard, player 2 wins!");
				if (player2.equals("P"))
					System.out.println("Lizard eats Paper, player 1 wins");
				if (player2.equals("S"))
					System.out.println("Scissors decapitate Lizard, player 2 wins!");
				if (player2.equals("SP"))
					System.out.println("Lizard poisons Spock, player 1 wins");
			} else if (player1.equals("SP")) {
				if (player2.equals("R"))
					System.out.println("Spock vaporizes Rock, player 1 wins!");
				if (player2.equals("P"))
					System.out.println("Paper disproves Spock, player 2 wins!");
				if (player2.equals("S"))
					System.out.println("Spock crushes Scissors, player 1 wins!");
				if (player2.equals("L"))
					System.out.println("Lizard poisons Spock, player 2 wins!");
			
		}
	}
}
