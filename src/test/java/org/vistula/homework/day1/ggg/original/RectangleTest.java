package org.vistula.homework.day1.ggg.original;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RectangleTest {

	@Test
	public void shouldCorrectlyCalculateField(){
		Rectangle rec = new Rectangle(5, 4);
		int expectedField = 20;
		
		int result = rec.field();
		
		Assertions.assertThat(result).isEqualTo(expectedField);
	}
	
	@Test
	public void shouldCorrectlyCalculatePerimeter() {
		Rectangle rec1 = new Rectangle(3, 4);
		int expectedPerimeter = 14;
		
		int result2 = rec1.permiter();
		
		Assertions.assertThat(result2).isEqualTo(expectedPerimeter);
	}
}
