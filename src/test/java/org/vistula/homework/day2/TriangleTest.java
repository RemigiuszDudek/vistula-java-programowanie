package org.vistula.homework.day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
	@Test
	public void testTriangleField() {
		Triangle triangle = new Triangle(2.4, 3);
		double expectedField = 3.6d;
		double delta = 1e-3;

		double actualField = triangle.field();

		assertEquals(expectedField, actualField, delta);
	}
}
