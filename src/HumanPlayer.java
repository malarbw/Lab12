import java.util.Scanner;

public class HumanPlayer extends Player {

	@Override
	public void generateRoshambo() {
		Scanner scan = new Scanner(System.in);
		String choice = Validator.getString(scan, "Rock, paper, or scissors? (R|P|S): ");
		choice = choice.toUpperCase();
		switch (choice) {
		case "R":
			String choice1 = "ROCK";
			System.out.println("You played: " + choice1);
			break;
		case "P":
			String choice2 = "PAPER";
			System.out.println("You played: " + choice2);

			break;
		case "S":
			String choice3 = "SCISSORS";
			System.out.println("You played: " + choice3);

			break;

		}
		return;
	}

}
