package studio7;

import java.util.Scanner;

public class Die {
	
	//Instance Variables
	private int sides;
	

	public int getSides() {
		return sides;
	}


	public void setSides(int sides) {
		this.sides = sides;
	}


	public Die(int sides) {
		super();
		this.sides = sides;
	}
	
	public int roll() {
		return (int) (Math.random()*this.sides) + 1;
	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of sides:");
		int numSides = in.nextInt();
		Die dice = new Die(numSides);
		System.out.println(dice.roll());

	}


}
