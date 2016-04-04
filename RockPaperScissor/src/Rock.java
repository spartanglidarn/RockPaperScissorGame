public class Rock {

	public static String rock(String userInp, int compInp) {
		String result = "Something has gone wrong when calculating the result";
		if (compInp == 1) {
			// draw
			result = "draw";
		} else if (compInp == 2) {
			// Computer is the winner
			result = "loser";
		} else if (compInp == 3) {
			// Player is the winner
			result = "winner";
		}

		return result;

	}
}
