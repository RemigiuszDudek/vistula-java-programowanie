package org.vistula.homework.day2;

public class Triangle {
	private double a;
	private double h;

	public Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}

	public double field() {
		return (a * h) / 2;
	}
}
