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
    public void testRomanNumerals1900() {

        romanNumerals number = new romanNumerals();
        Assert.assertEquals(1900, number.romanToDecimal("MCM"));
    }
    
}
