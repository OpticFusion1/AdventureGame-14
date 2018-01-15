package game;

/**
 * Class for get command
 * @author Tim Kartawijaya
 *
 */
public class Get implements Action {
	
	private Game game;
	
	public Get(Game game) {
		this.game = game;
	}

	public void doAction(String[] command) {
		//grab room and player
		Player player = game.getPlayer();
		Room room = game.getCurrentRoom(); 
		
		//check if item is in the room
		if (room.checkInventory(command[1])){
			//if it is, remove item from room and add it to the player
			Item item = room.getItem(command[1]);
			player.pickUp(item);
			room.removeItem(command[1]);
		} else {
			System.out.println("There's no such thing here.");
		}
		
		
	}

}
