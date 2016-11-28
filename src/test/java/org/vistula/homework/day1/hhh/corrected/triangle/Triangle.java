package org.vistula.homework.day1.hhh.corrected.triangle;

public class Triangle {

	private double a;
	private double h;

	public Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}

	public double triangleField() {
		return (this.a * this.h) / 2.0f;

	}

}
