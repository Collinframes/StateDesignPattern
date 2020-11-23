/**
 * Written by Collin Frames 11/21/20
 */

package csce247.state;

/**
 * The state interface contains the behaviors that the different classes will implement when ran.
 * @author Collin Frames
 *
 */

public interface State {

	public void pressHomeButton();
	public void pressNintendoButton();
	public void pressXBoxButton();
	public void pressGameButton();
}
