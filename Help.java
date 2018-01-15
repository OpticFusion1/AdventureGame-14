package game;

/**
 * Class for help command
 * @author tim.kartawijaya
 *
 */

public class Help implements Action {

	private Game game;
	
	public Help(Game game) {
		this.game = game; 
	}
	
	/**
	 * Method to move from one room to another
	 */
	public void doAction(String[] command) {
		System.out.println("You cry for help. But no one came.");
	}
}
