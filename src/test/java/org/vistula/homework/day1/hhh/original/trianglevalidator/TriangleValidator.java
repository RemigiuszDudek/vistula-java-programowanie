package org.vistula.homework.day1.hhh.original.trianglevalidator;

public class TriangleValidator {
	private double a;
	private double b;
	private double c;

	public TriangleValidator(int a, int b, int c) {
		// TODO Auto-generated constructor stub
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean validate(double a, double b, double c) {
		if (a + b > c) {
			if (a + c > b) {
				if (b + c > a) {
					return true;
				}
			}
		}
		return false;

	}
}

