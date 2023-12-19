/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int sideOne, sideTwo, sideThree;
		// Receive the 3 lengths from the user
		sideOne = Integer.parseInt(args[0]);
		sideTwo = Integer.parseInt(args[1]);
		sideThree = Integer.parseInt(args[2]);
		boolean sumOne, sumTwo, sumThree, ifFormsTriangle;
		// Checks the 3 options of sums to test Triangle Inequailty Theorem
		sumOne = sideOne + sideTwo > sideThree;
		sumTwo = sideOne + sideThree > sideTwo;
		sumThree = sideThree + sideTwo > sideOne;
		ifFormsTriangle = sumOne && sumTwo && sumThree;
		System.out.println(
		sideOne + ", " + sideTwo + ", " + sideThree + ": " + ifFormsTriangle);
	}
}
