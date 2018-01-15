package game;

/**
 * Class for quit command
 * @author tim.kartawijaya
 *
 */

public class Quit implements Action {

	private Game game;
	
	public Quit(Game game) {
		this.game = game; 
	}
	
	/**
	 * Method to move from one room to another
	 */
	public void doAction(String[] command) {
		game.finishGame();
	}
}
