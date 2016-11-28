package org.vistula.homework.day1.hhh.original.triangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

	@Test
	public void testTriangleField() {
		Triangle tf = new Triangle(2.5f, 3);
		double expected = tf.triangleField();

		assertEquals(expected, (tf.getA() * 2 + tf.getH() * 2) / 2.0f, 1e-15);
	}

}
