package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutTestTest {

    @Test
    void test_calculate() {
        int number1 = 10;
        int number2 = 2;

        String addition = WithoutTest.calculate(number1, number2, '+');
        assertEquals("12", addition);

        String subtraction = WithoutTest.calculate(number1, number2, '-');
        assertEquals("8", subtraction);

        String multiply = WithoutTest.calculate(number1, number2, '*');
        assertEquals("20", multiply);

        String division = WithoutTest.calculate(number1, number2, '/');
        assertEquals("5", division);

        String other = WithoutTest.calculate(number1, number2, 'a');
        assertEquals("", other);
    }

    @Test
    void test_isPrime() {
        assertTrue(WithoutTest.isPrime(2));
        assertTrue(WithoutTest.isPrime(3));
        assertTrue(WithoutTest.isPrime(7));
        assertTrue(WithoutTest.isPrime(11));
        assertTrue(WithoutTest.isPrime(Integer.MAX_VALUE));

        assertFalse(WithoutTest.isPrime(0));
        assertFalse(WithoutTest.isPrime(1));
        assertFalse(WithoutTest.isPrime(-2));
        assertFalse(WithoutTest.isPrime(9));
        assertFalse(WithoutTest.isPrime(25));
    }

    @Test
    void test_checkGender() {
        String result1 = WithoutTest.checkGender(0);assertEquals("nő",result1);
        String result2 = WithoutTest.checkGender(1);assertEquals("férfi",result2);
        String result3 = WithoutTest.checkGender(-1);assertEquals("valami más",result3);


    }

    @Test
    void test_trafficLight() {
        String result1 = WithoutTest.trafficLight("zöld");assertEquals("SZABAD",result1);
        String result2 = WithoutTest.trafficLight("sárga");assertEquals("LASSÍTS",result2);
        String result3 = WithoutTest.trafficLight("piros");assertEquals("MEGÁLLJ",result3);
        String result4 = WithoutTest.trafficLight(" ");assertEquals("NEM TUDOM",result4);

    }

    @Test
    void test_isLeapYear() {
        assertTrue(WithoutTest.isLeapYear(2020));
        assertTrue(WithoutTest.isLeapYear(2016));
        assertTrue(WithoutTest.isLeapYear(1932));
        assertTrue(WithoutTest.isLeapYear(1880));
        assertTrue(WithoutTest.isLeapYear(1720));

        assertFalse(WithoutTest.isLeapYear(2021));
        assertFalse(WithoutTest.isLeapYear(1931));
        assertFalse(WithoutTest.isLeapYear(1878));
        assertFalse(WithoutTest.isLeapYear(1662));
        assertFalse(WithoutTest.isLeapYear(1581));
    }

}