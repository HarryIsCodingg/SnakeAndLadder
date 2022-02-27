import java.util.Scanner;

/**
 * 
 * COMP249 Assignment # 1 Due Date February 7,2022
 * 
 * @author HARINDER PARTAP SINGH AND 40076200
 *
 */
public class PlayLadderAndSnake {

	static Scanner input = new Scanner(System.in);
	static int counter = 1;
	static int numberOfPlayers = 0;

	/**
	 * 
	 * @param args The driver method starts the program.
	 */
	public static void main(String[] args) {
		System.out.printf("\n***********************************************************************************\n"
				+ "\tWelcome To The Snake And Ladder Game\n" + "\t\t\t\t\t    Designed By:Harinder Partap Singh\n"
				+ "***********************************************************************************\n\n");

		System.out.print("Enter the # of players for your game - Number must be between 2 and 4 inclusively:");
		numberOfPlayers = input.nextInt();
		checkNumberOfPlayers(numberOfPlayers);
		input.close();

	}

	/**
	 * The user has 4 attempts to enter the valid number of players.If user enters
	 * players between 2 and 4 then the game will be started.Otherwise,after 4
	 * consecutive failed attempts, the system exits.
	 * 
	 * @param numberOfPlayers represent the number of players
	 */
	public static void checkNumberOfPlayers(int numberOfPlayers) {

		while (counter < 5) {

			if (numberOfPlayers >= 2 && numberOfPlayers <= 4) {
				System.out.println();
				LadderAndSnake ladder = new LadderAndSnake(numberOfPlayers);
				ladder.play();
				break;
			}

			else if (counter == 4) {
				System.out.printf("Bad Attempt %d! You have exhausted all your choices.Program will terminate!",
						counter);
			} else {

				System.out.printf("Bad Attempt %d - Invalid # of players.Please enter a # between 2 and 4 inclusively:",
						counter);
				numberOfPlayers = input.nextInt();

			}
			counter++;

		}
	}

}
