/*
 * Brad Malarkey
 * 
 * Lab 12 -- Roshambo app. Meant to spend some time before class today trying to fix some of the issues
 * but my commute took longer than expected. Couldn't figure out how to really compare the results.
 */


import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Player opponent = null;
		HumanPlayer player3 = new HumanPlayer();
		String cont = "y";

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();
		String userName = Validator.getString(scan, "Enter your name: ");
		player3.setName(userName);
		System.out.println();

		while (cont.equalsIgnoreCase("y")) {
			System.out.println("Please select The Rock (1) or The Boulder (2): ");
			int computerPlyr = scan.nextInt();

			if (computerPlyr == 1) {
				opponent = new TheRock();
				player3.generateRoshambo();
				opponent.generateRoshambo();

				if (player3 == opponent) {
					System.out.println("It's a draw!");
				} else {
					System.out.println("You lose!");

				}

			} else if (computerPlyr == 2) {
				opponent = new RandomPlayer();
				player3.generateRoshambo();
				opponent.generateRoshambo();

				if (player3 == opponent) {
					System.out.println("It's a draw!");
				} else {
					System.out.println("You lose!");

				}
			}
			System.out.println();
			cont = Validator.getString(scan, "Would you like to play again?");
		}
	}

}
