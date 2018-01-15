package game;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Player {

	private Map<String, Item> inventory;
	
	private Game game;
	
	public Player(Game game) {
		this.game = game;
		this.inventory = new HashMap<String,Item>();
	}
	
	public void drop(String item) {
		inventory.remove(item);
	}
	
	public void pickUp(Item item) {
		inventory.put(item.getName(),item);
	}
	
	public void examineRoom() {
		Room room = game.getCurrentRoom();
		System.out.println("This room contains:");
		
	}
	
	public void listInventory() {
		if (inventory.isEmpty()){
			System.out.println("nothing");
		} else {
			
		Set<String> items = inventory.keySet();
		Iterator<String> it = items.iterator();
			while(it.hasNext()) {
				System.out.print(it.next()+", ");
			}
		}
		
	}
}
