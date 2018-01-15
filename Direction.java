package game;

/**
 * Class for direction commands
 * @author tim.kartawijaya
 *
 */

public class Direction implements Action {

	private Game game;
	
	public Direction(Game game) {
		this.game = game; 
	}
	
	/**
	 * Method to move from one room to another
	 */
	public void doAction(String[] command) {
		Room room = game.getCurrentRoom(); //grab current room from game
		Exit exit = room.getExit(command[0]);
		game.setCurrentRoom(exit.getRoomTo());
		System.out.println(game.getCurrentRoom().getDescription());
	}
}
