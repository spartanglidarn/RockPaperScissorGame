import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner nrOfRounds = new Scanner(System.in);
		System.out.print("How many rounds ");
		int rounds = nrOfRounds.nextInt();
		System.out.println("Game started");

		ArrayList<String> choices = new ArrayList<String>();
		ArrayList<String> results = new ArrayList<String>();
		int roundNr = 0;

		while (roundNr < rounds) {

			// Takes user input rock, paper or scissor and adds it to an
			// arrayList
			Scanner userInput = new Scanner(System.in);
			System.out.println("Make your choice for round " + (roundNr + 1) + ": ");
			String userChoice = userInput.next();
			choices.add(userChoice);

			// Creates a random number between 1 and 3 and then assaign a choice
			// to each value.
			Random rand = new Random();
			int n = rand.nextInt(3) + 1;

			String compChoice = "";

			switch (n) {
			case 1:
				compChoice = "rock";
				break;
			case 2:
				compChoice = "paper";
				break;
			case 3:
				compChoice = "scissor";
				break;
			}

			if (Objects.equals(userChoice, new String("rock"))) {
				// System.out.println(Rock.rock(userChoice, n));
				results.add(Rock.rock(userChoice, n));
			} else if (Objects.equals(userChoice, new String("paper"))) {
				// System.out.println(Paper.paper(userChoice, n));
				results.add(Paper.paper(userChoice, n));
			} else if (Objects.equals(userChoice, new String("scissor"))) {
				// System.out.println(Scissor.scissor(userChoice, n));
				results.add(Scissor.scissor(userChoice, n));
			}

			if (Objects.equals(results.get(roundNr), new String("winner"))) {
				System.out.println("You chose " + userChoice + ", your opponent chose " + compChoice + ". You win!");
			} else if (Objects.equals(results.get(roundNr), new String("loser"))) {
				System.out.println(
						"You chose " + userChoice + ", your opponent chose " + compChoice + ". Your opponent wins!");
			} else if (Objects.equals(results.get(roundNr), new String("draw"))) {
				System.out
						.println("You chose " + userChoice + ", your opponent chose " + compChoice + ".  It's a tie!");
			}

			roundNr++;
		}
		int wins = 0;
		int losses = 0;
		int draw = 0;
		for (int i = 0; i < results.size(); i++) {
			if (Objects.equals(results.get(i), new String("winner"))) {
				wins++;
			} else if (Objects.equals(results.get(i), new String("loser"))) {
				losses++;
			} else if (Objects.equals(results.get(i), new String("draw"))) {
				draw++;
			}
		}

		System.out.println(results);
		System.out.println("You won " + wins + " times");
		System.out.println("You lost " + losses + " times");
		System.out.println("Ther was a draw " + draw + " times");

		if (wins == losses) {
			System.out.println("You won " + wins + " times " + "and lost " + losses + "times. Its a draw!");
		} else if (wins > losses) {
			System.out.println("You won " + wins + " times " + "and lost " + losses + "times. You win!");
		} else if (losses > wins) {
			System.out.println("You won " + wins + " times " + "and lost " + losses + "times. Your opponent won!");
		}

	}

}
