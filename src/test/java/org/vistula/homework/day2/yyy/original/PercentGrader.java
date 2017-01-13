package org.vistula.homework.day2.yyy.original; /**
 * Created by Lukasz on 30.12.2016.
 */

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class PercentGrader {
    @Test
    public void testGrade() {
        /* testuję wartość ujemną */
        char result = getGrade(-1);
        Assert.assertThat(result, is('e'));
    }

    @Test
    public void testGrade0() {
        /* testuję wartość 0 */
        char result = getGrade(0);
        Assert.assertThat(result, is('1'));
    }

    @Test
    public void testGrade1() {
        /* testuję wartość 1 */
        char result = getGrade(1);
        Assert.assertThat(result, is('1'));
    }

    @Test
    public void testGrade99() {
        /* testuję wartość 99 */
        char result = getGrade(99);
        Assert.assertThat(result, is('6'));
    }

    @Test
    public void testGrade100() {
        /* testuję wartość 100 */
        char result = getGrade(100);
        Assert.assertThat(result, is('6'));
    }

    @Test
    public void testGrade101() {
        /*testuję wartość 101 */
        char result = getGrade(101);
        Assert.assertThat(result, is('e'));
    }

    @Test
    public void testGrade55() {
        /*testuję wartość 55 */
        char result = getGrade(55);
        Assert.assertThat(result, is('1'));
    }

    @Test
    public void testGrade65() {
        /*testuję wartość 65 */
        char result = getGrade(65);
        Assert.assertThat(result, is('2'));
    }

    @Test
    public void testGrade75() {
        /*testuję wartość 75 */
        char result = getGrade(75);
        Assert.assertThat(result, is('3'));
    }

    @Test
    public void testGrade85() {
        /*testuję wartośc 85 */
        char result = getGrade(85);
        Assert.assertThat(result, is('4'));
    }

    @Test
    public void testGrade95() {
        /*testuję wartość 95 */
        char result = getGrade(95);
        Assert.assertThat(result, is('5'));
    }

    public char getGrade(int testScore) {

        char grade;
        if (testScore > 100) {
            grade = 'e';
        } else if (testScore > 95) {
            grade = '6';
        } else if (testScore > 85) {
            grade = '5';
        } else if (testScore > 75) {
            grade = '4';
        } else if (testScore > 65) {
            grade = '3';
        } else if (testScore > 55) {
            grade = '2';
        } else if (testScore >= 0) {
            grade = '1';
        } else {
            grade = 'e';
        }
        return grade;
    }
}
