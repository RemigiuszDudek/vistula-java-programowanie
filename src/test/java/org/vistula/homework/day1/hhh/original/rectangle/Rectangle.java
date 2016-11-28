package org.vistula.homework.day1.hhh.original.rectangle;

public class Rectangle {

	private int a;
	private int b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
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
}
