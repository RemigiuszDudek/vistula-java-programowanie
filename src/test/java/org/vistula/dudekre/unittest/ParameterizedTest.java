package org.vistula.dudekre.unittest;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParameterizedTest {
    @Test
    @Parameters({
            "4, 2, 2",
            "6, 3, 2",
            "5, 2, 2.5"
    })
    public void testDivide(int a, int b, float expectedDivisionResult) {
        float actualDivisionResult = divide(a, b);
        Assertions.assertThat(actualDivisionResult).isEqualTo(expectedDivisionResult);
    }

    private int divide(int a, int b) {
        return a/b;
    }

    @Test
    @FileParameters("src/test/resources/org/vistula/dudekre/unittest/testParameters.csv")
    public void printFileContent(String username, String password) {
        System.out.println(String.format("username=%s, password=%s", username, password));
    }
}
