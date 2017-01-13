package org.vistula.homework.day2.yyy.original; /**
 * Created by Lukasz on 05.01.2017.
 */

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class TriangleValidator {
    public boolean validate( int a, int b, int c) {
        /* sprawdza czy można stworzyć trójkąt o podanych bokach, zwraca true albo false */
        if (a < 0 || b < 0 || c < 0) {
            return false;
        }
        return ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
    }

    @Test
    public void testInvalid() {
        boolean result = validate(1,2, 3);
        Assert.assertThat(result, is(false));

    }
    @Test
    public void testValid() {
        boolean result = validate(2,3,4);
        Assert.assertThat(result, is(true));
    }
    @Test
    public void testZeros() {
        boolean result = validate(0,0,0);
        Assert.assertThat(result, is(false));
    }
    @Test
    public void testMinus0() {
        boolean result = validate(-1,3,2);
        Assert.assertThat(result, is(false));
    }
}
