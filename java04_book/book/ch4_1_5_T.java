package java04_book.book;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.format("(%.1f,%.1f)%d", x, y, radius);
	}

	public void show() {
		System.out.println(this);
	}
}

public class ch4_1_5_T {
	public static final int SIZE = 3;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Circle[] c = new Circle[SIZE];
		for (int i = 0; i < SIZE; i++) {
			System.out.print("x, y, radius >>");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for (int i = 0; i < SIZE; i++) {
			System.out.println(c[i]);
		}
		scan.close();
	}
}