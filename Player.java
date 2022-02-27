
/**
 * 
 * COMP249 Assignment # 1 
 * Due Date February 7,2022
 * @author HARINDER PARTAP SINGH AND 40076200
 *
 */
public class Player {

	/**
	 * The location int representing the location of the player
	 */
	public int location;
	private String playerName;
	private int playTurn;

	/**
	 * Class constructor
	 */
	public Player() {
		this.playerName = " ";
		this.location = 0;
	}

	/**
	 * Class constructor creates the new object with given player name.
	 * 
	 * @param playerName Describe the player name.
	 */
	public Player(String playerName) {
		this.setName(playerName);
		this.location = 0;
	}

	/**
	 * Changes the player turn.
	 * 
	 * @param turn the players turn to play the game.
	 */
	public void setPlayTurn(int turn) {
		playTurn = turn;
	}

	/**
	 * Provides the player turn to play the game.
	 * 
	 * @return the player turn to play the game.
	 */
	public int getTurn() {
		return playTurn;
	}

	/**
	 * Provides the name of the player.
	 * 
	 * @return the name of the player.
	 */
	public String getName() {
		return playerName;
	}

	/**
	 * Change the player's name
	 * 
	 * @param name the player's name
	 */
	public void setName(String name) {
		this.playerName = name;
	}

	/**
	 * Change the location of the player after dice is thrown
	 * 
	 * @param newLocation the new location of player
	 */
	public void setLocation(int newLocation) {
		location += newLocation;
	}

	/**
	 * Provides the current location of the player
	 * 
	 * @return the current location of the player
	 */
	public int getLocation() {
		return location;
	}

}
