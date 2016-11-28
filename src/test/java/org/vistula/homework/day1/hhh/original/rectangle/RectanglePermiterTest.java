package org.vistula.homework.day1.hhh.original.rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectanglePermiterTest {

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle (3,4);
		int expected = r.perimeter();
		assertEquals(expected,r.getA()*2+r.getB()*2);
	}

}
