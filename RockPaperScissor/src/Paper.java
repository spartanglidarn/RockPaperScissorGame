
public class Paper {
	public static String paper(String userInp, int compInp) {
		String result = "Something has gone wrong when calculating the result";
		if (compInp == 1) {
			// Player is the winner
			result = "winner";
		} else if (compInp == 2) {
			// Draw
			result = "draw";
		} else if (compInp == 3) {
			// Computer is the winner
			result = "loser";
		}

		return result;
	}
}
