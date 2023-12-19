/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int numberOne = Integer.parseInt(args[0]);
		int numberTwo = Integer.parseInt(args[1]);
		System.out.println(numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo));
	}
}
