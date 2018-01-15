package game;

/**
 * Class for direction commands
 * @author tim.kartawijaya
 *
 */

public class Look implements Action {

	private Game game;
	
	public Look(Game game) {
		this.game = game; 
	}
	
	
	/**
	 * Method to move from one room to another
	 */
	public void doAction(String[] command) {
		System.out.println(game.getCurrentRoom().getDescription());
	}
}
