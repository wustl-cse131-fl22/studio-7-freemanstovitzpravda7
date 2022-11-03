package studio7;

import java.util.Scanner;

public class Rectangle {
	
	//Instance Variables
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}

	public double perimeter() {
		return (this.length + this.width) * 2.0;
	}
	
	public boolean isSquare() {
		return (this.length == this.width);
	}
	
	public double area() {
		return this.length * this.width;
	}
	public boolean isAreaLarger(Rectangle test) {
		return this.area() > test.area();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length and width for two rectangles:");
		System.out.println("First length:");
		double x1 = in.nextDouble();
		System.out.println("First width:");
		double y1 = in.nextDouble();
		System.out.println("Second length:");
		double x2 = in.nextDouble();
		System.out.println("Second width:");
		double y2 = in.nextDouble();
		Rectangle one = new Rectangle(x1, y1);
		Rectangle two = new Rectangle(x2, y2);
		System.out.println("First rectangle is square: " + one.isSquare());
		System.out.println("Second rectangle is square: " + two.isSquare());
		System.out.println("First rectangle perimeter: " + one.perimeter());
		System.out.println("Second rectangle perimeter: " + two.perimeter());
		System.out.println("First rectangle area: " + one.area());
		System.out.println("Second rectangle area: " + two.area());
		System.out.println("First rectangle area larger than second?: " + one.isAreaLarger(two));
	}

}
