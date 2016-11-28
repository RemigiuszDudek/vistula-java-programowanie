package org.vistula.homework.day1.hhh.original.triangle;

public class Triangle {

	private double a;
	private double h;

	public Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double triangleField() {
		double c = (this.a * this.h) / 2.0f;
		return c;

	}

}
