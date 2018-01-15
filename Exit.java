package game;
/**
 * This class will have ability to read inventory and create room connector
 * 
 * @author jthomp and Tim Kartawijaya
 *
 */
public class Exit {
	
	private Game game;
	
	private Room roomTo; 
	
	public Exit(Game game, Room room) {
		this.game = game; 
		this.roomTo = room;
	}
	
	public Room getRoomTo() {
		return roomTo; 
	}
	
	
	
}

 