package org.vistula.homework.day1.hhh.corrected.rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectanglePermiterTest {

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle (3,4);
		int expectedPerimeter = 14;

		int actualPerimeter = r.perimeter();

		assertEquals(expectedPerimeter, actualPerimeter);
	}

}
