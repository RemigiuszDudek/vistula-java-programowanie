package org.vistula.homework.day1.hhh.corrected.triangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
	@Test
	public void testTriangleField() {
		Triangle tf = new Triangle(2.5, 3);
		double expectedField = 3.75d;
		double delta = 1e-3;

		double actualField = tf.triangleField();

		assertEquals(expectedField, actualField, delta);
	}
}
