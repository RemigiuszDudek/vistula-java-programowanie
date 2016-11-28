package org.vistula.homework.day1.hhh.original.trianglevalidator;

import junit.framework.TestCase;

public class TriangleValidatorTest extends TestCase {

	public void testValidate() {
		TriangleValidator v = new TriangleValidator(0, 2, 3);
		boolean expected = v.validate(2,3, 4);
		
		assertEquals(expected,v.validate(v.getA(), v.getB(), v.getC()));
	}

}
