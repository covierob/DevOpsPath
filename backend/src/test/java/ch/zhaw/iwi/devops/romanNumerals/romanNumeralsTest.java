package ch.zhaw.iwi.devops.romanNumerals;

import org.junit.Assert;
import org.junit.Test;

public class romanNumeralsTest {

    @Test
    public void testRomanNumerals1() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(1, number.romanToDecimal("I"));
    }

    @Test
    public void testRomanNumerals3() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(3, number.romanToDecimal("III"));
    }

    @Test
    public void testRomanNumerals6() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(6, number.romanToDecimal("VI"));
    }

    @Test
    public void testRomanNumerals5() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(5, number.romanToDecimal("V"));
    }

    @Test
    public void testRomanNumerals18() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(18, number.romanToDecimal("XVIII"));
    }

    @Test
    public void testRomanNumerals623() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(623, number.romanToDecimal("DCXXIII"));
    }

    @Test
    public void testRomanNumerals50() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(50, number.romanToDecimal("L"));
    }

    @Test
    public void testRomanNumerals54() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(54, number.romanToDecimal("LIV"));
    }

    @Test
    public void testRomanNumerals500() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(500, number.romanToDecimal("D"));
    }

    @Test
    public void testRomanNumerals567() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(567, number.romanToDecimal("DLXVII"));
    }

    @Test
    public void testRomanNumerals1000() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(1000, number.romanToDecimal("M"));
    }

    @Test
    public void testRomanNumerals1589() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(1589, number.romanToDecimal("MDLXXXIX"));
    }
    
}
