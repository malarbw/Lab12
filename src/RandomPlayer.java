import java.util.Random;

public class RandomPlayer extends Player {

	@Override
	public void generateRoshambo() {
		Random random = new Random();
		int randomNumber = 1 +  (int)(Math.random()*(3));		
		switch(randomNumber) {
		case 1:
			String choice1 = "ROCK";
			System.out.println("The Boulder played: " + choice1);
			break;
		case 2:
			String choice2 = "PAPER";
			System.out.println("The Boulder played: " + choice2);
			break;
		case 3:
			String choice3 = "SCISSORS";
			System.out.println("The Boulder played: " + choice3);
			break;
		}

	}

}
