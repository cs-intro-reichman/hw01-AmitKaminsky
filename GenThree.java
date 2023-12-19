/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int min, max, randOne, randTwo, randThree, randMin;
		// Receive the min and max from the user
		min = Integer.parseInt(args[0]);
		max = Integer.parseInt(args[1]);
		randOne = (int)(Math.random() * (max - min) + min);
		randTwo = (int)(Math.random() * (max - min) + min);
		randThree = (int)(Math.random() * (max - min) + min);
		// Check which one is minimum
		randMin = Math.min(randOne, Math.min(randTwo, randThree));
		System.out.println(randOne + "\n" + randTwo + "\n" + randThree);
		System.out.println("The minimal generated number was " + randMin);
	}
}
