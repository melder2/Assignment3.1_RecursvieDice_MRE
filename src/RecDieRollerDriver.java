/**
 * @author Michael Elder
 * Assignment 3.1 Recursive Dice
 * RecDieRollerDriver class creates a die called d and calls the two different roll methods
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		
		/**
		 * Creates a die called d
		 */
		RecDieRoller d = new RecDieRoller();
		
		/**
		 * Rolls a die until it shows a 2
		 */
		d.roll();
		
		/**
		 * Rolls a die 1,000 times and counts how 
		 */
		d.roll(1000);

	}//end main

}//end class
