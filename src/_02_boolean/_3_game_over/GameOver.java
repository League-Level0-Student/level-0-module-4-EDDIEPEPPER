package _02_boolean._3_game_over;

import javax.swing.JOptionPane;

public class GameOver {
	
	public static void main(String[] args) {

		boolean gameOver = false;
		
		// 1. Ask the user if the game is over and save their answer.
		while(!gameOver) {
		String gameoOver= JOptionPane.showInputDialog("is the game over.");
		// 2. If they answer "yes" change gameOver to true.
		if(gameoOver.equalsIgnoreCase("yes")) {
			gameOver=true;
		}
		else if(gameoOver.equalsIgnoreCase("no")) {
			gameOver=false;
		}
		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.
		}
		JOptionPane.showMessageDialog(null, "the game is over");
		// 4. Tell the user the game is over outside the while loop.
		
	}

}