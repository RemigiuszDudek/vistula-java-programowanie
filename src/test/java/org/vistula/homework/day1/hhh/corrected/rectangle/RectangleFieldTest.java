package org.vistula.homework.day1.hhh.corrected.rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleFieldTest {
	@Test
	public void test() {
		Rectangle r = new Rectangle (3,4);
		int expectedField = 12;
		int actual = r.field();
		assertEquals(expectedField, actual);
	}
}
