package game;

/**
 * Parser.java
 * 
 * Class to interpret the user's commands
 *
 * @author Thomas VanDrunen
 * Wheaton College, CS 245, Spring 2007
 * Lab 5
 * Feb 8, 2007
 */

import java.util.Scanner;

public class Parser {

    /**
     * For user input from the keyboard.
     */
    private Scanner keyboard;

    /**
     * Plain constructor
     */
    public Parser() {
        keyboard = new Scanner(System.in);
    }

    /**
     * Let the user make one "turn" at this game.
     * Give the user a description of the room, prompt for
     * a command, and interpret the command.
     * @param game A reference to the object representing the game.
     */
    public void executeTurn(Game game) {
 
        System.out.print("Enter command--> ");
        String command = keyboard.nextLine().toLowerCase();  // user's command

        String arrCommand[] = command.split(" ");
        Action action = game.findActionObject(arrCommand[0]);
        if(action != null)
        	action.doAction(arrCommand);
        else
        	System.out.println("Command not valid"); //To prevent game from breaking
        
        
    }


}
