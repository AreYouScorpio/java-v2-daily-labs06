package day02.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumbersTest {

    @Test
    public void testIsPerfectNumber() {

        //Given
        PerfectNumbers perfectNumbers = new PerfectNumbers ();

        // When
        int number=5;
        boolean expected = false;

        //Then
        assertEquals(expected, perfectNumbers.isPerfectNumber(number));


    }

}
