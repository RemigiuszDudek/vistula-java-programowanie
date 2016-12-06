package org.vistula.dudekre.loops;

import org.junit.Test;

public class WhileLoopExampleTest {
    @Test
    public void basicWhileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}
