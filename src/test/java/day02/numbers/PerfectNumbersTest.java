package day02.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumbersTest {

    @Test
    public void testIsPerfectNumber() {

        // Given
        PerfectNumbers perfectNumbers = new PerfectNumbers ();

        // When
        int number=5;
        boolean expected = false;

        // Then
        assertEquals( false, perfectNumbers.isPerfectNumber(number));


        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertTrue(perfectNumbers.isPerfectNumber(6));

        assertFalse(perfectNumbers.isPerfectNumber(88));
        assertFalse(perfectNumbers.isPerfectNumber(27));


    }

}
