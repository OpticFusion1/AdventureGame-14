package game;

import java.util.HashMap;
import java.util.Map;

/**
 * Game.java
 * 
 * Class to model the game as a collection of rooms. The
 * rooms are organized as a graph, and the Room objects
 * are nodes in the graph.
 *
 * @author Thomas VanDrunen
 * Wheaton College, CS 245, Spring 2007
 * Lab 5
 * Feb 8, 2007
 */

public class Game {
	
    /**
     * The current room the user is in. This serves to
     * purposes-- it is our only permanent connection to
     * the rooms in this game (the other rooms are reachable
     * by traversing this room's "doors"-- and it maintains
     * the state by representing the user's current location.
     */
    private Room currentRoom;

    /**
     * Keeps track of whether this game is over or not.
     */
    private boolean over;
    
    /**
     * Models the player within the game 
     */
    private Player player;
    
    /**
     * A map of String commands to Action objects. 
     */
    private Map<String, Action> actions;
    
    /**
     * Return the room in which the user is currently.
     */
    public Room getCurrentRoom() { return currentRoom; }
    
    /**
     * Models the map / array of rooms
     */
    private Room[] rooms;
    
    /**
     * Constructor to set up the game.
     */
    public Game() {
    		//create player
    		player = new Player(this);
    		
    		//create rooms
    		rooms = new Room[1000];
        rooms[0] = new Room("You find yourself in an empty dark room.\nYou see light coming from "
        		+ "the bottom of the door in front of you.");
        rooms[1] = new Room("You are in a long hallway, and you see that light is shining through "
        		+ "a crack at the end of the hall.\nTo your right, you see a door. Behind you is the "
        		+ "door you originally came through. ");
        rooms[2] = new Room("You are in a small room, barely lit by a torch hung on the far wall.\n"
        		+ "There are some sticks of dynamite on one corner of the room.");
        rooms[3] = new Room("You find yourself in a large forest.");
        
        //Create connections between rooms by exit objects
        Exit door_r0 = new Exit(this, rooms[1]); 
        Exit crack_r1 = new Exit(this, rooms[3]);
        Exit right_door_r1 = new Exit(this, rooms[2]);
        Exit back_door_r1 = new Exit(this, rooms[0]);
        Exit back_door_r2 = new Exit(this, rooms[1]);
        
        //Designate exits to rooms
        rooms[0].setExit("door", door_r0);
        rooms[1].setExit("crack", crack_r1);
        rooms[1].setExit("right", right_door_r1);
        rooms[1].setExit("back", back_door_r1);
        rooms[2].setExit("back", back_door_r2);
        rooms[2].setExit("door", back_door_r2);
        
        //create items
        Item key = new Key();
        
        //designate items to rooms
        rooms[0].addItem(key);
        
        //create global actions and populate global action map
	    	actions = new HashMap<>();
	    	Action quit = new Quit(this);
	    	Action help = new Help(this); 
	    	Action look = new Look(this);
    		actions.put("help", help);
    		actions.put("look", look);
    		actions.put("quit", quit);
    		
        over = false;
        currentRoom = rooms[0];
	        
	    Action check = new CheckInventory(this);
	    	Action direction = new Direction(this);
	    	
	    	Action get = new Get(this);
	    	//create map and populate map for actions
	    
    		//Pair text to its action object
    		//Directions to different rooms
	    	
	    	actions.put("check", check);
	    	actions.put("door", direction);
	    	actions.put("crack", direction);
	    	actions.put("right", direction);
	    	actions.put("back", direction);
    		actions.put("north", direction);
    		actions.put("south", direction);
    		actions.put("west", direction);
    		actions.put("east", direction);
    		actions.put("up", direction);
    		
    		actions.put("get", get);
    		actions.put("grab", get);
    		actions.put("take", get);
        
 
    		
}
    
    /**
     * Is this game over or not?
     */
    public boolean isOver() { return over; }
    

    /**
     * Move into a different current room.
     */
    public void setCurrentRoom(Room currentRoom) { this.currentRoom = currentRoom; }

    /**
     * Indicate that the game is now over.
     */
    public void finishGame() { over = true; }
    
    /**
     * Find action object according to command string from the map of actions
     * @param command
     * @return
     */
    public Action findActionObject(String command) {
    	Action actionObject = actions.get(command);
    	return actionObject;
    }
    
    public Player getPlayer() {
    		return player;
    }
    
}
