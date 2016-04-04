
public class Scissor {
	public static String scissor(String userInp, int compInp) {
		String result = "Something has gone wrong when calculating the result";

		if (compInp == 1) {
			// Computer is the winner
			result = "loser";
		} else if (compInp == 2) {
			// Player is the winner
			result = "winner";
		} else if (compInp == 3) {
			// Draw
			result = "draw";
		}

		return result;
	}
}
