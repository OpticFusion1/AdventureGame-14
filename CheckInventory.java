package game;

public class CheckInventory implements Action {
	private Game game;
	
	public CheckInventory(Game game) {
		this.game = game; 
	}
	
	/**
	 * Method to move from one room to another
	 */
	public void doAction(String[] command) {
		System.out.print("You have ");
		game.getPlayer().listInventory();
		
	}
}
