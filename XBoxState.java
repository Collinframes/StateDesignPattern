/**
 * Written by Collin Frames 11/21/20
 */

package csce247.state;

public class XBoxState implements State {

	/**
	 * Array of games chosen from the required output
	 */
	
	String[] games = {"Forza Horizon", "Ori and the Blind Forest", "Red Dead Redemption", 
						"Fortnite", "Gears", "Cuphead"};

	/**
	 * The home button method displays the required text when the user is already "home" 
	 */

	public void pressHomeButton()
	{
		System.out.println("Display Home Screen.");
	}
	
	/**
	 * Displays the required text for the user when on "Nintendo" and is already on nintendo
	 */
	
	public void pressNintendoButton()
	{
		System.out.println("Starting Nintendo...");
	}
	
	/**
	 * Displays the required text for when the user chooses XBOX and is already on XBOX
	 */
	
	public void pressXBoxButton()
	{
		System.out.println("You are already viewing XBox");
	}
	
	/**
	 * Displays the games for the XBOX system
	 */
	
	public void pressGameButton()
	{
		System.out.println("You have the following games: ");
		for(String game : games)
		{
			System.out.println(game);
		}
		System.out.println("\n");
	}
}
