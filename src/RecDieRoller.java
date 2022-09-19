/**
 * @author Michael Elder
 * Assignment 3.1 Recursive Dice
 * RecDieRoller class has two different versions of the roll method. The first roll method is a recursive method 
 * that rolls until it gets a two. The second roll method rolls 1,000 times and prints out how many times the 2
 * appeared on the die.  
 */
import java.util.Random;

public class RecDieRoller {
	
	public RecDieRoller() {
		
	}//end empty argument constructor
	
	/**
	 * This roll method rolls a die and then checks to see if it is a 2. If not, it will do the roll method again
	 * but if so it will finish the output
	 */
	public void roll() {
		int num;
		
		/**
		 * Creating a random number between 1 and 6
		 */
		Random r = new Random();
		num = r.nextInt(6)+1;
		System.out.println(num);
		
		/**
		 * If statement returns 2 once it is called and doesn't ask for another random number. If it isn't 2,
		 * then the roll method is called again.
		 */
		if (num == 2)
		return;
		else roll();
	}//end roll method
	
	/**
	 * 
	 * This roll method runs a specific number of times and prints the amount of times 2 shows up on the die
	 */
	public void roll(int key) 
	{
		int d;
		int num1 = 0;
		int frequency = 0;
		
		/**
		 * for loop iterates however many times the integer key you place in the roll method to roll that many times
		 */
		for(d=1;d<key;d++) 
		{
		
		/**
		* Creating a random number between 1 and 6
		*/
			Random rand = new Random();
			num1 = rand.nextInt(6)+1;
		System.out.println(num1);
			
			/**
			 * If statement counts the number of times 2 shows up and reflects it on the frequency variable
			 */
			if(num1 == 2) 
			{
				frequency++;
			}//end if statement	
		}//end for loop
		
		/**
		 * Prints out how many times the 2 showed up
		 */
		System.out.println("The number 2 was on the die " + frequency + " times.");
	}//end roll method 
}//end class
