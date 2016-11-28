package org.vistula.homework.day1.hhh.corrected.rectangle;

public class Rectangle {
	private int a;
	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int field() {
		int c = this.a * this.b;
		return c;
	}

	public int perimeter() {
		int c = 2 * this.a + 2 * this.b;
		return c;
	}

	@Override
	public String toString() {
		return "Rectangle{" +
				"a=" + a +
				", b=" + b +
				'}';
	}
}
