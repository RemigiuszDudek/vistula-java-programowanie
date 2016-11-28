package org.vistula.homework.day1.hhh.original.rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTestField {

	@Test
	public void test() {
	
		Rectangle r = new Rectangle (3,4);
		int expected = r.field();
		assertEquals(expected,12);
		
		
	}

}
