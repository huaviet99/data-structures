package stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertPositiveDecimalToBinaryTest {

    @Test
    public void testCase1() {
        String binaryNumber = MyStackExamples.convertPositiveDecimalToBinary(5);
        assertEquals("101", binaryNumber);
    }

    @Test
    public void testCase2() {
        String binaryNumber = MyStackExamples.convertPositiveDecimalToBinary(10);
        assertEquals("1010", binaryNumber);
    }

    @Test
    public void testCase3() {
        String binaryNumber = MyStackExamples.convertPositiveDecimalToBinary(123456789);
        assertEquals("111010110111100110100010101", binaryNumber);
    }
}
