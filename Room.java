package game;


import java.util.*;
/**
 * Room.java
 * 
 * Class to model a room in the game.
 *
 * @author Thomas VanDrunen
 * Wheaton College, CS 245, Spring 2007
 * Lab 5
 * Feb 8, 2007
 */

public class Room {
	
	/**
	 * Map of item name to the item object. 
	 */
    private Map<String, Item> inventory = new HashMap<String, Item>();;
	
    /**
     * Map of exits/doors this room has. 
     */
    private Map<String, Exit> exits = new HashMap<>();
    
    /**
     * Map of actions that are specific to each room. 
     */
    private Map<String, Action> actions = new HashMap<>();
    
    /**
     * A description of this room
     */
    private String description;
    
    /**
     * Constructor.
     * @param description A String describing this room to the user.
     */
    public Room(String description) { 
    		this.description = description;
 
    }
    
    /**
     * Method to return particular exit according to the key
     * @param exitString
     * @return
     */
    public Exit getExit(String exit) {
    		return exits.get(exit);
    }
    
    /**
     * Method to add exits/doors to this room
     * @param direction
     * @param exit
     */
    public void setExit(String direction, Exit exit) {
    		exits.put(direction, exit);
    }
    
    /**
     * Retrieve a description of this room (to the user).
     */
    public String getDescription() { return description; }

    /**
     * Method to add item to the inventory.
     * @param item Item to be added
     */
    public void addItem(Item item) {
    	inventory.put(item.getName(),item);
    }

    /**
     * Method to remove item from inventory.
     * @param item
     */
    public void removeItem(String item) {
    	inventory.remove(item);
    }
    
    /**
     * Method to get item from inventory
     * @param item
     * @return
     */
    public Item getItem(String item) {
    	return inventory.get(item);
    }
    
    /**]
     * Method to check if item is in inventory.
     * @param item
     * @return
     */
    public boolean checkInventory(String item) {
    	return inventory.containsKey(item);
    }



	
}
