package studio7;

import java.util.Scanner;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	

	public int getNumerator() {
		return numerator;
	}



	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}



	public int getDenominator() {
		return denominator;
	}



	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	


	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction add(Fraction addend) {
		int top = this.numerator * addend.denominator + addend.numerator * this.denominator;
		int bottom = this.denominator * addend.denominator;
		Fraction sum = new Fraction(top, bottom);
		return sum;
		
	}
	
	public Fraction multiply(Fraction multiplier) {
		int top = this.numerator * multiplier.numerator;
		int bottom = this.denominator * multiplier.denominator;
		Fraction product = new Fraction(top, bottom);
		return product;
		
	}
	
	public Fraction reciprocal() {
		return new Fraction(this.denominator, this.numerator);
	}
	
	private static int gcd(Fraction f) {
		
		if (f.numerator % f.denominator == 0) {
			return f.denominator;
		}
		else {
			return gcd(new Fraction(f.denominator, f.numerator % f.denominator));
		}
	}
	
	public Fraction simplify() {
		int gcd = gcd(new Fraction(this.numerator, this.denominator));
		return new Fraction (this.numerator / gcd, this.denominator / gcd);
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numerator and denominator for 2 fractions");
		int numeratorOne = in.nextInt();
		int denominatorOne = in.nextInt();
		int numeratorTwo = in.nextInt();
		int denominatorTwo = in.nextInt();
		Fraction One = new Fraction(numeratorOne, denominatorOne);
		Fraction Two = new Fraction(numeratorTwo, denominatorTwo);
		Fraction adds = One.add(Two);
		Fraction ms = One.multiply(Two);
		System.out.println(adds);
		System.out.println(ms);
		System.out.println(One.reciprocal());
		System.out.println(One.simplify());
		System.out.println(Two.simplify());
		System.out.println(adds.simplify());
		System.out.println(ms.simplify());

	}

}
